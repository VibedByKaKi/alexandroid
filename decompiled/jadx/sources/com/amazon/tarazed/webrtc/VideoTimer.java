package com.amazon.tarazed.webrtc;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0010\u001a\u00020\u0004H\u0001¢\u0006\u0002\b\u0011J\r\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\r\u0010\u0015\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/amazon/tarazed/webrtc/VideoTimer;", "", "()V", "elapsedTimeMs", "", VoiceChatContract.COLUMN_IS_ACTIVE, "", "isActive$TarazedAndroidLibrary_release$annotations", "isActive$TarazedAndroidLibrary_release", "()Z", "setActive$TarazedAndroidLibrary_release", "(Z)V", "lastStartTimeMs", "timerLength", "getTimerLength$TarazedAndroidLibrary_release", "()J", "currentTime", "currentTime$TarazedAndroidLibrary_release", "start", "", "start$TarazedAndroidLibrary_release", "stop", "stop$TarazedAndroidLibrary_release", "timeSinceLastStart", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class VideoTimer {
    private long elapsedTimeMs;
    private boolean isActive;
    private long lastStartTimeMs;

    private final long timeSinceLastStart() {
        return currentTime$TarazedAndroidLibrary_release() - this.lastStartTimeMs;
    }

    @VisibleForTesting
    public final long currentTime$TarazedAndroidLibrary_release() {
        return System.currentTimeMillis();
    }

    public final long getTimerLength$TarazedAndroidLibrary_release() {
        boolean z = this.isActive;
        long j = this.elapsedTimeMs;
        return z ? j + timeSinceLastStart() : j;
    }

    /* renamed from: isActive$TarazedAndroidLibrary_release, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final void setActive$TarazedAndroidLibrary_release(boolean z) {
        this.isActive = z;
    }

    public final void start$TarazedAndroidLibrary_release() {
        if (this.isActive) {
            return;
        }
        this.isActive = true;
        this.lastStartTimeMs = currentTime$TarazedAndroidLibrary_release();
    }

    public final void stop$TarazedAndroidLibrary_release() {
        if (this.isActive) {
            this.isActive = false;
            this.elapsedTimeMs += timeSinceLastStart();
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void isActive$TarazedAndroidLibrary_release$annotations() {
    }
}
