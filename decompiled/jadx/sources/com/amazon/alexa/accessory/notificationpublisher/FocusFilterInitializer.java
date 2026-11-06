package com.amazon.alexa.accessory.notificationpublisher;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.alexa.accessory.frames.TopContactProvider$$ExternalSyntheticLambda0;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import com.dee.app.data.api.ElementLocalStorage;
import dagger.Lazy;
import okhttp3.OkHttpClient;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class FocusFilterInitializer {
    private static final String TAG = "FocusFilterInitializer";
    private final Context context;
    private final Lazy<ElementLocalStorage> elementLocalStorageLazy;
    private FocusFilter focusFilter;
    private final Lazy<OkHttpClient> okHttpClientLazy;

    public FocusFilterInitializer(Context context, Lazy<OkHttpClient> lazy, Lazy<ElementLocalStorage> lazy2) {
        this.context = context;
        this.okHttpClientLazy = lazy;
        this.elementLocalStorageLazy = lazy2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0() {
        this.focusFilter = new FocusFilter();
    }

    public void initialize() {
        Log.i(TAG, "initializing");
        FocusFilter.initDependencies(this.context, this.okHttpClientLazy, this.elementLocalStorageLazy);
        new Handler(Looper.getMainLooper()).post(new TopContactProvider$$ExternalSyntheticLambda0(this, 8));
    }
}
