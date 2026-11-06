package com.amazon.alexa.ra.ui.metrics;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaMetadataBundleKey;
import com.amazon.alexa.api.compat.model.UiEventName;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.ra.core.data.utils.TimeProvider;
import com.dee.app.contacts.common.constants.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0085\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012r\u0010\u0004\u001an\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\"\u0010\u0016\u001a\u0004\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u0015H\u0086@¢\u0006\u0002\u0010\u001aR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R|\u0010\u0004\u001an\b\u0001\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\r\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/amazon/alexa/ra/ui/metrics/LegacyOpenLatencyEmitter;", "", "timeProvider", "Lcom/amazon/alexa/ra/core/data/utils/TimeProvider;", "emit", "Lkotlin/Function5;", "Lcom/amazon/alexa/api/compat/model/UiEventName;", "Lkotlin/ParameterName;", "name", "event", "", "latencyMs", "", "source", AlexaMetricsConstants.AssistantSdkDimensions.INITIATOR, "Lkotlin/coroutines/Continuation;", "", "<init>", "(Lcom/amazon/alexa/ra/core/data/utils/TimeProvider;Lkotlin/jvm/functions/Function5;)V", "Lkotlin/jvm/functions/Function5;", "emitted", "", "tryEmit", "raUiOptions", "Lcom/amazon/alexa/voice/ui/ra/RaUiOptions;", "viewModelBuilt", "(Lcom/amazon/alexa/voice/ui/ra/RaUiOptions;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class LegacyOpenLatencyEmitter {

    @NotNull
    public static final String HOST = "ra_activity_fragment";

    @NotNull
    private static final String TAG = "LegacyOpenLatency";

    @NotNull
    private final Function5<UiEventName, Long, String, String, Continuation<? super Unit>, Object> emit;
    private boolean emitted;

    @NotNull
    private final TimeProvider timeProvider;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyOpenLatencyEmitter(@NotNull TimeProvider timeProvider, @NotNull Function5<? super UiEventName, ? super Long, ? super String, ? super String, ? super Continuation<? super Unit>, ? extends Object> function5) {
        timeProvider.getClass();
        function5.getClass();
        this.timeProvider = timeProvider;
        this.emit = function5;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tryEmit(@org.jetbrains.annotations.Nullable com.amazon.alexa.voice.ui.ra.RaUiOptions r17, boolean r18, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Long> r19) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.ra.ui.metrics.LegacyOpenLatencyEmitter.tryEmit(com.amazon.alexa.voice.ui.ra.RaUiOptions, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/ra/ui/metrics/LegacyOpenLatencyEmitter$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "HOST", "initiatorMetadata", "", "Lcom/amazon/alexa/api/compat/model/AlexaMetadataBundleKey;", "referer", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Map<AlexaMetadataBundleKey, Object> initiatorMetadata(@Nullable String referer) {
            return referer == null ? MapsKt.emptyMap() : MapsKt.mapOf(TuplesKt.to(AlexaMetadataBundleKey.INITIATOR, referer));
        }

        private Companion() {
        }
    }

    public /* synthetic */ LegacyOpenLatencyEmitter(TimeProvider timeProvider, Function5 function5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new TimeProvider() : timeProvider, function5);
    }
}
