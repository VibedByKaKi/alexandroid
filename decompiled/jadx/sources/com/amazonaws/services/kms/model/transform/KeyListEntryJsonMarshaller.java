package com.amazonaws.services.kms.model.transform;

import com.amazonaws.services.kms.model.KeyListEntry;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class KeyListEntryJsonMarshaller {
    private static KeyListEntryJsonMarshaller instance;

    public static KeyListEntryJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KeyListEntryJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KeyListEntry keyListEntry, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (keyListEntry.getKeyId() != null) {
            String keyId = keyListEntry.getKeyId();
            awsJsonWriter.name("KeyId");
            awsJsonWriter.value(keyId);
        }
        if (keyListEntry.getKeyArn() != null) {
            String keyArn = keyListEntry.getKeyArn();
            awsJsonWriter.name("KeyArn");
            awsJsonWriter.value(keyArn);
        }
        awsJsonWriter.endObject();
    }
}
