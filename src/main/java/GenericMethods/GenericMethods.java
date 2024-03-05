package GenericMethods;

import java.util.function.ToDoubleFunction;

public class GenericMethods {
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static <T extends Comparable<T>> T max(T a, T b, T c, T d, T e) {
        T max = a;

        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        if (d.compareTo(max) > 0) {
            max = d;
        }
        if (e.compareTo(max) > 0) {
            max = e;
        }
        return max;
    }

    public static <T> double average(T[] array, ToDoubleFunction<T> converter) {
        if (array == null || array.length == 0) {
            System.out.println("Array cannot be null or empty");
            return 0.0;
        }
        double sum = 0.0;

        for (T elem : array) {
            sum += converter.applyAsDouble(elem);
        }

        return sum / array.length;
    }

    public static <T extends Comparable<T>> T max(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty"); // ну тут чатжпт підказав цей варік
        }
        T max = array[0];
        for (T elem : array) {
            if (elem.compareTo(max) > 0) {
                max = elem;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T min(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty"); // ну тут чатжпт підказав цей варік
        }
        T min = array[0];
        for (T elem : array) {
            if (elem.compareTo(min) < 0) {
                min = elem;
            }
        }
        return min;
    }

    public static <T extends Comparable<T>> void sort(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty"); // ну тут чатжпт підказав цей варік
        }
        for (int i = 1; i < array.length; i++) {
            T sort = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].compareTo(sort) > 0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = sort;
        }
    }

    public static <T extends Comparable<T>> int binarySearch(T[] array, T key) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty"); // ну тут чатжпт підказав цей варік
        }
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midVal = array[mid];
            int cmp = midVal.compareTo(key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
