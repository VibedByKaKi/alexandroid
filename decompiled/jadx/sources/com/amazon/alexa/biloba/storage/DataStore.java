package com.amazon.alexa.biloba.storage;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class DataStore {
    private MutableLiveData<Boolean> loading = new MutableLiveData<>();
    private MutableLiveData<Throwable> error = new MutableLiveData<>();

    public void clear() {
        this.loading = new MutableLiveData<>();
        this.error = new MutableLiveData<>();
    }

    public LiveData<Throwable> getError() {
        return this.error;
    }

    public LiveData<Boolean> getIsLoading() {
        return this.loading;
    }

    public void postError(Throwable th) {
        this.error.setValue(th);
    }

    public void setIsLoading(Boolean bool) {
        this.loading.setValue(bool);
    }
}
