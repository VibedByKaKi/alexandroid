package com.amazonaws.services.s3.model;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class S3ObjectId implements Serializable {
    private final String bucket;
    private final String key;
    private final String versionId;

    public S3ObjectId(S3ObjectIdBuilder s3ObjectIdBuilder) {
        this.bucket = s3ObjectIdBuilder.getBucket();
        this.key = s3ObjectIdBuilder.getKey();
        this.versionId = s3ObjectIdBuilder.getVersionId();
    }

    public String getBucket() {
        return this.bucket;
    }

    public String getKey() {
        return this.key;
    }

    public String getVersionId() {
        return this.versionId;
    }

    public InstructionFileId instructionFileId(String str) {
        String m = a$$ExternalSyntheticOutline0.m(new StringBuilder(), this.key, ".");
        if (str == null || str.trim().length() == 0) {
            str = "instruction";
        }
        return new InstructionFileId(this.bucket, m.concat(str), this.versionId);
    }

    public String toString() {
        return "bucket: " + this.bucket + ", key: " + this.key + ", versionId: " + this.versionId;
    }

    public S3ObjectId(String str, String str2, String str3) {
        if (str != null && str2 != null) {
            this.bucket = str;
            this.key = str2;
            this.versionId = str3;
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("bucket and key must be specified");
        throw null;
    }

    public S3ObjectId(String str, String str2) {
        this(str, str2, null);
    }

    public InstructionFileId instructionFileId() {
        return instructionFileId(null);
    }
}
