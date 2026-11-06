package com.amazon.alexa.client.crashreporting;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/client/crashreporting/BreadcrumbType;", "", "(Ljava/lang/String;I)V", "ERROR", "LOG", "MANUAL", "NAVIGATION", "PROCESS", "REQUEST", "STATE", "USER", "AVSAndroidClient-crashreporting_bugsnagRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class BreadcrumbType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BreadcrumbType[] $VALUES;
    public static final BreadcrumbType ERROR = new BreadcrumbType("ERROR", 0);
    public static final BreadcrumbType LOG = new BreadcrumbType("LOG", 1);
    public static final BreadcrumbType MANUAL = new BreadcrumbType("MANUAL", 2);
    public static final BreadcrumbType NAVIGATION = new BreadcrumbType("NAVIGATION", 3);
    public static final BreadcrumbType PROCESS = new BreadcrumbType("PROCESS", 4);
    public static final BreadcrumbType REQUEST = new BreadcrumbType("REQUEST", 5);
    public static final BreadcrumbType STATE = new BreadcrumbType("STATE", 6);
    public static final BreadcrumbType USER = new BreadcrumbType("USER", 7);

    private static final /* synthetic */ BreadcrumbType[] $values() {
        return new BreadcrumbType[]{ERROR, LOG, MANUAL, NAVIGATION, PROCESS, REQUEST, STATE, USER};
    }

    static {
        BreadcrumbType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private BreadcrumbType(String str, int i) {
    }

    @NotNull
    public static EnumEntries<BreadcrumbType> getEntries() {
        return $ENTRIES;
    }

    public static BreadcrumbType valueOf(String str) {
        return (BreadcrumbType) Enum.valueOf(BreadcrumbType.class, str);
    }

    public static BreadcrumbType[] values() {
        return (BreadcrumbType[]) $VALUES.clone();
    }
}
