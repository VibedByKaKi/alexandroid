package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.CertificateValidity;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class CertificateValidityJsonMarshaller {
    private static CertificateValidityJsonMarshaller instance;

    public static CertificateValidityJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new CertificateValidityJsonMarshaller();
        }
        return instance;
    }

    public void marshall(CertificateValidity certificateValidity, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (certificateValidity.getNotBefore() != null) {
            Date notBefore = certificateValidity.getNotBefore();
            awsJsonWriter.name("notBefore");
            awsJsonWriter.value(notBefore);
        }
        if (certificateValidity.getNotAfter() != null) {
            Date notAfter = certificateValidity.getNotAfter();
            awsJsonWriter.name("notAfter");
            awsJsonWriter.value(notAfter);
        }
        awsJsonWriter.endObject();
    }
}
