package testCode;

import java.util.Scanner;

public class code {
    public static void main(String[] args){
        sortStringByAscii();

    }
    public static void sortStringByAscii() {
        String tmp;
        System.out.println("type your input");;
        try (Scanner sc = new Scanner(System.in)) {
            tmp = sc.nextLine();
        }
        char[] charArray = tmp.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++) {
            for (int j = i + 1; j < charArray.length; j++) {
                if (charArray[i] > charArray[j]) {
                    char temp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = temp;
                }
            }
        }
        // Chuyển đổi mảng ký tự thành chuỗi kết quả
        String sortedString = new String(charArray);
        System.out.println("Chuỗi đã sắp xếp theo mã ASCII: " + sortedString);

        
    }
}
