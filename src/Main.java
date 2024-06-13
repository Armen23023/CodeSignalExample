import java.util.*;

public class Main {
    public static void main(String[] args) {
        Single single = new Single();


        char c[][] = {{'.', '.', '.', '.', '.', '.', '5', '.', '.'},
                     {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                     {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                     {'9', '3', '.', '.', '2', '.', '4', '.', '.'},
                     {'.', '.', '7', '.', '.', '.', '3', '.', '.'},
                     {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                     {'.', '.', '.', '3', '4', '.', '.', '.', '.'},
                     {'.', '.', '.', '.', '.', '3', '.', '.', '.'},
                     {'.', '.', '.', '.', '.', '5', '2', '.', '.'}};

        System.out.println(single.solution(c));


    }
}

class Single {

    boolean solution(char[][] grid) {

        HashSet set = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != '.') {
                    if (!set.add(grid[i][j])) {
                        return false;
                    }
                }
            }
            set.clear();
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[j][i] != '.') {
                    if (!set.add(grid[j][i])) {
                        return false;
                    }
                }
            }
            set.clear();
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l < j+3; l++) {
                        if (grid[k][l] != '.') {
                            if (!set.add(grid[k][l])) {
                                return false;
                            }
                        }
                    }
                }
                set.clear();
            }
        }

        return true;
    }


}

