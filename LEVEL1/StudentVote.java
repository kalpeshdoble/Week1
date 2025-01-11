import java.util.Scanner;

public class StudentVote {
    public static void main(String[] args) {
        int studentNumbe r =10;
        int studentAge[]= n ew 
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < studentNumber; i++) {
            studentAge[i] = sc.nextInt();
        }
        for (int i = 0; i < studentNumber; i++) {
            if (studentAge[i] >= 18) {
                System.out.println("The student with the age " + studentAge[i] + " can vote");
            } else {
                System.out.println("The student with the age " + studentAge[i] + " can not vote");
            }
        }
    }

}
