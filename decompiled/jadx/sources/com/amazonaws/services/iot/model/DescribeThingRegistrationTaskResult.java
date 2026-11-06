package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class DescribeThingRegistrationTaskResult implements Serializable {
    private Date creationDate;
    private Integer failureCount;
    private String inputFileBucket;
    private String inputFileKey;
    private Date lastModifiedDate;
    private String message;
    private Integer percentageProgress;
    private String roleArn;
    private String status;
    private Integer successCount;
    private String taskId;
    private String templateBody;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof DescribeThingRegistrationTaskResult)) {
            return false;
        }
        DescribeThingRegistrationTaskResult describeThingRegistrationTaskResult = (DescribeThingRegistrationTaskResult) obj;
        if ((describeThingRegistrationTaskResult.getTaskId() == null) ^ (getTaskId() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getTaskId() != null && !describeThingRegistrationTaskResult.getTaskId().equals(getTaskId())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getCreationDate() != null && !describeThingRegistrationTaskResult.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getLastModifiedDate() == null) ^ (getLastModifiedDate() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getLastModifiedDate() != null && !describeThingRegistrationTaskResult.getLastModifiedDate().equals(getLastModifiedDate())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getTemplateBody() == null) ^ (getTemplateBody() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getTemplateBody() != null && !describeThingRegistrationTaskResult.getTemplateBody().equals(getTemplateBody())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getInputFileBucket() == null) ^ (getInputFileBucket() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getInputFileBucket() != null && !describeThingRegistrationTaskResult.getInputFileBucket().equals(getInputFileBucket())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getInputFileKey() == null) ^ (getInputFileKey() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getInputFileKey() != null && !describeThingRegistrationTaskResult.getInputFileKey().equals(getInputFileKey())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getRoleArn() == null) ^ (getRoleArn() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getRoleArn() != null && !describeThingRegistrationTaskResult.getRoleArn().equals(getRoleArn())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getStatus() == null) ^ (getStatus() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getStatus() != null && !describeThingRegistrationTaskResult.getStatus().equals(getStatus())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getMessage() == null) ^ (getMessage() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getMessage() != null && !describeThingRegistrationTaskResult.getMessage().equals(getMessage())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getSuccessCount() == null) ^ (getSuccessCount() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getSuccessCount() != null && !describeThingRegistrationTaskResult.getSuccessCount().equals(getSuccessCount())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getFailureCount() == null) ^ (getFailureCount() == null)) {
            return false;
        }
        if (describeThingRegistrationTaskResult.getFailureCount() != null && !describeThingRegistrationTaskResult.getFailureCount().equals(getFailureCount())) {
            return false;
        }
        if ((describeThingRegistrationTaskResult.getPercentageProgress() == null) ^ (getPercentageProgress() == null)) {
            return false;
        }
        return describeThingRegistrationTaskResult.getPercentageProgress() == null || describeThingRegistrationTaskResult.getPercentageProgress().equals(getPercentageProgress());
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public Integer getFailureCount() {
        return this.failureCount;
    }

    public String getInputFileBucket() {
        return this.inputFileBucket;
    }

    public String getInputFileKey() {
        return this.inputFileKey;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public String getMessage() {
        return this.message;
    }

    public Integer getPercentageProgress() {
        return this.percentageProgress;
    }

    public String getRoleArn() {
        return this.roleArn;
    }

    public String getStatus() {
        return this.status;
    }

    public Integer getSuccessCount() {
        return this.successCount;
    }

    public String getTaskId() {
        return this.taskId;
    }

    public String getTemplateBody() {
        return this.templateBody;
    }

    public int hashCode() {
        return (((((((((((((((((((((((getTaskId() == null ? 0 : getTaskId().hashCode()) + 31) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getLastModifiedDate() == null ? 0 : getLastModifiedDate().hashCode())) * 31) + (getTemplateBody() == null ? 0 : getTemplateBody().hashCode())) * 31) + (getInputFileBucket() == null ? 0 : getInputFileBucket().hashCode())) * 31) + (getInputFileKey() == null ? 0 : getInputFileKey().hashCode())) * 31) + (getRoleArn() == null ? 0 : getRoleArn().hashCode())) * 31) + (getStatus() == null ? 0 : getStatus().hashCode())) * 31) + (getMessage() == null ? 0 : getMessage().hashCode())) * 31) + (getSuccessCount() == null ? 0 : getSuccessCount().hashCode())) * 31) + (getFailureCount() == null ? 0 : getFailureCount().hashCode())) * 31) + (getPercentageProgress() != null ? getPercentageProgress().hashCode() : 0);
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setFailureCount(Integer num) {
        this.failureCount = num;
    }

    public void setInputFileBucket(String str) {
        this.inputFileBucket = str;
    }

    public void setInputFileKey(String str) {
        this.inputFileKey = str;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setPercentageProgress(Integer num) {
        this.percentageProgress = num;
    }

    public void setRoleArn(String str) {
        this.roleArn = str;
    }

    public void setStatus(Status status) {
        this.status = status.toString();
    }

    public void setSuccessCount(Integer num) {
        this.successCount = num;
    }

    public void setTaskId(String str) {
        this.taskId = str;
    }

    public void setTemplateBody(String str) {
        this.templateBody = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getTaskId() != null) {
            sb.append("taskId: " + getTaskId() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate() + ",");
        }
        if (getLastModifiedDate() != null) {
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        }
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
            sb.append("roleArn: " + getRoleArn() + ",");
        }
        if (getStatus() != null) {
            sb.append("status: " + getStatus() + ",");
        }
        if (getMessage() != null) {
            sb.append("message: " + getMessage() + ",");
        }
        if (getSuccessCount() != null) {
            sb.append("successCount: " + getSuccessCount() + ",");
        }
        if (getFailureCount() != null) {
            sb.append("failureCount: " + getFailureCount() + ",");
        }
        if (getPercentageProgress() != null) {
            sb.append("percentageProgress: " + getPercentageProgress());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public DescribeThingRegistrationTaskResult withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public DescribeThingRegistrationTaskResult withFailureCount(Integer num) {
        this.failureCount = num;
        return this;
    }

    public DescribeThingRegistrationTaskResult withInputFileBucket(String str) {
        this.inputFileBucket = str;
        return this;
    }

    public DescribeThingRegistrationTaskResult withInputFileKey(String str) {
        this.inputFileKey = str;
        return this;
    }

    public DescribeThingRegistrationTaskResult withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }

    public DescribeThingRegistrationTaskResult withMessage(String str) {
        this.message = str;
        return this;
    }

    public DescribeThingRegistrationTaskResult withPercentageProgress(Integer num) {
        this.percentageProgress = num;
        return this;
    }

    public DescribeThingRegistrationTaskResult withRoleArn(String str) {
        this.roleArn = str;
        return this;
    }

    public DescribeThingRegistrationTaskResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    public DescribeThingRegistrationTaskResult withSuccessCount(Integer num) {
        this.successCount = num;
        return this;
    }

    public DescribeThingRegistrationTaskResult withTaskId(String str) {
        this.taskId = str;
        return this;
    }

    public DescribeThingRegistrationTaskResult withTemplateBody(String str) {
        this.templateBody = str;
        return this;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public DescribeThingRegistrationTaskResult withStatus(String str) {
        this.status = str;
        return this;
    }
}
