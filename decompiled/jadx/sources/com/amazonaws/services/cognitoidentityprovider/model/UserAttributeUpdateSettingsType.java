package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class UserAttributeUpdateSettingsType implements Serializable {
    private List<String> attributesRequireVerificationBeforeUpdate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UserAttributeUpdateSettingsType)) {
            return false;
        }
        UserAttributeUpdateSettingsType userAttributeUpdateSettingsType = (UserAttributeUpdateSettingsType) obj;
        if ((userAttributeUpdateSettingsType.getAttributesRequireVerificationBeforeUpdate() == null) ^ (getAttributesRequireVerificationBeforeUpdate() == null)) {
            return false;
        }
        return userAttributeUpdateSettingsType.getAttributesRequireVerificationBeforeUpdate() == null || userAttributeUpdateSettingsType.getAttributesRequireVerificationBeforeUpdate().equals(getAttributesRequireVerificationBeforeUpdate());
    }

    public List<String> getAttributesRequireVerificationBeforeUpdate() {
        return this.attributesRequireVerificationBeforeUpdate;
    }

    public int hashCode() {
        return 31 + (getAttributesRequireVerificationBeforeUpdate() == null ? 0 : getAttributesRequireVerificationBeforeUpdate().hashCode());
    }

    public void setAttributesRequireVerificationBeforeUpdate(Collection<String> collection) {
        if (collection == null) {
            this.attributesRequireVerificationBeforeUpdate = null;
        } else {
            this.attributesRequireVerificationBeforeUpdate = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getAttributesRequireVerificationBeforeUpdate() != null) {
            sb.append("AttributesRequireVerificationBeforeUpdate: " + getAttributesRequireVerificationBeforeUpdate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public UserAttributeUpdateSettingsType withAttributesRequireVerificationBeforeUpdate(String... strArr) {
        if (getAttributesRequireVerificationBeforeUpdate() == null) {
            this.attributesRequireVerificationBeforeUpdate = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.attributesRequireVerificationBeforeUpdate.add(str);
        }
        return this;
    }

    public UserAttributeUpdateSettingsType withAttributesRequireVerificationBeforeUpdate(Collection<String> collection) {
        setAttributesRequireVerificationBeforeUpdate(collection);
        return this;
    }
}
