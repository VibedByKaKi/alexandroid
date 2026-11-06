package com.amazon.alexa.voice.tta.statemachine;

import com.amazon.alexa.voice.tta.statemachine.Inputs;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/Events;", "", "<init>", "()V", "SendTextEvent", "AVSTextResponseReceivedEvent", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class Events {
    public /* synthetic */ Events(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/Events$AVSTextResponseReceivedEvent;", "Lcom/amazon/alexa/voice/tta/statemachine/Event;", "Lcom/amazon/alexa/voice/tta/statemachine/Inputs$TextResponseInput;", "data", "<init>", "(Lcom/amazon/alexa/voice/tta/statemachine/Inputs$TextResponseInput;)V", "getData", "()Lcom/amazon/alexa/voice/tta/statemachine/Inputs$TextResponseInput;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AVSTextResponseReceivedEvent implements Event<Inputs.TextResponseInput> {

        @NotNull
        private final Inputs.TextResponseInput data;

        public AVSTextResponseReceivedEvent(@NotNull Inputs.TextResponseInput textResponseInput) {
            textResponseInput.getClass();
            this.data = textResponseInput;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.voice.tta.statemachine.Event
        @NotNull
        public Inputs.TextResponseInput getData() {
            return this.data;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/Events$SendTextEvent;", "Lcom/amazon/alexa/voice/tta/statemachine/Event;", "Lcom/amazon/alexa/voice/tta/statemachine/Inputs$TextRequestInput;", "data", "<init>", "(Lcom/amazon/alexa/voice/tta/statemachine/Inputs$TextRequestInput;)V", "getData", "()Lcom/amazon/alexa/voice/tta/statemachine/Inputs$TextRequestInput;", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SendTextEvent implements Event<Inputs.TextRequestInput> {

        @NotNull
        private final Inputs.TextRequestInput data;

        public SendTextEvent(@NotNull Inputs.TextRequestInput textRequestInput) {
            textRequestInput.getClass();
            this.data = textRequestInput;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.amazon.alexa.voice.tta.statemachine.Event
        @NotNull
        public Inputs.TextRequestInput getData() {
            return this.data;
        }
    }

    private Events() {
    }
}
