package com.amazon.deecomms.calling.model;

import androidx.autofill.HintConstants;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class EndpointConfigurationInfo {

    @JsonProperty("credential")
    private String credential;

    @JsonProperty("url")
    private String url;

    @JsonProperty(HintConstants.AUTOFILL_HINT_USERNAME)
    private String username;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EndpointConfigurationInfo)) {
            return false;
        }
        EndpointConfigurationInfo endpointConfigurationInfo = (EndpointConfigurationInfo) obj;
        return Objects.equal(this.url, endpointConfigurationInfo.url) && Objects.equal(this.username, endpointConfigurationInfo.username) && Objects.equal(this.credential, endpointConfigurationInfo.credential);
    }

    public String getCredential() {
        return this.credential;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        return Objects.hashCode(this.url, this.username, this.credential);
    }

    public void setCredential(String str) {
        this.credential = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("url", this.url).add(HintConstants.AUTOFILL_HINT_USERNAME, this.username).add("credential", this.credential).toString();
    }
}
