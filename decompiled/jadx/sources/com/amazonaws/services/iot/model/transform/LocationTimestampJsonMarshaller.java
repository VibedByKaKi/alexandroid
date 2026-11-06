package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.LocationTimestamp;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class LocationTimestampJsonMarshaller {
    private static LocationTimestampJsonMarshaller instance;

    public static LocationTimestampJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new LocationTimestampJsonMarshaller();
        }
        return instance;
    }

    public void marshall(LocationTimestamp locationTimestamp, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (locationTimestamp.getValue() != null) {
            String value = locationTimestamp.getValue();
            awsJsonWriter.name("value");
            awsJsonWriter.value(value);
        }
        if (locationTimestamp.getUnit() != null) {
            String unit = locationTimestamp.getUnit();
            awsJsonWriter.name("unit");
            awsJsonWriter.value(unit);
        }
        awsJsonWriter.endObject();
    }
}
