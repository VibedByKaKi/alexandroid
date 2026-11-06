package com.amazon.apl.devtools.models.processor;

import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.Request;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SystemInfoGetApplicationProcessorUsageCommandRequestModel extends Request<SystemInfoGetApplicationProcessorUsageCommandResponse> {
    public SystemInfoGetApplicationProcessorUsageCommandRequestModel(JSONObject jSONObject) throws JSONException {
        super(CommandMethod.SYSTEM_INFO_GET_APPLICATION_PROCESSOR_USAGE, jSONObject);
    }
}
