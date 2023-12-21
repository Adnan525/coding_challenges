package longestSubStringNoRepeat;

public class LongestSub {
    public int sublength(String s){

        //checks
        if(s.length() == 0)
            return 0;
        else if(s.length() == 1)
            return 1;

        //test
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
