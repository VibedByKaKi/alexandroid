package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UploadFileResponse extends Node {
    private String location;

    @Override // com.amazon.clouddrive.model.Node, com.amazon.clouddrive.model.EditableNode, java.lang.Comparable
    public int compareTo(EditableNode editableNode) {
        if (editableNode == null) {
            return -1;
        }
        if (editableNode == this) {
            return 0;
        }
        if (!(editableNode instanceof UploadFileResponse)) {
            return 1;
        }
        String location = getLocation();
        String location2 = ((UploadFileResponse) editableNode).getLocation();
        if (location != location2) {
            if (location == null) {
                return -1;
            }
            if (location2 == null) {
                return 1;
            }
            int compareTo = location.compareTo(location2);
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return super.compareTo(editableNode);
    }

    @Override // com.amazon.clouddrive.model.Node, com.amazon.clouddrive.model.EditableNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UploadFileResponse) && compareTo((EditableNode) obj) == 0;
    }

    public String getLocation() {
        return this.location;
    }

    @Override // com.amazon.clouddrive.model.Node, com.amazon.clouddrive.model.EditableNode
    public int hashCode() {
        return (((getLocation() == null ? 0 : getLocation().hashCode()) + 1) * 31) + super.hashCode();
    }

    public void setLocation(String str) {
        this.location = str;
    }
}
