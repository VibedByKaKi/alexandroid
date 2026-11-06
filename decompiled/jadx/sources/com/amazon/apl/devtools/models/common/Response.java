package com.amazon.apl.devtools.models.common;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Response implements IResponseParser {
    private final int mId;

    public Response(int i) {
        this.mId = i;
    }

    public int getId() {
        return this.mId;
    }

    @Override // com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        return new JSONObject().put("id", getId());
    }
}
