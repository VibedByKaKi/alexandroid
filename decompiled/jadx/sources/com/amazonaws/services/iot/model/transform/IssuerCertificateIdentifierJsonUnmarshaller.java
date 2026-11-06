package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.IssuerCertificateIdentifier;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IssuerCertificateIdentifierJsonUnmarshaller implements Unmarshaller<IssuerCertificateIdentifier, JsonUnmarshallerContext> {
    private static IssuerCertificateIdentifierJsonUnmarshaller instance;

    public static IssuerCertificateIdentifierJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new IssuerCertificateIdentifierJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public IssuerCertificateIdentifier unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        IssuerCertificateIdentifier issuerCertificateIdentifier = new IssuerCertificateIdentifier();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("issuerCertificateSubject")) {
                issuerCertificateIdentifier.setIssuerCertificateSubject(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("issuerId")) {
                issuerCertificateIdentifier.setIssuerId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("issuerCertificateSerialNumber")) {
                issuerCertificateIdentifier.setIssuerCertificateSerialNumber(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return issuerCertificateIdentifier;
    }
}
