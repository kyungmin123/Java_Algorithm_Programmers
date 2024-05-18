package Day2;

public class 문자열_겹쳐쓰기 {
    private static String solution(String my_string, String overwrite_string, int s) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++) {
            if (s <= i && i - s < overwrite_string.length()) {
                answer += overwrite_string.charAt(i - s);
            } else {
                answer += my_string.charAt(i);
            }
        }

//        다른 풀이 (더 좋은 풀이 방법인 것 같다.)
//        String before = my_string.substring(0, s);
//        String after = my_string.substring(s + overwrite_string.length());
//        return before + overwrite_string + after;

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
        System.out.println(solution("Program29b8UYP", "merS123", 7));
    }
}
