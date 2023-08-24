package isPalindrome;

class StringBuilderSolution {
    public boolean isPalindrome(int x) {
        String str = "" + x;
        StringBuilder sb = new StringBuilder(str).reverse();
        if(str.equals(sb.toString()))
            return true;
        else
            return false;
        
    }
}
