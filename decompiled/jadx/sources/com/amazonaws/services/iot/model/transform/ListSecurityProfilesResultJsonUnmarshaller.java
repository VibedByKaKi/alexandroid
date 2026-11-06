package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaConversationsPaginationContextBundleKeys;
import com.amazonaws.services.iot.model.ListSecurityProfilesResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.ListUnmarshaller;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ListSecurityProfilesResultJsonUnmarshaller implements Unmarshaller<ListSecurityProfilesResult, JsonUnmarshallerContext> {
    private static ListSecurityProfilesResultJsonUnmarshaller instance;

    public static ListSecurityProfilesResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ListSecurityProfilesResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ListSecurityProfilesResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        ListSecurityProfilesResult listSecurityProfilesResult = new ListSecurityProfilesResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("securityProfileIdentifiers")) {
                listSecurityProfilesResult.setSecurityProfileIdentifiers(new ListUnmarshaller(SecurityProfileIdentifierJsonUnmarshaller.getInstance()).unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(AlexaConversationsPaginationContextBundleKeys.NEXT_TOKEN)) {
                listSecurityProfilesResult.setNextToken(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return listSecurityProfilesResult;
    }
}
