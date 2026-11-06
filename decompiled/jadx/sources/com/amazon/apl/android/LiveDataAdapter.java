package com.amazon.apl.android;

import com.amazon.alexaext.ILiveDataUpdateCallback;
import com.dee.app.metrics.MetricsConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class LiveDataAdapter {
    protected final String mName;
    protected final ILiveDataUpdateCallback mUpdateCallback;
    protected final String mUri;

    public LiveDataAdapter(ILiveDataUpdateCallback iLiveDataUpdateCallback, String str, String str2) {
        this.mUpdateCallback = iLiveDataUpdateCallback;
        this.mUri = str;
        this.mName = str2;
    }

    public JSONObject getLiveDataDefinition() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("type", this.mName + "Type");
            jSONObject.put("name", this.mName);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public JSONObject getTypeDefinition() {
        return new JSONObject();
    }

    public boolean sendUpdate(JSONArray jSONArray) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", "1.0");
            jSONObject.put(MetricsConstants.NativeFetch.METHOD, "LiveDataUpdate");
            jSONObject.put("target", this.mUri);
            jSONObject.put("name", this.mName);
            jSONObject.put("operations", jSONArray);
            return this.mUpdateCallback.invokeLiveDataUpdate(this.mUri, jSONObject.toString());
        } catch (JSONException unused) {
            return false;
        }
    }
}
