package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.Denied;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class DeniedJsonUnmarshaller implements Unmarshaller<Denied, JsonUnmarshallerContext> {
    private static DeniedJsonUnmarshaller instance;

    public static DeniedJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DeniedJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public Denied unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Denied denied = new Denied();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("implicitDeny")) {
                denied.setImplicitDeny(ImplicitDenyJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("explicitDeny")) {
                denied.setExplicitDeny(ExplicitDenyJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return denied;
    }
}
