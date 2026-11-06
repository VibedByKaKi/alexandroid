package com.amazon.apl.devtools.models.common;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DocumentDomainResponse extends SessionCommandResponse {
    private final JSONObject mResult;

    public DocumentDomainResponse(int i, String str, JSONObject jSONObject) {
        super(i, str);
        this.mResult = jSONObject;
    }

    @Override // com.amazon.apl.devtools.models.common.SessionCommandResponse, com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        return this.mResult == null ? super.toJSONObject() : super.toJSONObject().put("result", this.mResult);
    }

    public DocumentDomainResponse(int i, String str) {
        this(i, str, null);
    }
}
