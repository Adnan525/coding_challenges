package longestSubStringNoRepeat;

public class LongestSub {
    public int sublength(String s){
        String temp = "";
        int longLength = 0;
        for(int i = 0; i < s.length(); i++)
        {
            temp += s.charAt(i);
            for(int j = i+1; j<s.length(); j++)
            {
                if(!temp.contains(""+s.charAt(j)))
                {
                    temp+=s.charAt(j);
                    if(longLength<temp.length())
                    {
                        longLength = temp.length();
                    }
                }
                else
                    break;
            }
            temp = "";

        }
        return longLength;
    }
    
}
