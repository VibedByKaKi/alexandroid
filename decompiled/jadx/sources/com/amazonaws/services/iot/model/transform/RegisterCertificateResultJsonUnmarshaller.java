package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.RegisterCertificateResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RegisterCertificateResultJsonUnmarshaller implements Unmarshaller<RegisterCertificateResult, JsonUnmarshallerContext> {
    private static RegisterCertificateResultJsonUnmarshaller instance;

    public static RegisterCertificateResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new RegisterCertificateResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public RegisterCertificateResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        RegisterCertificateResult registerCertificateResult = new RegisterCertificateResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("certificateArn")) {
                registerCertificateResult.setCertificateArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("certificateId")) {
                registerCertificateResult.setCertificateId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return registerCertificateResult;
    }
}
