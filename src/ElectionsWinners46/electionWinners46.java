package ElectionsWinners46;

public class electionWinners46 {

    int solution(int[] votes, int k) {

        int maxVote = votes[0];
        int b = 0;
        for (int i : votes) {
            if (maxVote < i) maxVote = i;
        }

        int c = 0;
        for (int i = 0; i < votes.length; i++) {
            if (votes[i] + k > maxVote) {
                c++;
            }
            if (votes[i] == maxVote) b++;
        }

        if (c == 0 && b < 2) return 1;


        return c;
    }


}
