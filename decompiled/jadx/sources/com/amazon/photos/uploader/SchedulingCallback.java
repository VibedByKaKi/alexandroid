package com.amazon.photos.uploader;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.Operation;
import androidx.work.WorkManager;
import com.amazon.photos.uploader.internal.workers.BlockerEvaluatorWorker;
import com.amazon.photos.uploader.internal.workers.SchedulerWorker;
import com.amazon.photos.uploader.internal.workers.SchedulerWorkerKt;
import com.amazon.photos.uploader.log.UploadLogger;
import com.dee.app.contacts.common.constants.Constants;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u001f\b\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0017\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\rJ\u001f\u0010\t\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/photos/uploader/SchedulingCallback;", "", "uploadFrameworkContext", "Lcom/amazon/photos/uploader/UploadFrameworkContext;", "workManager", "Landroidx/work/WorkManager;", "logger", "Lcom/amazon/photos/uploader/log/UploadLogger;", "(Lcom/amazon/photos/uploader/UploadFrameworkContext;Landroidx/work/WorkManager;Lcom/amazon/photos/uploader/log/UploadLogger;)V", "reevaluateBlockers", "Landroidx/work/Operation;", "constraints", "Landroidx/work/Constraints;", "reevaluateBlockers$AndroidPhotosUploader_release", "delay", "", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSchedulingCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SchedulingCallback.kt\ncom/amazon/photos/uploader/SchedulingCallback\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,103:1\n1#2:104\n*E\n"})
/* loaded from: classes5.dex */
public final class SchedulingCallback {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "SchedulingCallback";

    @NotNull
    private final UploadLogger logger;

    @NotNull
    private final UploadFrameworkContext uploadFrameworkContext;

    @NotNull
    private final WorkManager workManager;

    public SchedulingCallback(@NotNull UploadFrameworkContext uploadFrameworkContext, @NotNull WorkManager workManager, @NotNull UploadLogger uploadLogger) {
        uploadFrameworkContext.getClass();
        workManager.getClass();
        uploadLogger.getClass();
        this.uploadFrameworkContext = uploadFrameworkContext;
        this.workManager = workManager;
        this.logger = uploadLogger;
    }

    @NotNull
    public final Operation reevaluateBlockers() {
        this.logger.i$AndroidPhotosUploader_release(TAG, "reevaluateBlockers with no delay and no constraints.");
        return reevaluateBlockers$AndroidPhotosUploader_release(0L, null);
    }

    @NotNull
    public final Operation reevaluateBlockers$AndroidPhotosUploader_release(long delay, @Nullable Constraints constraints) {
        this.logger.i$AndroidPhotosUploader_release(TAG, "reevaluateBlockers with " + delay + " ms delay and " + constraints + " constraints.");
        Data build = new Data.Builder().putString("HASHED_DIRECTED_ID_KEY", this.uploadFrameworkContext.getHashedDirectedId()).build();
        build.getClass();
        OneTimeWorkRequest.Builder addTag = new OneTimeWorkRequest.Builder(BlockerEvaluatorWorker.class).setInputData(build).setInitialDelay(delay, TimeUnit.MILLISECONDS).addTag(UploadManager.WORK_MANAGER_TAG);
        if (constraints != null) {
            addTag.setConstraints(constraints);
        }
        OneTimeWorkRequest build2 = addTag.build();
        OneTimeWorkRequest build3 = new OneTimeWorkRequest.Builder(SchedulerWorker.class).addTag(UploadManager.WORK_MANAGER_TAG).addTag(SchedulerWorkerKt.SCHEDULE_TAG).setInputData(build).build();
        ExistingWorkPolicy existingWorkPolicy = constraints == null ? ExistingWorkPolicy.REPLACE : ExistingWorkPolicy.APPEND;
        this.logger.i$AndroidPhotosUploader_release(TAG, "reevaluateBlockers begin unique work using work policy " + existingWorkPolicy + '.');
        Operation enqueue = this.workManager.beginUniqueWork(SchedulingCallbackKt.SCHEDULER_CHAIN_UNIQUE_NAME, existingWorkPolicy, build2).then(build3).enqueue();
        enqueue.getClass();
        return enqueue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amazon/photos/uploader/SchedulingCallback$Companion;", "", "()V", Constants.LOG_TAG, "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @NotNull
    public final Operation reevaluateBlockers$AndroidPhotosUploader_release(long delay) {
        this.logger.i$AndroidPhotosUploader_release(TAG, AppLaunchChecker$$ExternalSyntheticOutline0.m("reevaluateBlockers with ", delay, " ms delay."));
        return reevaluateBlockers$AndroidPhotosUploader_release(delay, null);
    }

    @NotNull
    public final Operation reevaluateBlockers$AndroidPhotosUploader_release(@Nullable Constraints constraints) {
        this.logger.i$AndroidPhotosUploader_release(TAG, "reevaluateBlockers with " + constraints + '.');
        return reevaluateBlockers$AndroidPhotosUploader_release(0L, constraints);
    }
}
