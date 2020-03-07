/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author Etienne De Winnaar
 */
public class NumRangeSum implements NumberRangeSummarizer {

    Collection<Integer> collect;

    
    public NumRangeSum() {
        collect = new ArrayList<>();
    }

    @Override
    public Collection<Integer> collect(String input) {
        try {
            int num = Integer.parseInt(input);
            collect.add(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }        
        return collect;
    }

    @Override
    public String summarizeCollection(Collection<Integer> input) {
        String summary = "";
        Iterator<Integer> firstIt = input.iterator();
        Iterator<Integer> secIt = input.iterator();
        int firstNum = 0;
        int secNum = secIt.next();
        do {
            firstNum = firstIt.next();
            secNum = secIt.next();

            if (secNum - firstNum == 1) {
                summary += firstNum + "-";
                int temp = 0;

                while (secNum - firstNum == 1 && secIt.hasNext()) {
                    temp = secNum;
                    firstNum = firstIt.next();
                    secNum = secIt.next();
                    if (secNum - firstNum == 1 && !secIt.hasNext()) {
                        temp = secNum;
                    }
                    
                }

                if (secIt.hasNext() && firstIt.hasNext()) {
                    summary += temp + ", ";
                } else {
                    if (secNum - firstNum != 1 && !secIt.hasNext()) {
                        summary += temp + ", ";
                    } else {
                        summary += temp;
                    }                    
                }
                
            } else {
                summary += firstNum + ", ";
            }
            if (secNum - firstNum != 1 && !secIt.hasNext()) {
                summary += secNum;
            }
        } while (secIt.hasNext());

        return summary;
    }
}
