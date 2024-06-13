package rotateimage;

public class rotateImage {
    int[][] solution(int[][] a) {
        int[][] tmp = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                tmp[i][j] = a[(a[j].length-1)-j][i];
            }
        }
        return tmp;

    }
}
