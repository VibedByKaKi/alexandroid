package com.amazon.photos.uploader;

import com.amazon.alexa.enrollment.metrics.MetricsConstants;
import com.amazon.alexa.sharing.Constants;
import com.amazon.minerva.client.thirdparty.transport.UploadResult;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/amazon/photos/uploader/UploadErrorCategory;", "", "(Ljava/lang/String;I)V", UploadResult.SERVER_ERROR, "TOO_MANY_REQUESTS", "LOCAL_VALIDATION", "DIGEST_ERROR", "QUOTA_ERROR", "QUOTA_ERROR_UNKNOWN", "CONFLICT_ERROR", "PARENT_ERROR", "INVALID_PARAMETER", "AUTH_ERROR", "CONTENT_SIGNATURE_ERROR", "FILE_NOT_PRESENT", "INVALID_PARAMETER_FILE_LENGTH_MISMATCH", "APPLICATION_CANCELLED", "UPLOAD_NOT_IN_PROGRESS", "UPLOAD_PARTS_MISSED", "MULTIPART_NOT_SUCCEEDED", Constants.CDS_NODE_NOT_FOUND, "OTHER_KNOWN_ERROR", MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, "SPECIFIC_PARENT_NOT_FOUND", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploadErrorCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UploadErrorCategory[] $VALUES;
    public static final UploadErrorCategory SERVER_ERROR = new UploadErrorCategory(UploadResult.SERVER_ERROR, 0);
    public static final UploadErrorCategory TOO_MANY_REQUESTS = new UploadErrorCategory("TOO_MANY_REQUESTS", 1);
    public static final UploadErrorCategory LOCAL_VALIDATION = new UploadErrorCategory("LOCAL_VALIDATION", 2);
    public static final UploadErrorCategory DIGEST_ERROR = new UploadErrorCategory("DIGEST_ERROR", 3);
    public static final UploadErrorCategory QUOTA_ERROR = new UploadErrorCategory("QUOTA_ERROR", 4);
    public static final UploadErrorCategory QUOTA_ERROR_UNKNOWN = new UploadErrorCategory("QUOTA_ERROR_UNKNOWN", 5);
    public static final UploadErrorCategory CONFLICT_ERROR = new UploadErrorCategory("CONFLICT_ERROR", 6);
    public static final UploadErrorCategory PARENT_ERROR = new UploadErrorCategory("PARENT_ERROR", 7);
    public static final UploadErrorCategory INVALID_PARAMETER = new UploadErrorCategory("INVALID_PARAMETER", 8);
    public static final UploadErrorCategory AUTH_ERROR = new UploadErrorCategory("AUTH_ERROR", 9);
    public static final UploadErrorCategory CONTENT_SIGNATURE_ERROR = new UploadErrorCategory("CONTENT_SIGNATURE_ERROR", 10);
    public static final UploadErrorCategory FILE_NOT_PRESENT = new UploadErrorCategory("FILE_NOT_PRESENT", 11);
    public static final UploadErrorCategory INVALID_PARAMETER_FILE_LENGTH_MISMATCH = new UploadErrorCategory("INVALID_PARAMETER_FILE_LENGTH_MISMATCH", 12);
    public static final UploadErrorCategory APPLICATION_CANCELLED = new UploadErrorCategory("APPLICATION_CANCELLED", 13);
    public static final UploadErrorCategory UPLOAD_NOT_IN_PROGRESS = new UploadErrorCategory("UPLOAD_NOT_IN_PROGRESS", 14);
    public static final UploadErrorCategory UPLOAD_PARTS_MISSED = new UploadErrorCategory("UPLOAD_PARTS_MISSED", 15);
    public static final UploadErrorCategory MULTIPART_NOT_SUCCEEDED = new UploadErrorCategory("MULTIPART_NOT_SUCCEEDED", 16);
    public static final UploadErrorCategory NODE_NOT_FOUND = new UploadErrorCategory(Constants.CDS_NODE_NOT_FOUND, 17);
    public static final UploadErrorCategory OTHER_KNOWN_ERROR = new UploadErrorCategory("OTHER_KNOWN_ERROR", 18);
    public static final UploadErrorCategory UNKNOWN_ERROR = new UploadErrorCategory(MetricsConstants.OperationalMetrics.UNKNOWN_ERROR, 19);
    public static final UploadErrorCategory SPECIFIC_PARENT_NOT_FOUND = new UploadErrorCategory("SPECIFIC_PARENT_NOT_FOUND", 20);

    private static final /* synthetic */ UploadErrorCategory[] $values() {
        return new UploadErrorCategory[]{SERVER_ERROR, TOO_MANY_REQUESTS, LOCAL_VALIDATION, DIGEST_ERROR, QUOTA_ERROR, QUOTA_ERROR_UNKNOWN, CONFLICT_ERROR, PARENT_ERROR, INVALID_PARAMETER, AUTH_ERROR, CONTENT_SIGNATURE_ERROR, FILE_NOT_PRESENT, INVALID_PARAMETER_FILE_LENGTH_MISMATCH, APPLICATION_CANCELLED, UPLOAD_NOT_IN_PROGRESS, UPLOAD_PARTS_MISSED, MULTIPART_NOT_SUCCEEDED, NODE_NOT_FOUND, OTHER_KNOWN_ERROR, UNKNOWN_ERROR, SPECIFIC_PARENT_NOT_FOUND};
    }

    static {
        UploadErrorCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private UploadErrorCategory(String str, int i) {
    }

    @NotNull
    public static EnumEntries<UploadErrorCategory> getEntries() {
        return $ENTRIES;
    }

    public static UploadErrorCategory valueOf(String str) {
        return (UploadErrorCategory) Enum.valueOf(UploadErrorCategory.class, str);
    }

    public static UploadErrorCategory[] values() {
        return (UploadErrorCategory[]) $VALUES.clone();
    }
}
