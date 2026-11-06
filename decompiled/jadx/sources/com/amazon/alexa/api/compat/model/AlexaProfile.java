package com.amazon.alexa.api.compat.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaProfile;", "", "<init>", "(Ljava/lang/String;I)V", "NEAR_FIELD", "FAR_FIELD", "CLOSE_TALK", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AlexaProfile {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AlexaProfile[] $VALUES;
    public static final AlexaProfile NEAR_FIELD = new AlexaProfile("NEAR_FIELD", 0);
    public static final AlexaProfile FAR_FIELD = new AlexaProfile("FAR_FIELD", 1);
    public static final AlexaProfile CLOSE_TALK = new AlexaProfile("CLOSE_TALK", 2);

    private static final /* synthetic */ AlexaProfile[] $values() {
        return new AlexaProfile[]{NEAR_FIELD, FAR_FIELD, CLOSE_TALK};
    }

    static {
        AlexaProfile[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AlexaProfile(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AlexaProfile> getEntries() {
        return $ENTRIES;
    }

    public static AlexaProfile valueOf(String str) {
        return (AlexaProfile) Enum.valueOf(AlexaProfile.class, str);
    }

    public static AlexaProfile[] values() {
        return (AlexaProfile[]) $VALUES.clone();
    }
}
