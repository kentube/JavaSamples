package crack.tech.common.Sort;

import crack.tech.common.Util;

import java.util.Arrays;

/**
 * Bubble Sort:
 * Start at the beginning of an array and swap the first two elements if the first is bigger than the second
 * Go to the next pair, etc, continuously making sweeps of the array until sorted
 * O(n^2)
 *
 * @see "https://en.wikipedia.org/wiki/Bubble_sort"
 */
public class BubbleSort implements ISorter {

    @Override
    public String getName() {
        return "Bubble Sort O(n^2)";
    }

    public int sort(int[] items) {
        return sort(items, false);
    }

    public int sort(int[] items, boolean showSteps) {
        int loops = 0;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < items.length; i++) {
                if (items[i - 1] > items[i]) {
                    int save = items[i - 1];
                    items[i - 1] = items[i];
                    items[i] = save;
                    swapped = true;
                    if (showSteps)
                        Util.printArray(items, String.format("%6d: ", loops + 1));
                }
                loops++;
            }
        }
        return loops;
    }

    public static void main(String[] args) {
        int[] array = Util.generateArray(5, 100);
        Util.printArray(array, "Before: ");

        BubbleSort sorter = new BubbleSort();
        int loops = sorter.sort(array);

        Util.printArray(array, "After : ");
        System.out.println("Loops: " + loops);

    }

}
