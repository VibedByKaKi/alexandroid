package com.amazon.alexa.handsfree.uservoicerecognition.model.errors;

import androidx.annotation.StringRes;
import com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract;
import com.amazon.alexa.handsfree.uservoicerecognition.R;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum StartError implements EnrollmentErrorContract {
    PERMISSION,
    WIRED_HEADSET,
    BLUETOOTH_HEADSET,
    AUDIO_IN_PROGRESS,
    CALL_IN_PROGRESS,
    ALARM_IN_PROGRESS,
    MIC_USE_BY_OTHER_APP,
    CONNECTION(R.string.uvr_enrollment_connection_error),
    UNKNOWN;


    @StringRes
    private final int mReasonRes;

    StartError() {
        this(R.string.uvr_start_default_error);
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
    public String getErrorCode() {
        return "";
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
        return 0;
    }

    @Override // com.amazon.alexa.handsfree.protocols.uservoicerecognition.model.EnrollmentErrorContract
    public boolean isTerminalError() {
        return false;
    }

    StartError(@StringRes int i) {
        this.mReasonRes = i;
    }
}
