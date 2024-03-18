package chapter07;

public class Excercise11 {
    public static void main(String[] args) {

        int[] arr = {9, 5, 24, 13, 3, 21};

        Math m = new Math();
        int max = m.max(arr);
        int min = m.min(arr);

        System.out.println("최대값 : "+max);
        System.out.println("최소값 : "+min);

    }
}

class Math {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
      public int max(int[] arr) {
        for (int i: arr) {
            if (i  > max) {
                max = i;
            }
        }
        return max;
    }
        public int min (int[] arr) {
            for (int i : arr) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }
    }
