package ReverseInteger;

// Given a signed 32-bit integer x, return x with its digits reversed. 
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

public class ReverseIntegerLeet {
    public int reverse(int x) {
        Boolean isNegative = false;
        if(x<0)
        {
            isNegative = true;
            x = x*-1;
        }
        StringBuilder sb = new StringBuilder(Integer.toString(x)).reverse();
        try{
            int temp = Integer.parseInt(sb.toString());
            return isNegative ? temp*-1 : temp;
        } catch(NumberFormatException e){
            return 0; 
        }
    }
    
}
