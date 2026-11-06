package com.amazon.deecomms.common.telemetry;

import com.amazon.deecomms.calling.incallcommands.models.InCallCommandModel$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TelemetryCredentials {

    @JsonProperty
    private String accessKey;

    @JsonProperty
    private String apiKey;

    @JsonProperty
    private String invokeUrl;

    @JsonProperty
    private String region;

    @JsonProperty
    private String secretKey;

    public String getAccessKey() {
        return this.accessKey;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getInvokeUrl() {
        return this.invokeUrl;
    }

    public String getRegion() {
        return this.region;
    }

    public String getSecretKey() {
        return this.secretKey;
    }

    public void setAccessKey(String str) {
        this.accessKey = str;
    }

    public void setApiKey(String str) {
        this.apiKey = str;
    }

    public void setInvokeUrl(String str) {
        this.invokeUrl = str;
    }

    public void setRegion(String str) {
        this.region = str;
    }

    public void setSecretKey(String str) {
        this.secretKey = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("TelemetryCredentials{invokeUrl='");
        sb.append(this.invokeUrl);
        sb.append("', apiKey='");
        sb.append(this.apiKey);
        sb.append("', accessKey='");
        sb.append(this.accessKey);
        sb.append("', secretKey='");
        sb.append(this.secretKey);
        sb.append("', region='");
        return InCallCommandModel$$ExternalSyntheticOutline0.m(sb, this.region, "'}");
    }
}
