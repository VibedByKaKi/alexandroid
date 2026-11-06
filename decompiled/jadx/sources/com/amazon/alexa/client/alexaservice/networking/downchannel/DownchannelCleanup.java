package com.amazon.alexa.client.alexaservice.networking.downchannel;

import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DownchannelCleanup implements Runnable {
    private static final String TAG = "DownchannelCleanup";
    private final Downchannel downchannel;

    public DownchannelCleanup(Downchannel downchannel) {
        this.downchannel = downchannel;
    }

    @Override // java.lang.Runnable
    public void run() {
        Log.i(TAG, "Cleaning up downchannel.");
        this.downchannel.cancel(true);
    }
}
