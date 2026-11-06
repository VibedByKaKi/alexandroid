package com.amazonaws.services.iot.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class StartSigningJobParameter implements Serializable {
    private Destination destination;
    private String signingProfileName;
    private SigningProfileParameter signingProfileParameter;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof StartSigningJobParameter)) {
            return false;
        }
        StartSigningJobParameter startSigningJobParameter = (StartSigningJobParameter) obj;
        if ((startSigningJobParameter.getSigningProfileParameter() == null) ^ (getSigningProfileParameter() == null)) {
            return false;
        }
        if (startSigningJobParameter.getSigningProfileParameter() != null && !startSigningJobParameter.getSigningProfileParameter().equals(getSigningProfileParameter())) {
            return false;
        }
        if ((startSigningJobParameter.getSigningProfileName() == null) ^ (getSigningProfileName() == null)) {
            return false;
        }
        if (startSigningJobParameter.getSigningProfileName() != null && !startSigningJobParameter.getSigningProfileName().equals(getSigningProfileName())) {
            return false;
        }
        if ((startSigningJobParameter.getDestination() == null) ^ (getDestination() == null)) {
            return false;
        }
        return startSigningJobParameter.getDestination() == null || startSigningJobParameter.getDestination().equals(getDestination());
    }

    public Destination getDestination() {
        return this.destination;
    }

    public String getSigningProfileName() {
        return this.signingProfileName;
    }

    public SigningProfileParameter getSigningProfileParameter() {
        return this.signingProfileParameter;
    }

    public int hashCode() {
        return (((((getSigningProfileParameter() == null ? 0 : getSigningProfileParameter().hashCode()) + 31) * 31) + (getSigningProfileName() == null ? 0 : getSigningProfileName().hashCode())) * 31) + (getDestination() != null ? getDestination().hashCode() : 0);
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public void setSigningProfileName(String str) {
        this.signingProfileName = str;
    }

    public void setSigningProfileParameter(SigningProfileParameter signingProfileParameter) {
        this.signingProfileParameter = signingProfileParameter;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getSigningProfileParameter() != null) {
            sb.append("signingProfileParameter: " + getSigningProfileParameter() + ",");
        }
        if (getSigningProfileName() != null) {
            sb.append("signingProfileName: " + getSigningProfileName() + ",");
        }
        if (getDestination() != null) {
            sb.append("destination: " + getDestination());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public StartSigningJobParameter withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    public StartSigningJobParameter withSigningProfileName(String str) {
        this.signingProfileName = str;
        return this;
    }

    public StartSigningJobParameter withSigningProfileParameter(SigningProfileParameter signingProfileParameter) {
        this.signingProfileParameter = signingProfileParameter;
        return this;
    }
}
