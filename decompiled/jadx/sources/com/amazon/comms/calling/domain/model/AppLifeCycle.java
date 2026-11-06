package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.biloba.storage.CareActorsStore;
import com.amazon.alexa.presence.service.PresenceBleService;
import com.amazon.alexa.voice.tta.metrics.SimbaEventProcessor;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/domain/model/AppLifeCycle;", "", "<init>", "(Ljava/lang/String;I)V", DebugCoroutineInfoImplKt.CREATED, SimbaEventProcessor.SOURCE_STARTED, "RESUMED", CareActorsStore.SubscriptionStatus.PAUSED, PresenceBleService.ServiceState.STOPPED, "NONE", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AppLifeCycle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppLifeCycle[] $VALUES;
    public static final AppLifeCycle CREATED = new AppLifeCycle(DebugCoroutineInfoImplKt.CREATED, 0);
    public static final AppLifeCycle STARTED = new AppLifeCycle(SimbaEventProcessor.SOURCE_STARTED, 1);
    public static final AppLifeCycle RESUMED = new AppLifeCycle("RESUMED", 2);
    public static final AppLifeCycle PAUSED = new AppLifeCycle(CareActorsStore.SubscriptionStatus.PAUSED, 3);
    public static final AppLifeCycle STOPPED = new AppLifeCycle(PresenceBleService.ServiceState.STOPPED, 4);
    public static final AppLifeCycle NONE = new AppLifeCycle("NONE", 5);

    private static final /* synthetic */ AppLifeCycle[] $values() {
        return new AppLifeCycle[]{CREATED, STARTED, RESUMED, PAUSED, STOPPED, NONE};
    }

    static {
        AppLifeCycle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AppLifeCycle(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AppLifeCycle> getEntries() {
        return $ENTRIES;
    }

    public static AppLifeCycle valueOf(String str) {
        return (AppLifeCycle) Enum.valueOf(AppLifeCycle.class, str);
    }

    public static AppLifeCycle[] values() {
        return (AppLifeCycle[]) $VALUES.clone();
    }
}
