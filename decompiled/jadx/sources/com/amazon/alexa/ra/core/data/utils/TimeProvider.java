package com.amazon.alexa.ra.core.data.utils;

import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/ra/core/data/utils/TimeProvider;", "", "<init>", "()V", "currentTimeMillis", "", "elapsedRealTime", "ui-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class TimeProvider {
    public static final int $stable = 0;

    public final long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public final long elapsedRealTime() {
        return SystemClock.elapsedRealtime();
    }
}
