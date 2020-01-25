package com.igris.agrigo.ui.send;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SendViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SendViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Send your queries to PhoenixIgris@gmail.com");
    }

    public LiveData<String> getText() {
        return mText;
    }
}