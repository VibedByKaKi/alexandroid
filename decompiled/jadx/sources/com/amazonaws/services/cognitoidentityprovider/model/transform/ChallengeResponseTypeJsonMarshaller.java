package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.ChallengeResponseType;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class ChallengeResponseTypeJsonMarshaller {
    private static ChallengeResponseTypeJsonMarshaller instance;

    public static ChallengeResponseTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new ChallengeResponseTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(ChallengeResponseType challengeResponseType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (challengeResponseType.getChallengeName() != null) {
            String challengeName = challengeResponseType.getChallengeName();
            awsJsonWriter.name("ChallengeName");
            awsJsonWriter.value(challengeName);
        }
        if (challengeResponseType.getChallengeResponse() != null) {
            String challengeResponse = challengeResponseType.getChallengeResponse();
            awsJsonWriter.name("ChallengeResponse");
            awsJsonWriter.value(challengeResponse);
        }
        awsJsonWriter.endObject();
    }
}
