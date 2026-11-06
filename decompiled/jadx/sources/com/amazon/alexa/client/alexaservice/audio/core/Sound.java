package com.amazon.alexa.client.alexaservice.audio.core;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class Sound {
    private static final String TAG = "Sound";
    private static final long TIMEOUT_SECONDS = 2;
    private final CountDownLatch countDownLatch = new CountDownLatch(1);
    private boolean hasLoaded;
    private boolean loadedSuccessfully;
    private final int sampleId;
    private final SoundName soundName;

    public Sound(SoundName soundName, int i) {
        this.soundName = soundName;
        this.sampleId = i;
    }

    public int getId() {
        return this.sampleId;
    }

    public SoundName getSoundName() {
        return this.soundName;
    }

    public boolean isReady() {
        return this.hasLoaded && this.loadedSuccessfully;
    }

    public void setLoaded(boolean z) {
        this.hasLoaded = true;
        this.loadedSuccessfully = z;
        this.countDownLatch.countDown();
    }

    public boolean waitForLoad() {
        try {
            this.countDownLatch.await(2L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Log.e(TAG, "Loading sound interrupted: " + this.sampleId);
        }
        return this.loadedSuccessfully;
    }
}
