package com.amazon.photos.uploader.cds.multipart;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/photos/uploader/cds/multipart/PartUploadState;", "", "(Ljava/lang/String;I)V", "ENQUEUED", "FAILED", "RUNNING", "SUCCEEDED", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartUploadState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PartUploadState[] $VALUES;
    public static final PartUploadState ENQUEUED = new PartUploadState("ENQUEUED", 0);
    public static final PartUploadState FAILED = new PartUploadState("FAILED", 1);
    public static final PartUploadState RUNNING = new PartUploadState("RUNNING", 2);
    public static final PartUploadState SUCCEEDED = new PartUploadState("SUCCEEDED", 3);

    private static final /* synthetic */ PartUploadState[] $values() {
        return new PartUploadState[]{ENQUEUED, FAILED, RUNNING, SUCCEEDED};
    }

    static {
        PartUploadState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private PartUploadState(String str, int i) {
    }

    @NotNull
    public static EnumEntries<PartUploadState> getEntries() {
        return $ENTRIES;
    }

    public static PartUploadState valueOf(String str) {
        return (PartUploadState) Enum.valueOf(PartUploadState.class, str);
    }

    public static PartUploadState[] values() {
        return (PartUploadState[]) $VALUES.clone();
    }
}
