package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.DescribeCertificateResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeCertificateResultJsonUnmarshaller implements Unmarshaller<DescribeCertificateResult, JsonUnmarshallerContext> {
    private static DescribeCertificateResultJsonUnmarshaller instance;

    public static DescribeCertificateResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new DescribeCertificateResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public DescribeCertificateResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        DescribeCertificateResult describeCertificateResult = new DescribeCertificateResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            if (reader.nextName().equals("certificateDescription")) {
                describeCertificateResult.setCertificateDescription(CertificateDescriptionJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return describeCertificateResult;
    }
}
