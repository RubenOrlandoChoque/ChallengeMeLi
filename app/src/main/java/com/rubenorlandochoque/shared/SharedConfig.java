package com.rubenorlandochoque.shared;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SharedConfig {
    private static final String sharedStore = "MercadoLibreShared";
    Context context;

    public SharedConfig(Context context) {
        this.context = context;
    }

    public void setHistory(String newItem) {
        SharedPreferences settings = context.getSharedPreferences(sharedStore, 0);
        Set<String> s = new HashSet<>(settings.getStringSet("history", new HashSet<>()));
        SharedPreferences.Editor editor = settings.edit();
        s.add(newItem);
        editor.putStringSet("history", s);
        editor.apply();
    }

    public Set<String> getHistory() {
        SharedPreferences settings = context.getSharedPreferences(sharedStore, 0);
        return new HashSet<>(settings.getStringSet("history", new HashSet<>()));
    }
}
