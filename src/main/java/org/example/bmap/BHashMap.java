package org.example.bmap;

import java.util.HashMap;
import java.util.Map;

public class BHashMap implements Bmap{

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();


        String bit = Integer.toBinaryString(342);
        int mBit = ~342;
        System.out.println(bit.length());
        System.out.println(bit);
        System.out.println(Integer.toBinaryString(mBit));


    }




}
