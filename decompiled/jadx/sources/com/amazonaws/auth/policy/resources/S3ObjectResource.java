package com.amazonaws.auth.policy.resources;

import com.amazon.coral.annotation.generator.ModelValidation;
import com.amazonaws.auth.policy.Resource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class S3ObjectResource extends Resource {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public S3ObjectResource(java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r0 = ":s3:::"
            java.lang.String r1 = "/"
            java.lang.String r2 = "arn:"
            java.lang.StringBuilder r4 = androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0.m(r2, r4, r0, r5, r1)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazonaws.auth.policy.resources.S3ObjectResource.<init>(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public S3ObjectResource(String str, String str2) {
        this(ModelValidation.AwsCompliance, str, str2);
    }
}
