public class Main {
    public static  boolean testScore (int interviewScore, int englishscore){
        boolean isOK;
        if (interviewScore > 70||englishscore > 50){
            isOK= true;
        }else{
            isOK= false;
        }
        return  isOK;
    }

    public static void main(String[] args) {
        System.out.println(testScore(75, 40));
        System.out.println(testScore(75, 60));
    }

}
