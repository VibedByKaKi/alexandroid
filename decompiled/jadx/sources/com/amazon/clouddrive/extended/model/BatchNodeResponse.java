package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.model.CloudDriveResponse;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface BatchNodeResponse extends CloudDriveResponse {
    List<BatchNodeError> getErrors();

    List<GroupCollection> getGroupCollections();

    List<NodeExtended> getNodes();

    void setErrors(List<BatchNodeError> list);

    void setGroupCollections(List<GroupCollection> list);

    void setNodes(List<NodeExtended> list);
}
