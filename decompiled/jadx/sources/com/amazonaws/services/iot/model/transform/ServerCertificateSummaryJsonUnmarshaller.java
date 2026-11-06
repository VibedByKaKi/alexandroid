package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ServerCertificateSummary;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ServerCertificateSummaryJsonUnmarshaller implements Unmarshaller<ServerCertificateSummary, JsonUnmarshallerContext> {
    private static ServerCertificateSummaryJsonUnmarshaller instance;

    public static ServerCertificateSummaryJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new ServerCertificateSummaryJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public ServerCertificateSummary unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ServerCertificateSummary serverCertificateSummary = new ServerCertificateSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("serverCertificateArn")) {
                serverCertificateSummary.setServerCertificateArn(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("serverCertificateStatus")) {
                serverCertificateSummary.setServerCertificateStatus(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("serverCertificateStatusDetail")) {
                serverCertificateSummary.setServerCertificateStatusDetail(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return serverCertificateSummary;
    }
}
