package com.amazon.alexa.enrollment.exception;

import com.amazon.alexa.enrollment.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NonRetryableQualityFailureException extends EnrollmentDialogException {
    public NonRetryableQualityFailureException(String str) {
        super(str);
    }

    @Override // com.amazon.alexa.enrollment.exception.EnrollmentException
    public boolean canShowInlineError() {
        return false;
    }

    @Override // com.amazon.alexa.enrollment.exception.EnrollmentDialogException
    public int getMessageResId() {
        return R.string.handle_quality_failure_message;
    }

    @Override // com.amazon.alexa.enrollment.exception.EnrollmentDialogException
    public int getRequestCode() {
        return 2;
    }

    @Override // com.amazon.alexa.enrollment.exception.EnrollmentDialogException
    public int getTitleResId() {
        return R.string.handle_quality_failure_title;
    }

    @Override // com.amazon.alexa.enrollment.exception.EnrollmentDialogException
    public boolean hasNegativeButton() {
        return true;
    }

    public NonRetryableQualityFailureException(String str, Throwable th) {
        super(str, th);
    }

    public NonRetryableQualityFailureException(Throwable th) {
        super(th);
    }
}
