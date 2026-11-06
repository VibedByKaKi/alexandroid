package com.amazon.deecomms.common.util;

import android.os.Looper;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class StatePoller {
    static final long SLEEP_TIME = 50;

    @NonNull
    public abstract CommsLogger getPollerLogger();

    public long getPollerSleepTime() {
        return 50L;
    }

    public abstract boolean isInExpectedState();

    public boolean isOnMainThread() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public void sleep(long j) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
    }

    public final boolean waitForExpectedState(long j) {
        if (isOnMainThread()) {
            getPollerLogger().w("Should not be called on main looper, trying isInExpectedState()");
            return isInExpectedState();
        }
        long currentTimeMillis = System.currentTimeMillis();
        while (!isInExpectedState()) {
            if (System.currentTimeMillis() - currentTimeMillis > j) {
                getPollerLogger().w("waitForExpectedState: false, exceeded max time (" + j + " ms)");
                return false;
            }
            sleep(getPollerSleepTime());
        }
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        getPollerLogger().d("waitForExpectedState: true, elapsed=" + currentTimeMillis2 + " ms");
        return true;
    }
}
