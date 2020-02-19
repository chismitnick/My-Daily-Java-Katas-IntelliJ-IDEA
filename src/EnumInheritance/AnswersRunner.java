package EnumInheritance;

public class AnswersRunner {
    static void answer(Answers results) {
        switch (results) {
            case NO:
                System.out.println("No");
                break;
            case YES:
                System.out.println("Yes");
                break;
            case MAYBE:
                System.out.println("Maybe");
                break;
            case LATER:
                System.out.println("Later");
                break;
            case SOON:
                System.out.println("Soon");
                break;
            case NEVER:
                System.out.println("Never");
                break;

        }
    }

    public static void main(String[] args) {
        Questions questions = new Questions();
        answer(questions.answers());
        answer(questions.answers());
        answer(questions.answers());
        answer(questions.answers());
    }
}