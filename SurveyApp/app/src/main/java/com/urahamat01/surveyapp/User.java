package com.urahamat01.surveyapp;

public class User {
    private String question;
    private String type;
    private String options;
    private boolean required;


    public User(String question, String type, String options, boolean required) {
        this.question = question;
        this.type = type;
        this.options = options;
        this.required = required;
    }


    public String getQuestion() {
        return question;
    }

    public String getType() {
        return type;
    }

    public String getOptions() {
        return options;
    }

    public boolean isRequired() {
        return required;
    }
}

