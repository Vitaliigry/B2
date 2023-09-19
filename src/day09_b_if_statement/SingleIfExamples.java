package day09_b_if_statement;

public class SingleIfExamples {
    public static void main(String[] args) {
        if(false) {
            System.out.println("Hello World!"); // since our condition is false, the body of the if statement (code block of if statement is skipped
            System.out.println("second line");
        }

        if (true){
            System.out.println("toaday is saturday");
        }

        int score = 75;
        if (score >= 75 ){
            System.out.println("You pass exam ");
        }
        if (score < 75){
            System.out.println("fail");
        }

        System.out.println();
        int year = 2021;
        boolean isLockdown = year == 2022 || year == 2021;

        if(isLockdown){
            System.out.println("Stay at Home");
            System.out.println("Study Java");
            System.out.println("When you study put your mask on");
        }
         /// statement does not depends on each other
        if (!isLockdown){
            System.out.println("Party");
            System.out.println("This is not a normal party. Its Java party");
            System.out.println("Travel");
        }

    }
}
