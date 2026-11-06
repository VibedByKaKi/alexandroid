package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.model.DeleteObjectsResult;
import com.amazonaws.services.s3.model.MultiObjectDeleteException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteObjectsResponse implements S3RequesterChargedResult {
    private List<DeleteObjectsResult.DeletedObject> deletedObjects;
    private List<MultiObjectDeleteException.DeleteError> errors;
    private boolean isRequesterCharged;

    public DeleteObjectsResponse() {
        this(new ArrayList(), new ArrayList());
    }

    public List<DeleteObjectsResult.DeletedObject> getDeletedObjects() {
        return this.deletedObjects;
    }

    public List<MultiObjectDeleteException.DeleteError> getErrors() {
        return this.errors;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public boolean isRequesterCharged() {
        return this.isRequesterCharged;
    }

    public void setDeletedObjects(List<DeleteObjectsResult.DeletedObject> list) {
        this.deletedObjects = list;
    }

    public void setErrors(List<MultiObjectDeleteException.DeleteError> list) {
        this.errors = list;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public void setRequesterCharged(boolean z) {
        this.isRequesterCharged = z;
    }

    public DeleteObjectsResponse(List<DeleteObjectsResult.DeletedObject> list, List<MultiObjectDeleteException.DeleteError> list2) {
        this.deletedObjects = list;
        this.errors = list2;
    }
}
