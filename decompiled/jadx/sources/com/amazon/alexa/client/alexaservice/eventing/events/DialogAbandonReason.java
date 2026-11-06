package com.amazon.alexa.client.alexaservice.eventing.events;

import com.amazon.alexa.api.AlexaMetricsName;
import com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult;
import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.amazon.alexa.client.alexaservice.eventing.events.DialogAbandonReason, still in use, count: 1, list:
  (r0v0 com.amazon.alexa.client.alexaservice.eventing.events.DialogAbandonReason) from 0x00de: INVOKE 
  (wrap:java.util.Map<com.amazon.alexa.client.alexaservice.eventing.events.DialogAbandonReason, com.amazon.alexa.api.AlexaMetricsName>:0x00da: SGET  A[WRAPPED] (LINE:219) com.amazon.alexa.client.alexaservice.eventing.events.DialogAbandonReason.voiceAbandonReasonToMetricsName java.util.Map)
  (r0v0 com.amazon.alexa.client.alexaservice.eventing.events.DialogAbandonReason)
  (wrap:com.amazon.alexa.api.AlexaMetricsName:0x00dc: SGET  A[WRAPPED] (LINE:221) com.amazon.alexa.api.AlexaMetricsName.VoiceInteraction.Abandoned.INVALID_WAKE_WORD com.amazon.alexa.api.AlexaMetricsName)
 INTERFACE call: java.util.Map.put(java.lang.Object, java.lang.Object):java.lang.Object A[MD:(K, V):V (c)] (LINE:223)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class DialogAbandonReason implements DialogInteractionResult.Reason {
    INVALID_WAKE_WORD,
    INVALID_AUDIO_METADATA,
    SCREEN_LOCKED,
    SOURCE_ARBITRATION,
    SPEECH_PROVIDER_NOT_REGISTERED,
    OUT_OF_TURN_CANNOT_REQUEST_DIALOG,
    OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN,
    OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN,
    OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN,
    OUT_OF_TURN_DIALOG_NOT_STARTED,
    OUT_OF_TURN_DIALOG_NOT_CURRENT,
    OUT_OF_TURN_UNEXPECTED_TURN,
    OUT_OF_TURN_UNEXPECTED_NEXT_TURN,
    OUT_OF_TURN_START_DIALOG_NOT_ALLOWED,
    WAKE_WORD_ENGINE_NOT_READY,
    WAKE_WORD_AUDIO_INCOMPLETE,
    TEXT_TRANSFORMATION_FAILURE,
    NATURAL_TURN_NO_SPEECH;

    public static Map<DialogAbandonReason, AlexaMetricsName> textAbandonReasonToMetricsName;
    public static Map<DialogAbandonReason, AlexaMetricsName> voiceAbandonReasonToMetricsName;
    private boolean isTextDialog = false;

    static {
        DialogAbandonReason dialogAbandonReason = SCREEN_LOCKED;
        DialogAbandonReason dialogAbandonReason2 = SOURCE_ARBITRATION;
        DialogAbandonReason dialogAbandonReason3 = OUT_OF_TURN_CANNOT_REQUEST_DIALOG;
        DialogAbandonReason dialogAbandonReason4 = OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN;
        DialogAbandonReason dialogAbandonReason5 = OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN;
        DialogAbandonReason dialogAbandonReason6 = OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN;
        DialogAbandonReason dialogAbandonReason7 = OUT_OF_TURN_DIALOG_NOT_STARTED;
        DialogAbandonReason dialogAbandonReason8 = OUT_OF_TURN_DIALOG_NOT_CURRENT;
        DialogAbandonReason dialogAbandonReason9 = OUT_OF_TURN_UNEXPECTED_TURN;
        DialogAbandonReason dialogAbandonReason10 = OUT_OF_TURN_UNEXPECTED_NEXT_TURN;
        DialogAbandonReason dialogAbandonReason11 = OUT_OF_TURN_START_DIALOG_NOT_ALLOWED;
        voiceAbandonReasonToMetricsName = new HashMap();
        textAbandonReasonToMetricsName = new HashMap();
        voiceAbandonReasonToMetricsName.put(r0, AlexaMetricsName.VoiceInteraction.Abandoned.INVALID_WAKE_WORD);
        voiceAbandonReasonToMetricsName.put(r1, AlexaMetricsName.VoiceInteraction.Abandoned.INVALID_AUDIO_METADATA);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason, AlexaMetricsName.VoiceInteraction.Abandoned.SCREEN_LOCKED);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason2, AlexaMetricsName.VoiceInteraction.Abandoned.SOURCE_ARBITRATION);
        voiceAbandonReasonToMetricsName.put(r4, AlexaMetricsName.VoiceInteraction.Abandoned.SPEECH_PROVIDER_NOT_REGISTERED);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason3, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_CANNOT_REQUEST_DIALOG);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason4, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason5, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason6, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason7, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_DIALOG_NOT_STARTED);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason8, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_DIALOG_NOT_CURRENT);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason9, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_UNEXPECTED_TURN);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason10, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_UNEXPECTED_NEXT_TURN);
        voiceAbandonReasonToMetricsName.put(dialogAbandonReason11, AlexaMetricsName.VoiceInteraction.Abandoned.OUT_OF_TURN_START_DIALOG_NOT_ALLOWED);
        voiceAbandonReasonToMetricsName.put(r14, AlexaMetricsName.VoiceInteraction.Abandoned.WAKE_WORD_ENGINE_NOT_READY);
        voiceAbandonReasonToMetricsName.put(r13, AlexaMetricsName.VoiceInteraction.Abandoned.WAKE_WORD_AUDIO_INCOMPLETE);
        voiceAbandonReasonToMetricsName.put(r13, AlexaMetricsName.VoiceInteraction.Abandoned.NATURAL_TURN_NO_SPEECH);
        textAbandonReasonToMetricsName.put(dialogAbandonReason, AlexaMetricsName.TextInteraction.Abandoned.SCREEN_LOCKED);
        textAbandonReasonToMetricsName.put(dialogAbandonReason2, AlexaMetricsName.TextInteraction.Abandoned.SOURCE_ARBITRATION);
        textAbandonReasonToMetricsName.put(dialogAbandonReason3, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_CANNOT_REQUEST_DIALOG);
        textAbandonReasonToMetricsName.put(dialogAbandonReason4, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_CANNOT_REQUEST_FIRST_TURN);
        textAbandonReasonToMetricsName.put(dialogAbandonReason5, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_BARGE_IN);
        textAbandonReasonToMetricsName.put(dialogAbandonReason6, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_REQUEST_NOT_ALLOWED_TO_START_FIRST_TURN);
        textAbandonReasonToMetricsName.put(dialogAbandonReason7, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_DIALOG_NOT_STARTED);
        textAbandonReasonToMetricsName.put(dialogAbandonReason8, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_DIALOG_NOT_CURRENT);
        textAbandonReasonToMetricsName.put(dialogAbandonReason9, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_UNEXPECTED_TURN);
        textAbandonReasonToMetricsName.put(dialogAbandonReason10, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_UNEXPECTED_NEXT_TURN);
        textAbandonReasonToMetricsName.put(dialogAbandonReason11, AlexaMetricsName.TextInteraction.Abandoned.OUT_OF_TURN_START_DIALOG_NOT_ALLOWED);
        textAbandonReasonToMetricsName.put(r14, AlexaMetricsName.TextInteraction.Abandoned.TEXT_TRANSFORMATION_FAILURE);
    }

    private DialogAbandonReason() {
    }

    public static DialogAbandonReason valueOf(String str) {
        return (DialogAbandonReason) Enum.valueOf(DialogAbandonReason.class, str);
    }

    public static DialogAbandonReason[] values() {
        return (DialogAbandonReason[]) $VALUES.clone();
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public AlexaMetricsName getMetricName() {
        return this.isTextDialog ? textAbandonReasonToMetricsName.get(this) : voiceAbandonReasonToMetricsName.get(this);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public DialogInteractionResult.Type getType() {
        return DialogInteractionResult.Type.ABANDONED;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public boolean isNetworkFailure() {
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.metrics.DialogInteractionResult.Reason
    public void setTextDialog(boolean z) {
        this.isTextDialog = z;
    }
}
