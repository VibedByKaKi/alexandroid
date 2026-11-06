package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.ResourceServerScopeType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ResourceServerScopeTypeJsonMarshaller {
    private static ResourceServerScopeTypeJsonMarshaller instance;

    public static ResourceServerScopeTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ResourceServerScopeTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ResourceServerScopeType resourceServerScopeType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (resourceServerScopeType.getScopeName() != null) {
            String scopeName = resourceServerScopeType.getScopeName();
            awsJsonWriter.name("ScopeName");
            awsJsonWriter.value(scopeName);
        }
        if (resourceServerScopeType.getScopeDescription() != null) {
            String scopeDescription = resourceServerScopeType.getScopeDescription();
            awsJsonWriter.name("ScopeDescription");
            awsJsonWriter.value(scopeDescription);
        }
        awsJsonWriter.endObject();
    }
}
