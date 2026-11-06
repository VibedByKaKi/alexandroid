package com.amazonaws.services.s3.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListNextBatchOfVersionsRequest extends AmazonWebServiceRequest implements Serializable {
    private VersionListing previousVersionListing;

    public ListNextBatchOfVersionsRequest(VersionListing versionListing) {
        setPreviousVersionListing(versionListing);
    }

    public VersionListing getPreviousVersionListing() {
        return this.previousVersionListing;
    }

    public void setPreviousVersionListing(VersionListing versionListing) {
        if (versionListing != null) {
            this.previousVersionListing = versionListing;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("The parameter previousVersionListing must be specified.");
        }
    }

    public ListVersionsRequest toListVersionsRequest() {
        return new ListVersionsRequest(this.previousVersionListing.getBucketName(), this.previousVersionListing.getPrefix(), this.previousVersionListing.getNextKeyMarker(), this.previousVersionListing.getNextVersionIdMarker(), this.previousVersionListing.getDelimiter(), Integer.valueOf(this.previousVersionListing.getMaxKeys())).withEncodingType(this.previousVersionListing.getEncodingType());
    }

    public ListNextBatchOfVersionsRequest withPreviousVersionListing(VersionListing versionListing) {
        setPreviousVersionListing(versionListing);
        return this;
    }
}
