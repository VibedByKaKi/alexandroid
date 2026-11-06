package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.TlsContext;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TlsContextJsonMarshaller {
    private static TlsContextJsonMarshaller instance;

    public static TlsContextJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TlsContextJsonMarshaller();
        }
        return instance;
    }

    public void marshall(TlsContext tlsContext, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (tlsContext.getServerName() != null) {
            String serverName = tlsContext.getServerName();
            awsJsonWriter.name("serverName");
            awsJsonWriter.value(serverName);
        }
        awsJsonWriter.endObject();
    }
}
