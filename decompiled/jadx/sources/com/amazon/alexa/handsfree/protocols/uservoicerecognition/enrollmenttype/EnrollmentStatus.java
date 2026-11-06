package com.amazon.alexa.handsfree.protocols.uservoicerecognition.enrollmenttype;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public enum EnrollmentStatus {
    SETUP_IN_3PSV(1),
    SETUP_IN_1PSV(0),
    SETUP_NOT_SET(-1);

    private final int mValue;

    EnrollmentStatus(int i) {
        this.mValue = i;
    }

    public static EnrollmentStatus fromValue(int i) {
        for (EnrollmentStatus enrollmentStatus : values()) {
            if (enrollmentStatus.getValue() == i) {
                return enrollmentStatus;
            }
        }
        return SETUP_NOT_SET;
    }

    public int getValue() {
        return this.mValue;
    }
}
