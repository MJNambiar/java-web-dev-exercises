package Studio.Ch7FunWithQuizzes;

public abstract class Question {
    private String questions;
    private String userAnswer;
    private String correctAnswer;
    //points

    public Question (String questions, String userAnswer, String correctAnswer) {
        this.questions = questions;
        this.userAnswer = userAnswer;
        this.correctAnswer = correctAnswer;
    }

    //display answer, display question

    public abstract double gradeAnswer();

    public String getQuestions() {
        return questions;
    }

    public String getUserAnswer() {
        return userAnswer;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }


}
