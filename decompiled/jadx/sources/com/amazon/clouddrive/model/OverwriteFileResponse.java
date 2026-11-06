package com.amazon.clouddrive.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class OverwriteFileResponse extends Node {
    @Override // com.amazon.clouddrive.model.Node, com.amazon.clouddrive.model.EditableNode, java.lang.Comparable
    public int compareTo(EditableNode editableNode) {
        if (editableNode == null) {
            return -1;
        }
        if (editableNode == this) {
            return 0;
        }
        if (editableNode instanceof OverwriteFileResponse) {
            return super.compareTo(editableNode);
        }
        return 1;
    }

    @Override // com.amazon.clouddrive.model.Node, com.amazon.clouddrive.model.EditableNode
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof OverwriteFileResponse) && compareTo((EditableNode) obj) == 0;
    }

    @Override // com.amazon.clouddrive.model.Node, com.amazon.clouddrive.model.EditableNode
    public int hashCode() {
        return super.hashCode();
    }
}
