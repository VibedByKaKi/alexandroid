package com.amazon.clouddrive.extended.model.serializer;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazon.clouddrive.extended.model.SearchContactsRequest;
import com.amazon.clouddrive.model.serializer.JsonFieldSerializer;
import com.amazon.clouddrive.model.serializer.JsonSerializer;
import com.amazon.clouddrive.model.serializer.SimpleListSerializers;
import com.amazon.clouddrive.model.serializer.SimpleSerializers;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SearchContactsRequestSerializer implements JsonSerializer<SearchContactsRequest> {
    public static final JsonSerializer<SearchContactsRequest> INSTANCE = new SearchContactsRequestSerializer();
    private final SearchContactsRequestFieldSerializer mFieldSerializer = new SearchContactsRequestFieldSerializer();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class SearchContactsRequestFieldSerializer implements JsonFieldSerializer<SearchContactsRequest> {
        @Override // com.amazon.clouddrive.model.serializer.JsonFieldSerializer
        public <U extends SearchContactsRequest> void serializeFields(U u, JsonGenerator jsonGenerator) throws IOException {
            if (u != null) {
                if (u.getTerm() != null) {
                    jsonGenerator.writeFieldName("term");
                    SimpleSerializers.serializeString(u.getTerm(), jsonGenerator);
                }
                if (u.getNextToken() != null) {
                    jsonGenerator.writeFieldName(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN);
                    SimpleSerializers.serializeString(u.getNextToken(), jsonGenerator);
                }
                if (u.getMaxResults() != null) {
                    jsonGenerator.writeFieldName("maxResults");
                    SimpleSerializers.serializeInteger(u.getMaxResults(), jsonGenerator);
                }
                if (u.getKindFilter() != null) {
                    jsonGenerator.writeFieldName("kindFilter");
                    SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getKindFilter(), jsonGenerator);
                }
                if (u.getGroupFilter() != null) {
                    jsonGenerator.writeFieldName("groupFilter");
                    SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getGroupFilter(), jsonGenerator);
                }
                if (u.getMemberFilter() != null) {
                    jsonGenerator.writeFieldName("memberFilter");
                    SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getMemberFilter(), jsonGenerator);
                }
                if (u.getInviteFilter() != null) {
                    jsonGenerator.writeFieldName("inviteFilter");
                    SimpleListSerializers.STRING_LIST_SERIALIZER.serialize(u.getInviteFilter(), jsonGenerator);
                }
            }
        }
    }

    private SearchContactsRequestSerializer() {
    }

    @Override // com.amazon.clouddrive.model.serializer.JsonSerializer
    public void serialize(SearchContactsRequest searchContactsRequest, JsonGenerator jsonGenerator) throws IOException {
        if (searchContactsRequest == null) {
            jsonGenerator.writeNull();
            return;
        }
        jsonGenerator.writeStartObject();
        this.mFieldSerializer.serializeFields((SearchContactsRequestFieldSerializer) searchContactsRequest, jsonGenerator);
        jsonGenerator.writeEndObject();
    }
}
