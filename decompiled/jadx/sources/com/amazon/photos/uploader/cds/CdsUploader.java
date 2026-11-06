package com.amazon.photos.uploader.cds;

import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.clouddrive.android.core.interfaces.MetricRecordingType;
import com.amazon.clouddrive.android.core.interfaces.Metrics;
import com.amazon.clouddrive.cdasdk.cds.common.NodeInfo;
import com.amazon.photos.uploader.CancellationListener;
import com.amazon.photos.uploader.ResultMetadata;
import com.amazon.photos.uploader.UploadCompleter;
import com.amazon.photos.uploader.UploadFrameworkContext;
import com.amazon.photos.uploader.UploadProgressListener;
import com.amazon.photos.uploader.UploadRequest;
import com.amazon.photos.uploader.UploadResponse;
import com.amazon.photos.uploader.Uploader;
import com.amazon.photos.uploader.UploaderState;
import com.amazon.photos.uploader.cds.multipart.CdsMultiPartUploader;
import com.amazon.photos.uploader.internal.dagger.component.CdsUploaderComponent;
import com.amazon.photos.uploader.internal.utils.FileUtils;
import com.amazon.photos.uploader.log.UploadLogger;
import com.dee.app.contacts.common.constants.Constants;
import java.io.File;
import javax.inject.Inject;
import javax.security.auth.Destroyable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0002TUB\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0017J\u0015\u0010=\u001a\u00020>2\u0006\u0010;\u001a\u00020<H\u0001¢\u0006\u0002\b?J\b\u0010@\u001a\u00020:H\u0016J\u0015\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020DH\u0001¢\u0006\u0002\bEJ\b\u0010F\u001a\u00020:H\u0017J\u0010\u0010G\u001a\u00020\u00012\u0006\u0010;\u001a\u00020<H\u0002J\b\u0010H\u001a\u00020\u0007H\u0016J\u0015\u0010I\u001a\u00020\u00072\u0006\u0010J\u001a\u00020BH\u0001¢\u0006\u0002\bKJ \u0010L\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020PH\u0017J\u0010\u0010Q\u001a\u00020:2\u0006\u0010R\u001a\u00020SH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000f@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0015@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\b\u001a\u00020\u001b@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020!2\u0006\u0010\b\u001a\u00020!@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010(\u001a\u00020'2\u0006\u0010\b\u001a\u00020'@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010.\u001a\u00020-2\u0006\u0010\b\u001a\u00020-@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00104\u001a\u0002032\u0006\u0010\b\u001a\u000203@AX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006V"}, d2 = {"Lcom/amazon/photos/uploader/cds/CdsUploader;", "Lcom/amazon/photos/uploader/Uploader;", "Ljavax/security/auth/Destroyable;", JsonFields.COMPONENT, "Lcom/amazon/photos/uploader/internal/dagger/component/CdsUploaderComponent;", "(Lcom/amazon/photos/uploader/internal/dagger/component/CdsUploaderComponent;)V", "destroyed", "", "<set-?>", "Lcom/amazon/photos/uploader/internal/utils/FileUtils;", "fileUtils", "getFileUtils$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/internal/utils/FileUtils;", "setFileUtils$AndroidPhotosUploader_release", "(Lcom/amazon/photos/uploader/internal/utils/FileUtils;)V", "Lcom/amazon/photos/uploader/log/UploadLogger;", "logger", "getLogger$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/log/UploadLogger;", "setLogger$AndroidPhotosUploader_release", "(Lcom/amazon/photos/uploader/log/UploadLogger;)V", "Lcom/amazon/clouddrive/android/core/interfaces/Metrics;", "metrics", "getMetrics$AndroidPhotosUploader_release", "()Lcom/amazon/clouddrive/android/core/interfaces/Metrics;", "setMetrics$AndroidPhotosUploader_release", "(Lcom/amazon/clouddrive/android/core/interfaces/Metrics;)V", "Lcom/amazon/photos/uploader/cds/multipart/CdsMultiPartUploader;", "multiPartUploader", "getMultiPartUploader$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/cds/multipart/CdsMultiPartUploader;", "setMultiPartUploader$AndroidPhotosUploader_release", "(Lcom/amazon/photos/uploader/cds/multipart/CdsMultiPartUploader;)V", "Lcom/amazon/photos/uploader/cds/ParentIdCache;", "parentIdCache", "getParentIdCache$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/cds/ParentIdCache;", "setParentIdCache$AndroidPhotosUploader_release", "(Lcom/amazon/photos/uploader/cds/ParentIdCache;)V", "Lcom/amazon/photos/uploader/cds/CdsSinglePartMetadataUploader;", "singlePartMetadataUploader", "getSinglePartMetadataUploader$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/cds/CdsSinglePartMetadataUploader;", "setSinglePartMetadataUploader$AndroidPhotosUploader_release", "(Lcom/amazon/photos/uploader/cds/CdsSinglePartMetadataUploader;)V", "Lcom/amazon/photos/uploader/cds/CdsSinglePartUploader;", "singlePartUploader", "getSinglePartUploader$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/cds/CdsSinglePartUploader;", "setSinglePartUploader$AndroidPhotosUploader_release", "(Lcom/amazon/photos/uploader/cds/CdsSinglePartUploader;)V", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "uploadFrameworkContext", "getUploadFrameworkContext$AndroidPhotosUploader_release", "()Lcom/amazon/photos/uploader/UploadFrameworkContext;", "setUploadFrameworkContext$AndroidPhotosUploader_release", "(Lcom/amazon/photos/uploader/UploadFrameworkContext;)V", "cancelUpload", "", "uploadRequest", "Lcom/amazon/photos/uploader/UploadRequest;", "cancellationListener", "Lcom/amazon/photos/uploader/CancellationListener;", "cancellationListener$AndroidPhotosUploader_release", "clearCompleted", "createFileForPath", "Ljava/io/File;", "filePath", "", "createFileForPath$AndroidPhotosUploader_release", "destroy", "getUploader", "isDestroyed", "isSinglePartUploadAllowed", "file", "isSinglePartUploadAllowed$AndroidPhotosUploader_release", "startUpload", "completer", "Lcom/amazon/photos/uploader/UploadCompleter;", "progressListener", "Lcom/amazon/photos/uploader/UploadProgressListener;", "updateUploaderState", "uploaderState", "Lcom/amazon/photos/uploader/UploaderState;", "Companion", "UploaderCancellationListener", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CdsUploader implements Uploader, Destroyable {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String RESULT_NODE_ID_KEY = "NODE_ID_KEY";

    @NotNull
    public static final String RESULT_NODE_KEY = "NODE_KEY";

    @NotNull
    public static final String RESULT_SUCCESS_WITH_CONFLICT = "IS_SUCCESSFUL_WITH_CONFLICT";

    @NotNull
    private static final String TAG = "CdsUploader";
    private boolean destroyed;
    public FileUtils fileUtils;
    public UploadLogger logger;
    public Metrics metrics;
    public CdsMultiPartUploader multiPartUploader;
    public ParentIdCache parentIdCache;
    public CdsSinglePartMetadataUploader singlePartMetadataUploader;
    public CdsSinglePartUploader singlePartUploader;
    public UploadFrameworkContext uploadFrameworkContext;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/amazon/photos/uploader/cds/CdsUploader$UploaderCancellationListener;", "Lcom/amazon/photos/uploader/CancellationListener;", "uploadRequest", "Lcom/amazon/photos/uploader/UploadRequest;", "uploader", "Lcom/amazon/photos/uploader/Uploader;", "(Lcom/amazon/photos/uploader/UploadRequest;Lcom/amazon/photos/uploader/Uploader;)V", "onCancelled", "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploaderCancellationListener implements CancellationListener {

        @NotNull
        private final UploadRequest uploadRequest;

        @NotNull
        private final Uploader uploader;

        public UploaderCancellationListener(@NotNull UploadRequest uploadRequest, @NotNull Uploader uploader) {
            uploadRequest.getClass();
            uploader.getClass();
            this.uploadRequest = uploadRequest;
            this.uploader = uploader;
        }

        @Override // com.amazon.photos.uploader.CancellationListener
        public void onCancelled() {
            this.uploader.cancelUpload(this.uploadRequest);
        }
    }

    public CdsUploader(@NotNull CdsUploaderComponent cdsUploaderComponent) {
        cdsUploaderComponent.getClass();
        cdsUploaderComponent.inject(this);
    }

    private final Uploader getUploader(UploadRequest uploadRequest) {
        if (!isSinglePartUploadAllowed$AndroidPhotosUploader_release(createFileForPath$AndroidPhotosUploader_release(uploadRequest.getFilePath()))) {
            return getMultiPartUploader$AndroidPhotosUploader_release();
        }
        String metadata = uploadRequest.getMetadata();
        return (metadata == null || metadata.length() == 0) ? getSinglePartUploader$AndroidPhotosUploader_release() : getSinglePartMetadataUploader$AndroidPhotosUploader_release();
    }

    @Override // com.amazon.photos.uploader.Uploader
    @WorkerThread
    public synchronized void cancelUpload(@NotNull UploadRequest uploadRequest) {
        uploadRequest.getClass();
        getLogger$AndroidPhotosUploader_release().d$AndroidPhotosUploader_release(TAG, "cancelUpload start uploader is destroyed [" + isDestroyed() + AbstractJsonLexerKt.END_LIST);
        if (isDestroyed()) {
            return;
        }
        getMetrics$AndroidPhotosUploader_release().recordSimpleEvent(TAG, new CdsUploader$$ExternalSyntheticLambda0(0), new MetricRecordingType[0]);
        getUploader(uploadRequest).cancelUpload(uploadRequest);
    }

    @VisibleForTesting
    @NotNull
    public final CancellationListener cancellationListener$AndroidPhotosUploader_release(@NotNull UploadRequest uploadRequest) {
        uploadRequest.getClass();
        return new UploaderCancellationListener(uploadRequest, this);
    }

    @Override // com.amazon.photos.uploader.Uploader
    public void clearCompleted() {
        getMultiPartUploader$AndroidPhotosUploader_release().clearCompleted();
        getSinglePartUploader$AndroidPhotosUploader_release().clearCompleted();
    }

    @VisibleForTesting
    @NotNull
    public final File createFileForPath$AndroidPhotosUploader_release(@NotNull String filePath) {
        filePath.getClass();
        return new File(filePath);
    }

    @Override // javax.security.auth.Destroyable
    @WorkerThread
    public synchronized void destroy() {
        getLogger$AndroidPhotosUploader_release().i$AndroidPhotosUploader_release(TAG, "destroy start");
        getSinglePartUploader$AndroidPhotosUploader_release().cleanup$AndroidPhotosUploader_release();
        getMultiPartUploader$AndroidPhotosUploader_release().cleanup$AndroidPhotosUploader_release();
        getParentIdCache$AndroidPhotosUploader_release().destroy();
        this.destroyed = true;
        getLogger$AndroidPhotosUploader_release().i$AndroidPhotosUploader_release(TAG, "destroy end");
    }

    @NotNull
    public final FileUtils getFileUtils$AndroidPhotosUploader_release() {
        FileUtils fileUtils = this.fileUtils;
        if (fileUtils != null) {
            return fileUtils;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fileUtils");
        return null;
    }

    @NotNull
    public final UploadLogger getLogger$AndroidPhotosUploader_release() {
        UploadLogger uploadLogger = this.logger;
        if (uploadLogger != null) {
            return uploadLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("logger");
        return null;
    }

    @NotNull
    public final Metrics getMetrics$AndroidPhotosUploader_release() {
        Metrics metrics = this.metrics;
        if (metrics != null) {
            return metrics;
        }
        Intrinsics.throwUninitializedPropertyAccessException("metrics");
        return null;
    }

    @NotNull
    public final CdsMultiPartUploader getMultiPartUploader$AndroidPhotosUploader_release() {
        CdsMultiPartUploader cdsMultiPartUploader = this.multiPartUploader;
        if (cdsMultiPartUploader != null) {
            return cdsMultiPartUploader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("multiPartUploader");
        return null;
    }

    @NotNull
    public final ParentIdCache getParentIdCache$AndroidPhotosUploader_release() {
        ParentIdCache parentIdCache = this.parentIdCache;
        if (parentIdCache != null) {
            return parentIdCache;
        }
        Intrinsics.throwUninitializedPropertyAccessException("parentIdCache");
        return null;
    }

    @NotNull
    public final CdsSinglePartMetadataUploader getSinglePartMetadataUploader$AndroidPhotosUploader_release() {
        CdsSinglePartMetadataUploader cdsSinglePartMetadataUploader = this.singlePartMetadataUploader;
        if (cdsSinglePartMetadataUploader != null) {
            return cdsSinglePartMetadataUploader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singlePartMetadataUploader");
        return null;
    }

    @NotNull
    public final CdsSinglePartUploader getSinglePartUploader$AndroidPhotosUploader_release() {
        CdsSinglePartUploader cdsSinglePartUploader = this.singlePartUploader;
        if (cdsSinglePartUploader != null) {
            return cdsSinglePartUploader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singlePartUploader");
        return null;
    }

    @NotNull
    public final UploadFrameworkContext getUploadFrameworkContext$AndroidPhotosUploader_release() {
        UploadFrameworkContext uploadFrameworkContext = this.uploadFrameworkContext;
        if (uploadFrameworkContext != null) {
            return uploadFrameworkContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("uploadFrameworkContext");
        return null;
    }

    @Override // javax.security.auth.Destroyable
    public synchronized boolean isDestroyed() {
        return this.destroyed;
    }

    @VisibleForTesting
    public final boolean isSinglePartUploadAllowed$AndroidPhotosUploader_release(@NotNull File file) {
        file.getClass();
        return getFileUtils$AndroidPhotosUploader_release().isSinglePartUploadAllowed(file);
    }

    @Inject
    public final void setFileUtils$AndroidPhotosUploader_release(@NotNull FileUtils fileUtils) {
        fileUtils.getClass();
        this.fileUtils = fileUtils;
    }

    @Inject
    public final void setLogger$AndroidPhotosUploader_release(@NotNull UploadLogger uploadLogger) {
        uploadLogger.getClass();
        this.logger = uploadLogger;
    }

    @Inject
    public final void setMetrics$AndroidPhotosUploader_release(@NotNull Metrics metrics) {
        metrics.getClass();
        this.metrics = metrics;
    }

    @Inject
    public final void setMultiPartUploader$AndroidPhotosUploader_release(@NotNull CdsMultiPartUploader cdsMultiPartUploader) {
        cdsMultiPartUploader.getClass();
        this.multiPartUploader = cdsMultiPartUploader;
    }

    @Inject
    public final void setParentIdCache$AndroidPhotosUploader_release(@NotNull ParentIdCache parentIdCache) {
        parentIdCache.getClass();
        this.parentIdCache = parentIdCache;
    }

    @Inject
    public final void setSinglePartMetadataUploader$AndroidPhotosUploader_release(@NotNull CdsSinglePartMetadataUploader cdsSinglePartMetadataUploader) {
        cdsSinglePartMetadataUploader.getClass();
        this.singlePartMetadataUploader = cdsSinglePartMetadataUploader;
    }

    @Inject
    public final void setSinglePartUploader$AndroidPhotosUploader_release(@NotNull CdsSinglePartUploader cdsSinglePartUploader) {
        cdsSinglePartUploader.getClass();
        this.singlePartUploader = cdsSinglePartUploader;
    }

    @Inject
    public final void setUploadFrameworkContext$AndroidPhotosUploader_release(@NotNull UploadFrameworkContext uploadFrameworkContext) {
        uploadFrameworkContext.getClass();
        this.uploadFrameworkContext = uploadFrameworkContext;
    }

    @Override // com.amazon.photos.uploader.Uploader
    @WorkerThread
    public synchronized void startUpload(@NotNull UploadRequest uploadRequest, @NotNull UploadCompleter completer, @NotNull UploadProgressListener progressListener) {
        uploadRequest.getClass();
        completer.getClass();
        progressListener.getClass();
        if (isDestroyed()) {
            return;
        }
        completer.addCancellationListener(cancellationListener$AndroidPhotosUploader_release(uploadRequest));
        getUploader(uploadRequest).startUpload(uploadRequest, completer, progressListener);
    }

    @Override // com.amazon.photos.uploader.Uploader
    public void updateUploaderState(@NotNull UploaderState uploaderState) {
        uploaderState.getClass();
        getSinglePartUploader$AndroidPhotosUploader_release().updateUploaderState(uploaderState);
        getMultiPartUploader$AndroidPhotosUploader_release().updateUploaderState(uploaderState);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/amazon/photos/uploader/cds/CdsUploader$Companion;", "", "()V", "RESULT_NODE_ID_KEY", "", "RESULT_NODE_KEY", "RESULT_SUCCESS_WITH_CONFLICT", Constants.LOG_TAG, "generateResultFromNodeInfo", "Lcom/amazon/photos/uploader/UploadResponse;", "nodeInfo", "Lcom/amazon/clouddrive/cdasdk/cds/common/NodeInfo;", "withConflict", "", "generateResultFromNodeInfo$AndroidPhotosUploader_release", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ UploadResponse generateResultFromNodeInfo$AndroidPhotosUploader_release$default(Companion companion, NodeInfo nodeInfo, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.generateResultFromNodeInfo$AndroidPhotosUploader_release(nodeInfo, z);
        }

        @NotNull
        public final UploadResponse generateResultFromNodeInfo$AndroidPhotosUploader_release(@NotNull NodeInfo nodeInfo, boolean withConflict) {
            nodeInfo.getClass();
            ResultMetadata resultMetadata = new ResultMetadata();
            String id = nodeInfo.getId();
            id.getClass();
            resultMetadata.putString(CdsUploader.RESULT_NODE_ID_KEY, id);
            resultMetadata.putAny(CdsUploader.RESULT_NODE_KEY, nodeInfo);
            resultMetadata.putBoolean(CdsUploader.RESULT_SUCCESS_WITH_CONFLICT, withConflict);
            return new UploadResponse.Success(resultMetadata);
        }

        private Companion() {
        }
    }
}
