package com.amazon.apl.android.utils;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SessionRecorderEvent {
    JSONObject data;
    String eventType;
    long timestamp;

    public SessionRecorderEvent(long j, String str, JSONObject jSONObject) {
        new JSONObject();
        this.timestamp = j;
        this.eventType = str;
        this.data = jSONObject;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("timestamp", this.timestamp);
        jSONObject.put("eventType", this.eventType);
        jSONObject.put("data", this.data);
        return jSONObject;
    }
}
