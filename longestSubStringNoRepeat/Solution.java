// does not work cause it's subsequence, not substring
package longestSubStringNoRepeat;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash_Set = new HashSet<Character>();
        Character[] charObjectArray = s.chars().mapToObj(c -> (char)c).toArray(Character[]::new); 
        for (Character c : charObjectArray)
            hash_Set.add(c);
        return hash_Set.size();
    }
    
}
