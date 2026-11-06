package io.branch.referral;

import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class ServerResponse {
    private String message_;
    private Object post_;
    private String requestId_;
    private int statusCode_;
    private String tag_;

    public ServerResponse(String str, int i, String str2, String str3) {
        this.tag_ = str;
        this.statusCode_ = i;
        this.requestId_ = str2;
        this.message_ = str3;
    }

    public JSONArray getArray() {
        Object obj = this.post_;
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        return null;
    }

    public String getFailReason() {
        String str = "";
        try {
            JSONObject object = getObject();
            return (object == null || !object.has("error") || !object.getJSONObject("error").has("message") || (str = object.getJSONObject("error").getString("message")) == null || str.trim().length() <= 0) ? str : str.concat(".");
        } catch (Exception e) {
            BranchLogger.w("Caught Exception ServerResponse getFailReason: " + e.getMessage());
            return str;
        }
    }

    public String getMessage() {
        return this.message_;
    }

    public JSONObject getObject() {
        Object obj = this.post_;
        return obj instanceof JSONObject ? (JSONObject) obj : new JSONObject();
    }

    public int getStatusCode() {
        return this.statusCode_;
    }

    public String getTag() {
        return this.tag_;
    }

    public void setPost(Object obj) {
        this.post_ = obj;
    }
}
