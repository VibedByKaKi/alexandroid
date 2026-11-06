package com.amazon.alexa.ra.core.features.dictation;

import kotlin.Metadata;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationSourceApi;", "", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/alexa/ra/core/features/dictation/DictationEvent;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "amplitude", "Lkotlinx/coroutines/flow/StateFlow;", "", "getAmplitude", "()Lkotlinx/coroutines/flow/StateFlow;", "start", "", "stop", "cancel", "Companion", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface DictationSourceApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationSourceApi$Companion;", "", "<init>", "()V", "NoOp", "Lcom/amazon/alexa/ra/core/features/dictation/DictationSourceApi;", "getNoOp", "()Lcom/amazon/alexa/ra/core/features/dictation/DictationSourceApi;", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final DictationSourceApi NoOp = new DictationSourceApi() { // from class: com.amazon.alexa.ra.core.features.dictation.DictationSourceApi$Companion$NoOp$1
            private final MutableSharedFlow<DictationEvent> events = SharedFlowKt.MutableSharedFlow$default(0, Integer.MAX_VALUE, null, 4, null);
            private final MutableStateFlow<Float> amplitude = StateFlowKt.MutableStateFlow(Float.valueOf(0.0f));

            @Override // com.amazon.alexa.ra.core.features.dictation.DictationSourceApi
            public MutableStateFlow<Float> getAmplitude() {
                return this.amplitude;
            }

            @Override // com.amazon.alexa.ra.core.features.dictation.DictationSourceApi
            public MutableSharedFlow<DictationEvent> getEvents() {
                return this.events;
            }

            @Override // com.amazon.alexa.ra.core.features.dictation.DictationSourceApi
            public void cancel() {
            }

            @Override // com.amazon.alexa.ra.core.features.dictation.DictationSourceApi
            public void start() {
            }

            @Override // com.amazon.alexa.ra.core.features.dictation.DictationSourceApi
            public void stop() {
            }
        };

        private Companion() {
        }

        @NotNull
        public final DictationSourceApi getNoOp() {
            return NoOp;
        }
    }

    void cancel();

    @NotNull
    StateFlow<Float> getAmplitude();

    @NotNull
    SharedFlow<DictationEvent> getEvents();

    void start();

    void stop();
}
