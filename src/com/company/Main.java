package com.company;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> hi = new ArrayList<String>();
        hi.add("Hello");
        hi.add("my");
        hi.add("name");
        hi.add("is");
        hi.add("jack");
        hi.add("don");
        ArrayList<String> no = new ArrayList<String>();
        no.add("No");
        no.add("I");
        no.add("Don't");
        no.add("Want");
        no.add("That");
        System.out.println(swapPairs(no));
        System.out.println(removeOddLength(hi));
        ArrayList<Integer> integer = new ArrayList<>();
        integer.add(1);
        integer.add(2);
        integer.add(3);
        ArrayList<Integer> integer1 = new ArrayList<>();
        integer1.add(3);
        integer1.add(2);
        integer1.add(1);
        integer1.add(5);
        System.out.println(intersect(integer1,integer));

    }
    public static ArrayList<String> removeOddLength(ArrayList<String> str){
        int count = str.size();
        for(int i = 0; i<=count-1;i++){
            if(str.get(i).length()%2==1){
                str.remove(i);
                count -=1;
            }
        }
        return str;
    }
    public static ArrayList<String> swapPairs(ArrayList<String> str){
        int count = str.size()/2;
        String temp;
        int j = 0;
        for(int i = 0; i<=count-1;i++,j++){
            temp = str.get(j+1);
            str.set(j+1,str.get(j));
            str.set(j,temp);
            j++;
        }
        return str;
    }
    public static ArrayList<Integer> intersect(ArrayList<Integer> i1,ArrayList<Integer> i2){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i <=i1.size()-1;i++){
            for(int j = 0; j<=i2.size()-1;j++){
                if(i1.get(i)==i2.get(j)){
                    temp.add(i1.get(i));
                }
            }
        }
        return temp;
    }

}
