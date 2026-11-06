package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MoveNodeToTrashRequest implements CloudDriveRequest {
    private String dedupeContext;
    private String id;

    public MoveNodeToTrashRequest(String str) {
        this.id = str;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(CloudDriveRequest cloudDriveRequest) {
        if (cloudDriveRequest == null) {
            return -1;
        }
        if (cloudDriveRequest == this) {
            return 0;
        }
        if (!(cloudDriveRequest instanceof MoveNodeToTrashRequest)) {
            return 1;
        }
        MoveNodeToTrashRequest moveNodeToTrashRequest = (MoveNodeToTrashRequest) cloudDriveRequest;
        String id = getId();
        String id2 = moveNodeToTrashRequest.getId();
        if (id != id2) {
            if (id == null) {
                return -1;
            }
            if (id2 == null) {
                return 1;
            }
            int compareTo = id.compareTo(id2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        String dedupeContext = getDedupeContext();
        String dedupeContext2 = moveNodeToTrashRequest.getDedupeContext();
        if (dedupeContext != dedupeContext2) {
            if (dedupeContext == null) {
                return -1;
            }
            if (dedupeContext2 == null) {
                return 1;
            }
            int compareTo2 = dedupeContext.compareTo(dedupeContext2);
            if (compareTo2 != 0) {
                return compareTo2;
            }
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof MoveNodeToTrashRequest) && compareTo((CloudDriveRequest) obj) == 0;
    }

    public String getDedupeContext() {
        return this.dedupeContext;
    }

    public String getId() {
        return this.id;
    }

    public int hashCode() {
        return (((getId() == null ? 0 : getId().hashCode()) + 1 + (getDedupeContext() != null ? getDedupeContext().hashCode() : 0)) * 31) + super.hashCode();
    }

    public void setDedupeContext(String str) {
        this.dedupeContext = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public MoveNodeToTrashRequest withDedupeContext(String str) {
        setDedupeContext(str);
        return this;
    }
}
