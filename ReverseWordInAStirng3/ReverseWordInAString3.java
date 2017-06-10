package LeetCode.ReverseWordInAStirng3;

/**
 * Created by limin on 6/9/2017.
 * Given a string, you need to reverse the order of characters in each word within a sentence while still
 * preserving whitespace and initial word order.

 Example 1:
 Input: "Let's take LeetCode contest"
 Output: "s'teL ekat edoCteeL tsetnoc"
 */
public class ReverseWordInAString3 {

    public String reverseWords(String s){

        StringBuilder sb = new StringBuilder();
        String words[] = s.split(" ");

        for (String word : words){

            StringBuilder reverse = new StringBuilder(word);
            sb.append(reverse.reverse() + " ");
        }
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        ReverseWordInAString3 rs = new ReverseWordInAString3();
        String input = "Let's take LeetCode contest";
        String test = "s'teL ekat edoCteeL tsetnoc";
        String output = rs.reverseWords(input);
        if (output.equalsIgnoreCase(test)){
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
}
