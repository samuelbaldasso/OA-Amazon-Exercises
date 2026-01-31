import java.util.*;

public class DSA5 {
    public static Collection<List<String>> returningAnagrams(String[] arr) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        char[] charArr;

        for (String a : arr) {
            charArr = a.toCharArray();
            Arrays.sort(charArr);

            StringBuilder sb = new StringBuilder();

            sb.append(charArr);

            if (!hashMap.containsKey(sb.toString())) {
                hashMap.putIfAbsent(sb.toString(), new ArrayList<>());
            }

            hashMap.get(sb.toString()).add(a);
        }
        return hashMap.values();
    }

    public static void main(String[] args) {
        String[] arr = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        System.out.println(returningAnagrams(arr));
    }
}
