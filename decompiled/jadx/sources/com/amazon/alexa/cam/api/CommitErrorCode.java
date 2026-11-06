package com.amazon.alexa.cam.api;

import com.amazon.alexa.sharing.Constants;
import com.amazon.clouddrive.cdasdk.cdus.MultipartUploadStatus;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/cam/api/CommitErrorCode;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", Constants.CDS_NODE_NOT_FOUND, MultipartUploadStatus.UPLOAD_IN_PROGRESS, MultipartUploadStatus.UPLOAD_FAILED, "NODE_EXPIRED", "NODE_CANNOT_BE_COMMITTED", "Companion", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class CommitErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CommitErrorCode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String value;
    public static final CommitErrorCode NODE_NOT_FOUND = new CommitErrorCode(Constants.CDS_NODE_NOT_FOUND, 0, Constants.CDS_NODE_NOT_FOUND);
    public static final CommitErrorCode UPLOAD_IN_PROGRESS = new CommitErrorCode(MultipartUploadStatus.UPLOAD_IN_PROGRESS, 1, MultipartUploadStatus.UPLOAD_IN_PROGRESS);
    public static final CommitErrorCode UPLOAD_FAILED = new CommitErrorCode(MultipartUploadStatus.UPLOAD_FAILED, 2, MultipartUploadStatus.UPLOAD_FAILED);
    public static final CommitErrorCode NODE_EXPIRED = new CommitErrorCode("NODE_EXPIRED", 3, "NODE_EXPIRED");
    public static final CommitErrorCode NODE_CANNOT_BE_COMMITTED = new CommitErrorCode("NODE_CANNOT_BE_COMMITTED", 4, "NODE_CANNOT_BE_COMMITTED");

    private static final /* synthetic */ CommitErrorCode[] $values() {
        return new CommitErrorCode[]{NODE_NOT_FOUND, UPLOAD_IN_PROGRESS, UPLOAD_FAILED, NODE_EXPIRED, NODE_CANNOT_BE_COMMITTED};
    }

    static {
        CommitErrorCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    private CommitErrorCode(String str, int i, String str2) {
        this.value = str2;
    }

    @NotNull
    public static EnumEntries<CommitErrorCode> getEntries() {
        return $ENTRIES;
    }

    public static CommitErrorCode valueOf(String str) {
        return (CommitErrorCode) Enum.valueOf(CommitErrorCode.class, str);
    }

    public static CommitErrorCode[] values() {
        return (CommitErrorCode[]) $VALUES.clone();
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/cam/api/CommitErrorCode$Companion;", "", "()V", "fromValue", "Lcom/amazon/alexa/cam/api/CommitErrorCode;", "value", "", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBatchCommitResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BatchCommitResponse.kt\ncom/amazon/alexa/cam/api/CommitErrorCode$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,51:1\n1#2:52\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CommitErrorCode fromValue(@NotNull String value) {
            value.getClass();
            for (CommitErrorCode commitErrorCode : CommitErrorCode.values()) {
                if (Intrinsics.areEqual(commitErrorCode.getValue(), value)) {
                    return commitErrorCode;
                }
            }
            return null;
        }

        private Companion() {
        }
    }
}
