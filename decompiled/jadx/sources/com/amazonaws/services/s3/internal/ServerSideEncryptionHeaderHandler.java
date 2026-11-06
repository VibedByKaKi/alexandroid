package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.ServerSideEncryptionResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ServerSideEncryptionHeaderHandler<T extends ServerSideEncryptionResult> implements HeaderHandler<T> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public void handle(T t, HttpResponse httpResponse) {
        t.setSSEAlgorithm(httpResponse.getHeaders().get(Headers.SERVER_SIDE_ENCRYPTION));
        t.setSSECustomerAlgorithm(httpResponse.getHeaders().get(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_ALGORITHM));
        t.setSSECustomerKeyMd5(httpResponse.getHeaders().get(Headers.SERVER_SIDE_ENCRYPTION_CUSTOMER_KEY_MD5));
    }
}
