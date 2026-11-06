package com.amazon.alexa.redesign.client;

import com.amazon.comms.calling.foundation.metrics.providers.CallingMetricsValues;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/amazon/alexa/redesign/client/FeedsSource;", "", "<init>", "(Ljava/lang/String;I)V", CallingMetricsValues.REMOTE, "CACHED", "SKELETON", "MOCKED", "STATIC", "REMOTE_DEFERRED", "FALLBACK", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class FeedsSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeedsSource[] $VALUES;
    public static final FeedsSource REMOTE = new FeedsSource(CallingMetricsValues.REMOTE, 0);
    public static final FeedsSource CACHED = new FeedsSource("CACHED", 1);
    public static final FeedsSource SKELETON = new FeedsSource("SKELETON", 2);
    public static final FeedsSource MOCKED = new FeedsSource("MOCKED", 3);
    public static final FeedsSource STATIC = new FeedsSource("STATIC", 4);
    public static final FeedsSource REMOTE_DEFERRED = new FeedsSource("REMOTE_DEFERRED", 5);
    public static final FeedsSource FALLBACK = new FeedsSource("FALLBACK", 6);

    private static final /* synthetic */ FeedsSource[] $values() {
        return new FeedsSource[]{REMOTE, CACHED, SKELETON, MOCKED, STATIC, REMOTE_DEFERRED, FALLBACK};
    }

    static {
        FeedsSource[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private FeedsSource(String str, int i) {
    }

    @NotNull
    public static EnumEntries<FeedsSource> getEntries() {
        return $ENTRIES;
    }

    public static FeedsSource valueOf(String str) {
        return (FeedsSource) Enum.valueOf(FeedsSource.class, str);
    }

    public static FeedsSource[] values() {
        return (FeedsSource[]) $VALUES.clone();
    }
}
