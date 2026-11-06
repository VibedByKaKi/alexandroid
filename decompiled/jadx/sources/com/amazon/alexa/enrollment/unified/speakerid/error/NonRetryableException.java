package com.amazon.alexa.enrollment.unified.speakerid.error;

import com.amazon.alexa.enrollment.unified.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NonRetryableException extends EnrollmentDialogException {
    public NonRetryableException(String str) {
        super(str);
    }

    @Override // com.amazon.alexa.enrollment.unified.speakerid.error.EnrollmentException
    public boolean canShowInlineError() {
        return false;
    }

    @Override // com.amazon.alexa.enrollment.unified.speakerid.error.EnrollmentDialogException
    public int getMessageResId() {
        return R.string.fe_handle_non_retry_msg;
    }

    @Override // com.amazon.alexa.enrollment.unified.speakerid.error.EnrollmentDialogException
    public int getTitleResId() {
        return R.string.fe_handle_non_retry_title;
    }

    public NonRetryableException(String str, Throwable th) {
        super(str, th);
    }
}
