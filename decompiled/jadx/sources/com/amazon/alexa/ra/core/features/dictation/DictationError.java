package com.amazon.alexa.ra.core.features.dictation;

import com.amazon.alexa.ra.core.metrics.VisualShareErrorType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/alexa/ra/core/features/dictation/DictationError;", "", "<init>", "(Ljava/lang/String;I)V", "MIC_DENIED", "MIC_INTERRUPTED", "CONNECTION_FAILED", VisualShareErrorType.NETWORK, "SERVICE", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class DictationError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DictationError[] $VALUES;
    public static final DictationError MIC_DENIED = new DictationError("MIC_DENIED", 0);
    public static final DictationError MIC_INTERRUPTED = new DictationError("MIC_INTERRUPTED", 1);
    public static final DictationError CONNECTION_FAILED = new DictationError("CONNECTION_FAILED", 2);
    public static final DictationError NETWORK = new DictationError(VisualShareErrorType.NETWORK, 3);
    public static final DictationError SERVICE = new DictationError("SERVICE", 4);

    private static final /* synthetic */ DictationError[] $values() {
        return new DictationError[]{MIC_DENIED, MIC_INTERRUPTED, CONNECTION_FAILED, NETWORK, SERVICE};
    }

    static {
        DictationError[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private DictationError(String str, int i) {
    }

    @NotNull
    public static EnumEntries<DictationError> getEntries() {
        return $ENTRIES;
    }

    public static DictationError valueOf(String str) {
        return (DictationError) Enum.valueOf(DictationError.class, str);
    }

    public static DictationError[] values() {
        return (DictationError[]) $VALUES.clone();
    }
}
