package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class LambdaAction implements Serializable {
    private String functionArn;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LambdaAction)) {
            return false;
        }
        LambdaAction lambdaAction = (LambdaAction) obj;
        if ((lambdaAction.getFunctionArn() == null) ^ (getFunctionArn() == null)) {
            return false;
        }
        return lambdaAction.getFunctionArn() == null || lambdaAction.getFunctionArn().equals(getFunctionArn());
    }

    public String getFunctionArn() {
        return this.functionArn;
    }

    public int hashCode() {
        return 31 + (getFunctionArn() == null ? 0 : getFunctionArn().hashCode());
    }

    public void setFunctionArn(String str) {
        this.functionArn = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getFunctionArn() != null) {
            sb.append("functionArn: " + getFunctionArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public LambdaAction withFunctionArn(String str) {
        this.functionArn = str;
        return this;
    }
}
