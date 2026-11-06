package com.amazonaws.services.iot.model.transform;

import com.amazon.identity.auth.device.api.MultipleAccountManager;
import com.amazonaws.services.iot.model.RoleAliasDescription;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class RoleAliasDescriptionJsonMarshaller {
    private static RoleAliasDescriptionJsonMarshaller instance;

    public static RoleAliasDescriptionJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new RoleAliasDescriptionJsonMarshaller();
        }
        return instance;
    }

    public void marshall(RoleAliasDescription roleAliasDescription, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (roleAliasDescription.getRoleAlias() != null) {
            String roleAlias = roleAliasDescription.getRoleAlias();
            awsJsonWriter.name("roleAlias");
            awsJsonWriter.value(roleAlias);
        }
        if (roleAliasDescription.getRoleAliasArn() != null) {
            String roleAliasArn = roleAliasDescription.getRoleAliasArn();
            awsJsonWriter.name("roleAliasArn");
            awsJsonWriter.value(roleAliasArn);
        }
        if (roleAliasDescription.getRoleArn() != null) {
            String roleArn = roleAliasDescription.getRoleArn();
            awsJsonWriter.name("roleArn");
            awsJsonWriter.value(roleArn);
        }
        if (roleAliasDescription.getOwner() != null) {
            String owner = roleAliasDescription.getOwner();
            awsJsonWriter.name(MultipleAccountManager.SessionPackageMappingType.JSON_KEY_SESSION_PACKAGE_MAPPING_OWNER);
            awsJsonWriter.value(owner);
        }
        if (roleAliasDescription.getCredentialDurationSeconds() != null) {
            Integer credentialDurationSeconds = roleAliasDescription.getCredentialDurationSeconds();
            awsJsonWriter.name("credentialDurationSeconds");
            awsJsonWriter.value(credentialDurationSeconds);
        }
        if (roleAliasDescription.getCreationDate() != null) {
            Date creationDate = roleAliasDescription.getCreationDate();
            awsJsonWriter.name("creationDate");
            awsJsonWriter.value(creationDate);
        }
        if (roleAliasDescription.getLastModifiedDate() != null) {
            Date lastModifiedDate = roleAliasDescription.getLastModifiedDate();
            awsJsonWriter.name("lastModifiedDate");
            awsJsonWriter.value(lastModifiedDate);
        }
        awsJsonWriter.endObject();
    }
}
