package com.google.android.datatransport.cct;

import com.google.android.datatransport.cct.CctTransportBackend;
import com.google.android.datatransport.runtime.retries.RetryStrategy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class CctTransportBackend$$ExternalSyntheticLambda1 implements RetryStrategy {
    @Override // com.google.android.datatransport.runtime.retries.RetryStrategy
    public final Object shouldRetry(Object obj, Object obj2) {
        CctTransportBackend.HttpRequest lambda$send$0;
        lambda$send$0 = CctTransportBackend.lambda$send$0((CctTransportBackend.HttpRequest) obj, (CctTransportBackend.HttpResponse) obj2);
        return lambda$send$0;
    }
}
