package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.KeyPair;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class KeyPairJsonMarshaller {
    private static KeyPairJsonMarshaller instance;

    public static KeyPairJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new KeyPairJsonMarshaller();
        }
        return instance;
    }

    public void marshall(KeyPair keyPair, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (keyPair.getPublicKey() != null) {
            String publicKey = keyPair.getPublicKey();
            awsJsonWriter.name("PublicKey");
            awsJsonWriter.value(publicKey);
        }
        if (keyPair.getPrivateKey() != null) {
            String privateKey = keyPair.getPrivateKey();
            awsJsonWriter.name("PrivateKey");
            awsJsonWriter.value(privateKey);
        }
        awsJsonWriter.endObject();
    }
}
