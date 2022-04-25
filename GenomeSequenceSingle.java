package com.cs622.hw7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: Qiwei Li
 */
public class GenomeSequenceSingle {

    private List<String> list = Collections.synchronizedList(new ArrayList<>());

    public void generate() {
        for (int i = 0; i < 100; i++) {
            list.add(GenomeSequenceUtil.craeteGenomeSequence());
        }
    }

    public void showAll() {
        System.out.println("Size = " + list.size());
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        GenomeSequenceSingle genomeSequenceSingle = new GenomeSequenceSingle();
        genomeSequenceSingle.generate();
        genomeSequenceSingle.showAll();
    }
}
