package com.amazon.clouddrive.model;

import com.amazon.clouddrive.model.INode;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public interface NodeListingResponse<T extends INode> extends CloudDriveResponse {
    long getCount();

    List<T> getData();

    String getNextToken();

    void setCount(long j);

    void setData(List<T> list);

    void setNextToken(String str);
}
