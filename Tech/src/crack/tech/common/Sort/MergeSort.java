package crack.tech.common.Sort;

import crack.tech.common.Util;

/**
 * Merge Sort:
 * Sort each pair of elements Then,
 * sort every four elements by merging every two pairs Then,
 * sort every 8 elements, etc
 * O(n log n) expected and worst case
 *
 * @see "https://en.wikipedia.org/wiki/Merge_sort"
 * @see "https://www.geeksforgeeks.org/merge-sort/"
 * @see "https://en.wikipedia.org/wiki/File:Merge_sort_algorithm_diagram.svg"
 */
public class MergeSort implements ISorter {
    @Override
    public String getName() {
        return "MergeSort O(n log n)";
    }

    @Override
    public int sort(int[] items) {
        return mergeSort(items, 0, items.length - 1);
    }

    private int mergeSort(int arr[], int l, int r) {
        int loops = 0;
        if (l < r) {
            // Same as (l+r)/2, but avoids overflow for large l and h
            int m = l + (r - l) / 2;

            loops += mergeSort(arr, l, m);
            loops += mergeSort(arr, m + 1, r);
            loops += merge(arr, l, m - l + 1, m + 1, r - m);
        }
        return loops;
    }

    private int merge(int[] items, int first, int firstLen, int second, int secondLen) {
        int[] result = new int[firstLen + secondLen];
        int firstPos = first;
        int secondPos = second;
        int resultPos = 0;
        int loop = 0;
        while (firstPos < first + firstLen || secondPos < second + secondLen) {
            if (firstPos >= first + firstLen)
                result[resultPos++] = items[secondPos++];
            else if (secondPos >= second + secondLen)
                result[resultPos++] = items[firstPos++];
            else if (items[firstPos] <= items[secondPos])
                result[resultPos++] = items[firstPos++];
            else
                result[resultPos++] = items[secondPos++];
            loop++;
        }
        for (int i = 0; i < resultPos; i++) {
            items[first + i] = result[i];
        }
        return loop;
    }

    public static void main(String[] args) {
        int[] array = Util.generateArray(15, 1000);
        Util.printArray(array, "Before: ");

        MergeSort sorter = new MergeSort();
        int loops = sorter.sort(array);

        Util.printArray(array, "After : ");
        System.out.println("Loops: " + loops);
    }
}

