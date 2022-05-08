package com.exemple.item;

import java.util.ArrayList;

public class RatingItem {
    private String ratingItemQuestion;
    private ArrayList<StatementItem> ratingItemStatementList;

    public RatingItem(String question) {
        this.ratingItemQuestion = question;
        this.ratingItemStatementList = new ArrayList<>();
    }

    public void addStatement(StatementItem statement){
           ratingItemStatementList.add(statement);
    }
    public void deleteStatement(String statement){
        ratingItemStatementList.remove(statement);
    }

    public void setRatingItemQuestion(String ratingItemQuestion) { this.ratingItemQuestion = ratingItemQuestion;}
    public String getRatingItemQuestion() { return ratingItemQuestion;}
    public ArrayList<StatementItem> getStatement() { return ratingItemStatementList;}
}
