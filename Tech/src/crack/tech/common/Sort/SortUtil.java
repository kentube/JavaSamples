package crack.tech.common.Sort;

public class SortUtil
{
    public static void sort(int[] items, int first, int second) {
        if (items[first] > items[second]) {
            swap(items, first, second);
        }
    }

    public static void swap(int[] items, int first, int second) {
        int save = items[first];
        items[first] = items[second];
        items[second] = save;
    }
}
