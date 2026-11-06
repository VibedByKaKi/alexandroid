package com.amazon.alexa.client.alexaservice.audio.core;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class FuturePlayingSound implements PlayingSound {
    private static final String TAG = "FuturePlayingSound";
    private static final int taskGetTimeout = 5000;
    private final FutureTask<Integer> task;

    public FuturePlayingSound(FutureTask<Integer> futureTask) {
        this.task = futureTask;
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.PlayingSound
    public void cancel() {
        this.task.cancel(true);
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.PlayingSound
    public int getStreamId() {
        try {
            if (this.task.isCancelled()) {
                return -1;
            }
            return this.task.get(5000L, TimeUnit.MILLISECONDS).intValue();
        } catch (InterruptedException unused) {
            Log.e(TAG, "Could not get sound streamId due to it being Interrupted");
            return -1;
        } catch (CancellationException unused2) {
            Log.e(TAG, "Could not get sound streamId due to it being cancelled before playing");
            return -1;
        } catch (ExecutionException unused3) {
            Log.e(TAG, "Could not get sound streamId due to it being interrupted");
            return -1;
        } catch (TimeoutException unused4) {
            Log.e(TAG, "Could not get sound streamId due to task taking too long to execute");
            return -1;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.audio.core.PlayingSound
    public boolean hasStarted() {
        return !this.task.isCancelled() && this.task.isDone();
    }

    @VisibleForTesting
    public boolean isCancelled() {
        return this.task.isCancelled();
    }
}
