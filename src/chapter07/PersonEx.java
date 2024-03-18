package chapter07;

public class PersonEx {
    public static void main(String[] args) {
        Person father = new Person();
        Person mother = new Person();

        father.name = "홍길동";
        mother.name = "홍홍홍";

        father.age = 50;
        mother.age = 40;

        father.gender = "남";
        mother.gender = "여";

        father.height = 180;
        mother.height = 167;

        father.weight = 75;
        mother.weight = 55;


        System.out.println("아빠 이름 : "+ father.name +"아빠 성별 : " + father.gender + "아빠 나이 : " + father.age + "아빠 키 : " + father.height + "아빠 몸무게 : " + father.weight );
        System.out.println("엄마 이름 : "+ mother.name +"엄마 성별 : " + mother.gender + "엄마 나이 : " + mother.age + "엄마 키 : " + mother.height + "엄마 몸무게 : " + mother.weight );


    }
}
