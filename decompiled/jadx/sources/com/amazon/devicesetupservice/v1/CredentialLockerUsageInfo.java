package com.amazon.devicesetupservice.v1;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@CoralSuppressWarnings
@XmlNamespace("http://device-setup-service.amazon.com/v1/")
@Generated
@XmlName("CredentialLockerUsageInfo")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes5.dex */
public class CredentialLockerUsageInfo {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.devicesetupservice.v1.CredentialLockerUsageInfo");
    private String chosenSSIDCredChanged;
    private String sSIDFromCredlocker;
    private String ssidFromCredlocker;
    private String userIntendsToSaveCredentialToLocker;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static class Builder {
        protected String chosenSSIDCredChanged;
        protected String sSIDFromCredlocker;
        protected String ssidFromCredlocker;
        protected String userIntendsToSaveCredentialToLocker;

        public CredentialLockerUsageInfo build() {
            CredentialLockerUsageInfo credentialLockerUsageInfo = new CredentialLockerUsageInfo();
            populate(credentialLockerUsageInfo);
            return credentialLockerUsageInfo;
        }

        public void populate(CredentialLockerUsageInfo credentialLockerUsageInfo) {
            credentialLockerUsageInfo.setUserIntendsToSaveCredentialToLocker(this.userIntendsToSaveCredentialToLocker);
            credentialLockerUsageInfo.setChosenSSIDCredChanged(this.chosenSSIDCredChanged);
            credentialLockerUsageInfo.setSSIDFromCredlocker(this.sSIDFromCredlocker);
            credentialLockerUsageInfo.setSsidFromCredlocker(this.ssidFromCredlocker);
        }

        public Builder withChosenSSIDCredChanged(String str) {
            this.chosenSSIDCredChanged = str;
            return this;
        }

        @Deprecated
        public Builder withSSIDFromCredlocker(String str) {
            this.sSIDFromCredlocker = str;
            return this;
        }

        public Builder withSsidFromCredlocker(String str) {
            this.ssidFromCredlocker = str;
            return this;
        }

        public Builder withUserIntendsToSaveCredentialToLocker(String str) {
            this.userIntendsToSaveCredentialToLocker = str;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialLockerUsageInfo)) {
            return false;
        }
        CredentialLockerUsageInfo credentialLockerUsageInfo = (CredentialLockerUsageInfo) obj;
        return Objects.equals(getUserIntendsToSaveCredentialToLocker(), credentialLockerUsageInfo.getUserIntendsToSaveCredentialToLocker()) && Objects.equals(getChosenSSIDCredChanged(), credentialLockerUsageInfo.getChosenSSIDCredChanged()) && Objects.equals(getSSIDFromCredlocker(), credentialLockerUsageInfo.getSSIDFromCredlocker()) && Objects.equals(getSsidFromCredlocker(), credentialLockerUsageInfo.getSsidFromCredlocker());
    }

    @Documentation("Value \"TRUE\" if the chosen SSID has Creds changed during Manual Setup, else \"FALSE\".")
    public String getChosenSSIDCredChanged() {
        return this.chosenSSIDCredChanged;
    }

    @Documentation("Value \"TRUE\" if the chosen SSID is from Credential Locker, else \"FALSE\".")
    @Deprecated
    public String getSSIDFromCredlocker() {
        return this.sSIDFromCredlocker;
    }

    @Documentation("Value \"TRUE\" if the chosen SSID is from Credential Locker, else \"FALSE\".")
    public String getSsidFromCredlocker() {
        return this.ssidFromCredlocker;
    }

    @Documentation("Value \"TRUE\" for marking user intending to save credentials to locker, else \"FALSE\".")
    public String getUserIntendsToSaveCredentialToLocker() {
        return this.userIntendsToSaveCredentialToLocker;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getUserIntendsToSaveCredentialToLocker(), getChosenSSIDCredChanged(), getSSIDFromCredlocker(), getSsidFromCredlocker());
    }

    public void setChosenSSIDCredChanged(String str) {
        this.chosenSSIDCredChanged = str;
    }

    @Deprecated
    public void setSSIDFromCredlocker(String str) {
        this.sSIDFromCredlocker = str;
    }

    public void setSsidFromCredlocker(String str) {
        this.ssidFromCredlocker = str;
    }

    public void setUserIntendsToSaveCredentialToLocker(String str) {
        this.userIntendsToSaveCredentialToLocker = str;
    }

    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.withUserIntendsToSaveCredentialToLocker(getUserIntendsToSaveCredentialToLocker());
        builder.withChosenSSIDCredChanged(getChosenSSIDCredChanged());
        builder.withSSIDFromCredlocker(getSSIDFromCredlocker());
        builder.withSsidFromCredlocker(getSsidFromCredlocker());
        return builder;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CredentialLockerUsageInfo(userIntendsToSaveCredentialToLocker=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.userIntendsToSaveCredentialToLocker, ", chosenSSIDCredChanged=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.chosenSSIDCredChanged, ", sSIDFromCredlocker=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.sSIDFromCredlocker, ", ssidFromCredlocker=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.ssidFromCredlocker, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
