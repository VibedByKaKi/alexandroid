package com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util;

import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes20.dex */
public class JSONBuilder implements JSONSerializable {
    private JSONObject json = new JSONObject();

    public JSONBuilder(Object obj) {
        if (obj != null) {
            withAttribute(RoadProbe.CLASS_PROPERTY, obj.getClass().getName());
            withAttribute("hashCode", Integer.toHexString(obj.hashCode()));
        }
    }

    @Override // com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.core.util.JSONSerializable
    public JSONObject toJSONObject() {
        return this.json;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    public String toString() {
        try {
            JSONObject jSONObject = this.json;
            if (jSONObject == null) {
                return "";
            }
            this = jSONObject.toString(4);
            return this;
        } catch (JSONException unused) {
            return this.json.toString();
        }
    }

    public JSONBuilder withAttribute(String str, Object obj) {
        if (obj instanceof JSONSerializable) {
            obj = ((JSONSerializable) obj).toJSONObject();
        }
        try {
            this.json.putOpt(str, obj);
        } catch (JSONException unused) {
        }
        return this;
    }
}
