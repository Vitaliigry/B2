package day05_variables;

public class School {
    //*Task:
    //
    //    class name: School
    //
    //    declare and assign these variables
    //    number of students in grade 1
    //    number of students in grade 2
    //    number of students in grade 3
    //    number of students in grade 4
    //    number of students in grade 5
    //
    //    total number of students in your school
    //
    //    number of days in a year (have some half day = ~ 100.5)
    //    number of snow days in a year (double)
    //    average gpa in school (3.5) [ranges 1.0 - 4.0]
    //
    //    print all of the variables with unique messages

    public static void main(String[] args) {
        int numberOfStudentsInGrade1 = 30;
        int numberOfStudentsInGrade2 = 40;
        int numberOfStudentsInGrade3 = 25;
        int numberOfStudentsInGrade4 = 10;
        int numberOfStudentsInGrade5 = 38;

// How can I calculate total number of students?

        int totalAmountOfStudents = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;

        double numberOfDaysInAYear = 100.05;
        double numberOfSnowDaysInAyear = 10;
        double avarageGPAInSchool = 3.5;
        System.out.println("Number of Students in Grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of Students in Grade 5 " + numberOfStudentsInGrade5);
        System.out.println("Total Number of Students" + totalAmountOfStudents);
        System.out.println("Number of Snow Days " + numberOfSnowDaysInAyear);
        System.out.println("Number of days in a Year"+ numberOfDaysInAYear);
        System.out.println("Avarage GPA " + avarageGPAInSchool);
        System.out.println("avarageGPAInSchool = " + avarageGPAInSchool);

    }

}
