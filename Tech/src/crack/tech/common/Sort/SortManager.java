package crack.tech.common.Sort;

import crack.tech.common.Util;

import java.util.Arrays;

public class SortManager {
    private static void SortMany(ISorter[] sorters, int size, int repeats) {
        int[][] loops = new int[sorters.length][repeats];

        for (int i = 0; i < repeats; i++) {
            int[] source = Util.generateArray(size);
            System.out.println(Arrays.toString(source));
            for (int s = 0; s < sorters.length; s++) {
                int[] copy = Arrays.copyOf(source, size);
                loops[s][i] = sorters[s].sort(copy);
                //System.out.println(String.format("Repeat: %d, TryCount %d", i, tries[i]));
            }
        }
        for (int s = 0; s < sorters.length; s++) {
            double avg = Arrays.stream(loops[s]).average().getAsDouble();
            System.out.println(String.format(
                    "ArraySize: %d, RepeatCount: %d, AvgLoops: %7.3f, %s",
                    size, repeats, avg, sorters[s].getName()));
        }
    }

    public static void main(String[] args) {
        SortMany(new ISorter[]{
                        new BubbleSort(),
                        new SelectionSort(),
                        new MergeSort(),
                        new QuickSort(),
                        //                new BucketSort(),
                },
                15, 200);

    }

}
