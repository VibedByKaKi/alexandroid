package com.amazon.alexa.smarthomecameras.directive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/SessionType;", "", "<init>", "(Ljava/lang/String;I)V", "SINGLEVIEW", "MULTIVIEW", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SessionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SessionType[] $VALUES;
    public static final SessionType SINGLEVIEW = new SessionType("SINGLEVIEW", 0);
    public static final SessionType MULTIVIEW = new SessionType("MULTIVIEW", 1);

    private static final /* synthetic */ SessionType[] $values() {
        return new SessionType[]{SINGLEVIEW, MULTIVIEW};
    }

    static {
        SessionType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SessionType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SessionType> getEntries() {
        return $ENTRIES;
    }

    public static SessionType valueOf(String str) {
        return (SessionType) Enum.valueOf(SessionType.class, str);
    }

    public static SessionType[] values() {
        return (SessionType[]) $VALUES.clone();
    }
}
