package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DescribeCACertificateResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeCACertificateResultJsonUnmarshaller implements Unmarshaller<DescribeCACertificateResult, JsonUnmarshallerContext> {
    private static DescribeCACertificateResultJsonUnmarshaller instance;

    public static DescribeCACertificateResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeCACertificateResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeCACertificateResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeCACertificateResult describeCACertificateResult = new DescribeCACertificateResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("certificateDescription")) {
                describeCACertificateResult.setCertificateDescription(CACertificateDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("registrationConfig")) {
                describeCACertificateResult.setRegistrationConfig(RegistrationConfigJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeCACertificateResult;
    }
}
