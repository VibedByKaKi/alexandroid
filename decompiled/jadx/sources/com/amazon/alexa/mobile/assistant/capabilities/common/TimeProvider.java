package com.amazon.alexa.mobile.assistant.capabilities.common;

import android.os.SystemClock;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/common/TimeProvider;", "", "<init>", "()V", "now", "", "currentTimeMillis", "", "elapsedRealTime", "getCurrentTimestamp", "Ljava/util/Date;", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TimeProvider {
    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final long elapsedRealTime() {
        return SystemClock.elapsedRealtime();
    }

    @NotNull
    public final Date getCurrentTimestamp() {
        return new Date();
    }

    @NotNull
    public final String now() {
        return AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m();
    }
}
