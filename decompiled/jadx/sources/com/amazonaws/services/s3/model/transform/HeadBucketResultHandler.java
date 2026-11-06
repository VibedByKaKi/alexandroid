package com.amazonaws.services.s3.model.transform;

import com.amazonaws.AmazonWebServiceResponse;
import com.amazonaws.http.HttpResponse;
import com.amazonaws.services.s3.Headers;
import com.amazonaws.services.s3.internal.AbstractS3ResponseHandler;
import com.amazonaws.services.s3.model.HeadBucketResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class HeadBucketResultHandler extends AbstractS3ResponseHandler<HeadBucketResult> {
    @Override // com.amazonaws.http.HttpResponseHandler
    public AmazonWebServiceResponse<HeadBucketResult> handle(HttpResponse httpResponse) throws Exception {
        AmazonWebServiceResponse<HeadBucketResult> amazonWebServiceResponse = new AmazonWebServiceResponse<>();
        HeadBucketResult headBucketResult = new HeadBucketResult();
        headBucketResult.setBucketRegion(httpResponse.getHeaders().get(Headers.S3_BUCKET_REGION));
        amazonWebServiceResponse.setResult(headBucketResult);
        return amazonWebServiceResponse;
    }
}
