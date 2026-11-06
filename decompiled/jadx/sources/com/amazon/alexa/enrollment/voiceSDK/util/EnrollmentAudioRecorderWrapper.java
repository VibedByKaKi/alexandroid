package com.amazon.alexa.enrollment.voiceSDK.util;

import com.amazon.alexa.enrollment.voiceSDK.audio.EnrollmentAudioRecordingRunnable;
import com.amazon.alexa.enrollment.voiceSDK.audio.EnrollmentAudioSinkWrapper;
import com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents.EnrollmentEventBus;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentAudioRecorderWrapper {
    public EnrollmentAudioRecordingRunnable getRecordingRunnable(EnrollmentAudioSinkWrapper enrollmentAudioSinkWrapper, EnrollmentEventBus enrollmentEventBus) {
        return new EnrollmentAudioRecordingRunnable(enrollmentAudioSinkWrapper, enrollmentEventBus);
    }
}
