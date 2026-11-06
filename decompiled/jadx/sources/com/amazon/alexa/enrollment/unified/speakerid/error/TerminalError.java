package com.amazon.alexa.enrollment.unified.speakerid.error;

import androidx.annotation.StringRes;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract;
import com.amazon.alexa.wakeword.speakerverification.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum TerminalError implements EnrollmentErrorContract {
    DIALOG_REQUEST_DENIED(1),
    GET_ENROLLMENT_STATUS_SAME_INDEX(2),
    SPEECHLET_TIMEOUT_DURING_API_CALL(3),
    SPEECHLET_TIMEOUT_DURING_DETECTION(4, R.string.handsfree_enrollment_detection_timeout_error_title, R.string.handsfree_enrollment_detection_timeout_error_message);

    private final int mErrorCode;

    @StringRes
    private final int mReasonRes;

    @StringRes
    private final int mTitleRes;

    TerminalError(int i) {
        this(i, R.string.handsfree_generic_enrollment_error_title, R.string.handsfree_generic_enrollment_error_message);
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
    public String getErrorCode() {
        return String.format("%d.%d", Integer.valueOf(EnrollmentErrorContract.ErrorSource.SPEAKER_ID_TERMINAL_ERROR.getCode()), Integer.valueOf(this.mErrorCode));
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
    public String getName() {
        return name();
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
    public int getReasonRes() {
        return this.mReasonRes;
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
    public int getReasonTitleRes() {
        return this.mTitleRes;
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
    public boolean isTerminalError() {
        return true;
    }

    TerminalError(int i, @StringRes int i2, @StringRes int i3) {
        this.mErrorCode = i;
        this.mTitleRes = i2;
        this.mReasonRes = i3;
    }
}
