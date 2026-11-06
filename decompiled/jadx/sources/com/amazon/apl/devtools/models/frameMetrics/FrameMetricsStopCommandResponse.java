package com.amazon.apl.devtools.models.frameMetrics;

import com.amazon.apl.devtools.models.common.SessionCommandResponse;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FrameMetricsStopCommandResponse extends SessionCommandResponse {
    private static final String TAG = "FrameMetricsStopCommandResponse";
    private List<JSONObject> mFramestatsList;

    public FrameMetricsStopCommandResponse(int i, String str, List<JSONObject> list) {
        super(i, str);
        this.mFramestatsList = list;
    }

    @Override // com.amazon.apl.devtools.models.common.SessionCommandResponse, com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (JSONObject jSONObject3 : this.mFramestatsList) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("begin", jSONObject3.getLong("begin"));
            jSONObject4.put("end", jSONObject3.getLong("end"));
            jSONArray.put(jSONObject4);
        }
        jSONObject2.put("framestats", jSONArray);
        jSONObject.put("value", jSONObject2);
        return super.toJSONObject().put("result", jSONObject);
    }
}
