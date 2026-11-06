package com.amazon.photos.uploader;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.clouddrive.android.core.interfaces.ClientMetric;
import com.amazon.clouddrive.android.core.interfaces.MetricRecordingType;
import com.amazon.clouddrive.android.core.interfaces.Metrics;
import com.amazon.dee.app.services.shortcut.ShortcutConstants;
import com.amazon.photos.uploader.UploadResponse;
import com.amazon.photos.uploader.internal.metrics.UploadMetrics;
import com.amazon.photos.uploader.internal.utils.FileUtils;
import com.amazon.ptz.util.NtpClient$$ExternalSyntheticLambda0;
import com.dee.app.contacts.common.constants.Constants;
import java.io.File;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0002J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0004J\u001d\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u001eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/amazon/photos/uploader/UploadCompleter;", "", "completer", "Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;", "Lcom/amazon/photos/uploader/UploadResponse;", "metrics", "Lcom/amazon/clouddrive/android/core/interfaces/Metrics;", "fileUtils", "Lcom/amazon/photos/uploader/internal/utils/FileUtils;", "(Landroidx/concurrent/futures/CallbackToFutureAdapter$Completer;Lcom/amazon/clouddrive/android/core/interfaces/Metrics;Lcom/amazon/photos/uploader/internal/utils/FileUtils;)V", "metricData", "Lcom/amazon/photos/uploader/MetricData;", "addCancellationListener", "", "cancellationListener", "Lcom/amazon/photos/uploader/CancellationListener;", "createFileForPath", "Ljava/io/File;", "filePath", "", "getMetricsSuffix", "file", "reportMetrics", "startTime", "", ShortcutConstants.METRIC_NAME_KEY, "setResponse", "", "response", "startUploadMetric", "startUploadMetric$AndroidPhotosUploader_release", "Companion", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UploadCompleter {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final String TAG = "UploadCompleter";

    @NotNull
    private final CallbackToFutureAdapter.Completer<UploadResponse> completer;

    @NotNull
    private final FileUtils fileUtils;

    @Nullable
    private MetricData metricData;

    @NotNull
    private final Metrics metrics;

    public UploadCompleter(@NotNull CallbackToFutureAdapter.Completer<UploadResponse> completer, @NotNull Metrics metrics, @NotNull FileUtils fileUtils) {
        completer.getClass();
        metrics.getClass();
        fileUtils.getClass();
        this.completer = completer;
        this.metrics = metrics;
        this.fileUtils = fileUtils;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addCancellationListener$lambda$3(CancellationListener cancellationListener) {
        cancellationListener.getClass();
        cancellationListener.onCancelled();
    }

    private final File createFileForPath(String filePath) {
        return new File(filePath);
    }

    private final String getMetricsSuffix(File file) {
        return this.fileUtils.isSinglePartUploadAllowed(file) ? "SMALL" : "BIG";
    }

    private final void reportMetrics(long startTime, String metricName, File file) {
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder m = AppLaunchChecker$$ExternalSyntheticOutline0.m(metricName, '_');
        m.append(getMetricsSuffix(file));
        String sb = m.toString();
        this.metrics.recordCustomMetric(TAG, new ClientMetric().addCounter(new UploadCompleter$$ExternalSyntheticLambda1(sb, 0), 1).addTimer(new UploadCompleter$$ExternalSyntheticLambda1(sb, 9), currentTimeMillis - startTime).withTagName(TAG), new MetricRecordingType[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reportMetrics$lambda$1(String str) {
        str.getClass();
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String reportMetrics$lambda$2(String str) {
        str.getClass();
        return str;
    }

    public final void addCancellationListener(@NotNull CancellationListener cancellationListener) {
        cancellationListener.getClass();
        this.completer.addCancellationListener(new NtpClient$$ExternalSyntheticLambda0(cancellationListener, 21), Executors.newSingleThreadExecutor());
    }

    public final boolean setResponse(@NotNull UploadResponse response) {
        response.getClass();
        MetricData metricData = this.metricData;
        if (metricData != null) {
            if (response instanceof UploadResponse.Success) {
                reportMetrics(metricData.getStartTime(), "UPLOAD_SUCCEEDED", metricData.getFile());
            } else {
                if (response instanceof UploadResponse.NoRetryFailure ? true : response instanceof UploadResponse.Failure) {
                    reportMetrics(metricData.getStartTime(), UploadMetrics.UPLOAD_ERROR, metricData.getFile());
                }
            }
        }
        return this.completer.set(response);
    }

    public final void startUploadMetric$AndroidPhotosUploader_release(long startTime, @NotNull String filePath) {
        filePath.getClass();
        this.metricData = new MetricData(startTime, createFileForPath(filePath));
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/amazon/photos/uploader/UploadCompleter$Companion;", "", "()V", Constants.LOG_TAG, "", "AndroidPhotosUploader_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
