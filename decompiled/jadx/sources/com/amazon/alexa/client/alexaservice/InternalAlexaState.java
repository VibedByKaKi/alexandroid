package com.amazon.alexa.client.alexaservice;

import com.amazon.alexa.api.AlexaState;
import com.amazon.devicesetup.common.v1.WifiConnectionState;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'PREPARING_TO_LISTEN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class InternalAlexaState {
    private static final /* synthetic */ InternalAlexaState[] $VALUES;
    public static final InternalAlexaState ERROR;
    public static final InternalAlexaState IDLE;
    public static final InternalAlexaState LISTENING;
    public static final InternalAlexaState PREPARING_TO_LISTEN;
    public static final InternalAlexaState PREPARING_TO_SPEAK;
    public static final InternalAlexaState REQUEST_PROCESSING;
    public static final InternalAlexaState RESPONDING;
    public static final InternalAlexaState SPEAKING;
    public static final InternalAlexaState THINKING;
    public static final InternalAlexaState UNKNOWN;
    private final AlexaState associatedExternalAlexaState;

    private static /* synthetic */ InternalAlexaState[] $values() {
        return new InternalAlexaState[]{PREPARING_TO_LISTEN, LISTENING, THINKING, REQUEST_PROCESSING, PREPARING_TO_SPEAK, SPEAKING, RESPONDING, ERROR, IDLE, UNKNOWN};
    }

    static {
        AlexaState alexaState = AlexaState.LISTENING;
        PREPARING_TO_LISTEN = new InternalAlexaState("PREPARING_TO_LISTEN", 0, alexaState);
        LISTENING = new InternalAlexaState("LISTENING", 1, alexaState);
        AlexaState alexaState2 = AlexaState.THINKING;
        THINKING = new InternalAlexaState("THINKING", 2, alexaState2);
        REQUEST_PROCESSING = new InternalAlexaState("REQUEST_PROCESSING", 3, alexaState2);
        PREPARING_TO_SPEAK = new InternalAlexaState("PREPARING_TO_SPEAK", 4, alexaState2);
        AlexaState alexaState3 = AlexaState.SPEAKING;
        SPEAKING = new InternalAlexaState("SPEAKING", 5, alexaState3);
        RESPONDING = new InternalAlexaState("RESPONDING", 6, alexaState3);
        ERROR = new InternalAlexaState("ERROR", 7, AlexaState.ERROR);
        IDLE = new InternalAlexaState(WifiConnectionState.IDLE, 8, AlexaState.IDLE);
        UNKNOWN = new InternalAlexaState("UNKNOWN", 9, AlexaState.UNKNOWN);
        $VALUES = $values();
    }

    private InternalAlexaState(String str, int i, AlexaState alexaState) {
        this.associatedExternalAlexaState = alexaState;
    }

    public static InternalAlexaState valueOf(String str) {
        return (InternalAlexaState) Enum.valueOf(InternalAlexaState.class, str);
    }

    public static InternalAlexaState[] values() {
        return (InternalAlexaState[]) $VALUES.clone();
    }

    public AlexaState convertToExternalState() {
        return this.associatedExternalAlexaState;
    }
}
