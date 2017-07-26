package com.stephenknutter.notetoself;

public class Note {
    private String mTitle;
    private String mDescription;
    private boolean mIdea;
    private boolean mTodo;
    private boolean mImportant;

    // Title
    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    // Description
    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    // Idea
    public boolean ismIdea() {
        return mIdea;
    }

    public void setmIdea(boolean mIdea) {
        this.mIdea = mIdea;
    }

    // ToDos
    public boolean ismTodo() {
        return mTodo;
    }

    public void setmTodo(boolean mTodo) {
        this.mTodo = mTodo;
    }

    // Important
    public boolean ismImportant() {
        return mImportant;
    }

    public void setmImportant(boolean mImportant) {
        this.mImportant = mImportant;
    }

}
