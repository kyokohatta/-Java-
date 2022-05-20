// フォルダ内全てのコンパイルの仕方「javac *.java」
// メソッドが違えば、同じ変数を定義できる。


public class Person {
    String name = "Taro";
    int age = 35;

    public void look() {
        String name = "Goro";
        int age = 40;
        System.out.println("look_name" + name);
        System.out.println("look_age" + age);
    }

    public void wahaha() {
        String name = "Jiro";
        int age = 50;
    }
}