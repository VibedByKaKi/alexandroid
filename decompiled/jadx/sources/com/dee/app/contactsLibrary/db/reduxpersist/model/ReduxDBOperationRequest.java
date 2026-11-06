package com.dee.app.contactsLibrary.db.reduxpersist.model;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class ReduxDBOperationRequest<OperationPayload> {
    private ReduxDBOperationType operationType;
    private OperationPayload payload;

    public ReduxDBOperationType getOperationType() {
        return this.operationType;
    }

    public OperationPayload getPayload() {
        return this.payload;
    }

    public void setOperationType(ReduxDBOperationType reduxDBOperationType) {
        this.operationType = reduxDBOperationType;
    }

    public void setPayload(OperationPayload operationpayload) {
        this.payload = operationpayload;
    }
}
