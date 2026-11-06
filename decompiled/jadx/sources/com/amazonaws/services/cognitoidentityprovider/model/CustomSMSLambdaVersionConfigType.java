package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class CustomSMSLambdaVersionConfigType implements Serializable {
    private String lambdaArn;
    private String lambdaVersion;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CustomSMSLambdaVersionConfigType)) {
            return false;
        }
        CustomSMSLambdaVersionConfigType customSMSLambdaVersionConfigType = (CustomSMSLambdaVersionConfigType) obj;
        if ((customSMSLambdaVersionConfigType.getLambdaVersion() == null) ^ (getLambdaVersion() == null)) {
            return false;
        }
        if (customSMSLambdaVersionConfigType.getLambdaVersion() != null && !customSMSLambdaVersionConfigType.getLambdaVersion().equals(getLambdaVersion())) {
            return false;
        }
        if ((customSMSLambdaVersionConfigType.getLambdaArn() == null) ^ (getLambdaArn() == null)) {
            return false;
        }
        return customSMSLambdaVersionConfigType.getLambdaArn() == null || customSMSLambdaVersionConfigType.getLambdaArn().equals(getLambdaArn());
    }

    public String getLambdaArn() {
        return this.lambdaArn;
    }

    public String getLambdaVersion() {
        return this.lambdaVersion;
    }

    public int hashCode() {
        return (((getLambdaVersion() == null ? 0 : getLambdaVersion().hashCode()) + 31) * 31) + (getLambdaArn() != null ? getLambdaArn().hashCode() : 0);
    }

    public void setLambdaArn(String str) {
        this.lambdaArn = str;
    }

    public void setLambdaVersion(CustomSMSSenderLambdaVersionType customSMSSenderLambdaVersionType) {
        this.lambdaVersion = customSMSSenderLambdaVersionType.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getLambdaVersion() != null) {
            sb.append("LambdaVersion: " + getLambdaVersion() + ",");
        }
        if (getLambdaArn() != null) {
            sb.append("LambdaArn: " + getLambdaArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public CustomSMSLambdaVersionConfigType withLambdaArn(String str) {
        this.lambdaArn = str;
        return this;
    }

    public CustomSMSLambdaVersionConfigType withLambdaVersion(CustomSMSSenderLambdaVersionType customSMSSenderLambdaVersionType) {
        this.lambdaVersion = customSMSSenderLambdaVersionType.toString();
        return this;
    }

    public void setLambdaVersion(String str) {
        this.lambdaVersion = str;
    }

    public CustomSMSLambdaVersionConfigType withLambdaVersion(String str) {
        this.lambdaVersion = str;
        return this;
    }
}
