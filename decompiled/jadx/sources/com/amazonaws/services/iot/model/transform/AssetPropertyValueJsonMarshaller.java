package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.hho.imagepicker.ImageCropActivity;
import com.amazonaws.services.iot.model.AssetPropertyTimestamp;
import com.amazonaws.services.iot.model.AssetPropertyValue;
import com.amazonaws.services.iot.model.AssetPropertyVariant;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AssetPropertyValueJsonMarshaller {
    private static AssetPropertyValueJsonMarshaller instance;

    public static AssetPropertyValueJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AssetPropertyValueJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AssetPropertyValue assetPropertyValue, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (assetPropertyValue.getValue() != null) {
            AssetPropertyVariant value = assetPropertyValue.getValue();
            awsJsonWriter.name("value");
            AssetPropertyVariantJsonMarshaller.getInstance().marshall(value, awsJsonWriter);
        }
        if (assetPropertyValue.getTimestamp() != null) {
            AssetPropertyTimestamp timestamp = assetPropertyValue.getTimestamp();
            awsJsonWriter.name("timestamp");
            AssetPropertyTimestampJsonMarshaller.getInstance().marshall(timestamp, awsJsonWriter);
        }
        if (assetPropertyValue.getQuality() != null) {
            String quality = assetPropertyValue.getQuality();
            awsJsonWriter.name(ImageCropActivity.EXTRA_QUALITY);
            awsJsonWriter.value(quality);
        }
        awsJsonWriter.endObject();
    }
}
