package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;
    /**
     * 생성자
     * 1. 생성자는 클래스 이름과 같아야 한다.
     * 2. 생성자 리턴 타입이 없으므로 비워둔다.
     * 3. 멤버 변수를 초기화하는 역할
     * 4. 객체를 생성하는 시점에 어떤 작업을 하고 싶은 경우
     */
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name +" ,  age = " + age + " , grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
