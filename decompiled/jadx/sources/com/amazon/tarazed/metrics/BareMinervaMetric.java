package com.amazon.tarazed.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.minerva.client.common.api.MetricEvent;
import com.amazon.minerva.client.common.api.Predefined;
import com.amazon.minerva.client.thirdparty.configuration.MetricsConfigurationConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001d\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\bH\u0000¢\u0006\u0002\b\u0017J\u0015\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\fH\u0000¢\u0006\u0002\b\u001aJ\u001b\u0010\u001b\u001a\u00020\u00142\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u001dH\u0000¢\u0006\u0002\b\u001eJ\u001d\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0000¢\u0006\u0002\b J\u001d\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u0007H\u0000¢\u0006\u0002\b%R*\u0010\u0005\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b`\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u0004¢\u0006\u0002\n\u0000R8\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006j\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007`\t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/amazon/tarazed/metrics/BareMinervaMetric;", "", "sampleRate", "", "(I)V", "metricEventDoubles", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "metricEventPredefineds", "Ljava/util/ArrayList;", "Lcom/amazon/minerva/client/common/api/Predefined;", "Lkotlin/collections/ArrayList;", "metricEventStrings", "getMetricEventStrings$TarazedAndroidLibrary_release$annotations", "()V", "getMetricEventStrings$TarazedAndroidLibrary_release", "()Ljava/util/HashMap;", "addDouble", "", "key", "value", "addDouble$TarazedAndroidLibrary_release", "addPredefined", "predefined", "addPredefined$TarazedAndroidLibrary_release", "addPredefineds", "predefineds", "", "addPredefineds$TarazedAndroidLibrary_release", "addString", "addString$TarazedAndroidLibrary_release", "populateMinervaMetric", "Lcom/amazon/minerva/client/common/api/MetricEvent;", FragmentMetaData.GROUP_ID, MetricsConfigurationConstants.SCHEMA_ID, "populateMinervaMetric$TarazedAndroidLibrary_release", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class BareMinervaMetric {

    @NotNull
    private final HashMap<String, Double> metricEventDoubles;

    @NotNull
    private final ArrayList<Predefined> metricEventPredefineds;

    @NotNull
    private final HashMap<String, String> metricEventStrings;
    private final int sampleRate;

    public BareMinervaMetric(int i) {
        this.sampleRate = i;
        this.metricEventStrings = new HashMap<>();
        this.metricEventPredefineds = new ArrayList<>();
        this.metricEventDoubles = new HashMap<>();
    }

    public final void addDouble$TarazedAndroidLibrary_release(@NotNull String key, double value) {
        key.getClass();
        this.metricEventDoubles.put(key, Double.valueOf(value));
    }

    public final void addPredefined$TarazedAndroidLibrary_release(@NotNull Predefined predefined) {
        predefined.getClass();
        this.metricEventPredefineds.add(predefined);
    }

    public final void addPredefineds$TarazedAndroidLibrary_release(@NotNull List<? extends Predefined> predefineds) {
        predefineds.getClass();
        Iterator<? extends Predefined> it2 = predefineds.iterator();
        while (it2.hasNext()) {
            addPredefined$TarazedAndroidLibrary_release(it2.next());
        }
    }

    public final void addString$TarazedAndroidLibrary_release(@NotNull String key, @NotNull String value) {
        key.getClass();
        value.getClass();
        this.metricEventStrings.put(key, value);
    }

    @NotNull
    public final HashMap<String, String> getMetricEventStrings$TarazedAndroidLibrary_release() {
        return this.metricEventStrings;
    }

    @NotNull
    public final MetricEvent populateMinervaMetric$TarazedAndroidLibrary_release(@NotNull String groupId, @NotNull String schemaId) {
        groupId.getClass();
        schemaId.getClass();
        MetricEvent metricEvent = new MetricEvent(groupId, schemaId, this.sampleRate);
        for (Map.Entry<String, String> entry : this.metricEventStrings.entrySet()) {
            metricEvent.addString(entry.getKey(), entry.getValue());
        }
        Iterator<Predefined> it2 = this.metricEventPredefineds.iterator();
        while (it2.hasNext()) {
            metricEvent.addPredefined(it2.next());
        }
        for (Map.Entry<String, Double> entry2 : this.metricEventDoubles.entrySet()) {
            metricEvent.addDouble(entry2.getKey(), entry2.getValue().doubleValue());
        }
        return metricEvent;
    }

    @VisibleForTesting
    public static /* synthetic */ void getMetricEventStrings$TarazedAndroidLibrary_release$annotations() {
    }

    public BareMinervaMetric() {
        this(0, 1, null);
    }

    public /* synthetic */ BareMinervaMetric(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 100 : i);
    }
}
