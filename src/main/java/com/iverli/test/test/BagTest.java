package com.iverli.test.test;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bidimap.TreeBidiMap;

public class BagTest {
    public static void main(String[] args){
        BidiMap<String,String> bidi = new TreeBidiMap<>();
        bidi.put("One", "yi");
        bidi.put("Two","er");
        System.out.println(bidi.get("One"));

    }
}
