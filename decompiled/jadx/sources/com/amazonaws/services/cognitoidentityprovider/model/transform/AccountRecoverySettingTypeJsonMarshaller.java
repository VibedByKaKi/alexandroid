package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.AccountRecoverySettingType;
import com.amazonaws.services.cognitoidentityprovider.model.RecoveryOptionType;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class AccountRecoverySettingTypeJsonMarshaller {
    private static AccountRecoverySettingTypeJsonMarshaller instance;

    public static AccountRecoverySettingTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new AccountRecoverySettingTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(AccountRecoverySettingType accountRecoverySettingType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (accountRecoverySettingType.getRecoveryMechanisms() != null) {
            List<RecoveryOptionType> recoveryMechanisms = accountRecoverySettingType.getRecoveryMechanisms();
            awsJsonWriter.name("RecoveryMechanisms");
            awsJsonWriter.beginArray();
            for (RecoveryOptionType recoveryOptionType : recoveryMechanisms) {
                if (recoveryOptionType != null) {
                    RecoveryOptionTypeJsonMarshaller.getInstance().marshall(recoveryOptionType, awsJsonWriter);
                }
            }
            awsJsonWriter.endArray();
        }
        awsJsonWriter.endObject();
    }
}
