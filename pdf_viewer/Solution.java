package pdf_viewer;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.util.List;

class Result {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        int height = 0;
        for(char c : word.toCharArray()){
            int index = (int) c - 97;
            System.out.println("Index " + index);
            height = h.get(index) > height ? h.get(index) : height;
            System.out.println("Current height " + height);
        }
        return height * (word.length());

    }
    //using stream api
    public static int designerPdfViewer_stream(List<Integer> h, String word){
        return word.chars()
                .map(c -> h.get((int) c - 97))
                .max() 
                .orElse(0) * word.length();
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        int val = Result.designerPdfViewer_stream(List.of(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5), 
        "abc");
        System.out.println(val);
    }
}
