package com.dee.app.contacts.interfaces.models.apis.batchupdatecontacts;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class BatchUpdateLABContactsRequest {
    private BatchUpdateLABContactsBody body;
    private BatchUpdateLABContactsQueryConfig queryConfig;
    private String userId;

    public BatchUpdateLABContactsRequest(String str, BatchUpdateLABContactsQueryConfig batchUpdateLABContactsQueryConfig, BatchUpdateLABContactsBody batchUpdateLABContactsBody) {
        this.userId = str;
        this.queryConfig = batchUpdateLABContactsQueryConfig;
        this.body = batchUpdateLABContactsBody;
    }

    public BatchUpdateLABContactsBody getBody() {
        return this.body;
    }

    public BatchUpdateLABContactsQueryConfig getQueryConfig() {
        return this.queryConfig;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setBody(BatchUpdateLABContactsBody batchUpdateLABContactsBody) {
        this.body = batchUpdateLABContactsBody;
    }

    public void setQueryConfig(BatchUpdateLABContactsQueryConfig batchUpdateLABContactsQueryConfig) {
        this.queryConfig = batchUpdateLABContactsQueryConfig;
    }

    public void setUserId(String str) {
        this.userId = str;
    }
}
