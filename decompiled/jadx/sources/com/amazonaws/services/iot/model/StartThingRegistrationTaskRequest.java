package com.amazonaws.services.iot.model;

import com.amazonaws.AmazonWebServiceRequest;
import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StartThingRegistrationTaskRequest extends AmazonWebServiceRequest implements Serializable {
    private String inputFileBucket;
    private String inputFileKey;
    private String roleArn;
    private String templateBody;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartThingRegistrationTaskRequest)) {
            return false;
        }
        StartThingRegistrationTaskRequest startThingRegistrationTaskRequest = (StartThingRegistrationTaskRequest) obj;
        if ((startThingRegistrationTaskRequest.getTemplateBody() == null) ^ (getTemplateBody() == null)) {
            return false;
        }
        if (startThingRegistrationTaskRequest.getTemplateBody() != null && !startThingRegistrationTaskRequest.getTemplateBody().equals(getTemplateBody())) {
            return false;
        }
        if ((startThingRegistrationTaskRequest.getInputFileBucket() == null) ^ (getInputFileBucket() == null)) {
            return false;
        }
        if (startThingRegistrationTaskRequest.getInputFileBucket() != null && !startThingRegistrationTaskRequest.getInputFileBucket().equals(getInputFileBucket())) {
            return false;
        }
        if ((startThingRegistrationTaskRequest.getInputFileKey() == null) ^ (getInputFileKey() == null)) {
            return false;
        }
        if (startThingRegistrationTaskRequest.getInputFileKey() != null && !startThingRegistrationTaskRequest.getInputFileKey().equals(getInputFileKey())) {
            return false;
        }
        if ((startThingRegistrationTaskRequest.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        return startThingRegistrationTaskRequest.getRoleArn() == null || startThingRegistrationTaskRequest.getRoleArn().equals(getRoleArn());
    }

    public String getInputFileBucket() {
        return this.inputFileBucket;
    }

    public String getInputFileKey() {
        return this.inputFileKey;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getTemplateBody() {
        return this.templateBody;
    }

    public int hashCode() {
        return (((((((getTemplateBody() == null ? 0 : getTemplateBody().hashCode()) + 31) * 31) + (getInputFileBucket() == null ? 0 : getInputFileBucket().hashCode())) * 31) + (getInputFileKey() == null ? 0 : getInputFileKey().hashCode())) * 31) + (getRoleArn() != null ? getRoleArn().hashCode() : 0);
    }

    public void setInputFileBucket(String str) {
        this.inputFileBucket = str;
    }

    public void setInputFileKey(String str) {
        this.inputFileKey = str;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setTemplateBody(String str) {
        this.templateBody = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTemplateBody() != null) {
            sb.append("templateBody: " + getTemplateBody() + ",");
        }
        if (getInputFileBucket() != null) {
            sb.append("inputFileBucket: " + getInputFileBucket() + ",");
        }
        if (getInputFileKey() != null) {
            sb.append("inputFileKey: " + getInputFileKey() + ",");
        }
        if (getRoleArn() != null) {
            sb.append("roleArn: " + getRoleArn());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StartThingRegistrationTaskRequest withInputFileBucket(String str) {
        this.inputFileBucket = str;
        return this;
    }

    public StartThingRegistrationTaskRequest withInputFileKey(String str) {
        this.inputFileKey = str;
        return this;
    }

    public StartThingRegistrationTaskRequest withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public StartThingRegistrationTaskRequest withTemplateBody(String str) {
        this.templateBody = str;
        return this;
    }
}
