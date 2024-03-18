package chapter11;

public class ExceptionEx0 {
    public static void main(String[] args) {
    try {
        System.out.println(10 / 0);
    }catch (Exception e){
        System.out.println("0으로 나누기를 할 수 없습니다.");
    }
    }

}
