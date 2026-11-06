package com.amazon.alexa.assistant.foundation.time;

import android.os.SystemClock;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/assistant/foundation/time/DefaultTimeProvider;", "Lcom/amazon/alexa/assistant/foundation/time/TimeProvider;", "<init>", "()V", "elapsedRealtimeMillis", "", "currentTimeMillis", "foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultTimeProvider implements TimeProvider {
    @Override // com.amazon.alexa.assistant.foundation.time.TimeProvider
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // com.amazon.alexa.assistant.foundation.time.TimeProvider
    public long elapsedRealtimeMillis() {
        return SystemClock.elapsedRealtime();
    }
}
