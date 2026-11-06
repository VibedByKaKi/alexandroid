package com.amazon.alexa.ra.android.smartfragment.metrics;

import com.amazon.alexa.accessory.notificationpublisher.conversation.metrics.SpeechMetric;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/metrics/MAPTokenRequestOutcome;", "", "dimensionValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getDimensionValue", "()Ljava/lang/String;", "TOKEN", "UNAVAILABLE", "FAILED", "TIMED_OUT", "UNSUPPORTED_METHOD", "INVALID_ID", "VIEW_GONE", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class MAPTokenRequestOutcome {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MAPTokenRequestOutcome[] $VALUES;

    @NotNull
    private final String dimensionValue;
    public static final MAPTokenRequestOutcome TOKEN = new MAPTokenRequestOutcome("TOKEN", 0, "token");
    public static final MAPTokenRequestOutcome UNAVAILABLE = new MAPTokenRequestOutcome("UNAVAILABLE", 1, "unavailable");
    public static final MAPTokenRequestOutcome FAILED = new MAPTokenRequestOutcome("FAILED", 2, "failed");
    public static final MAPTokenRequestOutcome TIMED_OUT = new MAPTokenRequestOutcome("TIMED_OUT", 3, SpeechMetric.TIMED_OUT);
    public static final MAPTokenRequestOutcome UNSUPPORTED_METHOD = new MAPTokenRequestOutcome("UNSUPPORTED_METHOD", 4, "unsupportedMethod");
    public static final MAPTokenRequestOutcome INVALID_ID = new MAPTokenRequestOutcome("INVALID_ID", 5, "invalidId");
    public static final MAPTokenRequestOutcome VIEW_GONE = new MAPTokenRequestOutcome("VIEW_GONE", 6, "viewGone");

    private static final /* synthetic */ MAPTokenRequestOutcome[] $values() {
        return new MAPTokenRequestOutcome[]{TOKEN, UNAVAILABLE, FAILED, TIMED_OUT, UNSUPPORTED_METHOD, INVALID_ID, VIEW_GONE};
    }

    static {
        MAPTokenRequestOutcome[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MAPTokenRequestOutcome(String str, int i, String str2) {
        this.dimensionValue = str2;
    }

    @NotNull
    public static EnumEntries<MAPTokenRequestOutcome> getEntries() {
        return $ENTRIES;
    }

    public static MAPTokenRequestOutcome valueOf(String str) {
        return (MAPTokenRequestOutcome) Enum.valueOf(MAPTokenRequestOutcome.class, str);
    }

    public static MAPTokenRequestOutcome[] values() {
        return (MAPTokenRequestOutcome[]) $VALUES.clone();
    }

    @NotNull
    public final String getDimensionValue() {
        return this.dimensionValue;
    }
}
