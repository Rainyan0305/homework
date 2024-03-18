public class JPA107 {
    public static void main(String args[]) {
        int skill = 2, action = 1, teamgame = 3;

        int basketballGrade = calculateBasketballGrade(skill, action,teamgame);
        System.out.printf("The basketball grade is %d%n", basketballGrade);


        int baseballGrade = calculateBaseballGrade(skill, teamgame);
        System.out.printf("The baseball grade is %d", baseballGrade);
    }

    private static int calculateBasketballGrade(int skill, int action,int teamgame) {
        return skill + action+teamgame;
    }
    private static int calculateBaseballGrade(int skill, int teamgame) {
        return 10+skill + teamgame;
    }
}

