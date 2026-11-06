package com.amazonaws.services.s3.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class SSEResultBase implements ServerSideEncryptionResult {
    private String sseAlgorithm;
    private String sseCustomerAlgorithm;
    private String sseCustomerKeyMD5;

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String getSSEAlgorithm() {
        return this.sseAlgorithm;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String getSSECustomerAlgorithm() {
        return this.sseCustomerAlgorithm;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final String getSSECustomerKeyMd5() {
        return this.sseCustomerKeyMD5;
    }

    @Deprecated
    public final String getServerSideEncryption() {
        return this.sseAlgorithm;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSEAlgorithm(String str) {
        this.sseAlgorithm = str;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSECustomerAlgorithm(String str) {
        this.sseCustomerAlgorithm = str;
    }

    @Override // com.amazonaws.services.s3.internal.ServerSideEncryptionResult
    public final void setSSECustomerKeyMd5(String str) {
        this.sseCustomerKeyMD5 = str;
    }
}
