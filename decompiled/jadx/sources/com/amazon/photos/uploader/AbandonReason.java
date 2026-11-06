package com.amazon.photos.uploader;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/photos/uploader/AbandonReason;", "", "(Ljava/lang/String;I)V", "NO_RETRY_FAILURE", "ACCEPTABLE_FAILURE", "FAILED_ATTEMPTS_EXCEEDED", "APPLICATION_CANCELLED", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AbandonReason {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AbandonReason[] $VALUES;
    public static final AbandonReason NO_RETRY_FAILURE = new AbandonReason("NO_RETRY_FAILURE", 0);
    public static final AbandonReason ACCEPTABLE_FAILURE = new AbandonReason("ACCEPTABLE_FAILURE", 1);
    public static final AbandonReason FAILED_ATTEMPTS_EXCEEDED = new AbandonReason("FAILED_ATTEMPTS_EXCEEDED", 2);
    public static final AbandonReason APPLICATION_CANCELLED = new AbandonReason("APPLICATION_CANCELLED", 3);

    private static final /* synthetic */ AbandonReason[] $values() {
        return new AbandonReason[]{NO_RETRY_FAILURE, ACCEPTABLE_FAILURE, FAILED_ATTEMPTS_EXCEEDED, APPLICATION_CANCELLED};
    }

    static {
        AbandonReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private AbandonReason(String str, int i) {
    }

    @NotNull
    public static EnumEntries<AbandonReason> getEntries() {
        return $ENTRIES;
    }

    public static AbandonReason valueOf(String str) {
        return (AbandonReason) Enum.valueOf(AbandonReason.class, str);
    }

    public static AbandonReason[] values() {
        return (AbandonReason[]) $VALUES.clone();
    }
}
