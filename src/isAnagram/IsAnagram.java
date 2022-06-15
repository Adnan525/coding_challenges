package isAnagram;

import java.util.HashMap;

public class IsAnagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        HashMap<Character, Integer> strA = makeHashMap(a);
        HashMap<Character, Integer> strB = makeHashMap(b);

        if(strA.keySet().equals(strB.keySet()))
        {
            for(Character c : strA.keySet())
            {
                if(strA.get(c) != strB.get(c))
                    return false;
            }
            return true;
        }
        else
            return false;

    }
    public static HashMap<Character, Integer> makeHashMap(String str)
    {
        HashMap<Character, Integer> res = new HashMap<>();
        for(int i = 0; i <= str.length() -1; i++)
        {
            Character target = str.charAt(i);
            if(res.containsKey(target))
                res.replace(target, res.get(target) + 1);
            else
                res.put(target, 1);
        }
        return res;
    }
    public static boolean solution (String a, String b)
    {
        char aa[] = a.toLowerCase().toCharArray();
        char bb[] = b.toLowerCase().toCharArray();
        if(a.length() != b.length()){
            return false;
        }else{
            java.util.Arrays.sort(aa);
            java.util.Arrays.sort(bb);
            return java.util.Arrays.equals(aa, bb);
        }
    }
}
