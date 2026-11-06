package com.amazon.alexa.assistant.ui.conversation.dictation;

import kotlin.Metadata;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/dictation/TranscriptionService;", "", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/amazon/alexa/assistant/ui/conversation/dictation/TranscriptionEvent;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "amplitude", "Lkotlinx/coroutines/flow/StateFlow;", "", "getAmplitude", "()Lkotlinx/coroutines/flow/StateFlow;", "start", "", "stop", "cancel", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface TranscriptionService {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static StateFlow<Float> getAmplitude(@NotNull TranscriptionService transcriptionService) {
            StateFlow<Float> stateFlow;
            stateFlow = TranscriptionServiceKt.NO_AMPLITUDE;
            return stateFlow;
        }
    }

    void cancel();

    @NotNull
    StateFlow<Float> getAmplitude();

    @NotNull
    SharedFlow<TranscriptionEvent> getEvents();

    void start();

    void stop();
}
