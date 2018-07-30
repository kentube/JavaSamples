package crack.tech.common.Sort;

import crack.tech.common.Util;

/**
 * Quick Sort:
 * Pick a random element and partition the array,
 * such that all numbers that are less than it come before all elements that are greater than it
 * Then do that for each half, then each quarter, etc
 * O(n log n) expected, O(n^2) worst case
 *
 * @see "https://en.wikipedia.org/wiki/Quicksort"
 * @see "https://www.geeksforgeeks.org/quick-sort/"
 */
public class QuickSort implements ISorter {
    @Override
    public String getName() {
        return "QuickSort O(n log n) expected, O(n^2) worst case";
    }

    @Override
    public int sort(int[] items) {
        return quickSort(items, 0, items.length - 1);
    }

    private int quickSort(int[] items, int low, int high) {
        int loops = 0;
        if (low < high) {
            // pi is partitioning index, arr[pi] is now at right place
            int pi = partition(items, low, high);
            loops += high - low + 1;
            // Recursively sort elements before partition and after partition
            loops += quickSort(items, low, pi - 1);
            loops += quickSort(items, pi + 1, high);
        }
        return loops;
    }

    private int partition(int arr[], int low, int high) {
        int loops = 0;
        int pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                SortUtil.swap(arr, i, j);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        SortUtil.swap(arr, i + 1, high);
        return i + 1;
    }

    public static void main(String[] args) {
        int[] array = Util.generateArray(15, 100);
        //int array[] = {10, 7, 8, 9, 1, 5};
        Util.printArray(array, "Before: ");

        QuickSort sorter = new QuickSort();
        int loops = sorter.sort(array);

        Util.printArray(array, "After : ");
        System.out.println("Loops: " + loops);
    }
}
