package com.amazonaws.services.iot.model;

import java.io.Serializable;
import java.util.Date;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BehaviorModelTrainingSummary implements Serializable {
    private String behaviorName;
    private Double datapointsCollectionPercentage;
    private Date lastModelRefreshDate;
    private String modelStatus;
    private String securityProfileName;
    private Date trainingDataCollectionStartDate;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BehaviorModelTrainingSummary)) {
            return false;
        }
        BehaviorModelTrainingSummary behaviorModelTrainingSummary = (BehaviorModelTrainingSummary) obj;
        if ((behaviorModelTrainingSummary.getSecurityProfileName() == null) ^ (getSecurityProfileName() == null)) {
            return false;
        }
        if (behaviorModelTrainingSummary.getSecurityProfileName() != null && !behaviorModelTrainingSummary.getSecurityProfileName().equals(getSecurityProfileName())) {
            return false;
        }
        if ((behaviorModelTrainingSummary.getBehaviorName() == null) ^ (getBehaviorName() == null)) {
            return false;
        }
        if (behaviorModelTrainingSummary.getBehaviorName() != null && !behaviorModelTrainingSummary.getBehaviorName().equals(getBehaviorName())) {
            return false;
        }
        if ((behaviorModelTrainingSummary.getTrainingDataCollectionStartDate() == null) ^ (getTrainingDataCollectionStartDate() == null)) {
            return false;
        }
        if (behaviorModelTrainingSummary.getTrainingDataCollectionStartDate() != null && !behaviorModelTrainingSummary.getTrainingDataCollectionStartDate().equals(getTrainingDataCollectionStartDate())) {
            return false;
        }
        if ((behaviorModelTrainingSummary.getModelStatus() == null) ^ (getModelStatus() == null)) {
            return false;
        }
        if (behaviorModelTrainingSummary.getModelStatus() != null && !behaviorModelTrainingSummary.getModelStatus().equals(getModelStatus())) {
            return false;
        }
        if ((behaviorModelTrainingSummary.getDatapointsCollectionPercentage() == null) ^ (getDatapointsCollectionPercentage() == null)) {
            return false;
        }
        if (behaviorModelTrainingSummary.getDatapointsCollectionPercentage() != null && !behaviorModelTrainingSummary.getDatapointsCollectionPercentage().equals(getDatapointsCollectionPercentage())) {
            return false;
        }
        if ((behaviorModelTrainingSummary.getLastModelRefreshDate() == null) ^ (getLastModelRefreshDate() == null)) {
            return false;
        }
        return behaviorModelTrainingSummary.getLastModelRefreshDate() == null || behaviorModelTrainingSummary.getLastModelRefreshDate().equals(getLastModelRefreshDate());
    }

    public String getBehaviorName() {
        return this.behaviorName;
    }

    public Double getDatapointsCollectionPercentage() {
        return this.datapointsCollectionPercentage;
    }

    public Date getLastModelRefreshDate() {
        return this.lastModelRefreshDate;
    }

    public String getModelStatus() {
        return this.modelStatus;
    }

    public String getSecurityProfileName() {
        return this.securityProfileName;
    }

    public Date getTrainingDataCollectionStartDate() {
        return this.trainingDataCollectionStartDate;
    }

    public int hashCode() {
        return (((((((((((getSecurityProfileName() == null ? 0 : getSecurityProfileName().hashCode()) + 31) * 31) + (getBehaviorName() == null ? 0 : getBehaviorName().hashCode())) * 31) + (getTrainingDataCollectionStartDate() == null ? 0 : getTrainingDataCollectionStartDate().hashCode())) * 31) + (getModelStatus() == null ? 0 : getModelStatus().hashCode())) * 31) + (getDatapointsCollectionPercentage() == null ? 0 : getDatapointsCollectionPercentage().hashCode())) * 31) + (getLastModelRefreshDate() != null ? getLastModelRefreshDate().hashCode() : 0);
    }

    public void setBehaviorName(String str) {
        this.behaviorName = str;
    }

    public void setDatapointsCollectionPercentage(Double d) {
        this.datapointsCollectionPercentage = d;
    }

    public void setLastModelRefreshDate(Date date) {
        this.lastModelRefreshDate = date;
    }

    public void setModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
    }

    public void setSecurityProfileName(String str) {
        this.securityProfileName = str;
    }

    public void setTrainingDataCollectionStartDate(Date date) {
        this.trainingDataCollectionStartDate = date;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSecurityProfileName() != null) {
            sb.append("securityProfileName: " + getSecurityProfileName() + ",");
        }
        if (getBehaviorName() != null) {
            sb.append("behaviorName: " + getBehaviorName() + ",");
        }
        if (getTrainingDataCollectionStartDate() != null) {
            sb.append("trainingDataCollectionStartDate: " + getTrainingDataCollectionStartDate() + ",");
        }
        if (getModelStatus() != null) {
            sb.append("modelStatus: " + getModelStatus() + ",");
        }
        if (getDatapointsCollectionPercentage() != null) {
            sb.append("datapointsCollectionPercentage: " + getDatapointsCollectionPercentage() + ",");
        }
        if (getLastModelRefreshDate() != null) {
            sb.append("lastModelRefreshDate: " + getLastModelRefreshDate());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public BehaviorModelTrainingSummary withBehaviorName(String str) {
        this.behaviorName = str;
        return this;
    }

    public BehaviorModelTrainingSummary withDatapointsCollectionPercentage(Double d) {
        this.datapointsCollectionPercentage = d;
        return this;
    }

    public BehaviorModelTrainingSummary withLastModelRefreshDate(Date date) {
        this.lastModelRefreshDate = date;
        return this;
    }

    public BehaviorModelTrainingSummary withModelStatus(ModelStatus modelStatus) {
        this.modelStatus = modelStatus.toString();
        return this;
    }

    public BehaviorModelTrainingSummary withSecurityProfileName(String str) {
        this.securityProfileName = str;
        return this;
    }

    public BehaviorModelTrainingSummary withTrainingDataCollectionStartDate(Date date) {
        this.trainingDataCollectionStartDate = date;
        return this;
    }

    public void setModelStatus(String str) {
        this.modelStatus = str;
    }

    public BehaviorModelTrainingSummary withModelStatus(String str) {
        this.modelStatus = str;
        return this;
    }
}
