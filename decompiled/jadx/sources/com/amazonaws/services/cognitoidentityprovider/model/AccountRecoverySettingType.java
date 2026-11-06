package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class AccountRecoverySettingType implements Serializable {
    private List<RecoveryOptionType> recoveryMechanisms;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccountRecoverySettingType)) {
            return false;
        }
        AccountRecoverySettingType accountRecoverySettingType = (AccountRecoverySettingType) obj;
        if ((accountRecoverySettingType.getRecoveryMechanisms() == null) ^ (getRecoveryMechanisms() == null)) {
            return false;
        }
        return accountRecoverySettingType.getRecoveryMechanisms() == null || accountRecoverySettingType.getRecoveryMechanisms().equals(getRecoveryMechanisms());
    }

    public List<RecoveryOptionType> getRecoveryMechanisms() {
        return this.recoveryMechanisms;
    }

    public int hashCode() {
        return 31 + (getRecoveryMechanisms() == null ? 0 : getRecoveryMechanisms().hashCode());
    }

    public void setRecoveryMechanisms(Collection<RecoveryOptionType> collection) {
        if (collection == null) {
            this.recoveryMechanisms = null;
        } else {
            this.recoveryMechanisms = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getRecoveryMechanisms() != null) {
            sb.append("RecoveryMechanisms: " + getRecoveryMechanisms());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public AccountRecoverySettingType withRecoveryMechanisms(RecoveryOptionType... recoveryOptionTypeArr) {
        if (getRecoveryMechanisms() == null) {
            this.recoveryMechanisms = new ArrayList(recoveryOptionTypeArr.length);
        }
        for (RecoveryOptionType recoveryOptionType : recoveryOptionTypeArr) {
            this.recoveryMechanisms.add(recoveryOptionType);
        }
        return this;
    }

    public AccountRecoverySettingType withRecoveryMechanisms(Collection<RecoveryOptionType> collection) {
        setRecoveryMechanisms(collection);
        return this;
    }
}
