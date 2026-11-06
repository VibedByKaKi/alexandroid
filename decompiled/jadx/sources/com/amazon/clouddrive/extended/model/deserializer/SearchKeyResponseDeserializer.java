package com.amazon.clouddrive.extended.model.deserializer;

import com.amazon.clouddrive.extended.model.SearchKeyResponse;
import com.amazon.clouddrive.model.PaginatedCloudDriveResponse;
import com.amazon.clouddrive.model.deserializer.JsonDeserializer;
import com.amazon.clouddrive.model.deserializer.PaginatedCloudDriveResponseFieldDeserializer;
import java.io.IOException;
import org.codehaus.jackson.JsonParser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchKeyResponseDeserializer extends AbstractDeserializer<PaginatedCloudDriveResponse, SearchKeyResponse> {
    public static final JsonDeserializer<SearchKeyResponse> INSTANCE = new SearchKeyResponseDeserializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SearchKeyResponseFieldDeserializer extends PaginatedCloudDriveResponseFieldDeserializer {
        @Override // com.amazon.clouddrive.model.deserializer.PaginatedCloudDriveResponseFieldDeserializer, com.amazon.clouddrive.model.deserializer.JsonFieldDeserializer
        public <U extends PaginatedCloudDriveResponse> boolean handleField(JsonParser jsonParser, String str, U u) throws IOException {
            if (super.handleField(jsonParser, str, (String) u)) {
                return true;
            }
            if (!(u instanceof SearchKeyResponse)) {
                return false;
            }
            if ("data".equals(str)) {
                ((SearchKeyResponse) u).setData(ExtendedDeserializers.LIST_NODE_EXTENDED_DESERIALIZER.deserialize(jsonParser));
                return true;
            }
            if (!"aggregations".equals(str)) {
                return false;
            }
            ((SearchKeyResponse) u).setAggregations(SearchKeyResponseAggregationsDeserializer.INSTANCE.deserialize(jsonParser));
            return true;
        }
    }

    private SearchKeyResponseDeserializer() {
        super(new SearchKeyResponseFieldDeserializer());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.clouddrive.extended.model.deserializer.AbstractDeserializer
    public SearchKeyResponse createValue() {
        return new SearchKeyResponse();
    }
}
