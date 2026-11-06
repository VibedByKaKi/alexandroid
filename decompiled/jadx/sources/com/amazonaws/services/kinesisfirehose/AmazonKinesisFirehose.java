package com.amazonaws.services.kinesisfirehose;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.ResponseMetadata;
import com.amazonaws.regions.Region;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchRequest;
import com.amazonaws.services.kinesisfirehose.model.PutRecordBatchResult;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface AmazonKinesisFirehose {
    ResponseMetadata getCachedResponseMetadata(AmazonWebServiceRequest amazonWebServiceRequest);

    PutRecordBatchResult putRecordBatch(PutRecordBatchRequest putRecordBatchRequest) throws AmazonClientException, AmazonServiceException;

    void setEndpoint(String str) throws IllegalArgumentException;

    void setRegion(Region region) throws IllegalArgumentException;

    void shutdown();
}
