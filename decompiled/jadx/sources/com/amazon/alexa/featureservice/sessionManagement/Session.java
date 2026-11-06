package com.amazon.alexa.featureservice.sessionManagement;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.util.UUID;
import org.joda.time.DateTimeUtils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Session {
    private static final String TAG = "Session";

    @VisibleForTesting
    long appBackgroundedTime;
    private UUID sessionId;

    public Session() {
        UUID randomUUID = UUID.randomUUID();
        this.sessionId = randomUUID;
        Log.i(TAG, "New session created with session ID: " + randomUUID);
        this.appBackgroundedTime = -1L;
    }

    public long getAppBackgroundedTime() {
        return this.appBackgroundedTime;
    }

    public UUID getSessionId() {
        return this.sessionId;
    }

    public void setAppBackgroundedTime() {
        this.appBackgroundedTime = DateTimeUtils.currentTimeMillis();
    }
}
