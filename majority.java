import java.util.*;

public class majority {
    public static void majorityElements(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i<n;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);}
                else{
                    map.put(nums[i], 1);
                }
            }
                for(int key: map.keySet()){
                    if(map.get(key)>n/3){
                        System.out.println(key);
                    }
                }
            }

        public static void main(String[] args){
            int nums[]= {1,3,2,5,1,3,1,5,1};
            majorityElements(nums);
        }
    }




    /*import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    static String findFreqsequence(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        HashSet<Character> maxFrequencyChars = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            maxValue = Math.max(maxValue, entry.getValue());
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                maxFrequencyChars.add(entry.getKey());
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (maxFrequencyChars.contains(c)) {
                result.append(c);
            }
        }

        return result.toString();
    }
} */




/*import java.util.Arrays;
public class Solution {
    static int[] howManyAreAnagrams(int n, int m, String[] a, String[] b) {
        // Write your code here.
        int i = 0;
         int freq = 0;
        int result[] = new int[m];
        while(i<m){
           
            for(int j =0;j<n;j++)
            {
                if(a[j].length() == b[i].length())
                {
                    char c1[] = a[j].toCharArray();
                    char c2[] = b[i].toCharArray();
                    Arrays.sort(c1);
                    Arrays.sort(c2);
                    String newa = new String(c1);
                    String newb =new String(c2);
                    if (newa.equals(newb)) {
                    freq++;}
                }
            }
            result[i] =freq;
            i++;
            freq =0;
        }
        return result;
    }
} */



/* import java.util.Arrays;

public class Solution {
    static int[] howManyAreAnagrams(int n, int m, String[] a, String[] b) {
        int[] result = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (areAnagrams(a[j], b[i])) {
                    result[i]++;
                }
            }
        }

        return result;
    }

    // Helper method to check if two strings are anagrams
    private static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }
}
 */
