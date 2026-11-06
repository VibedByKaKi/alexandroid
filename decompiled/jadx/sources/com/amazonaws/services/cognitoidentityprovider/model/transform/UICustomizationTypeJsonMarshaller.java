package com.amazonaws.services.cognitoidentityprovider.model.transform;

import com.amazonaws.services.cognitoidentityprovider.model.UICustomizationType;
import com.amazonaws.util.json.AwsJsonWriter;
import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
class UICustomizationTypeJsonMarshaller {
    private static UICustomizationTypeJsonMarshaller instance;

    public static UICustomizationTypeJsonMarshaller getInstance() {
        if (instance == null) {
            instance = new UICustomizationTypeJsonMarshaller();
        }
        return instance;
    }

    public void marshall(UICustomizationType uICustomizationType, AwsJsonWriter awsJsonWriter) throws Exception {
        awsJsonWriter.beginObject();
        if (uICustomizationType.getUserPoolId() != null) {
            String userPoolId = uICustomizationType.getUserPoolId();
            awsJsonWriter.name("UserPoolId");
            awsJsonWriter.value(userPoolId);
        }
        if (uICustomizationType.getClientId() != null) {
            String clientId = uICustomizationType.getClientId();
            awsJsonWriter.name("ClientId");
            awsJsonWriter.value(clientId);
        }
        if (uICustomizationType.getImageUrl() != null) {
            String imageUrl = uICustomizationType.getImageUrl();
            awsJsonWriter.name("ImageUrl");
            awsJsonWriter.value(imageUrl);
        }
        if (uICustomizationType.getCSS() != null) {
            String css = uICustomizationType.getCSS();
            awsJsonWriter.name("CSS");
            awsJsonWriter.value(css);
        }
        if (uICustomizationType.getCSSVersion() != null) {
            String cSSVersion = uICustomizationType.getCSSVersion();
            awsJsonWriter.name("CSSVersion");
            awsJsonWriter.value(cSSVersion);
        }
        if (uICustomizationType.getLastModifiedDate() != null) {
            Date lastModifiedDate = uICustomizationType.getLastModifiedDate();
            awsJsonWriter.name("LastModifiedDate");
            awsJsonWriter.value(lastModifiedDate);
        }
        if (uICustomizationType.getCreationDate() != null) {
            Date creationDate = uICustomizationType.getCreationDate();
            awsJsonWriter.name("CreationDate");
            awsJsonWriter.value(creationDate);
        }
        awsJsonWriter.endObject();
    }
}
