package Lab7;
enum Result {
    CORRECT, WRONG, NOT_ANSWERED
}

public class Q7_QuizReport {
    public static void main(String[] args) {
        char[] correctAnswers = {'C', 'A', 'B', 'D'};

        // Example submitted answers from command line
        // Example run: java Q7_QuizReport C B B D
        if (args.length != 4) {
            System.out.println("Please provide exactly 4 answers.");
            System.out.println("Example: java Q7_QuizReport C B B D");
            return;
        }

        char[] submitted = new char[4];
        for (int i = 0; i < 4; i++) {
            submitted[i] = Character.toUpperCase(args[i].charAt(0));
        }

        int correctCount = 0;
        int wrongCount = 0;

        System.out.println("QUESTION\tSUBMITTED\tCORRECT\t\tRESULT");

        for (int i = 0; i < 4; i++) {
            Result res;

            if (submitted[i] == 'X') {
                res = Result.NOT_ANSWERED;
            } else if (submitted[i] == correctAnswers[i]) {
                res = Result.CORRECT;
                correctCount++;
            } else {
                res = Result.WRONG;
                wrongCount++;
            }

            System.out.println((i + 1) + "\t\t" + submitted[i] + "\t\t" + correctAnswers[i] + "\t\t" + res);
        }

        System.out.println("\nNo. of correct answers: " + correctCount);
        System.out.println("No. of wrong answers: " + wrongCount);

        if (correctCount >= 2) {
            System.out.println("The candidate passed.");
        } else {
            System.out.println("The candidate failed.");
        }
    }
}