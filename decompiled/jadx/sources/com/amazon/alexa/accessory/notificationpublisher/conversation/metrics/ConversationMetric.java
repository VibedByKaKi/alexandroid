package com.amazon.alexa.accessory.notificationpublisher.conversation.metrics;

import androidx.compose.ui.text.input.TextFieldValue$$ExternalSyntheticLambda1;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsConstants;
import com.amazon.alexa.accessory.notificationpublisher.metrics.MetricsRecorder;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005J7\u0010\b\u001a\u00020\u00052*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b0\n\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005J?\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f2*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b0\n\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u000b¢\u0006\u0002\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u000f2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005J \u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005J\u001e\u0010\u0019\u001a\u00020\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/ConversationMetric;", "", "<init>", "()V", "name", "", "concept", "event", "context", "dimensions", "", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/lang/String;", "withBreakdown", "", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/MetricEvent;", "value", "withContext", "(Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/MetricEvent;[Lkotlin/Pair;)Lcom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/MetricEvent;", "record", "", "deviceType", "recordDuration", "durationMs", "", "recordAll", "events", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationMetric.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationMetric.kt\ncom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/ConversationMetric\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1#2:66\n1855#3,2:67\n*S KotlinDebug\n*F\n+ 1 ConversationMetric.kt\ncom/amazon/alexa/accessory/notificationpublisher/conversation/metrics/ConversationMetric\n*L\n60#1:67,2\n*E\n"})
/* loaded from: classes15.dex */
public final class ConversationMetric {

    @NotNull
    public static final ConversationMetric INSTANCE = new ConversationMetric();

    private ConversationMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence context$lambda$0(Pair pair) {
        pair.getClass();
        return a$$ExternalSyntheticOutline0.m$1((String) pair.component1(), "=", (String) pair.component2());
    }

    public static /* synthetic */ void record$default(ConversationMetric conversationMetric, MetricEvent metricEvent, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        conversationMetric.record(metricEvent, str);
    }

    @NotNull
    public final String context(@NotNull Pair<String, String>... dimensions) {
        dimensions.getClass();
        return ArraysKt.joinToString$default(dimensions, ";", null, null, new TextFieldValue$$ExternalSyntheticLambda1(14), 30);
    }

    @NotNull
    public final String name(@NotNull String concept, @NotNull String event) {
        concept.getClass();
        event.getClass();
        return MetricsConstants.CONVERSATION_METRIC_PREFIX + concept + "." + event;
    }

    public final void record(@NotNull MetricEvent event, @Nullable String deviceType) {
        event.getClass();
        Map createMapBuilder = MapsKt.createMapBuilder();
        String context = event.getContext();
        if (context != null) {
            createMapBuilder.put(MetricsConstants.CUSTOM_VALUES_KEY, context);
        }
        if (deviceType != null) {
            createMapBuilder.put("deviceType_accessory", deviceType);
        }
        Map<String, Object> build = MapsKt.build(createMapBuilder);
        if (build.isEmpty()) {
            build = null;
        }
        MetricsRecorder.getInstance().recordCounter(event.getName(), build);
    }

    public final void recordAll(@NotNull List<MetricEvent> events, @Nullable String deviceType) {
        events.getClass();
        Iterator<T> it2 = events.iterator();
        while (it2.hasNext()) {
            INSTANCE.record((MetricEvent) it2.next(), deviceType);
        }
    }

    public final void recordDuration(@NotNull String name, long durationMs, @Nullable String deviceType) {
        name.getClass();
        MetricsRecorder.getInstance().recordDuration(name, durationMs, deviceType != null ? MapsKt.mapOf(TuplesKt.to("deviceType_accessory", deviceType)) : null);
    }

    @NotNull
    public final List<MetricEvent> withBreakdown(@NotNull MetricEvent event, @NotNull String value) {
        event.getClass();
        value.getClass();
        return CollectionsKt.listOf((Object[]) new MetricEvent[]{event, MetricEvent.copy$default(event, a$$ExternalSyntheticOutline0.m$1(event.getName(), ".", value), null, 2, null)});
    }

    @NotNull
    public final MetricEvent withContext(@NotNull MetricEvent event, @NotNull Pair<String, String>... dimensions) {
        event.getClass();
        dimensions.getClass();
        return MetricEvent.copy$default(event, null, CollectionsKt.joinToString$default(CollectionsKt.listOfNotNull((Object[]) new String[]{event.getContext(), context((Pair[]) Arrays.copyOf(dimensions, dimensions.length))}), ";", null, null, null, 62), 1, null);
    }
}
