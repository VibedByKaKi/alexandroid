package com.amazon.identity.auth.device;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class oq {

    /* renamed from: a, reason: collision with root package name */
    public final String f864a;
    public final List b;
    public final long c;

    public oq(String str, List list, long j) {
        this.f864a = str;
        this.b = list;
        this.c = j;
    }

    public static oq a(ContentValues contentValues) {
        String asString = contentValues.getAsString("source_account_id");
        String asString2 = contentValues.getAsString("target_directed_ids");
        Long asLong = contentValues.getAsLong("change_timestamp");
        if (asString == null || asString2 == null || asLong == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Missing required fields in ContentValues");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(asString2);
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return new oq(asString, arrayList, asLong.longValue());
        } catch (JSONException e) {
            Single$$ExternalSyntheticBUOutline0.m("Invalid target_directed_ids JSON", e);
            return null;
        }
    }

    public final String a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("source_account_id", this.f864a);
            jSONObject.put("target_directed_ids", new JSONArray((Collection<?>) this.b));
            jSONObject.put("change_timestamp", this.c);
            return jSONObject.toString();
        } catch (JSONException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to serialize TransitionRecord", e);
            return null;
        }
    }

    public static oq a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("source_account_id");
            JSONArray jSONArray = jSONObject.getJSONArray("target_directed_ids");
            long j = jSONObject.getLong("change_timestamp");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return new oq(string, arrayList, j);
        } catch (JSONException e) {
            Single$$ExternalSyntheticBUOutline0.m("Invalid TransitionRecord JSON", e);
            return null;
        }
    }
}
