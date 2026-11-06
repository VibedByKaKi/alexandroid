package com.amazon.alexa.enrollment.model;

import android.content.Context;
import com.amazon.alexa.enrollment.api.model.KidsEnrollmentMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface EnrollmentGateway {
    void startKidsVoiceEnrollmentTraining(Context context, KidsEnrollmentMetadata kidsEnrollmentMetadata, String str);

    void startVoiceEnrollmentTraining(Context context);

    void startVoiceEnrollmentTraining(Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, Integer num2);
}
