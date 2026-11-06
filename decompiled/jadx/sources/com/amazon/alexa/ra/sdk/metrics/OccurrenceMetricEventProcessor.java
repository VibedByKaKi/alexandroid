package com.amazon.alexa.ra.sdk.metrics;

import com.amazon.alexa.api.compat.model.AlexaMetadataBundleKey;
import com.amazon.alexa.api.compat.model.UiEventName;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JB\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000bH¦@¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/ra/sdk/metrics/OccurrenceMetricEventProcessor;", "", "processEvent", "", "eventName", "Lcom/amazon/alexa/api/compat/model/UiEventName;", "occurrence", "", "eventSource", "", "customMetadata", "", "Lcom/amazon/alexa/api/compat/model/AlexaMetadataBundleKey;", "(Lcom/amazon/alexa/api/compat/model/UiEventName;ILjava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface OccurrenceMetricEventProcessor {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object processEvent$default(OccurrenceMetricEventProcessor occurrenceMetricEventProcessor, UiEventName uiEventName, int i, String str, Map map, Continuation continuation, int i2, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: processEvent");
                return null;
            }
            if ((i2 & 2) != 0) {
                i = 1;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                str = null;
            }
            String str2 = str;
            if ((i2 & 8) != 0) {
                map = MapsKt.emptyMap();
            }
            return occurrenceMetricEventProcessor.processEvent(uiEventName, i3, str2, map, continuation);
        }
    }

    @Nullable
    Object processEvent(@NotNull UiEventName uiEventName, int i, @Nullable String str, @NotNull Map<AlexaMetadataBundleKey, ? extends Object> map, @NotNull Continuation<? super Boolean> continuation);
}
