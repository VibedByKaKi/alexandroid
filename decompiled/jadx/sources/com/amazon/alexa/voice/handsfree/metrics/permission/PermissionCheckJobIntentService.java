package com.amazon.alexa.voice.handsfree.metrics.permission;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.JobIntentService;
import androidx.core.app.SafeDequeueJobIntentService;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.handsfree.notification.NotificationModule;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilder;
import com.amazon.alexa.handsfree.protocols.metrics.builders.MetricsBuilderProvider;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentStatus;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype.EnrollmentStatusManager;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.voice.handsfree.PartnerIntentResolver;
import com.amazon.alexa.voice.handsfree.metrics.MetricType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class PermissionCheckJobIntentService extends SafeDequeueJobIntentService {
    private static final int INVALID_QUOTA_ID = -1;
    private static final int JOB_ID = 32041;
    private static final String TAG = "PermissionJobService";
    private EnrollmentStatusManager mEnrollmentStatusManager;
    private final Initializer mInitializer;
    private MetricsBuilderProvider mMetricsBuilderProvider;
    private PackageManager mPackageManager;
    private Intent mPartnerPermissionsIntent;
    private final PermissionAlarmScheduler mPermissionAlarmScheduler;

    public PermissionCheckJobIntentService() {
        this.mInitializer = InitializerProvider.getInitializer();
        this.mPermissionAlarmScheduler = new PermissionAlarmScheduler();
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        JobIntentService.enqueueWork(context, (Class<?>) PermissionCheckJobIntentService.class, JOB_ID, intent);
    }

    @VisibleForTesting
    public boolean hasPermission(String str, String str2) {
        return this.mPackageManager.checkPermission(str, str2) == 0;
    }

    @Override // androidx.core.app.SafeDequeueJobIntentService, androidx.core.app.JobIntentService, android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mMetricsBuilderProvider = MetricsBuilderProvider.getInstance(this);
        this.mPackageManager = getPackageManager();
        this.mPartnerPermissionsIntent = new PartnerIntentResolver(this).getPartnerPermissionsIntent();
        this.mInitializer.initialize(this);
        this.mEnrollmentStatusManager = EnrollmentStatusManager.getInstance(this);
    }

    @Override // androidx.core.app.JobIntentService
    public void onHandleWork(@NonNull Intent intent) {
        if (this.mPartnerPermissionsIntent == null) {
            Log.i(TAG, "onHandleWork: Not an AMPD device.");
            return;
        }
        if (this.mPackageManager == null) {
            Log.i(TAG, "onHandleWork: package manager is not ready.");
            return;
        }
        String packageName = getPackageName();
        String str = this.mPartnerPermissionsIntent.getPackage();
        boolean hasPermission = hasPermission("android.permission.RECORD_AUDIO", packageName);
        boolean z = false;
        boolean z2 = hasPermission("android.permission.ACCESS_FINE_LOCATION", packageName) || hasPermission("android.permission.ACCESS_COARSE_LOCATION", packageName);
        boolean hasPermission2 = hasPermission("android.permission.RECORD_AUDIO", str);
        StringBuilder m = Automotive$$ExternalSyntheticOutline0.m("onStartCommand: sending permission results [", packageName, " : ", hasPermission, "], [");
        Automotive$$ExternalSyntheticOutline0.m(m, packageName, " : ", z2, "], [");
        m.append(str);
        m.append(" : ");
        m.append(hasPermission2);
        m.append(MarkdownConstants.RIGHT_BRACKET);
        Log.i(TAG, m.toString());
        MetricsBuilder newBuilder = this.mMetricsBuilderProvider.newBuilder();
        boolean z3 = this.mEnrollmentStatusManager.getEnrollmentStatus() != EnrollmentStatus.SETUP_NOT_SET;
        if (!hasPermission) {
            newBuilder.withPerformanceMetric(TAG, MetricType.ALEXA_AUDIO_PERMISSION_ONLY_THIS_TIME.getValue());
            z = true;
        }
        if (!z2) {
            newBuilder.withPerformanceMetric(TAG, MetricType.ALEXA_LOCATION_PERMISSION_ONLY_THIS_TIME.getValue());
        }
        if (!hasPermission2) {
            newBuilder.withPerformanceMetric(TAG, MetricType.PARTNER_AUDIO_PERMISSION_ONLY_THIS_TIME.getValue());
            z = true;
        }
        if (z && z3) {
            schedulePermissionNotification();
        } else {
            int intExtra = intent.getIntExtra("ExtraQuotaId", -1);
            if (intExtra != -1 && intExtra < PermissionAlarmScheduler.QUOTA_COUNT - 1) {
                this.mPermissionAlarmScheduler.schedulePermissionChecker(this, intExtra + 1);
            }
        }
        newBuilder.emit(this);
    }

    @VisibleForTesting
    public void schedulePermissionNotification() {
        NotificationModule.getInstance().schedulePermissionNotification(this);
    }

    @VisibleForTesting
    public PermissionCheckJobIntentService(@NonNull Initializer initializer, @NonNull MetricsBuilderProvider metricsBuilderProvider, @Nullable PackageManager packageManager, @Nullable Intent intent, @NonNull PermissionAlarmScheduler permissionAlarmScheduler, @NonNull EnrollmentStatusManager enrollmentStatusManager) {
        this.mInitializer = initializer;
        this.mPartnerPermissionsIntent = intent;
        this.mPackageManager = packageManager;
        this.mMetricsBuilderProvider = metricsBuilderProvider;
        this.mPermissionAlarmScheduler = permissionAlarmScheduler;
        this.mEnrollmentStatusManager = enrollmentStatusManager;
    }
}
