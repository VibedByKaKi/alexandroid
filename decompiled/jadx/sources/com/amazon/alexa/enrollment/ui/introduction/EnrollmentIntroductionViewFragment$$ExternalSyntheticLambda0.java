package com.amazon.alexa.enrollment.ui.introduction;

import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class EnrollmentIntroductionViewFragment$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EnrollmentIntroductionViewFragment f$0;

    public /* synthetic */ EnrollmentIntroductionViewFragment$$ExternalSyntheticLambda0(EnrollmentIntroductionViewFragment enrollmentIntroductionViewFragment, int i) {
        this.$r8$classId = i;
        this.f$0 = enrollmentIntroductionViewFragment;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.onEligibilityCheckResult(((Boolean) obj).booleanValue());
                break;
            case 1:
                this.f$0.lambda$checkForVoiceEnrollmentEligibility$2((Throwable) obj);
                break;
            case 2:
                this.f$0.onVoicePrivacySettingsCheckResult(((Boolean) obj).booleanValue());
                break;
            default:
                this.f$0.lambda$continueButtonClick$3((Throwable) obj);
                break;
        }
    }
}
