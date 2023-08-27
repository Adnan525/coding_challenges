package letter_combination_phone;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class Combination {
    public List<String> letterCombinations(String digits) {
        HashMap<String, String[]> phone = new HashMap<String, String[]>();
        phone.put("2", "abc".split(""));
        phone.put("3", "def".split(""));
        phone.put("4", "ghi".split(""));
        phone.put("5", "jkl".split(""));
        phone.put("6", "mno".split(""));
        phone.put("7", "pqrs".split(""));
        phone.put("8", "tuv".split(""));
        phone.put("9", "wxyz".split(""));

        String[] buttons = digits.split("");

        return null;
        
    }
    // public List<String> actual(List<String[]> buttons)
    // {
    //     //buttons has the actual string value as arrays like "[a,b,c], [d,e,f], [g,h,i]" etc
    //     if(buttons.size() == 0)
    //         return new String[] {""};
    //     if(buttons.size() == 1)
    //     {
    //         return buttons.get(0);
    //     }
    //     if(buttons.size() == 2)
    //     {
    //         List<String> result = new ArrayList<>();
    //         String[] str1 = buttons.get(0);
    //         String[] str2 = buttons.get(1);
    //         for(int i = 0; i<= str1.length-1; i++)
    //         {
    //             for(int j = 0; j<= str2.length-1; j++)
    //             {
    //                 // result.add(String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(j)));
    //                 result.add(str1[i] + str2[j]);
    //             }
    //         }
    //         return result.toArray(String[0]);
    //     }
    //     else
    //     {
    //         return actual(phone, buttons);
    //     }
    // }
}