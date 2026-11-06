package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.cognito.clientcontext.datacollection.DataRecordKey;
import com.amazonaws.services.cognitoidentityprovider.model.EventContextDataType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class EventContextDataTypeJsonMarshaller {
    private static EventContextDataTypeJsonMarshaller instance;

    public static EventContextDataTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new EventContextDataTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(EventContextDataType eventContextDataType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (eventContextDataType.getIpAddress() != null) {
            String ipAddress = eventContextDataType.getIpAddress();
            awsJsonWriter.name("IpAddress");
            awsJsonWriter.value(ipAddress);
        }
        if (eventContextDataType.getDeviceName() != null) {
            String deviceName = eventContextDataType.getDeviceName();
            awsJsonWriter.name(DataRecordKey.MODEL);
            awsJsonWriter.value(deviceName);
        }
        if (eventContextDataType.getTimezone() != null) {
            String timezone = eventContextDataType.getTimezone();
            awsJsonWriter.name("Timezone");
            awsJsonWriter.value(timezone);
        }
        if (eventContextDataType.getCity() != null) {
            String city = eventContextDataType.getCity();
            awsJsonWriter.name("City");
            awsJsonWriter.value(city);
        }
        if (eventContextDataType.getCountry() != null) {
            String country = eventContextDataType.getCountry();
            awsJsonWriter.name("Country");
            awsJsonWriter.value(country);
        }
        awsJsonWriter.endObject();
    }
}
