package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.clouddrive.extended.model.GetSearchSuggestionsRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetSearchSuggestionsRequestSerializer implements JsonSerializer<GetSearchSuggestionsRequest> {
    public static final JsonSerializer<GetSearchSuggestionsRequest> INSTANCE = new GetSearchSuggestionsRequestSerializer();
    private final SearchSuggestionsRequestFieldSerializer mFieldSerializer = new SearchSuggestionsRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SearchSuggestionsRequestFieldSerializer implements JsonFieldSerializer<GetSearchSuggestionsRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends GetSearchSuggestionsRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            jsonGenerator.writeFieldName("queryString");
            SimpleSerializers.serializeString(u.getQueryString(), jsonGenerator);
            if (u.getLimit() != null) {
                jsonGenerator.writeFieldName("limit");
                SimpleSerializers.serializeLong(u.getLimit(), jsonGenerator);
            }
            if (u.getFilters() != null && u.getFilters().length() > 0) {
                jsonGenerator.writeFieldName("filters");
                SimpleSerializers.serializeString(u.getFilters(), jsonGenerator);
            }
            if (u.getSort() == null || u.getSort().length() <= 0) {
                return;
            }
            jsonGenerator.writeFieldName("sort");
            SimpleSerializers.serializeString(u.getSort(), jsonGenerator);
        }
    }

    private GetSearchSuggestionsRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public final void serialize(GetSearchSuggestionsRequest getSearchSuggestionsRequest, JsonGenerator jsonGenerator) throws IOException {
        if (getSearchSuggestionsRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((SearchSuggestionsRequestFieldSerializer) getSearchSuggestionsRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
