package com.stepwisedesigns.knax.googlebooks;

public class Book {

    private String mBookTitle;
    private String mAuthor;
    private String mISBN;
    private String mSubtitle;
    private Long mID;
    private Double mRating;
    private String mCategory;


    public Book(){

    }

    public Book(String bookTitle, String author, String ISBN, Long ID, String subtitle,double rating, String category){

        mBookTitle = bookTitle;
        mAuthor = author;
        mISBN = ISBN;
        mID = ID;
        mRating = rating;
        mCategory = category;
        mSubtitle = subtitle;
    }


    public String getmBookTitle(){
        return mBookTitle;
    }

    public String getmAuthor(){
        return mAuthor;
    }

    public String getmISBN(){
        return mISBN;
    }

    public String getmSubtitle (){return mSubtitle; }

    public Long getmID(){return  mID; }

    public int getmRating() { return mRating; }

    public String getmCategory(){ return mCategory; }
}
