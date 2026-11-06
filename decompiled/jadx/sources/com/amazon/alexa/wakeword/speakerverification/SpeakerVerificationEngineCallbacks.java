package com.amazon.alexa.wakeword.speakerverification;

import androidx.annotation.NonNull;
import com.amazon.alexa.wakeword.speakerverification.enrollment.EnrollmentUtterance;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface SpeakerVerificationEngineCallbacks {
    void onExampleAccepted(@NonNull EnrollmentUtterance enrollmentUtterance);

    void onExampleRejected();

    void onProfileGenerated(@NonNull byte[] bArr);
}
