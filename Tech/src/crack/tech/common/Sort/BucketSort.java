package crack.tech.common.Sort;

/**
 * Bucket Sort:
 * Partition the array into a finite number of buckets, and then sort each bucket individually
 * This gives a time of O(n + m), where n is the number of items and m is the number of distinct
 * items
 */
public class BucketSort implements ISorter {
    @Override
    public String getName() {
        return "SelectionSort";
    }

    @Override
    public int sort(int[] items) {
        return 0;
    }
}
