package com.amazon.comms.calling.domain.model;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/comms/calling/domain/model/CallOrientation;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PORTRAIT_UP", "PORTRAIT_DOWN", "LANDSCAPE_LEFT", "LANDSCAPE_RIGHT", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallOrientation {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CallOrientation[] $VALUES;

    @NotNull
    private final String value;

    @SerializedName("portrait_up")
    public static final CallOrientation PORTRAIT_UP = new CallOrientation("PORTRAIT_UP", 0, "portrait_up");

    @SerializedName("portrait_down")
    public static final CallOrientation PORTRAIT_DOWN = new CallOrientation("PORTRAIT_DOWN", 1, "portrait_down");

    @SerializedName("landscape_left")
    public static final CallOrientation LANDSCAPE_LEFT = new CallOrientation("LANDSCAPE_LEFT", 2, "landscape_left");

    @SerializedName("landscape_right")
    public static final CallOrientation LANDSCAPE_RIGHT = new CallOrientation("LANDSCAPE_RIGHT", 3, "landscape_right");

    private static final /* synthetic */ CallOrientation[] $values() {
        return new CallOrientation[]{PORTRAIT_UP, PORTRAIT_DOWN, LANDSCAPE_LEFT, LANDSCAPE_RIGHT};
    }

    static {
        CallOrientation[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private CallOrientation(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<CallOrientation> getEntries() {
        return $ENTRIES;
    }

    public static CallOrientation valueOf(String str) {
        return (CallOrientation) Enum.valueOf(CallOrientation.class, str);
    }

    public static CallOrientation[] values() {
        return (CallOrientation[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
