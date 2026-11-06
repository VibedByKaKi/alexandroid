package com.amazon.apl.devtools.models.processor;

import com.amazon.apl.devtools.models.common.Response;
import com.facebook.hermes.intl.Constants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SystemInfoGetApplicationProcessorUsageCommandResponse extends Response {
    private final float applicationProcessor;

    public SystemInfoGetApplicationProcessorUsageCommandResponse(int i, float f) {
        super(i);
        this.applicationProcessor = f;
    }

    @Override // com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Constants.COLLATION_OPTION_USAGE, this.applicationProcessor);
        return super.toJSONObject().put("result", jSONObject);
    }
}
