package com.cs622.hw7;

/**
 * @author: Qiwei Li
 */

public class GenomeSequenceReport {

    public static void main(String[] args) throws InterruptedException {
        int times = 1000;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            GenomeSequenceSingle genomeSequenceSingle = new GenomeSequenceSingle();
            genomeSequenceSingle.generate();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Average time for single version: "
                + (endTime - startTime) * 1.0 / times + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++) {
            GenomeSequenceMultithead genomeSequenceMultithead = new GenomeSequenceMultithead();
            genomeSequenceMultithead.generate();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Average time for multi version: "
                + (endTime - startTime) * 1.0 / times + "ms");

    }

}
