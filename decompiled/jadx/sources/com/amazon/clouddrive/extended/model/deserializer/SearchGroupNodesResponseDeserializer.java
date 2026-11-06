package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.SearchGroupNodesResponse;
import com.amazon.clouddrive.extended.model.deserializer.SearchKeyResponseDeserializer;
import com.amazon.clouddrive.model.PaginatedCloudDriveResponse;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchGroupNodesResponseDeserializer extends AbstractDeserializer<PaginatedCloudDriveResponse, SearchGroupNodesResponse> {
    public static final JsonDeserializer<SearchGroupNodesResponse> INSTANCE = new SearchGroupNodesResponseDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SearchGroupNodesResponseFieldDeserializer extends SearchKeyResponseDeserializer.SearchKeyResponseFieldDeserializer {
    }

    private SearchGroupNodesResponseDeserializer() {
        super(new SearchGroupNodesResponseFieldDeserializer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.extended.model.deserializer.AbstractDeserializer
    public SearchGroupNodesResponse createValue() {
        return new SearchGroupNodesResponse();
    }
}
