package com.amazon.comms.calling.domain.model.dataChannel;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.b;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/EffectsMetric;", "", "type", "", ShortcutConstants.METRIC_NAME_KEY, "value", "", "dimensions", "Ljava/util/HashMap;", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/util/HashMap;)V", "getType", "()Ljava/lang/String;", "getMetricName", "getValue", "()D", "getDimensions", "()Ljava/util/HashMap;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class EffectsMetric {

    @SerializedName("dimensions")
    @NotNull
    private final HashMap<String, String> dimensions;

    @SerializedName(ShortcutConstants.METRIC_NAME_KEY)
    @NotNull
    private final String metricName;

    @SerializedName("type")
    @NotNull
    private final String type;

    @SerializedName("value")
    private final double value;

    public EffectsMetric(@NotNull String str, @NotNull String str2, double d, @NotNull HashMap<String, String> hashMap) {
        str.getClass();
        str2.getClass();
        hashMap.getClass();
        this.type = str;
        this.metricName = str2;
        this.value = d;
        this.dimensions = hashMap;
    }

    public static /* synthetic */ EffectsMetric copy$default(EffectsMetric effectsMetric, String str, String str2, double d, HashMap hashMap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = effectsMetric.type;
        }
        if ((i & 2) != 0) {
            str2 = effectsMetric.metricName;
        }
        if ((i & 4) != 0) {
            d = effectsMetric.value;
        }
        if ((i & 8) != 0) {
            hashMap = effectsMetric.dimensions;
        }
        HashMap hashMap2 = hashMap;
        return effectsMetric.copy(str, str2, d, hashMap2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMetricName() {
        return this.metricName;
    }

    /* renamed from: component3, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    @NotNull
    public final HashMap<String, String> component4() {
        return this.dimensions;
    }

    @NotNull
    public final EffectsMetric copy(@NotNull String type, @NotNull String metricName, double value, @NotNull HashMap<String, String> dimensions) {
        type.getClass();
        metricName.getClass();
        dimensions.getClass();
        return new EffectsMetric(type, metricName, value, dimensions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EffectsMetric)) {
            return false;
        }
        EffectsMetric effectsMetric = (EffectsMetric) other;
        return Intrinsics.areEqual(this.type, effectsMetric.type) && Intrinsics.areEqual(this.metricName, effectsMetric.metricName) && Double.compare(this.value, effectsMetric.value) == 0 && Intrinsics.areEqual(this.dimensions, effectsMetric.dimensions);
    }

    @NotNull
    public final HashMap<String, String> getDimensions() {
        return this.dimensions;
    }

    @NotNull
    public final String getMetricName() {
        return this.metricName;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    public final double getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.dimensions.hashCode() + AppLaunchChecker$$ExternalSyntheticOutline0.m(this.value, b.a(this.metricName, this.type.hashCode() * 31, 31), 31);
    }

    @NotNull
    public String toString() {
        String str = this.type;
        String str2 = this.metricName;
        double d = this.value;
        HashMap<String, String> hashMap = this.dimensions;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("EffectsMetric(type=", str, ", metricName=", str2, ", value=");
        m.append(d);
        m.append(", dimensions=");
        m.append(hashMap);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }
}
