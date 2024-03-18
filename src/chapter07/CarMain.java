package chapter07;

public class CarMain {
    public static void main(String[] args) {

        Car tico = new Car();
        Car pride = new Car();

        tico.color = "화이트";
        tico.company = "대우";
        tico.type = "경차";

        pride.color = "블랙";
        pride.company = "기아";
        pride.type = "소형";

        //메소드 호출
        tico.go();  // 전진하다
        pride.back(); // 후진하다

        System.out.println("tico 자동차 : "+" 색상은 " + tico.color + "제조사는 " + tico.company + "타입은" + tico.type) ;
        System.out.println("pride 자동차 : "+" 색상은 " + pride.color + "제조사는 " + pride.company + "타입은" + pride.type) ;



    }
}
