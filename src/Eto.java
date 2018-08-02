import java.io.*;

public class Eto {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader (
                new InputStreamReader(System.in)
        );

        System.out.println("西暦を打ち込んでね");

        String seinen = br.readLine();
        int x = Integer.parseInt(seinen);

        String[] eto = {"申", "酉", "戌", "亥", "子", "丑", "寅", "卯", "辰", "巳", "午", "未"};

        int i = x % 12;

        System.out.println(eto[i] + "年生まれです");

    }



}
