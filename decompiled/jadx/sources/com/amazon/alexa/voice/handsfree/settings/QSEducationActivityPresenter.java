package com.amazon.alexa.voice.handsfree.settings;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.notification.metrics.NotificationMetricReporter;
import com.amazon.alexa.voice.handsfree.metrics.MetricsConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class QSEducationActivityPresenter {
    private static final String TAG = "QSEducationActivityPresenter";
    private NotificationMetricReporter mNotificationMetricReporter;
    private QSEducationMetricRecorder mQSEducationMetricRecorder;

    public QSEducationActivityPresenter(@NonNull Context context) {
        this(new QSEducationMetricRecorder(context), new NotificationMetricReporter(context));
    }

    public void onDoneButtonClick() {
        this.mQSEducationMetricRecorder.recordClick(MetricsConstants.SubPageType.DONE);
    }

    public void onNotificationClick(@NonNull Intent intent) {
        this.mNotificationMetricReporter.reportNotificationClickMetric(intent);
    }

    public void onPageView(@NonNull boolean z) {
        this.mQSEducationMetricRecorder.recordPageView(z ? MetricsConstants.SubPageType.MAIN_MENU_EDUCATION : MetricsConstants.SubPageType.EDIT_MENU_EDUCATION);
    }

    @VisibleForTesting
    public QSEducationActivityPresenter(@NonNull QSEducationMetricRecorder qSEducationMetricRecorder, @NonNull NotificationMetricReporter notificationMetricReporter) {
        this.mQSEducationMetricRecorder = qSEducationMetricRecorder;
        this.mNotificationMetricReporter = notificationMetricReporter;
    }
}
