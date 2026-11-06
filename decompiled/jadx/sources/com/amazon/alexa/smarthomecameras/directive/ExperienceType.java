package com.amazon.alexa.smarthomecameras.directive;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/smarthomecameras/directive/ExperienceType;", "", "<init>", "(Ljava/lang/String;I)V", "SEARCH", "TIMELINE", "COLLECTION", "AlexaMobileAndroidSmartHomeCameras_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ExperienceType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExperienceType[] $VALUES;
    public static final ExperienceType SEARCH = new ExperienceType("SEARCH", 0);
    public static final ExperienceType TIMELINE = new ExperienceType("TIMELINE", 1);
    public static final ExperienceType COLLECTION = new ExperienceType("COLLECTION", 2);

    private static final /* synthetic */ ExperienceType[] $values() {
        return new ExperienceType[]{SEARCH, TIMELINE, COLLECTION};
    }

    static {
        ExperienceType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ExperienceType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ExperienceType> getEntries() {
        return $ENTRIES;
    }

    public static ExperienceType valueOf(String str) {
        return (ExperienceType) Enum.valueOf(ExperienceType.class, str);
    }

    public static ExperienceType[] values() {
        return (ExperienceType[]) $VALUES.clone();
    }
}
