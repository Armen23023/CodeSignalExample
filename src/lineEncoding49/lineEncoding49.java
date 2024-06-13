package lineEncoding49;

public class lineEncoding49 {
    String solution(String s) {
        char[] charArray = s.toCharArray();
        char l = charArray[0];
        int c = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {

            if (charArray[i] == l) {
                c++;
            } else {
                if (c > 1) {
                    sb.append(c);
                    sb.append(l);
                } else {
                    sb.append(l);
                }
                c = 1;
                l = charArray[i];
            }

        }
        if (c > 1) {
            sb.append(c);
            sb.append(l);
        } else {
            sb.append(l);
        }
        return sb.toString();

    }
}
