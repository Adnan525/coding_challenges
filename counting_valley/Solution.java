package counting_valley;

import java.io.*;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        int upHill = 0;
        int downHill = 0;
        int result = 0;
        boolean isSeaLevel = true;
        for(char c: path.toCharArray()){
            if (c == 'U'){
                if(downHill > 0){
                    downHill--;
                    if (downHill == 0) isSeaLevel = true;
                }
                else{
                    isSeaLevel = false;
                    upHill++;
                }
            }
            else if (c == 'D'){
                if(upHill > 0){
                    upHill--;
                    if (upHill == 0) isSeaLevel = true;
                }
                else{
                    if(isSeaLevel) result++;
                    isSeaLevel = false;
                    downHill++;
                }
            }
        }
        return result;

    }

    // chat gpt simplified logic
    // public static int countingValleys(int steps, String path) {
    //     int level = 0;
    //     int valleys = 0;

    //     for (char c : path.toCharArray()) {
    //         if (c == 'U') {
    //             if (level == -1) {
    //                 valleys++;
    //             }
    //             level++;
    //         } else if (c == 'D') {
    //             level--;
    //         }
    //     }

    //     return valleys;
    // }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

