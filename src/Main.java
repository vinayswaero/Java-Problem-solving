import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();

        //String s = "abcabcbb";
        Set<Character> set = new HashSet<>();

        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left)); //{b,c,
                left++;
            }

            set.add(s.charAt(right));//{b,c,a
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}