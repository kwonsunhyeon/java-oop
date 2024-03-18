package chapter11;

public class ExceptionEx03 {
    public static void main(String[] args) {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            Integer.parseInt("hello");

        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("배열 인덱스 범위를 벗어난 예외발생");
        } catch (NumberFormatException e){
            System.out.println("문자열 hello를 정수로 변환할 수 없습니다.");
        } catch (Exception e){
            System.out.println("예외 발생");
        }
    }
}