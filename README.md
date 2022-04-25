# com.cs622.hw7

How to run:
Run GenomeSequenceSingle for single version.
Run GenomeSequenceMultithead for multi version.
Run GenomeSequenceReport to test difference.

Results:
Average time for single version: 0.043ms
Average time for multi version: 0.335ms

Analysis:
The multi-version spends time at generating thread and adding operation of list.
It actually takes more time  when the original task is small.
