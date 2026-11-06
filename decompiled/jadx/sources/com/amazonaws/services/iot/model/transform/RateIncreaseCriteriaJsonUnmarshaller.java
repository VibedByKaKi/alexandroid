package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.RateIncreaseCriteria;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RateIncreaseCriteriaJsonUnmarshaller implements Unmarshaller<RateIncreaseCriteria, JsonUnmarshallerContext> {
    private static RateIncreaseCriteriaJsonUnmarshaller instance;

    public static RateIncreaseCriteriaJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RateIncreaseCriteriaJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RateIncreaseCriteria unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RateIncreaseCriteria rateIncreaseCriteria = new RateIncreaseCriteria();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("numberOfNotifiedThings")) {
                rateIncreaseCriteria.setNumberOfNotifiedThings(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("numberOfSucceededThings")) {
                rateIncreaseCriteria.setNumberOfSucceededThings(SimpleTypeJsonUnmarshallers.IntegerJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return rateIncreaseCriteria;
    }
}
