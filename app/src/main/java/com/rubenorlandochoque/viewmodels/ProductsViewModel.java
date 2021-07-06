package com.rubenorlandochoque.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.rubenorlandochoque.models.searchresult.Result;

import java.util.List;

public class ProductsViewModel extends ViewModel {
    private MutableLiveData<List<Result>> results;

    public MutableLiveData<List<Result>> getResults() {
        if (results == null) {
            results = new MutableLiveData<>();
        }
        return results;
    }
}