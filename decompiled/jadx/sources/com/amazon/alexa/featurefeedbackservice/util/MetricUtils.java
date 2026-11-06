package com.amazon.alexa.featurefeedbackservice.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.amazon.alexa.featurefeedbackservice.constants.MetricConstants;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.mobilytics.OwnerIdentifier;
import dagger.Lazy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class MetricUtils {
    private Lazy<Mobilytics> mobilytics;

    public MetricUtils(@NonNull Lazy<Mobilytics> lazy) {
        ValidationUtils.validateNonNullObject("mobilytics", lazy);
        this.mobilytics = lazy;
    }

    private void validateParameters(@NonNull String str, @NonNull String str2) {
        Utils.validateNonEmptyString("event", str);
        Utils.validateNonEmptyString(JsonFields.COMPONENT, str2);
        ValidationUtils.validateNonNullLazyObject("mobilytics", this.mobilytics);
    }

    public void recordCheckEligibilityCountMetric(String str) {
        recordCountEvent(str, MetricConstants.Component.CHECK_ELIGIBILITY);
    }

    public void recordCheckEligibilityTimerMetric(String str, long j) {
        recordTimerEvent(str, MetricConstants.Component.CHECK_ELIGIBILITY, j);
    }

    public void recordConfigManagerCountMetric(String str) {
        recordCountEvent(str, MetricConstants.Component.CONFIG_RETRIEVAL_MANAGER);
    }

    public void recordConfigManagerTimerMetric(String str, long j) {
        recordTimerEvent(str, MetricConstants.Component.CONFIG_RETRIEVAL_MANAGER, j);
    }

    public void recordCountEvent(@NonNull String str, @NonNull String str2, @Nullable Exception exc) {
        validateParameters(str, str2);
        this.mobilytics.get().recordCriticalEvent(str, str, MetricConstants.FEATURE_FEEDBACK_SERVICE, str2, exc, OwnerIdentifier.DEEPLINKS);
    }

    public void recordSubmitFeedbackCountMetric(String str) {
        recordCountEvent(str, MetricConstants.Component.SUBMIT_FEEDBACK);
    }

    public void recordSubmitFeedbackTimerMetric(String str, long j) {
        recordTimerEvent(str, MetricConstants.Component.SUBMIT_FEEDBACK, j);
    }

    public void recordTimerEvent(@NonNull String str, @NonNull String str2, long j) {
        validateParameters(str, str2);
        this.mobilytics.get().recordTimer(this.mobilytics.get().createTimer(str, MetricConstants.FEATURE_FEEDBACK_SERVICE, str2, System.currentTimeMillis() - j, false, OwnerIdentifier.DEEPLINKS));
    }

    public void recordCountEvent(@NonNull String str, @NonNull String str2) {
        recordCountEvent(str, str2, null);
    }
}
