package com.amazon.alexa.handsfree.protocols.uservoicerecognition.model;

import androidx.annotation.StringRes;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface EnrollmentErrorContract {
    public static final int NO_RES_ID = 0;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorSource {
        _1PSV(1),
        SPEAKER_ID_AIS(2),
        SPEAKER_ID_OTHER(3),
        SPEAKER_ID_NETWORK_UNAVAILABLE(4),
        SPEAKER_ID_TERMINAL_ERROR(5);

        private final int mCode;

        ErrorSource(int i) {
            this.mCode = i;
        }

        public int getCode() {
            return this.mCode;
        }
    }

    String getErrorCode();

    String getName();

    @StringRes
    int getReasonRes();

    @StringRes
    int getReasonTitleRes();

    boolean isTerminalError();
}
