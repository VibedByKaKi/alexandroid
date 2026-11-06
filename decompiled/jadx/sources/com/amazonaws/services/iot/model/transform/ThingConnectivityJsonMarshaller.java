package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.ThingConnectivity;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ThingConnectivityJsonMarshaller {
    private static ThingConnectivityJsonMarshaller instance;

    public static ThingConnectivityJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ThingConnectivityJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ThingConnectivity thingConnectivity, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (thingConnectivity.getConnected() != null) {
            Boolean connected = thingConnectivity.getConnected();
            awsJsonWriter.name("connected");
            awsJsonWriter.value(connected.booleanValue());
        }
        if (thingConnectivity.getTimestamp() != null) {
            Long timestamp = thingConnectivity.getTimestamp();
            awsJsonWriter.name("timestamp");
            awsJsonWriter.value(timestamp);
        }
        if (thingConnectivity.getDisconnectReason() != null) {
            String disconnectReason = thingConnectivity.getDisconnectReason();
            awsJsonWriter.name("disconnectReason");
            awsJsonWriter.value(disconnectReason);
        }
        awsJsonWriter.endObject();
    }
}
