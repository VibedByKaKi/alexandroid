package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;
import org.apache.commons.text.StringSubstitutor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ChallengeResponseType implements Serializable {
    private String challengeName;
    private String challengeResponse;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof ChallengeResponseType)) {
            return false;
        }
        ChallengeResponseType challengeResponseType = (ChallengeResponseType) obj;
        if ((challengeResponseType.getChallengeName() == null) ^ (getChallengeName() == null)) {
            return false;
        }
        if (challengeResponseType.getChallengeName() != null && !challengeResponseType.getChallengeName().equals(getChallengeName())) {
            return false;
        }
        if ((challengeResponseType.getChallengeResponse() == null) ^ (getChallengeResponse() == null)) {
            return false;
        }
        return challengeResponseType.getChallengeResponse() == null || challengeResponseType.getChallengeResponse().equals(getChallengeResponse());
    }

    public String getChallengeName() {
        return this.challengeName;
    }

    public String getChallengeResponse() {
        return this.challengeResponse;
    }

    public int hashCode() {
        return (((getChallengeName() == null ? 0 : getChallengeName().hashCode()) + 31) * 31) + (getChallengeResponse() != null ? getChallengeResponse().hashCode() : 0);
    }

    public void setChallengeName(ChallengeName challengeName) {
        this.challengeName = challengeName.toString();
    }

    public void setChallengeResponse(ChallengeResponse challengeResponse) {
        this.challengeResponse = challengeResponse.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        if (getChallengeName() != null) {
            sb.append("ChallengeName: " + getChallengeName() + ",");
        }
        if (getChallengeResponse() != null) {
            sb.append("ChallengeResponse: " + getChallengeResponse());
        }
        sb.append(StringSubstitutor.DEFAULT_VAR_END);
        return sb.toString();
    }

    public ChallengeResponseType withChallengeName(ChallengeName challengeName) {
        this.challengeName = challengeName.toString();
        return this;
    }

    public ChallengeResponseType withChallengeResponse(ChallengeResponse challengeResponse) {
        this.challengeResponse = challengeResponse.toString();
        return this;
    }

    public void setChallengeName(String str) {
        this.challengeName = str;
    }

    public void setChallengeResponse(String str) {
        this.challengeResponse = str;
    }

    public ChallengeResponseType withChallengeName(String str) {
        this.challengeName = str;
        return this;
    }

    public ChallengeResponseType withChallengeResponse(String str) {
        this.challengeResponse = str;
        return this;
    }
}
