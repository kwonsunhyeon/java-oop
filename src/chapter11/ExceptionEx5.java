package chapter11;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {
            System.out.println(10/2);
           // throw new Exception("개발자가 강제로 예외 발생시킴.");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("시스템 강제 종료.");
        }

    }
}
