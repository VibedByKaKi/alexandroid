package com.amazon.alexa.enrollment.ui;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.enrollment.metrics.EnrollmentMetricsRecorder;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AbstractEnrollmentActivity_MembersInjector implements MembersInjector<AbstractEnrollmentActivity> {
    private final Provider<DeviceInformation> deviceInformationProvider;
    private final Provider<EnrollmentMetricsRecorder> enrollmentMetricsRecorderProvider;

    public AbstractEnrollmentActivity_MembersInjector(Provider<DeviceInformation> provider, Provider<EnrollmentMetricsRecorder> provider2) {
        this.deviceInformationProvider = provider;
        this.enrollmentMetricsRecorderProvider = provider2;
    }

    public static MembersInjector<AbstractEnrollmentActivity> create(Provider<DeviceInformation> provider, Provider<EnrollmentMetricsRecorder> provider2) {
        return new AbstractEnrollmentActivity_MembersInjector(provider, provider2);
    }

    @InjectedFieldSignature("com.amazon.alexa.enrollment.ui.AbstractEnrollmentActivity.deviceInformation")
    public static void injectDeviceInformation(AbstractEnrollmentActivity abstractEnrollmentActivity, DeviceInformation deviceInformation) {
        abstractEnrollmentActivity.deviceInformation = deviceInformation;
    }

    @InjectedFieldSignature("com.amazon.alexa.enrollment.ui.AbstractEnrollmentActivity.enrollmentMetricsRecorder")
    public static void injectEnrollmentMetricsRecorder(AbstractEnrollmentActivity abstractEnrollmentActivity, EnrollmentMetricsRecorder enrollmentMetricsRecorder) {
        abstractEnrollmentActivity.enrollmentMetricsRecorder = enrollmentMetricsRecorder;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AbstractEnrollmentActivity abstractEnrollmentActivity) {
        injectDeviceInformation(abstractEnrollmentActivity, this.deviceInformationProvider.get());
        injectEnrollmentMetricsRecorder(abstractEnrollmentActivity, this.enrollmentMetricsRecorderProvider.get());
    }
}
