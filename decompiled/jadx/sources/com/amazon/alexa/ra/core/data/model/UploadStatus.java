package com.amazon.alexa.ra.core.data.model;

import com.amazon.devicesetup.common.v1.WifiConnectionState;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0006\u0010\u000e\u001a\u00020\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UploadStatus;", "", "<init>", "(Ljava/lang/String;I)V", WifiConnectionState.IDLE, "PROACTIVE_UPLOADING", "UPLOADING", "READY_TO_SEND", "POST_UPLOAD_PROCESSING", "CANCELED", "ERROR", "isFileUploadingGlobal", "", "isUploadUnsettled", "isCamFlowOngoingOrCancelled", "Companion", "ui-ingress_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class UploadStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UploadStatus[] $VALUES;
    public static final UploadStatus CANCELED;
    public static final UploadStatus ERROR;
    public static final UploadStatus IDLE = new UploadStatus(WifiConnectionState.IDLE, 0);
    public static final UploadStatus POST_UPLOAD_PROCESSING;
    public static final UploadStatus PROACTIVE_UPLOADING;
    public static final UploadStatus READY_TO_SEND;
    public static final UploadStatus UPLOADING;

    @NotNull
    private static final Set<UploadStatus> unsettledUploadStates;

    @NotNull
    private static final Set<UploadStatus> uploadingStatesForBothTextFieldAndChatScreen;

    private static final /* synthetic */ UploadStatus[] $values() {
        return new UploadStatus[]{IDLE, PROACTIVE_UPLOADING, UPLOADING, READY_TO_SEND, POST_UPLOAD_PROCESSING, CANCELED, ERROR};
    }

    static {
        UploadStatus uploadStatus = new UploadStatus("PROACTIVE_UPLOADING", 1);
        PROACTIVE_UPLOADING = uploadStatus;
        UploadStatus uploadStatus2 = new UploadStatus("UPLOADING", 2);
        UPLOADING = uploadStatus2;
        READY_TO_SEND = new UploadStatus("READY_TO_SEND", 3);
        UploadStatus uploadStatus3 = new UploadStatus("POST_UPLOAD_PROCESSING", 4);
        POST_UPLOAD_PROCESSING = uploadStatus3;
        CANCELED = new UploadStatus("CANCELED", 5);
        ERROR = new UploadStatus("ERROR", 6);
        UploadStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        uploadingStatesForBothTextFieldAndChatScreen = SetsKt.setOf((Object[]) new UploadStatus[]{uploadStatus, uploadStatus2, uploadStatus3});
        unsettledUploadStates = SetsKt.setOf((Object[]) new UploadStatus[]{uploadStatus, uploadStatus2});
    }

    private UploadStatus(String str, int i) {
    }

    @NotNull
    public static EnumEntries<UploadStatus> getEntries() {
        return $ENTRIES;
    }

    public static UploadStatus valueOf(String str) {
        return (UploadStatus) Enum.valueOf(UploadStatus.class, str);
    }

    public static UploadStatus[] values() {
        return (UploadStatus[]) $VALUES.clone();
    }

    public final boolean isCamFlowOngoingOrCancelled() {
        return SetsKt.setOf((Object[]) new UploadStatus[]{UPLOADING, POST_UPLOAD_PROCESSING, ERROR, CANCELED}).contains(this);
    }

    public final boolean isFileUploadingGlobal() {
        return uploadingStatesForBothTextFieldAndChatScreen.contains(this);
    }

    public final boolean isUploadUnsettled() {
        return unsettledUploadStates.contains(this);
    }
}
