package com.stepwisedesigns.knax.googlebooks;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.List;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Activity context, List<Book> books){
        super(context, 0, books);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout,parent,false);
        }
        Book currentBook = getItem(position);

        //Bind TextViews to data

        TextView ratingTextView = listItemView.findViewById(R.id.rating_text_view);
        String formattedRating = formatrating(currentBook.getmRating());
        ratingTextView.setText(formattedRating);

        TextView titleTextView = listItemView.findViewById(R.id.title_text_view);
        titleTextView.setText(currentBook.getmBookTitle());

        TextView subTitleTextView = listItemView.findViewById(R.id.subtitle_text_view);
        subTitleTextView.setText(currentBook.getmSubtitle());


        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        authorTextView.setText(currentBook.getmAuthor());

        TextView ISBNTextView = listItemView.findViewById(R.id.isbn_text_view);
        ISBNTextView.setText(currentBook.getmISBN());

        TextView IDTextView= listItemView.findViewById(R.id.id_text_view);
        IDTextView.setText(currentBook.getmISBN());

        return listItemView;

    }
    
    private int getRatingColor(double readerRating ){
        int readerRatingColorResourceId;
        int ratingFloor = (int)Math.floor(readerRating);
        
        switch (ratingFloor){
            case 0:
            case 1:
                readerRatingColorResourceId = R.color.rating1;
                break;
            case 2:
                readerRatingColorResourceId = R.color.rating2;
                break;
            case 3:
                readerRatingColorResourceId = R.color.rating3;
                break;
            case 4:
                readerRatingColorResourceId = R.color.rating4;
                break;
            case 5:
                readerRatingColorResourceId = R.color.rating5;
                break;
            case 6:
                readerRatingColorResourceId = R.color.rating6;
                break;
            case 7:
                readerRatingColorResourceId = R.color.rating7;
                break;
            case 8:
                readerRatingColorResourceId = R.color.rating8;
                break;
            case 9:
                readerRatingColorResourceId = R.color.rating9;
                break;
            default:
                readerRatingColorResourceId = R.color.rating10plus;
                break;
        }

        return ContextCompat.getColor(getContext(), readerRatingColorResourceId);
    }

    private String formatrating(double rating) {
        DecimalFormat ratingFormat = new DecimalFormat("0.0");
        return ratingFormat.format(rating);
    }

}
