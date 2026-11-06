package com.amazon.alexa.ra.android.smartfragment.metrics;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.android.smartfragment.util.Logger;
import com.amazon.alexa.ra.cards.components.IconKt$$ExternalSyntheticLambda0;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0002\b\u0010J3\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0002\b\u0014J5\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0002\b\u0019J3\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0002\b\u001bJ\u0010\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/metrics/MetricsBroadcaster;", "", "context", "Landroid/content/Context;", "onSendFailure", "Lkotlin/Function1;", "", "", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "sendCounter", "event", "Lcom/amazon/alexa/ra/android/smartfragment/metrics/MetricName;", "metadata", "", "", "sendCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release", "sendTimer", "durationMs", "", "sendTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release", "sendRawCounter", "name", "value", "", "sendRawCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release", "sendRawTimer", "sendRawTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release", "sendEvent", "eventData", "Landroid/os/Bundle;", "Companion", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMetricsBroadcaster.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MetricsBroadcaster.kt\ncom/amazon/alexa/ra/android/smartfragment/metrics/MetricsBroadcaster\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 SafeCatching.kt\ncom/amazon/alexa/ra/android/smartfragment/util/SafeCatchingKt\n*L\n1#1,144:1\n216#2,2:145\n216#2,2:147\n19#3,7:149\n*S KotlinDebug\n*F\n+ 1 MetricsBroadcaster.kt\ncom/amazon/alexa/ra/android/smartfragment/metrics/MetricsBroadcaster\n*L\n78#1:145,2\n102#1:147,2\n128#1:149,7\n*E\n"})
/* loaded from: classes18.dex */
public final class MetricsBroadcaster {

    @NotNull
    private static final String ACTION_PUBLISH_UI_EVENT = "com.amazon.alexa.intent.action.PUBLISH_UI_EVENT";

    @NotNull
    private static final String EVENT_NAME = "PUBLISH_SMART_FRAGMENT_METRICS";

    @NotNull
    private static final String EXTRA_EVENT_DATA = "com.amazon.alexa.intent.extra.EVENT_DATA";

    @NotNull
    private static final String EXTRA_EVENT_NAME = "com.amazon.alexa.intent.extra.EVENT_NAME";

    @NotNull
    private final Context context;

    @NotNull
    private final Function1<Throwable, Unit> onSendFailure;
    public static final int $stable = 8;

    public /* synthetic */ MetricsBroadcaster(Context context, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new IconKt$$ExternalSyntheticLambda0(10) : function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$0(Throwable th) {
        th.getClass();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release$default(MetricsBroadcaster metricsBroadcaster, MetricName metricName, Map map, int i, Object obj) {
        if ((i & 2) != 0) {
            map = MapsKt.emptyMap();
        }
        metricsBroadcaster.sendCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release(metricName, map);
    }

    private final void sendEvent(Bundle eventData) {
        Object m25294constructorimpl;
        eventData.putLong("EVENT_REALTIME_MS", SystemClock.elapsedRealtime());
        Intent intent = new Intent("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT");
        intent.setPackage(this.context.getPackageName());
        intent.putExtra("com.amazon.alexa.intent.extra.EVENT_NAME", EVENT_NAME);
        intent.putExtra("com.amazon.alexa.intent.extra.EVENT_DATA", eventData);
        try {
            Result.Companion companion = Result.INSTANCE;
            this.context.sendBroadcast(intent);
            m25294constructorimpl = Result.m25294constructorimpl(Unit.INSTANCE);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Result.Companion companion2 = Result.INSTANCE;
            m25294constructorimpl = Result.m25294constructorimpl(ResultKt.createFailure(e2));
        }
        Throwable m25297exceptionOrNullimpl = Result.m25297exceptionOrNullimpl(m25294constructorimpl);
        if (m25297exceptionOrNullimpl != null) {
            Logger.INSTANCE.error("metrics sendBroadcast failed", m25297exceptionOrNullimpl);
            this.onSendFailure.invoke(m25297exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendRawCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release$default(MetricsBroadcaster metricsBroadcaster, String str, int i, Map map, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        if ((i2 & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        metricsBroadcaster.sendRawCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release(str, i, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendRawTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release$default(MetricsBroadcaster metricsBroadcaster, String str, long j, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        metricsBroadcaster.sendRawTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release(str, j, map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void sendTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release$default(MetricsBroadcaster metricsBroadcaster, MetricName metricName, long j, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = MapsKt.emptyMap();
        }
        metricsBroadcaster.sendTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release(metricName, j, map);
    }

    public final void sendCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release(@NotNull MetricName event, @NotNull Map<String, String> metadata) {
        event.getClass();
        metadata.getClass();
        sendRawCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release(event.name(), 1, metadata);
    }

    public final void sendRawCounter$AVSMobileFramework_ra_android_smart_fragment_runtime_release(@NotNull String name, int value, @NotNull Map<String, String> metadata) {
        name.getClass();
        metadata.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("TITLE", name);
        bundle.putInt("EVENT_VALUE", value);
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        sendEvent(bundle);
    }

    public final void sendRawTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release(@NotNull String name, long durationMs, @NotNull Map<String, String> metadata) {
        name.getClass();
        metadata.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("TITLE", name);
        bundle.putLong("LATENCY_REALTIME_MS", durationMs);
        for (Map.Entry<String, String> entry : metadata.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        sendEvent(bundle);
    }

    public final void sendTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release(@NotNull MetricName event, long durationMs, @NotNull Map<String, String> metadata) {
        event.getClass();
        metadata.getClass();
        sendRawTimer$AVSMobileFramework_ra_android_smart_fragment_runtime_release(event.name(), durationMs, metadata);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MetricsBroadcaster(@NotNull Context context, @NotNull Function1<? super Throwable, Unit> function1) {
        context.getClass();
        function1.getClass();
        this.context = context;
        this.onSendFailure = function1;
    }
}
