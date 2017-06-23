package com.chapter8;

/**
 * Created by peng.tan on 17/6/23.
 */
public class Cycle {
    public void ride(Cycle c){
        Unicycle u = (Unicycle)c;
        u.ride();
    }

    public static void main(String[] args) {
        Cycle c = new Unicycle();
        c.ride(c);
    }
}
