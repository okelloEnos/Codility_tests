package com.okelloSoftwarez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        int[] input = {-4, -1, 2};
//        String message = "Why not";
//        int limit = 100;
        int[] people = {1, 4, 1};
        int[] seats = {1, 5, 1};

        Solution Soln = new Solution();
        int d = Soln.solution(people, seats);
        System.out.println(d);
    }
}

class Solution {
    public int solution(int[] P, int[] S) {

        // write your code in Java SE 11
        int total_people = 0;
        List<Integer> sList = new ArrayList<Integer>();
        int num_cars = 0;
        int max_num_seat = 0;

        for (int l : S
        ) {
            sList.add(l);
        }
        for (int p : P) {
            total_people += p;
        }

        while (total_people > 0) {
            max_num_seat = sList.get(0);

            for (int s : sList) {
                if (max_num_seat < s) {
                    max_num_seat = s;
                }
            }

            total_people = total_people - max_num_seat;

            if (total_people < 0) {
                num_cars = 1;
            } else {
                num_cars++;
            }

            int index = sList.indexOf(max_num_seat);
            sList.remove(index);
        }

        return num_cars;
    }
}


//class Solution {
//    public String solution(String message, int K) {
//        // write your code in Java SE 11
//        String finalMesssage = "";
//
//        if(message.length() > K){
//            String reducedMessage = message.substring(0, K);
//
//            int count = 0;
//
//            char [] listChar = message.toCharArray();
//
//            if(listChar[K] == ' '){
//                finalMesssage = reducedMessage;
//            }
//            else {
//                for (int o = K - 1; o > 1; o--){
//
//                    if(listChar[o] == ' '){
//                        count++;
//                        break;
//                    }
//                    else {
//                        count++;
//                    }
//                }
//                finalMesssage = reducedMessage.substring(0, K - count);
//            }
//
//        }
//        else {
//            finalMesssage = message;
//        }
//
//        return finalMesssage;
//    }
//}

//class Solution {
//    public int solution(int[] A) {
//        // write your code in Java SE 11
//        ArrayList<Integer> tempList = new ArrayList<Integer>();
//
//        for (int i = 1; i <= 100000; i++) {
//            tempList.add(i);
//        }
//
//        for (int p : A) {
//            boolean occuredItem = tempList.contains(p);
//            if(occuredItem){
//                int index = tempList.indexOf(p);
//                tempList.remove(index);
//            }
//        }
//
//        return tempList.get(0);
//    }
//}