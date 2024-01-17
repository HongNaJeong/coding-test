import java.util.HashMap;

public class Solution9 {
    public int solution(String s) {
        HashMap<Character, Integer> sH = new HashMap<>();
        for (char x : s.toCharArray()) {
            sH.put(x, sH.getOrDefault(x, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (sH.get(s.charAt(i)) == 1) return i + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution9 T = new Solution9();
        System.out.println(T.solution("statitsics"));
        System.out.println(T.solution("aabb"));
        System.out.println(T.solution("stringshowtime"));
        System.out.println(T.solution("abcdeabcdfg"));
    }
}
