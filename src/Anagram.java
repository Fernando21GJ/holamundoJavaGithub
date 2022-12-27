
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ferna
 */
public class Anagram {

    public static void main(String[] args) {
        String a = "anagram";
        String b = "nagaram";

        System.out.println(isAnagram(a, b));

        String[] words = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list = groupAnagrams(words);

        for (List<String> l : list) {
            System.out.println(l);
        }
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int[] letters = new int[256];

        for (char c : a.toCharArray()) {
            letters[c]++;
        }

        for (char c : b.toCharArray()) {
            letters[c]--;
        }
        for (int i : letters) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static String generateHash(String s) {
        Map<Character, Integer> map = new HashMap();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for (char c : map.keySet()) {
            int val = map.get(c);
            sb.append(val + c);
        }

        return sb.toString();
    }

    public static List<List<String>> groupAnagrams(String[] words) {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String s : words) {
            String hash = generateHash(s);

            if (map.containsKey(hash)) {
                map.get(hash).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(hash, list);
            }
        }

        for (List<String> l : map.values()) {
            output.add(l);
        }
        return output;
    }
}
