package com.exemple.item;

import android.widget.EditText;

import java.util.HashMap;
import java.util.Map;

public class QuestionnaireItem {
    private String name;
    private String description;
    private Map<Integer, EditText> freeWords;
    private Map<Integer, MultipleChociceItem> multipleChociceItems;
    private Map<Integer, RatingItem> ratingItems;
    private int elementNumber;

    public QuestionnaireItem(String name) {
        this.name = name;
        elementNumber = 0;
        freeWords = new HashMap<Integer, EditText>();
        multipleChociceItems = new HashMap<Integer, MultipleChociceItem>();
        ratingItems = new HashMap<Integer, RatingItem>();
    }
     public void addMultipleChociceItem(MultipleChociceItem multipleChociceItem){
        elementNumber++;
        multipleChociceItems.put(elementNumber,multipleChociceItem);
     }
     public void deleteMultipleChoiceItem(MultipleChociceItem multipleChociceItem){
        int number = -1;
         for (int key: multipleChociceItems.keySet()) {
                if(multipleChociceItems.get(key) == multipleChociceItem){
                    number = key;
                }
         }
         if(number != -1){
             //modositsd a sorrendet és ez térjen vissza bool -> ha
         }
     }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Map<Integer, EditText> getFreeWords() { return freeWords; }
    public Map<Integer, MultipleChociceItem> getMultipleChociceItems() { return multipleChociceItems; }
    public Map<Integer, RatingItem> getRatingItems() { return ratingItems; }
}
