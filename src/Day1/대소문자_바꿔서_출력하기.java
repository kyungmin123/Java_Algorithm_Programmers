package Day1;

import java.util.Scanner;

public class 대소문자_바꿔서_출력하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];

            charArray[i] = _convertCase(ch);
        }

        System.out.println(charArray);
    }

    private static char _convertCase(char ch) {
        char convertedCharacter;

        if (Character.isUpperCase((ch))) {
            convertedCharacter = Character.toLowerCase((ch));
        }
        else {
            convertedCharacter = Character.toUpperCase((ch));
        }

        return convertedCharacter;
    }
}
