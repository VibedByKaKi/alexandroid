package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazon.comms.ringservice.MetricsSession;
import com.amazonaws.services.cognitoidentity.model.UnprocessedIdentityId;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UnprocessedIdentityIdJsonMarshaller {
    private static UnprocessedIdentityIdJsonMarshaller instance;

    public static UnprocessedIdentityIdJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UnprocessedIdentityIdJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UnprocessedIdentityId unprocessedIdentityId, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (unprocessedIdentityId.getIdentityId() != null) {
            String identityId = unprocessedIdentityId.getIdentityId();
            awsJsonWriter.name("IdentityId");
            awsJsonWriter.value(identityId);
        }
        if (unprocessedIdentityId.getErrorCode() != null) {
            String errorCode = unprocessedIdentityId.getErrorCode();
            awsJsonWriter.name(MetricsSession.ERROR_CODE_PIVOT);
            awsJsonWriter.value(errorCode);
        }
        awsJsonWriter.endObject();
    }
}
