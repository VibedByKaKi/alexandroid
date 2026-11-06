package com.amazon.alexa.client.alexaservice.audio.core;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExoplayerEventWaiter {
    private static final String TAG = "ExoplayerEventWaiter";
    private final Object waitForEventLock = new Object();
    private CountDownLatch waitForEventToBeSent;

    public void eventOccurred() {
        synchronized (this.waitForEventLock) {
            try {
                CountDownLatch countDownLatch = this.waitForEventToBeSent;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void startNewPlayback() {
        synchronized (this.waitForEventLock) {
            this.waitForEventToBeSent = new CountDownLatch(1);
        }
    }

    public boolean waitForEvent(long j, TimeUnit timeUnit) {
        CountDownLatch countDownLatch;
        boolean z = false;
        try {
            synchronized (this.waitForEventLock) {
                countDownLatch = this.waitForEventToBeSent;
                if (countDownLatch == null) {
                    countDownLatch = null;
                }
            }
            if (countDownLatch == null || countDownLatch.await(j, timeUnit)) {
                z = true;
            }
        } catch (InterruptedException unused) {
        }
        if (!z) {
            Log.e(TAG, "Timeout to send an event expired before event was sent");
        }
        return z;
    }
}
