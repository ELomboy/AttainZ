package com.prjucu.attainz;


import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> alphabetQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the middle letter of A and C?", "B", "K", "L", "O", "B", "");
        final QuestionsList question2 = new QuestionsList("What is the middle letter of X and Z?", "Y", "O", "P", "Q", "Y", "");
        final QuestionsList question3 = new QuestionsList("What is the letter before B?", "A", "C", "D", "E", "A", "");
        final QuestionsList question4 = new QuestionsList("What is the letter before Z?", "B", "M", "X", "K", "Y", "");
        final QuestionsList question5 = new QuestionsList("What is the letter after O?", "P", "K", "Z", "M", "P", "");
        final QuestionsList question6 = new QuestionsList("What is the letter after C?", "D", "E", "F", "G", "D", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> numberQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the middle number of 1 and 3?", "2", "4", "6", "8", "2", "");
        final QuestionsList question2 = new QuestionsList("What is the middle number of 8 and 10?", "7", "9", "5", "4", "9", "");
        final QuestionsList question3 = new QuestionsList("What is the number before 2?", "3", "4", "5", "1", "1", "");
        final QuestionsList question4 = new QuestionsList("What is the number before 5?", "4", "3", "2", "6", "4", "");
        final QuestionsList question5 = new QuestionsList("What is the number after 5?", "6", "8", "9", "10", "6", "");
        final QuestionsList question6 = new QuestionsList("What is the number after 6?", "7", "8", "9", "10", "7", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> dayQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the middle day of monday and wednesday?", "tuesday", "saturday", "sunday", "friday", "tuesday", "");
        final QuestionsList question2 = new QuestionsList("What is the middle day of friday and sunday?", "monday", "saturday", "tuesday", "wednesday", "saturday", "");
        final QuestionsList question3 = new QuestionsList("What is the day before monday?", "sunday", "saturday", "tuesday", "friday", "sunday", "");
        final QuestionsList question4 = new QuestionsList("What is the day before friday?", "thursday", "monday", "tuesday", "saturday", "thursday", "");
        final QuestionsList question5 = new QuestionsList("What is the day after monday?", "tuesday", "wednesday", "friday", "saturday", "tuesday", "");
        final QuestionsList question6 = new QuestionsList("What is the day after friday?", "sunday", "saturday", "monday", "tuesday", "saturday", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    private static List<QuestionsList> colorQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("What is the color of star?", "yellow", "white", "black", "red", "yellow", "");
        final QuestionsList question2 = new QuestionsList("What is the color of grapes?", "yellow", "purple", "green", "white", "purple", "");
        final QuestionsList question3 = new QuestionsList("What is the color of apple?", "yellow", "red", "white", "blue", "red", "");
        final QuestionsList question4 = new QuestionsList("What is the color of clouds?", "white", "yellow", "red", "green", "white", "");
        final QuestionsList question5 = new QuestionsList("What is the color of sky?", "blue", "red", "green", "yellow", "blue", "");
        final QuestionsList question6 = new QuestionsList("What is the color of shadow?", "black", "blue", "red", "green", "black", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "alphabet":
                return alphabetQuestions();
            case "number":
                return numberQuestions();

            case "day":
                return dayQuestions();

            default:
                return colorQuestions();
        }
    }
}
