package com.example.json;

import java.util.ArrayList;
import java.util.List;

public class Quiz {
    private String Quiz;
    private String Sport;
    private String Q1;
    private String Question;
    public ArrayList<QuizInfo> objectQuizInfo;
    private String Answer;


    public Quiz(String quiz, String sport, String q1, String question, ArrayList<QuizInfo> objectQuizInfo, String answer) {
        Quiz = quiz;
        Sport = sport;
        Q1 = q1;
        Question = question;
        this.objectQuizInfo = objectQuizInfo;
        Answer = answer;
    }

    public String getQuiz() {
        return Quiz;
    }

    public String getSport() {
        return Sport;
    }

    public String getQ1() {
        return Q1;
    }

    public String getQuestion() {
        return Question;
    }

    public List<QuizInfo> getObjectQuizInfo() {
        return objectQuizInfo;
    }

    public String getAnswer() {
        return Answer;
    }
}
