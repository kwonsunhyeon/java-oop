package ref;

public class OuterDataMainSol {
    public static void main(String[] args) {
        OuterData outerData = new OuterData();
        outerData.data = new Data(); //Data 인스턴스를 만들고 BigData.data 멤버 변수에 참조값을 할당
        System.out.println("outerData.count : " + outerData.count);
        System.out.println("outerData.data : " + outerData.data); // null 값이 출력 => data 변수는 아직 아무것도 참조하고 있지 않다.
        System.out.println("outerData.data.value : "+ outerData.data.value); //NullPointerException 참조할값이 없으므로 value 값도 알 수 없다.
    }
}
