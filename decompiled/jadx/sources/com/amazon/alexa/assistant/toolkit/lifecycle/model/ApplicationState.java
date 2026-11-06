package com.amazon.alexa.assistant.toolkit.lifecycle.model;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/lifecycle/model/ApplicationState;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", "ACTIVE", CareActorsStore.SubscriptionStatus.PAUSED, "INACTIVE", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ApplicationState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ApplicationState[] $VALUES;
    public static final ApplicationState UNKNOWN = new ApplicationState("UNKNOWN", 0);
    public static final ApplicationState ACTIVE = new ApplicationState("ACTIVE", 1);
    public static final ApplicationState PAUSED = new ApplicationState(CareActorsStore.SubscriptionStatus.PAUSED, 2);
    public static final ApplicationState INACTIVE = new ApplicationState("INACTIVE", 3);

    private static final /* synthetic */ ApplicationState[] $values() {
        return new ApplicationState[]{UNKNOWN, ACTIVE, PAUSED, INACTIVE};
    }

    static {
        ApplicationState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ApplicationState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ApplicationState> getEntries() {
        return $ENTRIES;
    }

    public static ApplicationState valueOf(String str) {
        return (ApplicationState) Enum.valueOf(ApplicationState.class, str);
    }

    public static ApplicationState[] values() {
        return (ApplicationState[]) $VALUES.clone();
    }
}
