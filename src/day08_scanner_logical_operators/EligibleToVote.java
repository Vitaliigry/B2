package day08_scanner_logical_operators;

public class EligibleToVote {
    public static void main(String[] args) {
         /*
    create and assign these variables:

        name
        are they citizen
        do have criminal background
        age

        sample inputs:
            "James Bond"
            true
            false
            49

    determine if they are eligible to vote,
     1)they can only vote if they are a citizen,
     and
     2)have no criminal background
     and
     3) are about age 18

    print : $name is eligible to vote: $boolean

 */
        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isNotCriminal = false;
        int age = 30;



        //                    true         true          false
        boolean isEligible = isCitizen && isNotCriminal || age >= 18;
        System.out.println(name + " is eligible to vote: " + isEligible);





    }
}
