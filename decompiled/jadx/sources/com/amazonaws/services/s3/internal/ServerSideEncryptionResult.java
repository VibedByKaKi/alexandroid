package com.amazonaws.services.s3.internal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface ServerSideEncryptionResult {
    String getSSEAlgorithm();

    String getSSECustomerAlgorithm();

    String getSSECustomerKeyMd5();

    void setSSEAlgorithm(String str);

    void setSSECustomerAlgorithm(String str);

    void setSSECustomerKeyMd5(String str);
}
