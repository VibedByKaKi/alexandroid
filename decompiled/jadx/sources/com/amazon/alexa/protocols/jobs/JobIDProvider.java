package com.amazon.alexa.protocols.jobs;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@FunctionalInterface
/* loaded from: classes18.dex */
public interface JobIDProvider {
    public static final int NO_JOB_ID_FOUND = -1;

    int getJobId(@NonNull Class cls);
}
