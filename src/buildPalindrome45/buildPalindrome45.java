package buildPalindrome45;


/*
Given a string, find the shortest possible string which can be achieved by
 adding characters to the end of initial string to make it a palindrome.
 */
public class buildPalindrome45 {
    String solution(String st) {
        StringBuilder forward = new StringBuilder(st);
        StringBuilder backward = new StringBuilder(st);


        int j = st.length() - 1;
        for (int i = 0; i < st.length(); ) {
            if (!(forward.charAt(i) == backward.charAt(j))) {
                if (i >= st.length()-1){
                    backward.insert(i , forward.charAt(i));
                }else {
                    backward.insert(j + 1, forward.charAt(i));
                }
                i = 0;
                j = backward.length() - 1;
            } else {
                j--;
                i++;
            }
        }
        return backward.toString();

    }

}
