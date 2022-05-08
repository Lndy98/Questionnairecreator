package com.exemple.item;

import android.widget.EditText;

import java.util.ArrayList;

public class MultipleChociceItem {
    private String question;
    private ArrayList<String> answerOptions;
    private EditText other;

    public MultipleChociceItem(String question) {
        this.question = question;
        this.answerOptions = new ArrayList<>();
    }

    public void addAnswerOption(String answerOption){
        answerOptions.add(answerOption);
    }
    public void deleteAnswerOption(String answerOption){
        answerOptions.remove(answerOption);
    }

    public String getQuestion() { return question;}
    public void setQuestion(String question) { this.question = question;}
    public ArrayList<String> getAnswerOptions() { return answerOptions;}
    public EditText getOther() { return other;}
    public void setOther(EditText other) { this.other = other; }
}
