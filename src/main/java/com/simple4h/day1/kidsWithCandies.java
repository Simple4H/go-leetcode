package com.simple4h.day1;

import java.util.ArrayList;
import java.util.List;

/**
 * author Create By Simple4H
 * date 2020-08-20 20:57
 * <p>拥有最多糖果的孩子</p>
 */
public class kidsWithCandies {

    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = 0;
        List<Boolean> result = new ArrayList<>(candies.length);
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }

        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }

//    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//
//        List<Boolean> result = new ArrayList<>(candies.length);
//        for (int i : candies) {
//            boolean flag = true;
//            for (int candy : candies) {
//                if (i + extraCandies < candy) {
//                    flag = false;
//                    break;
//                }
//            }
//            result.add(flag);
//        }
//        return result;
//    }
}
