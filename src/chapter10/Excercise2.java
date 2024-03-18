package chapter10;

public class Excercise2 {
    public static void main(String[] args) {
        //name을 출력하는 코드 작성
        System.out.println(new Out().new In().name );

    //    String name = new String();
    //    System.out.println("자바");
    }
}
class Out{
    class In{
        String name = "자바";
    }
}
