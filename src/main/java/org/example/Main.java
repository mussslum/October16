package org.example;

import org.example.designPatterns.observer.Currency;
import org.example.designPatterns.observer.Customer;
import org.example.model.Bird;
import org.example.model.Swan;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String s = "babatwmymwtd";
        String res = "";
        for (int i = 0; i<s.length()-1; i++){
            int mid = i;
            for (int k= 1; k<s.length()/2; k++){
                int start = mid - k;
                int end = mid + k;
                if(start >=0 && end<=s.length()){
                    if (s.charAt(start)==s.charAt(end)){
                        String main = s.substring(start,end+1);
                        if(main.length()>res.length()){
                            res = main;
                        }
                    }
                    else {
                        break;
                    }
                }
                else {
                    break;
                }
            }
        }
        System.out.println(res);

    }

}