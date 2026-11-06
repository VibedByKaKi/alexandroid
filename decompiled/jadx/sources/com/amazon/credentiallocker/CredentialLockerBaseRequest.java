package com.amazon.credentiallocker;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.annotation.CoralSuppressWarnings;
import com.amazon.coral.annotation.Documentation;
import com.amazon.coral.annotation.Generated;
import com.amazon.coral.annotation.HttpHeader;
import com.amazon.coral.annotation.Shape;
import com.amazon.coral.annotation.Wrapper;
import com.amazon.coral.annotation.WrapperType;
import com.amazon.coral.annotation.XmlName;
import com.amazon.coral.annotation.XmlNamespace;
import com.amazon.whisperjoin.credentiallocker.Constants;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Shape
@XmlNamespace("http://internal.amazon.com/coral/com.amazon.credentiallocker/")
@CoralSuppressWarnings
@Generated
@XmlName("CredentialLockerBaseRequest")
@Documentation("Structure from which all Credential Locker requests are inherited.\n        clientName - Client can be Alexa App, mShop app, or kindle device. This is the name of the client.\n        clientVersion - Version of Alexa app or mShop app\n        clientProduct - Information about the client product.\n        clientModel - Model number of the client\n        clientManufacturer - Manufacturer of the client\n        clientOs - Type of operating System when Alexa or mShop app is installed. For Kindle, its fire OS.\n        clientOsVersion - Version of the operating system\n        deviceName - This is the device who is receiving the wifi information.\n        deviceVersion - Version of the device\n        deviceManufacturer - Manufacturer of the device")
@Wrapper({WrapperType.INPUT, WrapperType.OUTPUT})
/* loaded from: classes19.dex */
public abstract class CredentialLockerBaseRequest {
    private static final int classNameHashCode = internalHashCodeCompute("com.amazon.credentiallocker.CredentialLockerBaseRequest");
    private String clientManufacturer;
    private String clientModel;
    private String clientName;
    private String clientOs;
    private String clientOsVersion;
    private String clientProduct;
    private String clientVersion;
    private String deviceManufacturer;
    private String deviceName;
    private String deviceVersion;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Generated
    public static abstract class Builder {
        protected String clientManufacturer;
        protected String clientModel;
        protected String clientName;
        protected String clientOs;
        protected String clientOsVersion;
        protected String clientProduct;
        protected String clientVersion;
        protected String deviceManufacturer;
        protected String deviceName;
        protected String deviceVersion;

        public void populate(CredentialLockerBaseRequest credentialLockerBaseRequest) {
            credentialLockerBaseRequest.setClientName(this.clientName);
            credentialLockerBaseRequest.setClientVersion(this.clientVersion);
            credentialLockerBaseRequest.setClientProduct(this.clientProduct);
            credentialLockerBaseRequest.setClientModel(this.clientModel);
            credentialLockerBaseRequest.setClientManufacturer(this.clientManufacturer);
            credentialLockerBaseRequest.setClientOs(this.clientOs);
            credentialLockerBaseRequest.setClientOsVersion(this.clientOsVersion);
            credentialLockerBaseRequest.setDeviceName(this.deviceName);
            credentialLockerBaseRequest.setDeviceVersion(this.deviceVersion);
            credentialLockerBaseRequest.setDeviceManufacturer(this.deviceManufacturer);
        }

        public Builder withClientManufacturer(String str) {
            this.clientManufacturer = str;
            return this;
        }

        public Builder withClientModel(String str) {
            this.clientModel = str;
            return this;
        }

        public Builder withClientName(String str) {
            this.clientName = str;
            return this;
        }

        public Builder withClientOs(String str) {
            this.clientOs = str;
            return this;
        }

        public Builder withClientOsVersion(String str) {
            this.clientOsVersion = str;
            return this;
        }

        public Builder withClientProduct(String str) {
            this.clientProduct = str;
            return this;
        }

        public Builder withClientVersion(String str) {
            this.clientVersion = str;
            return this;
        }

        public Builder withDeviceManufacturer(String str) {
            this.deviceManufacturer = str;
            return this;
        }

        public Builder withDeviceName(String str) {
            this.deviceName = str;
            return this;
        }

        public Builder withDeviceVersion(String str) {
            this.deviceVersion = str;
            return this;
        }
    }

    private static int internalHashCodeCompute(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CredentialLockerBaseRequest)) {
            return false;
        }
        CredentialLockerBaseRequest credentialLockerBaseRequest = (CredentialLockerBaseRequest) obj;
        return Objects.equals(getClientName(), credentialLockerBaseRequest.getClientName()) && Objects.equals(getClientVersion(), credentialLockerBaseRequest.getClientVersion()) && Objects.equals(getClientProduct(), credentialLockerBaseRequest.getClientProduct()) && Objects.equals(getClientModel(), credentialLockerBaseRequest.getClientModel()) && Objects.equals(getClientManufacturer(), credentialLockerBaseRequest.getClientManufacturer()) && Objects.equals(getClientOs(), credentialLockerBaseRequest.getClientOs()) && Objects.equals(getClientOsVersion(), credentialLockerBaseRequest.getClientOsVersion()) && Objects.equals(getDeviceName(), credentialLockerBaseRequest.getDeviceName()) && Objects.equals(getDeviceVersion(), credentialLockerBaseRequest.getDeviceVersion()) && Objects.equals(getDeviceManufacturer(), credentialLockerBaseRequest.getDeviceManufacturer());
    }

    @HttpHeader(Constants.CLIENT_MANUFACTURER_HEADER)
    public String getClientManufacturer() {
        return this.clientManufacturer;
    }

    @HttpHeader(Constants.CLIENT_MODEL_HEADER)
    public String getClientModel() {
        return this.clientModel;
    }

    @HttpHeader(Constants.CLIENT_NAME_HEADER)
    public String getClientName() {
        return this.clientName;
    }

    @HttpHeader(Constants.CLIENT_OS_HEADER)
    public String getClientOs() {
        return this.clientOs;
    }

    @HttpHeader(Constants.CLIENT_OS_VERSION_HEADER)
    public String getClientOsVersion() {
        return this.clientOsVersion;
    }

    @HttpHeader(Constants.CLIENT_PRODUCT_HEADER)
    public String getClientProduct() {
        return this.clientProduct;
    }

    @HttpHeader(Constants.CLIENT_VERSION_HEADER)
    public String getClientVersion() {
        return this.clientVersion;
    }

    @HttpHeader(Constants.TARGET_MANUFACTURER_HEADER)
    public String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    @HttpHeader(Constants.TARGET_NAME_HEADER)
    public String getDeviceName() {
        return this.deviceName;
    }

    @HttpHeader(Constants.TARGET_VERSION_HEADER)
    public String getDeviceVersion() {
        return this.deviceVersion;
    }

    public int hashCode() {
        return internalHashCodeCompute(Integer.valueOf(classNameHashCode), getClientName(), getClientVersion(), getClientProduct(), getClientModel(), getClientManufacturer(), getClientOs(), getClientOsVersion(), getDeviceName(), getDeviceVersion(), getDeviceManufacturer());
    }

    public void setClientManufacturer(String str) {
        this.clientManufacturer = str;
    }

    public void setClientModel(String str) {
        this.clientModel = str;
    }

    public void setClientName(String str) {
        this.clientName = str;
    }

    public void setClientOs(String str) {
        this.clientOs = str;
    }

    public void setClientOsVersion(String str) {
        this.clientOsVersion = str;
    }

    public void setClientProduct(String str) {
        this.clientProduct = str;
    }

    public void setClientVersion(String str) {
        this.clientVersion = str;
    }

    public void setDeviceManufacturer(String str) {
        this.deviceManufacturer = str;
    }

    public void setDeviceName(String str) {
        this.deviceName = str;
    }

    public void setDeviceVersion(String str) {
        this.deviceVersion = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CredentialLockerBaseRequest(clientName=");
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientName, ", clientVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientVersion, ", clientProduct=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientProduct, ", clientModel=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientModel, ", clientManufacturer=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientManufacturer, ", clientOs=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientOs, ", clientOsVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.clientOsVersion, ", deviceName=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceName, ", deviceVersion=", sb);
        CredentialConfig$$ExternalSyntheticOutline0.m21224m(this.deviceVersion, ", deviceManufacturer=", sb);
        return CredentialConfig$$ExternalSyntheticOutline0.m$1(this.deviceManufacturer, MarkdownConstants.RIGHT_PARENTHESIS, sb);
    }
}
