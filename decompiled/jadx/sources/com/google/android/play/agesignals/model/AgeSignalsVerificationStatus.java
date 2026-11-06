package com.google.android.play.agesignals.model;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes7.dex */
public @interface AgeSignalsVerificationStatus {
    public static final int DECLARED = 5;
    public static final int SUPERVISED = 1;
    public static final int SUPERVISED_APPROVAL_DENIED = 3;
    public static final int SUPERVISED_APPROVAL_PENDING = 2;
    public static final int UNKNOWN = 4;
    public static final int VERIFIED = 0;
}
