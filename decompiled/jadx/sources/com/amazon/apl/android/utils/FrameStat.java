package com.amazon.apl.android.utils;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FrameStat {
    long begin;
    long end;

    public FrameStat(long j, long j2) {
        this.begin = j;
        this.end = j2;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("begin", this.begin);
        jSONObject.put("end", this.end);
        return jSONObject;
    }
}
