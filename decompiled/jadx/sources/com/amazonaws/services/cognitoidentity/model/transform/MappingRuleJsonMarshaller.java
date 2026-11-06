package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.MappingRule;
import com.amazonaws.util.json.AwsJsonWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class MappingRuleJsonMarshaller {
    private static MappingRuleJsonMarshaller instance;

    public static MappingRuleJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new MappingRuleJsonMarshaller();
        }
        return instance;
    }

    public void marshall(MappingRule mappingRule, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (mappingRule.getClaim() != null) {
            String claim = mappingRule.getClaim();
            awsJsonWriter.name("Claim");
            awsJsonWriter.value(claim);
        }
        if (mappingRule.getMatchType() != null) {
            String matchType = mappingRule.getMatchType();
            awsJsonWriter.name("MatchType");
            awsJsonWriter.value(matchType);
        }
        if (mappingRule.getValue() != null) {
            String value = mappingRule.getValue();
            awsJsonWriter.name("Value");
            awsJsonWriter.value(value);
        }
        if (mappingRule.getRoleARN() != null) {
            String roleARN = mappingRule.getRoleARN();
            awsJsonWriter.name("RoleARN");
            awsJsonWriter.value(roleARN);
        }
        awsJsonWriter.endObject();
    }
}
