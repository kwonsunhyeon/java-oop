package ref;

public class OuterDataMain {
    public static void main(String[] args) {
        OuterData outerData = new OuterData();
        System.out.println("outerData.count : " + outerData.count);
        System.out.println("outerData.data : " + outerData.data); // null 값이 출력 => data 변수는 아직 아무것도 참조하고 있지 않다.
        System.out.println("outerData.data.value : "+ outerData.data.value); //NullPointerException 참조할값이 없으므로 value값도 알 수 없다.

    }
}
