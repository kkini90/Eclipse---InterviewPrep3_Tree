package com.usc.ctcl.tree;
// Sort preference according to priority
/*
 * Input  : [LOW, LOW, LOW, HIGH, HIGH, MEDIUM, HIGH, LOW, LOW, MEDIUM, LOW, LOW]
   Output : [HIGH, HIGH, HIGH, MEDIUM, MEDIUM, LOW, LOW, LOW, LOW, LOW, LOW, LOW]
 * 
 * */
 
import java.util.Arrays;
import java.util.Random;

/**
 * @author kkini
 *
 */
public class SortPreference {
    enum Preference {
        HIGH, MEDIUM, LOW
    }
 
    public static void main(String[] args) {
        Preference[] level = new Preference[12];
 
        Preference[] values = Preference.values();
        Random rand = new Random();
        for (int i = 0; i < level.length; i++)
            level[i] = values[rand.nextInt(values.length)];
 
        System.out.println("Before array is sorted: " + Arrays.toString(level));
        sortPreferences(level);
        System.out.println("After array is sorted: " + Arrays.toString(level));
    }
    /*
     * Assumption : items[] is not null or empty
     * 
     */
    private static void sortPreferences(Preference[] items) {
        int low = 0, mid = 0, high = items.length - 1;
 
        while (mid <= high)
            switch (items[mid]) {
                case HIGH:
                    swap(items, low++, mid++);
                    break;
                case MEDIUM:
                    mid++;
                    break;
                case LOW:
                    swap(items, mid, high--);
                    break;
            }
    }
 
    private static void swap(Preference[] arr, int left, int right) {
        Preference tmp = arr[left];
        arr[left] = arr[right];
        arr[right] = tmp;
    }
}
//Time complexity is O(n), n is no of elements in array
//Space complexity is O(1) as I am sorting the preferences in-place without taking extra memory space 