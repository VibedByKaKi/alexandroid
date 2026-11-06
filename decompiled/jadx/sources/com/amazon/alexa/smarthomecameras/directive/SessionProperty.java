package com.amazon.alexa.smarthomecameras.directive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/SessionProperty;", "", "<init>", "(Ljava/lang/String;I)V", "AMAZON_E2E_ENCRYPTION", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class SessionProperty {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SessionProperty[] $VALUES;
    public static final SessionProperty AMAZON_E2E_ENCRYPTION = new SessionProperty("AMAZON_E2E_ENCRYPTION", 0);

    private static final /* synthetic */ SessionProperty[] $values() {
        return new SessionProperty[]{AMAZON_E2E_ENCRYPTION};
    }

    static {
        SessionProperty[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SessionProperty(String str, int i) {
    }

    @NotNull
    public static EnumEntries<SessionProperty> getEntries() {
        return $ENTRIES;
    }

    public static SessionProperty valueOf(String str) {
        return (SessionProperty) Enum.valueOf(SessionProperty.class, str);
    }

    public static SessionProperty[] values() {
        return (SessionProperty[]) $VALUES.clone();
    }
}
