package com.amazon.alexa.enrollment.unified.edgesv;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.wakeword.speakerverification.errors.TrainingFailure;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EdgeSVEnrollmentMetricsReporter {

    @VisibleForTesting
    static final String EDGE_SV_ENROLLMENT_PREFIX = "EdgeSVEnrollment";

    @VisibleForTesting
    static final String FAILURE_SUFFIX = "Failure";

    @VisibleForTesting
    static final String FINISH_ENROLLMENT = "FinishEnrollment";

    @VisibleForTesting
    static final String SEPARATOR = ":";

    @VisibleForTesting
    static final String START_ENROLLMENT = "StartEnrollment";

    @VisibleForTesting
    static final String SUCCESS_SUFFIX = "Success";
    static final String TAG = "EdgeSVEnrollmentMetricsReporter";

    @VisibleForTesting
    static final String UTTERANCE_TRAINING = "UtteranceTraining";

    @VisibleForTesting
    static final String WAKEWORD_DETECTION = "WakewordDetection";
    private final Context mContext;
    private final MetricsBuilderProvider mMetricsBuilderProvider;

    @VisibleForTesting
    public EdgeSVEnrollmentMetricsReporter(@NonNull Context context, @NonNull MetricsBuilderProvider metricsBuilderProvider) {
        this.mContext = context.getApplicationContext();
        this.mMetricsBuilderProvider = metricsBuilderProvider;
    }

    @VisibleForTesting
    public String createEdgeSVErrorMetricName(@NonNull String str, @NonNull TrainingFailure trainingFailure) {
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("EdgeSVEnrollment:", str, ":");
        m2m.append(trainingFailure.name());
        String sb = m2m.toString();
        Log.d(TAG, "Creating metric name ".concat(sb));
        return sb;
    }

    @VisibleForTesting
    public String createEdgeSVMetricName(@NonNull String str, @NonNull String str2) {
        String m = a$$ExternalSyntheticOutline0.m("EdgeSVEnrollment:", str, ":", str2);
        Log.d(TAG, "Creating metric name ".concat(m));
        return m;
    }

    @VisibleForTesting
    public String createEdgeSVPercentileMetricName(@NonNull String str) {
        String m = a$$ExternalSyntheticOutline0.m("EdgeSVEnrollment:", str);
        Log.d(TAG, "Creating metric name ".concat(m));
        return m;
    }

    @VisibleForTesting
    public void recordEnrollmentWakeWordDetectionEventMetric(boolean z, @NonNull String str, @NonNull String str2, long j) {
        this.mMetricsBuilderProvider.newBuilder().withEnrollmentDetectionEventMetric(TAG, createEdgeSVMetricName(WAKEWORD_DETECTION, z ? "Success" : FAILURE_SUFFIX), str, str2, j).emit(this.mContext);
    }

    public void recordPercentileMetricFailure(@NonNull String str) {
        String str2 = TAG;
        Log.i(str2, "Reporting percentile metric " + str);
        this.mMetricsBuilderProvider.newBuilder().withPercentileMetricFailure(str2, str).emit(this.mContext);
    }

    public void recordPercentileMetricSuccess(@NonNull String str) {
        String str2 = TAG;
        Log.i(str2, "Reporting percentile metric " + str);
        this.mMetricsBuilderProvider.newBuilder().withPercentileMetricSuccess(str2, str).emit(this.mContext);
    }

    @VisibleForTesting
    public void recordPerformanceMetric(@NonNull String str) {
        String str2 = TAG;
        Log.i(str2, "Reporting metric " + str);
        this.mMetricsBuilderProvider.newBuilder().withPerformanceMetric(str2, str).emit(this.mContext);
    }

    public void reportFinishEnrollmentFailure() {
        recordPercentileMetricFailure(createEdgeSVPercentileMetricName(FINISH_ENROLLMENT));
    }

    public void reportFinishEnrollmentFailureReason(@NonNull TrainingFailure trainingFailure) {
        recordPerformanceMetric(createEdgeSVErrorMetricName(FINISH_ENROLLMENT, trainingFailure));
    }

    public void reportFinishEnrollmentSuccess() {
        recordPercentileMetricSuccess(createEdgeSVPercentileMetricName(FINISH_ENROLLMENT));
    }

    public void reportStartEnrollmentFailure() {
        recordPercentileMetricFailure(createEdgeSVPercentileMetricName("StartEnrollment"));
    }

    public void reportStartEnrollmentFailureReason(@NonNull TrainingFailure trainingFailure) {
        recordPerformanceMetric(createEdgeSVErrorMetricName("StartEnrollment", trainingFailure));
    }

    public void reportStartEnrollmentSuccess() {
        recordPercentileMetricSuccess(createEdgeSVPercentileMetricName("StartEnrollment"));
    }

    public void reportUtteranceTrainingFailure() {
        recordPercentileMetricFailure(createEdgeSVPercentileMetricName("UtteranceTraining"));
    }

    public void reportUtteranceTrainingFailureReason(@NonNull TrainingFailure trainingFailure) {
        recordPerformanceMetric(createEdgeSVErrorMetricName("UtteranceTraining", trainingFailure));
    }

    public void reportUtteranceTrainingSuccess() {
        recordPercentileMetricSuccess(createEdgeSVPercentileMetricName("UtteranceTraining"));
    }

    public void reportWakeWordDetectionFailure(@NonNull String str, @NonNull String str2, long j) {
        recordPercentileMetricFailure(createEdgeSVPercentileMetricName(WAKEWORD_DETECTION));
        recordEnrollmentWakeWordDetectionEventMetric(false, str, str2, j);
    }

    public void reportWakeWordDetectionSuccess(@NonNull String str, @NonNull String str2, long j) {
        recordPercentileMetricSuccess(createEdgeSVPercentileMetricName(WAKEWORD_DETECTION));
        recordEnrollmentWakeWordDetectionEventMetric(true, str, str2, j);
    }

    public EdgeSVEnrollmentMetricsReporter(@NonNull Context context) {
        this(context, MetricsBuilderProvider.getInstance(context));
    }
}
