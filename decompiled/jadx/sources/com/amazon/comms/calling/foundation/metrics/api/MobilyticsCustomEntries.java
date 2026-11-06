package com.amazon.comms.calling.foundation.metrics.api;

import com.amazon.deecomms.common.Constants;
import com.amazon.photos.autosave.internal.workers.CancelUploadsWorkerKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/api/MobilyticsCustomEntries;", "", "<init>", "()V", "SOURCE_CONTEXT", "", "APP_COMPONENT", "CONTENT_TYPE", "CHANNEL_NAME", "INPUT_TYPE", "CONTENT_ID", "CONTENT_VERSION", "CONTENT_PROVIDER", "CONTENT_DETAILS", "CommsMetadata", "ErrorsCustomData", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class MobilyticsCustomEntries {

    @NotNull
    public static final String APP_COMPONENT = "appComponent";

    @NotNull
    public static final String CHANNEL_NAME = "channelName";

    @NotNull
    public static final String CONTENT_DETAILS = "contentDetails";

    @NotNull
    public static final String CONTENT_ID = "contentId";

    @NotNull
    public static final String CONTENT_PROVIDER = "contentProvider";

    @NotNull
    public static final String CONTENT_TYPE = "contentType";

    @NotNull
    public static final String CONTENT_VERSION = "contentVersion";

    @NotNull
    public static final String INPUT_TYPE = "inputType";

    @NotNull
    public static final MobilyticsCustomEntries INSTANCE = new MobilyticsCustomEntries();

    @NotNull
    public static final String SOURCE_CONTEXT = "sourceContext";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/api/MobilyticsCustomEntries$CommsMetadata;", "", "<init>", "()V", "STATUS_CODE", "", "COMMS_ID", Constants.CALL_TYPE, "TRANSPORT", "DIRECTION", "REQUEST_ID", "SIZE", "DURATION", CancelUploadsWorkerKt.MEDIA_TYPE, "MESSAGE_TYPE", "TARGET_TYPE", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CommsMetadata {

        @NotNull
        public static final String CALL_TYPE = "callType";

        @NotNull
        public static final String COMMS_ID = "commsId";

        @NotNull
        public static final String DIRECTION = "direction";

        @NotNull
        public static final String DURATION = "duration";

        @NotNull
        public static final CommsMetadata INSTANCE = new CommsMetadata();

        @NotNull
        public static final String MEDIA_TYPE = "mediaType";

        @NotNull
        public static final String MESSAGE_TYPE = "messageType";

        @NotNull
        public static final String REQUEST_ID = "requestId";

        @NotNull
        public static final String SIZE = "size";

        @NotNull
        public static final String STATUS_CODE = "statusCode";

        @NotNull
        public static final String TARGET_TYPE = "targetType";

        @NotNull
        public static final String TRANSPORT = "transport";

        private CommsMetadata() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/foundation/metrics/api/MobilyticsCustomEntries$ErrorsCustomData;", "", "<init>", "()V", "META_ERROR_SOURCE", "", "STATUS_CODE_EXCEPTION", "", "META_REQUEST_ID", "META_STATUS_CODE", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ErrorsCustomData {

        @NotNull
        public static final ErrorsCustomData INSTANCE = new ErrorsCustomData();

        @NotNull
        public static final String META_ERROR_SOURCE = "errorSource";

        @NotNull
        public static final String META_REQUEST_ID = "requestId";

        @NotNull
        public static final String META_STATUS_CODE = "statusCode";
        public static final int STATUS_CODE_EXCEPTION = 1700;

        private ErrorsCustomData() {
        }
    }

    private MobilyticsCustomEntries() {
    }
}
