package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonServiceException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ResourceAlreadyExistsException extends AmazonServiceException {
    private static final long serialVersionUID = 1;
    private String resourceArn;
    private String resourceId;

    public ResourceAlreadyExistsException(String str) {
        super(str);
    }

    public String getResourceArn() {
        return this.resourceArn;
    }

    public String getResourceId() {
        return this.resourceId;
    }

    public void setResourceArn(String str) {
        this.resourceArn = str;
    }

    public void setResourceId(String str) {
        this.resourceId = str;
    }
}
