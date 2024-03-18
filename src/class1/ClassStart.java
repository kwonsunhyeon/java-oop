package class1;

public class ClassStart {
    public static void main(String[] args) {
//        int형 배열 scores 를 10개 생성합니다.
//        int[] scores = new int[10];

        //학생 이름 배열 생성
        String[] studentNames = {"kim", "lee", "park", "choi"}; // studentNames.length = 3
        int[] scores ={100, 90, 80, 70}; // scores.length = 3
        int[] ages= {10, 20, 30, 40}; // ages.length = 3

        for(int i = 0; i <studentNames.length; i++ ) {
            System.out.println("name : "+studentNames[i]+"score : "+ scores[i]+"age : "+ages[i]);
        }


    }
}
