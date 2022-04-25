package com.cs622.hw7;
import java.util.Random;

/**
 * @author: Qiwei Li
 */

public class GenomeSequenceUtil {

    private final static Random random = new Random();

    public static String craeteGenomeSequence() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < 10; i++) {
            stringBuffer.append(randomATGC());
        }

        return stringBuffer.toString();
    }

    public static String randomATGC() {
        int randNumber = random.nextInt(4);

        switch (randNumber) {
            case 0:
                return "A";
            case 1:
                return "T";
            case 2:
                return "G";
            case 3:
                return "C";
        }

        return " ";
    }
}
