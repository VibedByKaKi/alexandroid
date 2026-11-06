package com.amazon.clouddrive.extended.utils;

import com.amazon.clouddrive.extended.model.JobType;
import defpackage.a$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class JobKeyUtils {
    public static String generateJobKey(String str, JobType jobType) {
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m(str, ":");
        m1m.append(jobType.name());
        return m1m.toString();
    }
}
