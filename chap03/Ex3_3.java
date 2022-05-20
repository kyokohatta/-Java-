// P135  練習問題 3-3

public class Ex3_3 {
    public static void main(String[] args) {
        int isHungry = new java.util.Random().nextInt(2) ; // 0 か 1 が入る。
        String food = "おでん";
        System.out.println("こんにちは");
        
        if (isHungry == 0) {
            System.out.println("お腹いっぱいです。");
        } else {
            System.out.println("はらぺこです。");
            System.out.println(food + "を、いただきます。");
        }
        System.out.println("ごちそうさまでした。");
    }
}