public class NumberGameMain {
    public static void main(String[] args) {
        System.out.println("*****************");
        System.out.println("  数あてゲーム  ");
        System.out.println("*****************");

        System.out.println("私が考えた、0〜99までの数字を当ててください");

        int answer = new java.util.Random().nextInt(100);

        // ゲームのループ
        int input_number=0;
        while (!(answer == input_number)) { // 答えと入力内容が一致したらループを抜ける
            System.out.print("数字を入力してください: ");
            String input = new java.util.Scanner(System.in).nextLine();

            try {
                input_number = Integer.parseInt(input);
                if(input_number<answer){
                    System.out.println("答えの数字はもっと大きいです");
                }else if(input_number>answer){
                    System.out.println("答えの数字はもっと小さいです");
                }
            } catch (Exception Ex) {
                //特に書くことはない。
            }
        }
        System.out.printf("大当たり!!! 答えは　%d　でした!!!",answer);
        System.out.println("ゲームを終了します");
        System.exit(0);
    }
}