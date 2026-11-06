package com.amazonaws.services.cognitoidentity.model.transform;

import com.amazonaws.services.cognitoidentity.model.MappingRule;
import com.amazonaws.services.cognitoidentity.model.RulesConfigurationType;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RulesConfigurationTypeJsonMarshaller {
    private static RulesConfigurationTypeJsonMarshaller instance;

    public static RulesConfigurationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RulesConfigurationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RulesConfigurationType rulesConfigurationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (rulesConfigurationType.getRules() != null) {
            List<MappingRule> rules = rulesConfigurationType.getRules();
            awsJsonWriter.name("Rules");
            awsJsonWriter.beginArray();
            for (MappingRule mappingRule : rules) {
                if (mappingRule != null) {
                    MappingRuleJsonMarshaller.getInstance().marshall(mappingRule, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
