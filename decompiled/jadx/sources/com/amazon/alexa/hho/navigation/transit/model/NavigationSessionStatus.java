package com.amazon.alexa.hho.navigation.transit.model;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.clouddrive.model.ResumeState;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/hho/navigation/transit/model/NavigationSessionStatus;", "", "<init>", "(Ljava/lang/String;I)V", "INITIALIZED", "IN_PROGRESS", CareActorsStore.SubscriptionStatus.PAUSED, "CANCELLED", ResumeState.COMPLETED, "AlexaMobileAndroidHHO_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NavigationSessionStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationSessionStatus[] $VALUES;
    public static final NavigationSessionStatus INITIALIZED = new NavigationSessionStatus("INITIALIZED", 0);
    public static final NavigationSessionStatus IN_PROGRESS = new NavigationSessionStatus("IN_PROGRESS", 1);
    public static final NavigationSessionStatus PAUSED = new NavigationSessionStatus(CareActorsStore.SubscriptionStatus.PAUSED, 2);
    public static final NavigationSessionStatus CANCELLED = new NavigationSessionStatus("CANCELLED", 3);
    public static final NavigationSessionStatus COMPLETED = new NavigationSessionStatus(ResumeState.COMPLETED, 4);

    private static final /* synthetic */ NavigationSessionStatus[] $values() {
        return new NavigationSessionStatus[]{INITIALIZED, IN_PROGRESS, PAUSED, CANCELLED, COMPLETED};
    }

    static {
        NavigationSessionStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private NavigationSessionStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<NavigationSessionStatus> getEntries() {
        return $ENTRIES;
    }

    public static NavigationSessionStatus valueOf(String str) {
        return (NavigationSessionStatus) Enum.valueOf(NavigationSessionStatus.class, str);
    }

    public static NavigationSessionStatus[] values() {
        return (NavigationSessionStatus[]) $VALUES.clone();
    }
}
