package com.amazonaws.services.s3.internal;

import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.model.GetObjectTaggingResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class GetObjectTaggingResponseHeaderHandler implements HeaderHandler<GetObjectTaggingResult> {
    @Override // com.amazonaws.services.s3.internal.HeaderHandler
    public void handle(GetObjectTaggingResult getObjectTaggingResult, HttpResponse httpResponse) {
        getObjectTaggingResult.setVersionId(httpResponse.getHeaders().get(Headers.S3_VERSION_ID));
    }
}
