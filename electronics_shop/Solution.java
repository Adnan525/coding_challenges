package electronics_shop;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;


public class Solution {

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        // IntStream from Arrays.stream(keyboards) requires a conversion to Stream<Integer> before using the sorted method.
        // but if the loop operates directly on Stream<Integer> which is achieved via Arrays.asList(drives).asList(),there's no need for an additional conversion.
        List<Integer> affordable_usb = Arrays.stream(keyboards)
                .flatMap(k -> Arrays.stream(drives).map(d -> k + d))
                .filter(u -> u <= b)
                .boxed()  // Convert IntStream to Stream<Integer>
                .sorted(java.util.Comparator.reverseOrder()) // can be appied only on Stream<t>
                .collect(Collectors.toList());

        return affordable_usb.isEmpty() ? -1 : affordable_usb.get(0);

        // alternative
        // List<Integer> affordable_usb = new ArrayList<>();
        // for (int k : keyboards) {
        //     int remain_for_usb = b - k;
        //     affordable_usb = Arrays.asList(b).stream()
        //             .filter(u -> u <= remain_for_usb)
        //             .map(u -> u + k)
        //             .sorted(java.util.Comparator.reverseOrder())
        //             .collect(Collectors.toList());
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] bnm = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int b = Integer.parseInt(bnm[0]);

        int n = Integer.parseInt(bnm[1]);

        int m = Integer.parseInt(bnm[2]);

        int[] keyboards = new int[n];

        String[] keyboardsItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
            int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
            keyboards[keyboardsItr] = keyboardsItem;
        }

        int[] drives = new int[m];

        String[] drivesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        for (int drivesItr = 0; drivesItr < m; drivesItr++) {
            int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
            drives[drivesItr] = drivesItem;
        }

        /*
         * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
         */

        int moneySpent = getMoneySpent(keyboards, drives, b);

        bufferedWriter.write(String.valueOf(moneySpent));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

