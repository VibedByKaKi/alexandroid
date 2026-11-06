package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.AssetPropertyVariant;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AssetPropertyVariantJsonMarshaller {
    private static AssetPropertyVariantJsonMarshaller instance;

    public static AssetPropertyVariantJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AssetPropertyVariantJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AssetPropertyVariant assetPropertyVariant, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (assetPropertyVariant.getStringValue() != null) {
            String stringValue = assetPropertyVariant.getStringValue();
            awsJsonWriter.name("stringValue");
            awsJsonWriter.value(stringValue);
        }
        if (assetPropertyVariant.getIntegerValue() != null) {
            String integerValue = assetPropertyVariant.getIntegerValue();
            awsJsonWriter.name("integerValue");
            awsJsonWriter.value(integerValue);
        }
        if (assetPropertyVariant.getDoubleValue() != null) {
            String doubleValue = assetPropertyVariant.getDoubleValue();
            awsJsonWriter.name("doubleValue");
            awsJsonWriter.value(doubleValue);
        }
        if (assetPropertyVariant.getBooleanValue() != null) {
            String booleanValue = assetPropertyVariant.getBooleanValue();
            awsJsonWriter.name("booleanValue");
            awsJsonWriter.value(booleanValue);
        }
        awsJsonWriter.endObject();
    }
}
