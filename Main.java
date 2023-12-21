import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {


    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rightDiag = 0, leftDiag = 0;
        for (int i = 0; i <= arr.size() - 1; i++) {
            rightDiag += arr.get(i).get(i);
            leftDiag += arr.get(i).get(arr.size()-1 - i);
        }
        return Math.abs(rightDiag-leftDiag);
    }

    public static void staircase(int n) {
        // Write your code here
        String result = "";
        for(int i = 1; i<=n; i++)
        {
            int spaceNum = n-i;
            int stairNum = i;
            while(spaceNum>0)
            {
                result+=" ";
                spaceNum--;
            }
            while(stairNum>0)
            {
                result+="#";
                stairNum--;
            }
            result+="\n";
        }
        System.out.println(result);

    }

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        List<Integer> temp = arr;
        Collections.sort(temp);
        long max = 0;
        long min = 0;
        for(int i = 0; i<=temp.size()-1; i++)
        {
            if(i==0)
               min+=temp.get(i);
            else if(i==temp.size()-1)
                max+=temp.get(i);
            else
            {
                min+=temp.get(i);
                max+=temp.get(i);
            }
        }
        System.out.println(min+"  "+max);


    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        if(candles.isEmpty())
            return 0;
        if(candles.size() == 1)
            return 1;
        List<Integer> temp = candles;
        Collections.sort(temp);
        return Collections.frequency(temp, temp.get(temp.size()-1));
    }
    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result = new ArrayList<>();
        for(Integer i : grades)
        {
            if(i%5 == 0)
                result.add(i);
            else
            {
                if(i<38)
                    result.add(i);
                else if(i%5 >= 3) //important cause we are taking values for the next multiple of 5
                    result.add(5*(i/5 + 1));
                else
                    result.add(i);
            }
        }
        return result;

    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        //range would be inclusive s and t
        //a: pos of apple tree
        //b: pos of orange tress
        int apple = 0;
        int orange = 0;
        for(Integer i:apples)
        {
            if(i>=0)
            {
                int position = a+i;
                if(position>=s && position<=t)
                    apple+=1;
            }
        }
        for(Integer i:oranges)
        {
            if(i<=0)
            {
                int position = b+i;
                if(position>=s && position<=t)
                    orange+=1;
            }
        }
        System.out.println(apple+"\n"+orange);

    }
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int breakBest = 0;
        int breakWorst = 0;
        if(scores.isEmpty())
            return Arrays.asList(new Integer[] {0,0});
        else{
            int best = scores.get(0);
            int worst = scores.get(0);
            for(Integer i : scores)
            {
                if(i>best)
                {
                    best = i;
                    breakBest++;
                }
                else if(i<worst)
                {
                    worst = i;
                    breakWorst++;
                }
            }
        }
        return Arrays.asList(new Integer[]{breakBest, breakWorst});
    }
    public static String findDay(int month, int day, int year) {
        LocalDate date = LocalDate.of(year, month, day);
        return date.getDayOfWeek().toString();
    }

    public static void useOfNumberFormatter(double payment)
    {
        NumberFormat usf = NumberFormat.getCurrencyInstance();
        String us = usf.format(payment);
        NumberFormat inf = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = inf.format(payment);
        NumberFormat chf = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chf.format(payment);
        NumberFormat frf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = frf.format(payment);
    }

    public static String timeConversion(String s) {
        // assuming s is a valid time string
        Integer target = Integer.parseInt(s.substring(0, 2));
        String milFormat = ""; //the first 2 digits
        if(s.substring(s.length()-2, s.length()).equals("AM"))
        {
            if(target == 12)
                return "00" + s.substring(2, s.length()-2);
            else
                return s.substring(0, s.length()-2);
        }
        else
        {
            if(target == 12)
                return s.substring(0, s.length()-2);
            else
            {
                Integer temp = 12+target;
                milFormat = temp.toString();
                return milFormat+s.substring(2, s.length()-2);
            }
        }

    }
    static String catAndMouse(int x, int y, int z) {
        if(Math.abs(x-z)<Math.abs(y-z))
            return "Cat A";
        else if(Math.abs(y-z)<Math.abs(x-z))
            return "Cat B";
        else
            return "Mouse C";
    }

    public static void main(String[] args)
    {
//        List<List<Integer>> arr = new ArrayList<>();
//        arr.add(Arrays.asList(new Integer[] {11,2,4}));
//        arr.add(Arrays.asList(new Integer[] {4,5,6}));
//        arr.add(Arrays.asList(new Integer[] {10,8,-12}));
//        System.out.println(diagonalDifference(arr));

//        staircase(6);

//        List<Integer> arr = new ArrayList<>();
//        arr.add(3);
//        arr.add(2);
//        arr.add(1);
//        arr.add(3);
//        System.out.println(birthdayCakeCandles(arr));

//        int[][] arr = {
//                {0,2,10}
//        };
//        getSequence(arr);
//        String A = "hello";
//        String B = "java";
//
//        System.out.println(A.length()+B.length());
//        if(B.compareTo(A)<0)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//        System.out.println(A.substring(0,1).toUpperCase(Locale.ROOT)+A.substring(1, A.length()) + " "+B.substring(0,1).toUpperCase(Locale.ROOT)+B.substring(1, B.length()));


    }
}
