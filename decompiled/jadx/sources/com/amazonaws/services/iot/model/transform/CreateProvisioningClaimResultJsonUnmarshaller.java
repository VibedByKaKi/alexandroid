package com.amazonaws.services.iot.model.transform;

import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazonaws.services.iot.model.CreateProvisioningClaimResult;
import com.amazonaws.transform.JsonUnmarshallerContext;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers;
import com.amazonaws.transform.Unmarshaller;
import com.amazonaws.util.json.AwsJsonReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CreateProvisioningClaimResultJsonUnmarshaller implements Unmarshaller<CreateProvisioningClaimResult, JsonUnmarshallerContext> {
    private static CreateProvisioningClaimResultJsonUnmarshaller instance;

    public static CreateProvisioningClaimResultJsonUnmarshaller getInstance() {
        if (instance == null) {
            instance = new CreateProvisioningClaimResultJsonUnmarshaller();
        }
        return instance;
    }

    @Override // com.amazonaws.transform.Unmarshaller
    public CreateProvisioningClaimResult unmarshall(JsonUnmarshallerContext jsonUnmarshallerContext) throws Exception {
        CreateProvisioningClaimResult createProvisioningClaimResult = new CreateProvisioningClaimResult();
        AwsJsonReader reader = jsonUnmarshallerContext.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String nextName = reader.nextName();
            if (nextName.equals("certificateId")) {
                createProvisioningClaimResult.setCertificateId(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("certificatePem")) {
                createProvisioningClaimResult.setCertificatePem(SimpleTypeJsonUnmarshallers.StringJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals("keyPair")) {
                createProvisioningClaimResult.setKeyPair(KeyPairJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else if (nextName.equals(FragmentMetaData.EXPIRATION)) {
                createProvisioningClaimResult.setExpiration(SimpleTypeJsonUnmarshallers.DateJsonUnmarshaller.getInstance().unmarshall(jsonUnmarshallerContext));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return createProvisioningClaimResult;
    }
}
