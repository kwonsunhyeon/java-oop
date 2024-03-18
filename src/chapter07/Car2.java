package chapter07;

public class Car2 {

    String color;
    String company;
    String type;

    Car2() {
        this("white", "기아", "경차");

   }
   Car2(String color, String company, String type){
        this.color = color;
        this.company=company;
        this.type=type;
   }
   // Car2클래스는 toString() 메소드를 오버라이딩(overriding)하여 객체의 차의 색상, 제조사, 유형 정보를 포함하여 문자열을 반환하여 출력
   public String toString(){
        return color  + "-" + company + "-" + type;
   }

}
