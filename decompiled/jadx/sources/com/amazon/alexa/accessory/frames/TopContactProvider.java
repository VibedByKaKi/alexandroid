package com.amazon.alexa.accessory.frames;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.amazon.alexa.accessory.frames.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class TopContactProvider {
    private static final String TAG = "TopContactProvider";
    private final Context context;
    private TopContact topContact;

    public TopContactProvider(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initialize$0() {
        Log.i(TAG, "TopContact initialize() called.");
        this.topContact = new TopContact();
    }

    public void initialize() {
        new Handler(Looper.getMainLooper()).post(new TopContactProvider$$ExternalSyntheticLambda0(this, 0));
    }
}
