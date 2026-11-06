package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListNextBatchOfObjectsRequest extends AmazonWebServiceRequest implements Serializable {
    private ObjectListing previousObjectListing;

    public ListNextBatchOfObjectsRequest(ObjectListing objectListing) {
        setPreviousObjectListing(objectListing);
    }

    public ObjectListing getPreviousObjectListing() {
        return this.previousObjectListing;
    }

    public void setPreviousObjectListing(ObjectListing objectListing) {
        if (objectListing != null) {
            this.previousObjectListing = objectListing;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The parameter previousObjectListing must be specified.");
        }
    }

    public ListObjectsRequest toListObjectsRequest() {
        return new ListObjectsRequest(this.previousObjectListing.getBucketName(), this.previousObjectListing.getPrefix(), this.previousObjectListing.getNextMarker(), this.previousObjectListing.getDelimiter(), Integer.valueOf(this.previousObjectListing.getMaxKeys())).withEncodingType(this.previousObjectListing.getEncodingType());
    }

    public ListNextBatchOfObjectsRequest withPreviousObjectListing(ObjectListing objectListing) {
        setPreviousObjectListing(objectListing);
        return this;
    }
}
