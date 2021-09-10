package CustomerTradePercent;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



class Result {

    /*
     * Complete the 'mostActive' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING_ARRAY customers as parameter.
     */

    public static List<String> mostActive(List<String> customers) {
        // Write your code here
        String checkedSofar = "";
        double numTrasactions = customers.size();
        List<String> result = new ArrayList<>();
        Set<String> occurence = new HashSet<>();
        for(String str: customers)
        {
            if(!checkedSofar.contains(str))
            {
                if(occurence.add(str)) //does it exist already
                {
                    Boolean check = (Collections.frequency(customers, str)/numTrasactions)*100 >= 5;
                    if(check)
                        result.add(str);
                }
                checkedSofar+=str;
            }

        }
        //sort the map
        Collections.sort(result);
        return result;
    }
    public static void main(String[] args)
    {
        List<String> myList = new ArrayList<>();
        myList.add("adnan");
        myList.add("adnan");
        myList.add("adnan");
        myList.add("muntasir");
        myList.add("muntasir");
        for(String str: mostActive(myList))
            System.out.println(str);

    }

}


//hacker rank input code
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int customersCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> customers = new ArrayList<>();
//
//        for (int i = 0; i < customersCount; i++) {
//            String customersItem = bufferedReader.readLine();
//            customers.add(customersItem);
//        }
//
//        List<String> result = Result.mostActive(customers);
//
//        for (int i = 0; i < result.size(); i++) {
//            bufferedWriter.write(result.get(i));
//
//            if (i != result.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
