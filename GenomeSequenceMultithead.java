package com.cs622.hw7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: Qiwei Li
 */
public class GenomeSequenceMultithead {

    private List<String> list = Collections.synchronizedList(new ArrayList<>());

    public void generate() throws InterruptedException {
        Thread[] threads = new Thread[5];
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread() {
                public void run() {
                    List<String> tmpList = new ArrayList<String>();
                    for (int j = 0; j < 20; j++) {
                        tmpList.add(GenomeSequenceUtil.craeteGenomeSequence());
                    }
                    list.addAll(tmpList);
                }
            };
            threads[i] = t;
        }

        for (int i = 0; i < 5; i++) {
            threads[i].start();
        }
        for (int i = 0; i < 5; i++) {
            threads[i].join();
        }
    }

    public void showAll() {
        System.out.println("Size = " + list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        GenomeSequenceMultithead genomeSequenceMultithead = new GenomeSequenceMultithead();
        genomeSequenceMultithead.generate();
        genomeSequenceMultithead.showAll();
    }

}
