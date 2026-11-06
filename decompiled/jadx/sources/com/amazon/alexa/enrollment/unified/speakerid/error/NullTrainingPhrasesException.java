package com.amazon.alexa.enrollment.unified.speakerid.error;

import androidx.annotation.NonNull;
import com.amazon.alexa.enrollment.unified.speakerid.api.model.EnrollmentStates;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NullTrainingPhrasesException extends Exception {
    private static final String MESSAGE_TEMPLATE = "Null training phrases obtained with enrollment state: %s";

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullTrainingPhrasesException(@NonNull EnrollmentStates enrollmentStates) {
        super(a$$ExternalSyntheticOutline0.m("Null training phrases obtained with enrollment state: ", enrollmentStates.name()));
        Locale locale = Locale.US;
    }
}
