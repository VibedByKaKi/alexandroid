package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import com.amazon.clouddrive.model.ObjectComparator;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkAddRemoveChildResponse implements BulkResponse {
    private Map<String, Integer> errorMap;
    private String message;

    @Override // java.lang.Comparable
    public int compareTo(CloudDriveResponse cloudDriveResponse) {
        if (cloudDriveResponse == null) {
            return -1;
        }
        if (cloudDriveResponse == this) {
            return 0;
        }
        if (!(cloudDriveResponse instanceof BulkAddRemoveChildResponse)) {
            return 1;
        }
        BulkAddRemoveChildResponse bulkAddRemoveChildResponse = (BulkAddRemoveChildResponse) cloudDriveResponse;
        int compare = ObjectComparator.compare(getMessage(), bulkAddRemoveChildResponse.getMessage());
        if (compare != 0) {
            return compare;
        }
        int compare2 = ObjectComparator.compare(getErrorMap(), bulkAddRemoveChildResponse.getErrorMap());
        if (compare2 != 0) {
            return compare2;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof BulkAddRemoveChildResponse) && compareTo((CloudDriveResponse) obj) == 0;
    }

    @Override // com.amazon.clouddrive.extended.model.BulkResponse
    public Map<String, Integer> getErrorMap() {
        return this.errorMap;
    }

    @Override // com.amazon.clouddrive.extended.model.BulkResponse
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (getMessage() == null ? 0 : getMessage().hashCode()) + 1 + (getErrorMap() != null ? getErrorMap().hashCode() : 0);
    }

    @Override // com.amazon.clouddrive.extended.model.BulkResponse
    public void setErrorMap(Map<String, Integer> map) {
        this.errorMap = map;
    }

    @Override // com.amazon.clouddrive.extended.model.BulkResponse
    public void setMessage(String str) {
        this.message = str;
    }
}
