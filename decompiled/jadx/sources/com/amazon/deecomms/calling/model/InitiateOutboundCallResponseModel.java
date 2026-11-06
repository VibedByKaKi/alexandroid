package com.amazon.deecomms.calling.model;

import androidx.annotation.NonNull;
import com.amazon.deecomms.calling.enums.BeginCallStatusCode;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class InitiateOutboundCallResponseModel {

    @JsonProperty("message")
    private String message;

    @JsonProperty("payload")
    private String payload;

    @JsonProperty("status")
    private BeginCallStatusCode status;

    public InitiateOutboundCallResponseModel(@NonNull @JsonProperty("message") String str, @NonNull @JsonProperty("status") BeginCallStatusCode beginCallStatusCode, @NonNull @JsonProperty("payload") String str2) {
        this.message = str;
        this.status = beginCallStatusCode;
        this.payload = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InitiateOutboundCallResponseModel)) {
            return false;
        }
        InitiateOutboundCallResponseModel initiateOutboundCallResponseModel = (InitiateOutboundCallResponseModel) obj;
        return Objects.equal(this.message, initiateOutboundCallResponseModel.message) && Objects.equal(this.status, initiateOutboundCallResponseModel.status) && Objects.equal(this.payload, initiateOutboundCallResponseModel.payload);
    }

    public String getMessage() {
        return this.message;
    }

    public String getPayload() {
        return this.payload;
    }

    public BeginCallStatusCode getStatus() {
        return this.status;
    }

    public int hashCode() {
        return Objects.hashCode(this.message, this.status, this.payload);
    }

    @NonNull
    public String toString() {
        return "Status : " + this.status + "\nPayload : " + this.payload;
    }
}
