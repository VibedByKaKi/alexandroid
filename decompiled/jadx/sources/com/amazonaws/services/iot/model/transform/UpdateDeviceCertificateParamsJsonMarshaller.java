package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.UpdateDeviceCertificateParams;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UpdateDeviceCertificateParamsJsonMarshaller {
    private static UpdateDeviceCertificateParamsJsonMarshaller instance;

    public static UpdateDeviceCertificateParamsJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UpdateDeviceCertificateParamsJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UpdateDeviceCertificateParams updateDeviceCertificateParams, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (updateDeviceCertificateParams.getAction() != null) {
            String action = updateDeviceCertificateParams.getAction();
            awsJsonWriter.name("action");
            awsJsonWriter.value(action);
        }
        awsJsonWriter.endObject();
    }
}
