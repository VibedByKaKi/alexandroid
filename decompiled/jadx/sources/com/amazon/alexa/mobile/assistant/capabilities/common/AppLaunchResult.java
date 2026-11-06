package com.amazon.alexa.mobile.assistant.capabilities.common;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/common/AppLaunchResult;", "", "<init>", "(Ljava/lang/String;I)V", "AMAZON_APPSTORE", "DIRECT_LAUNCH", "DEFAULT_APPSTORE_FALLBACK", "NO_LAUNCH", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AppLaunchResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppLaunchResult[] $VALUES;
    public static final AppLaunchResult AMAZON_APPSTORE = new AppLaunchResult("AMAZON_APPSTORE", 0);
    public static final AppLaunchResult DIRECT_LAUNCH = new AppLaunchResult("DIRECT_LAUNCH", 1);
    public static final AppLaunchResult DEFAULT_APPSTORE_FALLBACK = new AppLaunchResult("DEFAULT_APPSTORE_FALLBACK", 2);
    public static final AppLaunchResult NO_LAUNCH = new AppLaunchResult("NO_LAUNCH", 3);

    private static final /* synthetic */ AppLaunchResult[] $values() {
        return new AppLaunchResult[]{AMAZON_APPSTORE, DIRECT_LAUNCH, DEFAULT_APPSTORE_FALLBACK, NO_LAUNCH};
    }

    static {
        AppLaunchResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AppLaunchResult(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AppLaunchResult> getEntries() {
        return $ENTRIES;
    }

    public static AppLaunchResult valueOf(String str) {
        return (AppLaunchResult) Enum.valueOf(AppLaunchResult.class, str);
    }

    public static AppLaunchResult[] values() {
        return (AppLaunchResult[]) $VALUES.clone();
    }
}
