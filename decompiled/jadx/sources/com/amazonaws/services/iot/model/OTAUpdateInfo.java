package com.amazonaws.services.iot.model;

import com.amazon.credentiallocker.CredentialConfig$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class OTAUpdateInfo implements Serializable {
    private Map<String, String> additionalParameters;
    private String awsIotJobArn;
    private String awsIotJobId;
    private AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig;
    private AwsJobPresignedUrlConfig awsJobPresignedUrlConfig;
    private Date creationDate;
    private String description;
    private ErrorInfo errorInfo;
    private Date lastModifiedDate;
    private String otaUpdateArn;
    private List<OTAUpdateFile> otaUpdateFiles;
    private String otaUpdateId;
    private String otaUpdateStatus;
    private List<String> protocols;
    private String targetSelection;
    private List<String> targets;

    public OTAUpdateInfo addadditionalParametersEntry(String str, String str2) {
        if (this.additionalParameters == null) {
            this.additionalParameters = new HashMap();
        }
        if (this.additionalParameters.containsKey(str)) {
            Single$$ExternalSyntheticBUOutline0.m$3(CredentialConfig$$ExternalSyntheticOutline0.m(str, ") are provided.", new StringBuilder("Duplicated keys (")));
            return null;
        }
        this.additionalParameters.put(str, str2);
        return this;
    }

    public OTAUpdateInfo clearadditionalParametersEntries() {
        this.additionalParameters = null;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof OTAUpdateInfo)) {
            return false;
        }
        OTAUpdateInfo oTAUpdateInfo = (OTAUpdateInfo) obj;
        if ((oTAUpdateInfo.getOtaUpdateId() == null) ^ (getOtaUpdateId() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getOtaUpdateId() != null && !oTAUpdateInfo.getOtaUpdateId().equals(getOtaUpdateId())) {
            return false;
        }
        if ((oTAUpdateInfo.getOtaUpdateArn() == null) ^ (getOtaUpdateArn() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getOtaUpdateArn() != null && !oTAUpdateInfo.getOtaUpdateArn().equals(getOtaUpdateArn())) {
            return false;
        }
        if ((oTAUpdateInfo.getCreationDate() == null) ^ (getCreationDate() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getCreationDate() != null && !oTAUpdateInfo.getCreationDate().equals(getCreationDate())) {
            return false;
        }
        if ((oTAUpdateInfo.getLastModifiedDate() == null) ^ (getLastModifiedDate() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getLastModifiedDate() != null && !oTAUpdateInfo.getLastModifiedDate().equals(getLastModifiedDate())) {
            return false;
        }
        if ((oTAUpdateInfo.getDescription() == null) ^ (getDescription() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getDescription() != null && !oTAUpdateInfo.getDescription().equals(getDescription())) {
            return false;
        }
        if ((oTAUpdateInfo.getTargets() == null) ^ (getTargets() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getTargets() != null && !oTAUpdateInfo.getTargets().equals(getTargets())) {
            return false;
        }
        if ((oTAUpdateInfo.getProtocols() == null) ^ (getProtocols() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getProtocols() != null && !oTAUpdateInfo.getProtocols().equals(getProtocols())) {
            return false;
        }
        if ((oTAUpdateInfo.getAwsJobExecutionsRolloutConfig() == null) ^ (getAwsJobExecutionsRolloutConfig() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getAwsJobExecutionsRolloutConfig() != null && !oTAUpdateInfo.getAwsJobExecutionsRolloutConfig().equals(getAwsJobExecutionsRolloutConfig())) {
            return false;
        }
        if ((oTAUpdateInfo.getAwsJobPresignedUrlConfig() == null) ^ (getAwsJobPresignedUrlConfig() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getAwsJobPresignedUrlConfig() != null && !oTAUpdateInfo.getAwsJobPresignedUrlConfig().equals(getAwsJobPresignedUrlConfig())) {
            return false;
        }
        if ((oTAUpdateInfo.getTargetSelection() == null) ^ (getTargetSelection() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getTargetSelection() != null && !oTAUpdateInfo.getTargetSelection().equals(getTargetSelection())) {
            return false;
        }
        if ((oTAUpdateInfo.getOtaUpdateFiles() == null) ^ (getOtaUpdateFiles() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getOtaUpdateFiles() != null && !oTAUpdateInfo.getOtaUpdateFiles().equals(getOtaUpdateFiles())) {
            return false;
        }
        if ((oTAUpdateInfo.getOtaUpdateStatus() == null) ^ (getOtaUpdateStatus() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getOtaUpdateStatus() != null && !oTAUpdateInfo.getOtaUpdateStatus().equals(getOtaUpdateStatus())) {
            return false;
        }
        if ((oTAUpdateInfo.getAwsIotJobId() == null) ^ (getAwsIotJobId() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getAwsIotJobId() != null && !oTAUpdateInfo.getAwsIotJobId().equals(getAwsIotJobId())) {
            return false;
        }
        if ((oTAUpdateInfo.getAwsIotJobArn() == null) ^ (getAwsIotJobArn() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getAwsIotJobArn() != null && !oTAUpdateInfo.getAwsIotJobArn().equals(getAwsIotJobArn())) {
            return false;
        }
        if ((oTAUpdateInfo.getErrorInfo() == null) ^ (getErrorInfo() == null)) {
            return false;
        }
        if (oTAUpdateInfo.getErrorInfo() != null && !oTAUpdateInfo.getErrorInfo().equals(getErrorInfo())) {
            return false;
        }
        if ((oTAUpdateInfo.getAdditionalParameters() == null) ^ (getAdditionalParameters() == null)) {
            return false;
        }
        return oTAUpdateInfo.getAdditionalParameters() == null || oTAUpdateInfo.getAdditionalParameters().equals(getAdditionalParameters());
    }

    public Map<String, String> getAdditionalParameters() {
        return this.additionalParameters;
    }

    public String getAwsIotJobArn() {
        return this.awsIotJobArn;
    }

    public String getAwsIotJobId() {
        return this.awsIotJobId;
    }

    public AwsJobExecutionsRolloutConfig getAwsJobExecutionsRolloutConfig() {
        return this.awsJobExecutionsRolloutConfig;
    }

    public AwsJobPresignedUrlConfig getAwsJobPresignedUrlConfig() {
        return this.awsJobPresignedUrlConfig;
    }

    public Date getCreationDate() {
        return this.creationDate;
    }

    public String getDescription() {
        return this.description;
    }

    public ErrorInfo getErrorInfo() {
        return this.errorInfo;
    }

    public Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public String getOtaUpdateArn() {
        return this.otaUpdateArn;
    }

    public List<OTAUpdateFile> getOtaUpdateFiles() {
        return this.otaUpdateFiles;
    }

    public String getOtaUpdateId() {
        return this.otaUpdateId;
    }

    public String getOtaUpdateStatus() {
        return this.otaUpdateStatus;
    }

    public List<String> getProtocols() {
        return this.protocols;
    }

    public String getTargetSelection() {
        return this.targetSelection;
    }

    public List<String> getTargets() {
        return this.targets;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((getOtaUpdateId() == null ? 0 : getOtaUpdateId().hashCode()) + 31) * 31) + (getOtaUpdateArn() == null ? 0 : getOtaUpdateArn().hashCode())) * 31) + (getCreationDate() == null ? 0 : getCreationDate().hashCode())) * 31) + (getLastModifiedDate() == null ? 0 : getLastModifiedDate().hashCode())) * 31) + (getDescription() == null ? 0 : getDescription().hashCode())) * 31) + (getTargets() == null ? 0 : getTargets().hashCode())) * 31) + (getProtocols() == null ? 0 : getProtocols().hashCode())) * 31) + (getAwsJobExecutionsRolloutConfig() == null ? 0 : getAwsJobExecutionsRolloutConfig().hashCode())) * 31) + (getAwsJobPresignedUrlConfig() == null ? 0 : getAwsJobPresignedUrlConfig().hashCode())) * 31) + (getTargetSelection() == null ? 0 : getTargetSelection().hashCode())) * 31) + (getOtaUpdateFiles() == null ? 0 : getOtaUpdateFiles().hashCode())) * 31) + (getOtaUpdateStatus() == null ? 0 : getOtaUpdateStatus().hashCode())) * 31) + (getAwsIotJobId() == null ? 0 : getAwsIotJobId().hashCode())) * 31) + (getAwsIotJobArn() == null ? 0 : getAwsIotJobArn().hashCode())) * 31) + (getErrorInfo() == null ? 0 : getErrorInfo().hashCode())) * 31) + (getAdditionalParameters() != null ? getAdditionalParameters().hashCode() : 0);
    }

    public void setAdditionalParameters(Map<String, String> map) {
        this.additionalParameters = map;
    }

    public void setAwsIotJobArn(String str) {
        this.awsIotJobArn = str;
    }

    public void setAwsIotJobId(String str) {
        this.awsIotJobId = str;
    }

    public void setAwsJobExecutionsRolloutConfig(AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        this.awsJobExecutionsRolloutConfig = awsJobExecutionsRolloutConfig;
    }

    public void setAwsJobPresignedUrlConfig(AwsJobPresignedUrlConfig awsJobPresignedUrlConfig) {
        this.awsJobPresignedUrlConfig = awsJobPresignedUrlConfig;
    }

    public void setCreationDate(Date date) {
        this.creationDate = date;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public void setLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
    }

    public void setOtaUpdateArn(String str) {
        this.otaUpdateArn = str;
    }

    public void setOtaUpdateFiles(Collection<OTAUpdateFile> collection) {
        if (collection == null) {
            this.otaUpdateFiles = null;
        } else {
            this.otaUpdateFiles = new ArrayList(collection);
        }
    }

    public void setOtaUpdateId(String str) {
        this.otaUpdateId = str;
    }

    public void setOtaUpdateStatus(OTAUpdateStatus oTAUpdateStatus) {
        this.otaUpdateStatus = oTAUpdateStatus.toString();
    }

    public void setProtocols(Collection<String> collection) {
        if (collection == null) {
            this.protocols = null;
        } else {
            this.protocols = new ArrayList(collection);
        }
    }

    public void setTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
    }

    public void setTargets(Collection<String> collection) {
        if (collection == null) {
            this.targets = null;
        } else {
            this.targets = new ArrayList(collection);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getOtaUpdateId() != null) {
            sb.append("otaUpdateId: " + getOtaUpdateId() + ",");
        }
        if (getOtaUpdateArn() != null) {
            sb.append("otaUpdateArn: " + getOtaUpdateArn() + ",");
        }
        if (getCreationDate() != null) {
            sb.append("creationDate: " + getCreationDate() + ",");
        }
        if (getLastModifiedDate() != null) {
            sb.append("lastModifiedDate: " + getLastModifiedDate() + ",");
        }
        if (getDescription() != null) {
            sb.append("description: " + getDescription() + ",");
        }
        if (getTargets() != null) {
            sb.append("targets: " + getTargets() + ",");
        }
        if (getProtocols() != null) {
            sb.append("protocols: " + getProtocols() + ",");
        }
        if (getAwsJobExecutionsRolloutConfig() != null) {
            sb.append("awsJobExecutionsRolloutConfig: " + getAwsJobExecutionsRolloutConfig() + ",");
        }
        if (getAwsJobPresignedUrlConfig() != null) {
            sb.append("awsJobPresignedUrlConfig: " + getAwsJobPresignedUrlConfig() + ",");
        }
        if (getTargetSelection() != null) {
            sb.append("targetSelection: " + getTargetSelection() + ",");
        }
        if (getOtaUpdateFiles() != null) {
            sb.append("otaUpdateFiles: " + getOtaUpdateFiles() + ",");
        }
        if (getOtaUpdateStatus() != null) {
            sb.append("otaUpdateStatus: " + getOtaUpdateStatus() + ",");
        }
        if (getAwsIotJobId() != null) {
            sb.append("awsIotJobId: " + getAwsIotJobId() + ",");
        }
        if (getAwsIotJobArn() != null) {
            sb.append("awsIotJobArn: " + getAwsIotJobArn() + ",");
        }
        if (getErrorInfo() != null) {
            sb.append("errorInfo: " + getErrorInfo() + ",");
        }
        if (getAdditionalParameters() != null) {
            sb.append("additionalParameters: " + getAdditionalParameters());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public OTAUpdateInfo withAdditionalParameters(Map<String, String> map) {
        this.additionalParameters = map;
        return this;
    }

    public OTAUpdateInfo withAwsIotJobArn(String str) {
        this.awsIotJobArn = str;
        return this;
    }

    public OTAUpdateInfo withAwsIotJobId(String str) {
        this.awsIotJobId = str;
        return this;
    }

    public OTAUpdateInfo withAwsJobExecutionsRolloutConfig(AwsJobExecutionsRolloutConfig awsJobExecutionsRolloutConfig) {
        this.awsJobExecutionsRolloutConfig = awsJobExecutionsRolloutConfig;
        return this;
    }

    public OTAUpdateInfo withAwsJobPresignedUrlConfig(AwsJobPresignedUrlConfig awsJobPresignedUrlConfig) {
        this.awsJobPresignedUrlConfig = awsJobPresignedUrlConfig;
        return this;
    }

    public OTAUpdateInfo withCreationDate(Date date) {
        this.creationDate = date;
        return this;
    }

    public OTAUpdateInfo withDescription(String str) {
        this.description = str;
        return this;
    }

    public OTAUpdateInfo withErrorInfo(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public OTAUpdateInfo withLastModifiedDate(Date date) {
        this.lastModifiedDate = date;
        return this;
    }

    public OTAUpdateInfo withOtaUpdateArn(String str) {
        this.otaUpdateArn = str;
        return this;
    }

    public OTAUpdateInfo withOtaUpdateFiles(OTAUpdateFile... oTAUpdateFileArr) {
        if (getOtaUpdateFiles() == null) {
            this.otaUpdateFiles = new ArrayList(oTAUpdateFileArr.length);
        }
        for (OTAUpdateFile oTAUpdateFile : oTAUpdateFileArr) {
            this.otaUpdateFiles.add(oTAUpdateFile);
        }
        return this;
    }

    public OTAUpdateInfo withOtaUpdateId(String str) {
        this.otaUpdateId = str;
        return this;
    }

    public OTAUpdateInfo withOtaUpdateStatus(OTAUpdateStatus oTAUpdateStatus) {
        this.otaUpdateStatus = oTAUpdateStatus.toString();
        return this;
    }

    public OTAUpdateInfo withProtocols(String... strArr) {
        if (getProtocols() == null) {
            this.protocols = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.protocols.add(str);
        }
        return this;
    }

    public OTAUpdateInfo withTargetSelection(TargetSelection targetSelection) {
        this.targetSelection = targetSelection.toString();
        return this;
    }

    public OTAUpdateInfo withTargets(String... strArr) {
        if (getTargets() == null) {
            this.targets = new ArrayList(strArr.length);
        }
        for (String str : strArr) {
            this.targets.add(str);
        }
        return this;
    }

    public void setOtaUpdateStatus(String str) {
        this.otaUpdateStatus = str;
    }

    public void setTargetSelection(String str) {
        this.targetSelection = str;
    }

    public OTAUpdateInfo withOtaUpdateStatus(String str) {
        this.otaUpdateStatus = str;
        return this;
    }

    public OTAUpdateInfo withTargetSelection(String str) {
        this.targetSelection = str;
        return this;
    }

    public OTAUpdateInfo withOtaUpdateFiles(Collection<OTAUpdateFile> collection) {
        setOtaUpdateFiles(collection);
        return this;
    }

    public OTAUpdateInfo withProtocols(Collection<String> collection) {
        setProtocols(collection);
        return this;
    }

    public OTAUpdateInfo withTargets(Collection<String> collection) {
        setTargets(collection);
        return this;
    }
}
