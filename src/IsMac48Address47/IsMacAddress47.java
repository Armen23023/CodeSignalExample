package IsMac48Address47;

public class IsMacAddress47 {

    boolean solution(String inputString) {

        if(inputString.length()>17 )return false;
        for (int i = 2; i < inputString.length();i+=3) {
            if (!(inputString.charAt(i) == '-')) return false;
        }
        String[] separated = inputString.split("\\-");
        if(separated.length>6 || separated.length<6 )return false;
        for (int i = 0; i < separated.length; i++) {
            if (!separated[i].matches("^[A-F0-9]+$") ) {
                return false ;
            }
        }
        return true;



    }
}
