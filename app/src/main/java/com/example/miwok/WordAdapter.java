package com.example.miwok;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
public class WordAdapter extends ArrayAdapter<Word> {
    private int color;
    public WordAdapter(Context context, ArrayList<Word> words,int color)
    {
        super(context,0,words);
        this.color = color;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView;
        listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word word = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = listItemView.findViewById(R.id.trans);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(word != null ? word.getMiwokTranslation() : null);

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView =  listItemView.findViewById(R.id.name);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(word != null ? word.getDefaultTranslation() : null);

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView imageView= listItemView.findViewById(R.id.image);
        //ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if(word.hasImage()){
            imageView.setImageResource(word.getImageResourceId());
        }
        else {
            imageView.setVisibility(View.GONE);
        }
        //iconView.setImageResource(currentAndroidFlavor.getImageResourceId());

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        View textcontainer = listItemView.findViewById(R.id.text_container);
        int col = ContextCompat.getColor(getContext(),color);
        textcontainer.setBackgroundColor(col);

        return listItemView;
    }
}
