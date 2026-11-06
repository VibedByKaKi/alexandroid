package com.dee.app.contactsLibrary.db.reduxpersist.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@JsonIgnoreProperties(ignoreUnknown = true)
/* loaded from: classes6.dex */
public class ReduxDBOperationResponse<Output> {

    @JsonProperty("Output")
    private Output output;

    @JsonProperty("status")
    private DBOperationResponseStatus status;

    public Output getOutput() {
        return this.output;
    }

    public DBOperationResponseStatus getStatus() {
        return this.status;
    }

    public void setOutput(Output output) {
        this.output = output;
    }

    public void setStatus(DBOperationResponseStatus dBOperationResponseStatus) {
        this.status = dBOperationResponseStatus;
    }
}
