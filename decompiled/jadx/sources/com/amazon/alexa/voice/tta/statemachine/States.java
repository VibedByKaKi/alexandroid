package com.amazon.alexa.voice.tta.statemachine;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/States;", "", "<init>", "()V", "IdleState", "WaitingForAVSState", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public abstract class States {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/States$IdleState;", "Lcom/amazon/alexa/voice/tta/statemachine/DefaultState;", "<init>", "()V", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IdleState extends DefaultState {

        @NotNull
        public static final IdleState INSTANCE = new IdleState();

        private IdleState() {
            super("idle");
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/voice/tta/statemachine/States$WaitingForAVSState;", "Lcom/amazon/alexa/voice/tta/statemachine/DefaultState;", "<init>", "()V", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WaitingForAVSState extends DefaultState {

        @NotNull
        public static final WaitingForAVSState INSTANCE = new WaitingForAVSState();

        private WaitingForAVSState() {
            super("avs.waitForResponse");
        }
    }

    public /* synthetic */ States(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private States() {
    }
}
