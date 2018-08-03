import java.io.*;
import java.util.Random;
public class Test {
    public static void main(String[] args) throws IOException {
//        ToDoリスト
//                全体にfor文をかける
//                勝ち負けを変数で置く
//                それを数える
        int win = 0;
        int lose = 0;
        int draw = 0;

        while(lose < 3) {
            String[] hand = {"グー", "チョキ", "パー"};
//            {   コンピューターの手
            Random rnd = new Random();
            int x = rnd.nextInt(3);
//                入力フォーム
            InputStreamReader is = new InputStreamReader(System.in);       //（１）
            BufferedReader br = new BufferedReader(is);                    //（２）

            System.out.println("何を出しますか？（0:グー，1:チョキ，2:パー）");

            String str = br.readLine();
            int y = Integer.parseInt(str);
            System.out.println("コンピューターは"+hand[x]+"を出しました。");
            switch (x) {
                case 0:
                    if (y == 0) {
                        System.out.println("あいこです。");
                        draw++;
                    } else if (y == 1) {
                        System.out.println("あなたの負けです。");
                        lose++;
                    } else {
                        System.out.println("あなたの勝ちです。");
                        win++;
                    }
                    break;
                case 1:
                    if (y == 0) {
                        System.out.println("あなたの勝ちです");
                        win++;
                    } else if (y == 1) {
                        System.out.println("あいこです。");
                        draw++;
                    } else {
                        System.out.println("あなたの負けです。");
                        lose++;
                    }
                    break;
                case 2:
                    if (y == 0) {
                        System.out.println("あなたの負けです");
                        lose++;
                    } else if (y == 1) {
                        System.out.println("あなたの勝ちです。");
                        win++;
                    } else {
                        System.out.println("あいこです。");
                        draw++;
                    }
                    break;
            }
            System.out.println("あなたは現在"+win+"勝"+lose+"敗"+draw+"分けです。");


        }
    }
}




