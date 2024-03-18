package oop1;

public class MusicPlayerProcedure {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // mp 켜기 -> 볼륨 증가 -> 볼륨 감소 -> mp 현 상태 출력

        isOn = true;
        System.out.println("mp 시작합니다.");

        volume++;
        System.out.println("volume ++ : " + volume);

        volume++;
        System.out.println("volume ++ : " + volume);

        volume--;
        System.out.println("volume -- : " + volume);

        System.out.println("mp의 현재상태 확인");
        if (isOn) {
            System.out.println("mp는 ON 상태이고 ,  볼륨 : " + volume);
        } else {
            System.out.println("mp는 OFF 상태!!!");
        }
    }
}
