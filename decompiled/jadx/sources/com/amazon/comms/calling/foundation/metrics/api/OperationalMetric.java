package com.amazon.comms.calling.foundation.metrics.api;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0001B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nB+\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\fB3\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\rJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tR\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t@BX\u0086.¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/api/OperationalMetric;", "Lcom/amazon/comms/calling/foundation/metrics/api/BaseMetric;", "name", "", JsonFields.COMPONENT, "subComponent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "type", "Lcom/amazon/comms/calling/foundation/metrics/api/OperationalMetricType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/comms/calling/foundation/metrics/api/OperationalMetricType;)V", "ownerIdentifier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/amazon/comms/calling/foundation/metrics/api/OperationalMetricType;)V", "value", "getType", "()Lcom/amazon/comms/calling/foundation/metrics/api/OperationalMetricType;", "ofType", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public class OperationalMetric extends BaseMetric<OperationalMetric> {
    private OperationalMetricType type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationalMetric(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull OperationalMetricType operationalMetricType) {
        super(str, str2, str3, null, 8, null);
        str.getClass();
        str2.getClass();
        operationalMetricType.getClass();
        this.type = operationalMetricType;
    }

    @NotNull
    public final OperationalMetricType getType() {
        OperationalMetricType operationalMetricType = this.type;
        if (operationalMetricType != null) {
            return operationalMetricType;
        }
        Intrinsics.throwUninitializedPropertyAccessException("type");
        return null;
    }

    @NotNull
    public final OperationalMetric ofType(@NotNull OperationalMetricType type) {
        type.getClass();
        this.type = type;
        return this;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationalMetric(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        super(str, str2, str3, null, 8, null);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationalMetric(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4) {
        super(str, str2, str3, str4);
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationalMetric(@NotNull String str, @NotNull String str2, @Nullable String str3, @NotNull String str4, @NotNull OperationalMetricType operationalMetricType) {
        super(str, str2, str3, str4);
        str.getClass();
        str2.getClass();
        str4.getClass();
        operationalMetricType.getClass();
        this.type = operationalMetricType;
    }
}
