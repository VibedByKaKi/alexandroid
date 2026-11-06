package com.amazon.comms.calling.foundation.metrics.api;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\tJ\b\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u000bH&¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/api/CounterMetric;", "Lcom/amazon/comms/calling/foundation/metrics/api/OperationalMetric;", "name", "", JsonFields.COMPONENT, "subComponent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "ownerIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "incrementCounter", "", "incrementCounterBy", "value", "", "getMetricCount", "resetCounter", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public abstract class CounterMetric extends OperationalMetric {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterMetric(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
        super(str, str2, str3, str4, OperationalMetricType.COUNTER);
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str4);
    }

    public abstract long getMetricCount();

    public abstract void incrementCounter();

    public abstract void incrementCounterBy(long value);

    public abstract void resetCounter();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CounterMetric(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        super(str, str2, str3, OperationalMetricType.COUNTER);
        str.getClass();
        str2.getClass();
    }
}
