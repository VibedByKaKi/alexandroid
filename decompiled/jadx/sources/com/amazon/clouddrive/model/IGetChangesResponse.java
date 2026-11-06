package com.amazon.clouddrive.model;

import com.amazon.clouddrive.model.INode;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface IGetChangesResponse<T extends INode> extends CloudDriveResponse {
    String getCheckpoint();

    List<T> getNodes();

    boolean isReset();

    void setCheckpoint(String str);

    void setNodes(List<T> list);

    void setReset(boolean z);
}
