package com.amazon.alexa.enrollment.ui.views;

import com.amazon.alexa.enrollment.utils.EnrollmentThemeUtil;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class EnrollmentTrainingProgressBar_MembersInjector implements MembersInjector<EnrollmentTrainingProgressBar> {
    private final Provider<EnrollmentThemeUtil> enrollmentThemeUtilProvider;

    public EnrollmentTrainingProgressBar_MembersInjector(Provider<EnrollmentThemeUtil> provider) {
        this.enrollmentThemeUtilProvider = provider;
    }

    public static MembersInjector<EnrollmentTrainingProgressBar> create(Provider<EnrollmentThemeUtil> provider) {
        return new EnrollmentTrainingProgressBar_MembersInjector(provider);
    }

    @InjectedFieldSignature("com.amazon.alexa.enrollment.ui.views.EnrollmentTrainingProgressBar.enrollmentThemeUtil")
    public static void injectEnrollmentThemeUtil(EnrollmentTrainingProgressBar enrollmentTrainingProgressBar, EnrollmentThemeUtil enrollmentThemeUtil) {
        enrollmentTrainingProgressBar.enrollmentThemeUtil = enrollmentThemeUtil;
    }

    @Override // dagger.MembersInjector
    public void injectMembers(EnrollmentTrainingProgressBar enrollmentTrainingProgressBar) {
        injectEnrollmentThemeUtil(enrollmentTrainingProgressBar, this.enrollmentThemeUtilProvider.get());
    }
}
