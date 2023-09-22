package day10_if_statements;

public class ifWithoutBrackets {
    public static void main(String[] args) {
        //Single if statements with Brackets - which has only one statement
        if (4>2){
            System.out.println("Hello");
            System.out.println("Bye");
        }
        /// Single if statement with Brackets - which has two statements
        if (4>1){
            System.out.println("Hello 2");
            System.out.println("Bye 2");

        }
        // Single if statement withOUT BRACKETS - which can ONLY HAVE ONE statement.
        if (5 < 1)
            System.out.println("Hello without brackets ");  // IT IS RECOMMENDED to use curly brace even if you have only one statement belonging to if
            System.out.println("Another print statement");  // this one has nothing to do with if statement.
        }
    }

