package cs.edu.wap.models;

public class Quiz {
    private String[] questions = new String[]{"3 1 4 1 5", "1 1 2 3 5", "1 4 9 16 25", "2 3 5 7 11", "1 2 4 8 16"};
    private int[] answers = new int[]{9, 8, 36, 13, 32};
    private int score = 0;
    private int currentQuestion;

    public Quiz(int currentQuestion) {
        this.currentQuestion = currentQuestion;
    }


    public boolean checkAnswer(int answer) {
        return answers[this.currentQuestion] == answer;
    }

    public String[] getQuestions() {
        return questions;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getNextQuestion() {
        return this.questions[currentQuestion];
    }

    public int getCurrentQuestion() {
        return currentQuestion;
    }

    public void setCurrentQuestion(int currentQuestion) {
        this.currentQuestion = currentQuestion;
    }

    public int getQuestionCount() {
        return questions.length;
    }
}
