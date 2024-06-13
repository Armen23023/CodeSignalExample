package chessKnight50;

public class chessKnight50 {

    int solution(String cell) {
        char[] charArray = cell.toCharArray();
        int i = charArray[0] - 96;
        int j = Character.getNumericValue(charArray[1]);
        int count = 0;


        if ((i+2 > 0) && (i+2<9)  && (j+1 > 0) && (j+1 < 9) ) count++;
        if ((i+2 > 0) && (i+2<9)  && (j-1 > 0) && (j-1 < 9) ) count++;
        if ((i+1 > 0) && (i+1<9)  && (j+2 > 0) && (j+2 < 9) ) count++;
        if ((i-1 > 0) && (i-1<9)  && (j+2 > 0) && (j+2 < 9) ) count++;
        if ((i-2 > 0) && (i-2<9)  && (j+1 > 0) && (j+1 < 9) ) count++;
        if ((i-2 > 0) && (i-2<9)  && (j-1 > 0) && (j-1 < 9) ) count++;
        if ((i+1 > 0) && (i+1<9)  && (j-2 > 0) && (j-2 < 9) ) count++;
        if ((i-1 > 0) && (i-1<9)  && (j-2 > 0) && (j-2 < 9) ) count++;

        return count;
    }
}
