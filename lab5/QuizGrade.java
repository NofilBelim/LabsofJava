package Lab5;

public class QuizGrade {
        public static void main(String[] args) {

            char correct[] = {'C','A','B','D','B','C','C','A'};
            int correctCount = 0;
            int wrongCount = 0;
            int unansweredCount = 0;

            System.out.println("QUESTION  SUBMITTED  CORRECT  RESULT");

            for (int i = 0; i < correct.length; i++) {

                char submitted;
                String result;

                if (i < args.length)
                    submitted = args[i].charAt(0);
                else
                    submitted = 'X';

                if (submitted == 'X') {
                    result = "UNANSWERED";
                    unansweredCount++;
                }
                else if (submitted == correct[i]) {
                    result = "CORRECT";
                    correctCount++;
                }
                else {
                    result = "WRONG";
                    wrongCount++;
                }

                System.out.println((i+1) + "        " + submitted + "         " + correct[i] + "       " + result);
            }

            System.out.println("\nNo. of correct answers: " + correctCount);
            System.out.println("No. of wrong answers: " + wrongCount);
            System.out.println("No. of unanswered: " + unansweredCount);

            if (correctCount >= 5)
                System.out.println("Result: PASS");
            else
                System.out.println("Result: FAIL");
        }
    }

