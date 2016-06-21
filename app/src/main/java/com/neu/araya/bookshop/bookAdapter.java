package com.neu.araya.bookshop;

import android.content.Context;

/**
 * Created by iMac11 on 6/21/2016 AD.
 */
public class bookAdapter {

    //Explicit
    private Context context;
    private String[]iconStrings, nameStrings, priceStrings;

    public bookAdapter(Context context, String[] iconStrings,
                       String[] nameStrings,
                       String[] priceStrings) {
        this.context = context;
        this.iconStrings = iconStrings;
        this.nameStrings = nameStrings;
        this.priceStrings = priceStrings;
    }  // Constructor

}  //Main class
