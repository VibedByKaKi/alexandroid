package com.amazon.comms.calling.domain.model.dataChannel.sepia;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaEventName;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "APPLY_EFFECT", "REMOVE_EFFECT", "ACK_STATUS", "CURRENT_STATUS", "BEGIN_EFFECTS_SESSION", "SCREEN_TOUCH", "SEPIA_METRICS", "TAP_EFFECT_BUTTON", "TAP_REACTION_BUTTON", "TAP_CAPTION_BUTTON", "REMOVE_CAPTION", "TAP_CC_BUTTON", "CC_RAISE_CAPTIONS", "CC_LOWER_CAPTIONS", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SepiaEventName {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SepiaEventName[] $VALUES;

    @NotNull
    private final String value;

    @SerializedName("apply_effect")
    public static final SepiaEventName APPLY_EFFECT = new SepiaEventName("APPLY_EFFECT", 0, "apply_effect");

    @SerializedName("remove_effect")
    public static final SepiaEventName REMOVE_EFFECT = new SepiaEventName("REMOVE_EFFECT", 1, "remove_effect");

    @SerializedName("ack_status")
    public static final SepiaEventName ACK_STATUS = new SepiaEventName("ACK_STATUS", 2, "ack_status");

    @SerializedName("current_status")
    public static final SepiaEventName CURRENT_STATUS = new SepiaEventName("CURRENT_STATUS", 3, "current_status");

    @SerializedName("begin_effects_session")
    public static final SepiaEventName BEGIN_EFFECTS_SESSION = new SepiaEventName("BEGIN_EFFECTS_SESSION", 4, "begin_effects_session");

    @SerializedName("screen_touch")
    public static final SepiaEventName SCREEN_TOUCH = new SepiaEventName("SCREEN_TOUCH", 5, "screen_touch");

    @SerializedName("sepia_metrics")
    public static final SepiaEventName SEPIA_METRICS = new SepiaEventName("SEPIA_METRICS", 6, "sepia_metrics");

    @SerializedName("effect_button_tap")
    public static final SepiaEventName TAP_EFFECT_BUTTON = new SepiaEventName("TAP_EFFECT_BUTTON", 7, "effect_button_tap");

    @SerializedName("reaction_button_tap")
    public static final SepiaEventName TAP_REACTION_BUTTON = new SepiaEventName("TAP_REACTION_BUTTON", 8, "reaction_button_tap");

    @SerializedName("caption_button_tap")
    public static final SepiaEventName TAP_CAPTION_BUTTON = new SepiaEventName("TAP_CAPTION_BUTTON", 9, "caption_button_tap");

    @SerializedName("remove_caption")
    public static final SepiaEventName REMOVE_CAPTION = new SepiaEventName("REMOVE_CAPTION", 10, "remove_caption");

    @SerializedName("cc_button_tap")
    public static final SepiaEventName TAP_CC_BUTTON = new SepiaEventName("TAP_CC_BUTTON", 11, "call_captioning_button_tap");

    @SerializedName("cc_raise_captions")
    public static final SepiaEventName CC_RAISE_CAPTIONS = new SepiaEventName("CC_RAISE_CAPTIONS", 12, "call_captioning_raise_captions");

    @SerializedName("cc_lower_captions")
    public static final SepiaEventName CC_LOWER_CAPTIONS = new SepiaEventName("CC_LOWER_CAPTIONS", 13, "call_captioning_lower_captions");

    private static final /* synthetic */ SepiaEventName[] $values() {
        return new SepiaEventName[]{APPLY_EFFECT, REMOVE_EFFECT, ACK_STATUS, CURRENT_STATUS, BEGIN_EFFECTS_SESSION, SCREEN_TOUCH, SEPIA_METRICS, TAP_EFFECT_BUTTON, TAP_REACTION_BUTTON, TAP_CAPTION_BUTTON, REMOVE_CAPTION, TAP_CC_BUTTON, CC_RAISE_CAPTIONS, CC_LOWER_CAPTIONS};
    }

    static {
        SepiaEventName[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SepiaEventName(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<SepiaEventName> getEntries() {
        return $ENTRIES;
    }

    public static SepiaEventName valueOf(String str) {
        return (SepiaEventName) Enum.valueOf(SepiaEventName.class, str);
    }

    public static SepiaEventName[] values() {
        return (SepiaEventName[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
