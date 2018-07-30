package crack.tech.common.Sort;

import crack.tech.common.Util;

/**
 * Selection Sort:
 * Find the smallest element using a linear scan and move it to the front Then,
 * find the second smallest and move it, again doing a linear scan
 * Continue doing this until all the elements are in place
 * O(n^2)
 */
public class SelectionSort implements ISorter {
    @Override
    public String getName() {
        return "SelectionSort O(n^2)";
    }

    @Override
    public int sort(int[] items) {
        int loops = 0;
        for (int pos = 0; pos < items.length; pos++) {
            int smallest = items[pos];
            int smallestPos = pos;
            for (int j = pos + 1; j < items.length; j++) {
                if (items[j] <  smallest)
                {
                    smallest = items[j];
                    smallestPos = j;
                }
                loops++;
            }
            items[smallestPos] = items[pos];
            items[pos] = smallest;
            loops++;
        }
        return loops;
    }

    public static void main(String[] args) {
        int[] array = Util.generateArray(5, 1000);
        Util.printArray(array, "Before: ");

        SelectionSort sorter = new SelectionSort();
        int loops = sorter.sort(array);

        Util.printArray(array, "After : ");
        System.out.println("Loops: " + loops);
    }

}
