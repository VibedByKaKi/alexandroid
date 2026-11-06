package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RegisterThingRequest extends AmazonWebServiceRequest implements Serializable {
    private Map<String, String> parameters;
    private String templateBody;

    public RegisterThingRequest addparametersEntry(String str, String str2) {
        if (this.parameters == null) {
            this.parameters = new HashMap();
        }
        if (this.parameters.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.parameters.put(str, str2);
        return this;
    }

    public RegisterThingRequest clearparametersEntries() {
        this.parameters = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RegisterThingRequest)) {
            return false;
        }
        RegisterThingRequest registerThingRequest = (RegisterThingRequest) obj;
        if ((registerThingRequest.getTemplateBody() == null) ^ (getTemplateBody() == null)) {
            return false;
        }
        if (registerThingRequest.getTemplateBody() != null && !registerThingRequest.getTemplateBody().equals(getTemplateBody())) {
            return false;
        }
        if ((registerThingRequest.getParameters() == null) ^ (getParameters() == null)) {
            return false;
        }
        return registerThingRequest.getParameters() == null || registerThingRequest.getParameters().equals(getParameters());
    }

    public Map<String, String> getParameters() {
        return this.parameters;
    }

    public String getTemplateBody() {
        return this.templateBody;
    }

    public int hashCode() {
        return (((getTemplateBody() == null ? 0 : getTemplateBody().hashCode()) + 31) * 31) + (getParameters() != null ? getParameters().hashCode() : 0);
    }

    public void setParameters(Map<String, String> map) {
        this.parameters = map;
    }

    public void setTemplateBody(String str) {
        this.templateBody = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateBody() != null) {
            sb.append("templateBody: " + getTemplateBody() + ",");
        }
        if (getParameters() != null) {
            sb.append("parameters: " + getParameters());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public RegisterThingRequest withParameters(Map<String, String> map) {
        this.parameters = map;
        return this;
    }

    public RegisterThingRequest withTemplateBody(String str) {
        this.templateBody = str;
        return this;
    }
}
