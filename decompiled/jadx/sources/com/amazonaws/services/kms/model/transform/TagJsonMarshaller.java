package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.Tag;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class TagJsonMarshaller {
    private static TagJsonMarshaller instance;

    public static TagJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new TagJsonMarshaller();
        }
        return instance;
    }

    public void marshall(Tag tag, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (tag.getTagKey() != null) {
            String tagKey = tag.getTagKey();
            awsJsonWriter.name("TagKey");
            awsJsonWriter.value(tagKey);
        }
        if (tag.getTagValue() != null) {
            String tagValue = tag.getTagValue();
            awsJsonWriter.name("TagValue");
            awsJsonWriter.value(tagValue);
        }
        awsJsonWriter.endObject();
    }
}
