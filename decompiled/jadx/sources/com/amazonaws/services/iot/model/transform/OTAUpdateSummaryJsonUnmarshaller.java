package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.OTAUpdateSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class OTAUpdateSummaryJsonUnmarshaller implements Unmarshaller<OTAUpdateSummary, JsonUnmarshallerContext> {
    private static OTAUpdateSummaryJsonUnmarshaller instance;

    public static OTAUpdateSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new OTAUpdateSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public OTAUpdateSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        OTAUpdateSummary oTAUpdateSummary = new OTAUpdateSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("otaUpdateId")) {
                oTAUpdateSummary.setOtaUpdateId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("otaUpdateArn")) {
                oTAUpdateSummary.setOtaUpdateArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("creationDate")) {
                oTAUpdateSummary.setCreationDate(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return oTAUpdateSummary;
    }
}
