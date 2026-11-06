package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.BulkResponse;
import com.amazon.clouddrive.extended.model.BulkTrashRestoreNodesResponse;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkTrashRestoreNodesResponseDeserializer extends AbstractDeserializer<BulkResponse, BulkTrashRestoreNodesResponse> {
    public static final JsonDeserializer<BulkTrashRestoreNodesResponse> INSTANCE = new BulkTrashRestoreNodesResponseDeserializer();

    private BulkTrashRestoreNodesResponseDeserializer() {
        super(new BulkResponseFieldDeserializer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.extended.model.deserializer.AbstractDeserializer
    public BulkTrashRestoreNodesResponse createValue() {
        return new BulkTrashRestoreNodesResponse();
    }
}
