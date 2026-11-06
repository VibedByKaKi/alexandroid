package com.amazonaws.mobileconnectors.s3.transferutility;

import androidx.core.util.ObjectsCompat;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.ObjectMetadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class UploadOptions {
    private final String bucket;
    private final CannedAccessControlList cannedAcl;
    private final TransferListener listener;
    private final ObjectMetadata metadata;

    public UploadOptions(Builder builder) {
        this.bucket = builder.bucket;
        this.metadata = builder.metadata;
        this.cannedAcl = builder.cannedAcl;
        this.listener = builder.listener;
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && UploadOptions.class == obj.getClass()) {
            UploadOptions uploadOptions = (UploadOptions) obj;
            if (ObjectsCompat.equals(this.bucket, uploadOptions.bucket) && ObjectsCompat.equals(this.metadata, uploadOptions.metadata) && this.cannedAcl == uploadOptions.cannedAcl && ObjectsCompat.equals(this.listener, uploadOptions.listener)) {
                return true;
            }
        }
        return false;
    }

    public String getBucket() {
        return this.bucket;
    }

    public CannedAccessControlList getCannedAcl() {
        return this.cannedAcl;
    }

    public ObjectMetadata getMetadata() {
        return this.metadata;
    }

    public TransferListener getTransferListener() {
        return this.listener;
    }

    public int hashCode() {
        return ObjectsCompat.hash(this.bucket, this.metadata, this.cannedAcl, this.listener);
    }

    public String toString() {
        return "UploadOptions{bucket='" + this.bucket + "', metadata=" + this.metadata + ", cannedAcl=" + this.cannedAcl + ", listener=" + this.listener + AbstractJsonLexerKt.END_OBJ;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private String bucket;
        private CannedAccessControlList cannedAcl;
        private TransferListener listener;
        private ObjectMetadata metadata;

        public Builder bucket(String str) {
            this.bucket = str;
            return this;
        }

        public UploadOptions build() {
            return new UploadOptions(this);
        }

        public Builder cannedAcl(CannedAccessControlList cannedAccessControlList) {
            this.cannedAcl = cannedAccessControlList;
            return this;
        }

        public Builder objectMetadata(ObjectMetadata objectMetadata) {
            this.metadata = objectMetadata;
            return this;
        }

        public Builder transferListener(TransferListener transferListener) {
            this.listener = transferListener;
            return this;
        }

        private Builder() {
        }
    }
}
