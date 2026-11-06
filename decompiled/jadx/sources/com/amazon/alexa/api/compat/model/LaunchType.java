package com.amazon.alexa.api.compat.model;

import com.amazon.deecomms.common.Constants;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/api/compat/model/LaunchType;", "", "<init>", "(Ljava/lang/String;I)V", "WAKE_WORD", "TAP_TO_TALK", Constants.Calling.MEDIA_STREAM_TYPE_TEXT, "UNKNOWN", "NATURAL_TURN", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class LaunchType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LaunchType[] $VALUES;
    public static final LaunchType WAKE_WORD = new LaunchType("WAKE_WORD", 0);
    public static final LaunchType TAP_TO_TALK = new LaunchType("TAP_TO_TALK", 1);
    public static final LaunchType TEXT = new LaunchType(Constants.Calling.MEDIA_STREAM_TYPE_TEXT, 2);
    public static final LaunchType UNKNOWN = new LaunchType("UNKNOWN", 3);
    public static final LaunchType NATURAL_TURN = new LaunchType("NATURAL_TURN", 4);

    private static final /* synthetic */ LaunchType[] $values() {
        return new LaunchType[]{WAKE_WORD, TAP_TO_TALK, TEXT, UNKNOWN, NATURAL_TURN};
    }

    static {
        LaunchType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private LaunchType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<LaunchType> getEntries() {
        return $ENTRIES;
    }

    public static LaunchType valueOf(String str) {
        return (LaunchType) Enum.valueOf(LaunchType.class, str);
    }

    public static LaunchType[] values() {
        return (LaunchType[]) $VALUES.clone();
    }
}
