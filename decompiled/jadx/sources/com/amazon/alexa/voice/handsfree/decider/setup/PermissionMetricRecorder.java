package com.amazon.alexa.voice.handsfree.decider.setup;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.FalcoProtocolComponent;
import com.amazon.alexa.handsfree.protocols.metrics.PermissionResult;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentType;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentTypeResolver;
import com.amazon.alexa.voice.handsfree.metrics.MetricsConstants;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class PermissionMetricRecorder {

    @VisibleForTesting
    static final MetricsConstants.Component METRIC_COMPONENT = MetricsConstants.Component.HANDS_FREE;

    @VisibleForTesting
    static final MetricsConstants.PageType METRIC_PAGE_TYPE = MetricsConstants.PageType.DOUBLE_MICROPHONE_PERMISSIONS;
    private static final String TAG = "PermissionMetricRecorder";
    private final Context mContext;
    private EnrollmentType mEnrollmentType;
    private final Lazy<EnrollmentTypeResolver> mEnrollmentTypeResolverLazy;
    private final MetricsBuilderProvider mMetricsBuilderProvider;

    public PermissionMetricRecorder(@NonNull Context context) {
        this(context, MetricsBuilderProvider.getInstance(context), ((FalcoProtocolComponent) AhfComponentsProvider.getComponent(context, FalcoProtocolComponent.class)).enrollmentTypeResolverLazy());
    }

    private EnrollmentType getEnrollmentType() {
        if (this.mEnrollmentType == null) {
            this.mEnrollmentType = this.mEnrollmentTypeResolverLazy.get().getSpeakerVerificationEnrollmentType();
        }
        return this.mEnrollmentType;
    }

    public void recordClick(@NonNull MetricsConstants.PageType pageType, @NonNull MetricsConstants.SubPageType subPageType) {
        this.mMetricsBuilderProvider.newBuilder().withClickMetric(TAG, METRIC_COMPONENT, pageType, subPageType, getEnrollmentType()).emit(this.mContext);
    }

    public void recordPageView(@NonNull MetricsConstants.PageType pageType, @NonNull MetricsConstants.SubPageType subPageType) {
        this.mMetricsBuilderProvider.newBuilder().withPageViewMetric(TAG, METRIC_COMPONENT, pageType, subPageType, getEnrollmentType()).emit(this.mContext);
    }

    public void recordPermissionResult(@NonNull String str, @NonNull String str2, @NonNull PermissionResult permissionResult) {
        this.mMetricsBuilderProvider.newBuilder().withPermissionResultMetric(TAG, str, METRIC_PAGE_TYPE, str2, permissionResult, getEnrollmentType()).emit(this.mContext);
    }

    @VisibleForTesting
    public PermissionMetricRecorder(@NonNull Context context, @NonNull MetricsBuilderProvider metricsBuilderProvider, @NonNull Lazy<EnrollmentTypeResolver> lazy) {
        this.mContext = context;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
        this.mEnrollmentTypeResolverLazy = lazy;
    }
}
