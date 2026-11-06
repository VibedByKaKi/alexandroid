package com.amazon.apl.devtools.models.processor;

import com.amazon.apl.devtools.models.common.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SystemInfoGetEnvironmentMemoryCommandResponse extends Response {
    final long availableMemory;
    final long totalMemory;

    public SystemInfoGetEnvironmentMemoryCommandResponse(int i, long j, long j2) {
        super(i);
        this.totalMemory = j;
        this.availableMemory = j2;
    }

    @Override // com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("total", this.totalMemory);
        jSONObject.put("available", this.availableMemory);
        return super.toJSONObject().put("result", jSONObject);
    }
}
