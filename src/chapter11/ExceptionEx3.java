package chapter11;

import java.sql.Connection;

public class ExceptionEx3 {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("org.maridb.jdbc.Driver");
        }catch (ClassNotFoundException e){
            System.out.println("해당 클래스가 없습니다. 다운받아 설치하세요");
        }finally {
            System.out.println("DB 연결 종료합니다.");
        }

    }
}
