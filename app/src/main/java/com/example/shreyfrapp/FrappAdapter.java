package com.example.shreyfrapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.shreyfrapp.shreyfrapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Shrey Gupta on 22-05-2015.
 */
public class FrappAdapter extends ArrayAdapter {

    private Context context;
    private boolean useList = true;

    public FrappAdapter(Context context,List listOffers) {
        super(context, R.layout.each_offer,listOffers);
        this.context = context;
    }

    private class ViewHolder
    {
        TextView offercode;
        TextView CompanyName;
        TextView offertype;
        TextView offervalidity;
        TextView offerdesc;
        ImageView offerImage;
        Button taptogetcode;

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder = null;

        View viewToUse = null;

        LayoutInflater mInflater = (LayoutInflater)context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        viewToUse= mInflater.inflate(R.layout.each_offer, null);
        holder = new ViewHolder();
        holder.CompanyName = (TextView)viewToUse.findViewById(R.id.CompanyName);
        Picasso.with(this.getContext()).load("https://developer.chrome.com/extensions/examples/api/idle/idle_simple/sample-128.png").into(holder.offerImage);
        holder.offercode= (TextView)viewToUse.findViewById(R.id.offerCode);
        holder.offertype = (TextView)viewToUse.findViewById(R.id.offerType);
        holder.taptogetcode = (Button)viewToUse.findViewById(R.id.offerButton);
        holder.offervalidity = (TextView)viewToUse.findViewById(R.id.offervalidity);
        holder.offerdesc = (TextView)viewToUse.findViewById(R.id.offerDesc);
        holder.taptogetcode.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(FrappAdapter.this.getContext(),OfferDetails.class);

            }
                                               });
        viewToUse = mInflater.inflate(R.layout.each_offer,null);
        return super.getView(position, convertView, parent);
    }

}