package com.amazon.alexa.enrollment.ui;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.enrollment.metrics.EnrollmentMetricsRecorder;
import com.amazon.alexa.enrollment.module.library.Injector;
import com.amazon.alexa.enrollment.utils.ActivityUtils;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AbstractEnrollmentActivity extends AppCompatActivity {
    private static final String TAG = "VoxEn_AbstractEnrollmentActivity";

    @Inject
    protected DeviceInformation deviceInformation;

    @Inject
    protected EnrollmentMetricsRecorder enrollmentMetricsRecorder;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Injector.inject(this);
        this.enrollmentMetricsRecorder.initializeMetricsContext(ActivityUtils.getEnrollmentContext(this));
        if (this.deviceInformation.isPhoneFormFactor()) {
            setRequestedOrientation(1);
        }
    }
}
