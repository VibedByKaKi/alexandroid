package com.amazon.alexa.handsfree.uservoicerecognition.ui.primer;

import com.amazon.alexa.handsfree.uservoicerecognition.ui.start.StartEnrollmentContract;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface EnrollmentPrimerContract {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface View extends StartEnrollmentContract.View {
        void fetchEnrollmentStatus();

        void hideLoading();

        void showInternetAlertDialogWithRetry();

        void showLoading();

        @Override // com.amazon.alexa.handsfree.uservoicerecognition.ui.start.StartEnrollmentContract.View
        void showStartEnrollmentVoicePrivacyOptedIn();

        void skipEnrollment();
    }
}
