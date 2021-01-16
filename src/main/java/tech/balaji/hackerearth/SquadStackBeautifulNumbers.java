package tech.balaji.hackerearth;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SquadStackBeautifulNumbers {

    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4, 5};
        int n = 1;
        System.out.println(solve(arr, n));

        long[] a = {4, 3, 4, 3, 4};
        n = 2;
        System.out.println(solve(a, n));
    }

    private static int solve(long[] arr, int n) {
        int count = 0;
        Map<Long, Integer> map = new HashMap<>();

        for (long element : arr) {
            if (isOddNumberOfDivisor(element)) {
                if (map.containsKey(element)) {
                    map.put(element, map.get(element) + 1);
                } else {
                    map.put(element, 1);
                }
            }
        }

        List<Integer> array = map.values().stream().sorted().collect(Collectors.toList());
        for (Integer i : array)
            if (count < n)
                count = count + i;

        return count;
    }

    private static boolean isOddNumberOfDivisor(long n) {
        double d = Math.sqrt(n);
        double floor = Math.floor(d);
        return d - floor == 0;
    }


}
