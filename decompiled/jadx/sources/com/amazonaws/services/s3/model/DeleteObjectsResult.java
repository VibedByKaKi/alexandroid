package com.amazonaws.services.s3.model;

import com.amazonaws.services.s3.internal.S3RequesterChargedResult;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DeleteObjectsResult implements Serializable, S3RequesterChargedResult {
    private final List<DeletedObject> deletedObjects;
    private boolean isRequesterCharged;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DeletedObject implements Serializable {
        private boolean deleteMarker;
        private String deleteMarkerVersionId;
        private String key;
        private String versionId;

        public String getDeleteMarkerVersionId() {
            return this.deleteMarkerVersionId;
        }

        public String getKey() {
            return this.key;
        }

        public String getVersionId() {
            return this.versionId;
        }

        public boolean isDeleteMarker() {
            return this.deleteMarker;
        }

        public void setDeleteMarker(boolean z) {
            this.deleteMarker = z;
        }

        public void setDeleteMarkerVersionId(String str) {
            this.deleteMarkerVersionId = str;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setVersionId(String str) {
            this.versionId = str;
        }
    }

    public DeleteObjectsResult(List<DeletedObject> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        this.deletedObjects = arrayList;
        arrayList.addAll(list);
        setRequesterCharged(z);
    }

    public List<DeletedObject> getDeletedObjects() {
        return this.deletedObjects;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public boolean isRequesterCharged() {
        return this.isRequesterCharged;
    }

    @Override // com.amazonaws.services.s3.internal.S3RequesterChargedResult
    public void setRequesterCharged(boolean z) {
        this.isRequesterCharged = z;
    }

    public DeleteObjectsResult(List<DeletedObject> list) {
        this(list, false);
    }
}
