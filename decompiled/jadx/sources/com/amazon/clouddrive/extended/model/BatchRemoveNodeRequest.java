package com.amazon.clouddrive.extended.model;

import com.amazon.clouddrive.extended.model.BaseBatchNodeRequest;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BatchRemoveNodeRequest extends BaseBatchNodeRequest {
    public BatchRemoveNodeRequest(List<String> list, List<String> list2, String str) {
        super(list, list2, BaseBatchNodeRequest.OperationType.REMOVE, str);
    }
}
