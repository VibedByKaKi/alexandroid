package com.amazon.photos.uploader;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/amazon/photos/uploader/UploadState;", "", "(Ljava/lang/String;I)V", "BLOCKED", "CANCELLED", "ENQUEUED", "FAILED", "RUNNING", "SUCCEEDED", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploadState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UploadState[] $VALUES;
    public static final UploadState BLOCKED = new UploadState("BLOCKED", 0);
    public static final UploadState CANCELLED = new UploadState("CANCELLED", 1);
    public static final UploadState ENQUEUED = new UploadState("ENQUEUED", 2);
    public static final UploadState FAILED = new UploadState("FAILED", 3);
    public static final UploadState RUNNING = new UploadState("RUNNING", 4);
    public static final UploadState SUCCEEDED = new UploadState("SUCCEEDED", 5);

    private static final /* synthetic */ UploadState[] $values() {
        return new UploadState[]{BLOCKED, CANCELLED, ENQUEUED, FAILED, RUNNING, SUCCEEDED};
    }

    static {
        UploadState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private UploadState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<UploadState> getEntries() {
        return $ENTRIES;
    }

    public static UploadState valueOf(String str) {
        return (UploadState) Enum.valueOf(UploadState.class, str);
    }

    public static UploadState[] values() {
        return (UploadState[]) $VALUES.clone();
    }
}
