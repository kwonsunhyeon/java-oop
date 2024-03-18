package chapter07;

public class SingletonMain {
    public static void main(String[] args) {
        //Singleton s =new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
}