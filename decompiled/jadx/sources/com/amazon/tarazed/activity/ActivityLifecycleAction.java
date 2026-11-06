package com.amazon.tarazed.activity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/amazon/tarazed/activity/ActivityLifecycleAction;", "", "(Ljava/lang/String;I)V", "RESUME", "PAUSE", "INITIAL", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ActivityLifecycleAction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ActivityLifecycleAction[] $VALUES;
    public static final ActivityLifecycleAction RESUME = new ActivityLifecycleAction("RESUME", 0);
    public static final ActivityLifecycleAction PAUSE = new ActivityLifecycleAction("PAUSE", 1);
    public static final ActivityLifecycleAction INITIAL = new ActivityLifecycleAction("INITIAL", 2);

    private static final /* synthetic */ ActivityLifecycleAction[] $values() {
        return new ActivityLifecycleAction[]{RESUME, PAUSE, INITIAL};
    }

    static {
        ActivityLifecycleAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ActivityLifecycleAction(String str, int i) {
    }

    @NotNull
    public static EnumEntries<ActivityLifecycleAction> getEntries() {
        return $ENTRIES;
    }

    public static ActivityLifecycleAction valueOf(String str) {
        return (ActivityLifecycleAction) Enum.valueOf(ActivityLifecycleAction.class, str);
    }

    public static ActivityLifecycleAction[] values() {
        return (ActivityLifecycleAction[]) $VALUES.clone();
    }
}
