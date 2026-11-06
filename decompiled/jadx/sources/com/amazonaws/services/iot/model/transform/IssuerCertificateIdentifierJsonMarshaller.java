package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.IssuerCertificateIdentifier;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class IssuerCertificateIdentifierJsonMarshaller {
    private static IssuerCertificateIdentifierJsonMarshaller instance;

    public static IssuerCertificateIdentifierJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new IssuerCertificateIdentifierJsonMarshaller();
        }
        return instance;
    }

    public void marshall(IssuerCertificateIdentifier issuerCertificateIdentifier, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (issuerCertificateIdentifier.getIssuerCertificateSubject() != null) {
            String issuerCertificateSubject = issuerCertificateIdentifier.getIssuerCertificateSubject();
            awsJsonWriter.name("issuerCertificateSubject");
            awsJsonWriter.value(issuerCertificateSubject);
        }
        if (issuerCertificateIdentifier.getIssuerId() != null) {
            String issuerId = issuerCertificateIdentifier.getIssuerId();
            awsJsonWriter.name("issuerId");
            awsJsonWriter.value(issuerId);
        }
        if (issuerCertificateIdentifier.getIssuerCertificateSerialNumber() != null) {
            String issuerCertificateSerialNumber = issuerCertificateIdentifier.getIssuerCertificateSerialNumber();
            awsJsonWriter.name("issuerCertificateSerialNumber");
            awsJsonWriter.value(issuerCertificateSerialNumber);
        }
        awsJsonWriter.endObject();
    }
}
