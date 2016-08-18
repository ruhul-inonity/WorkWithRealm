package com.inonity.ruhul.workwithrealm.adapter;
import android.content.Context;
import com.inonity.ruhul.workwithrealm.model.Book;

import io.realm.RealmResults;

public class RealmBooksAdapter extends RealmModelAdapter<Book> {

    public RealmBooksAdapter(Context context, RealmResults<Book> realmResults, boolean automaticUpdate) {

        super(context, realmResults, automaticUpdate);
    }
}