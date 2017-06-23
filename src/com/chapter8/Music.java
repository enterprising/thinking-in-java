package com.chapter8;

/**
 * Created by peng.tan on 17/6/23.
 */
public class Music {
    public static void tune(Instrument i){
        i.play(Note.MIDDLE_C);
    }
    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);
    }
}
