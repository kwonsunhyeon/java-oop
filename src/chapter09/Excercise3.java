package chapter09;

public class Excercise3 {
    public static void main(String[] args) {
        Player p1 = new BaseBallPlayer();
        Player p2 = new FootBallPlayer();

        playgame(p1);
        playgame(p2);

    }
    public static void playgame(Player p) {
        p.play();
    }
}
