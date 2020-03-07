/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberrangesummarizer;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Etienne De Winnaar
 */
public class MainClass {
    
    public static void main(String[] args) {
        NumRangeSum num = new NumRangeSum();
        Collection<Integer> collect = new ArrayList<>();
        String[] input = {"1", "3", "6", "7", "8", "12", "13", "14", "15", "21", "22", "23", "24", "31"};
        
        for (String input1 : input) {
            collect = num.collect(input1);           
        }      
        
        String summary = num.summarizeCollection(collect);
        System.out.println(summary + "\n");
        
    }
}
