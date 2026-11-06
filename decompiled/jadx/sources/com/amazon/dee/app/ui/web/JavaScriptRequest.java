package com.amazon.dee.app.ui.web;

import com.amazon.dee.app.services.logging.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class JavaScriptRequest {
    public static final String KEY_REQUEST_ID = "requestId";
    private static final String TAG = "com.amazon.dee.app.ui.web.JavaScriptRequest";
    private final String mRawRequestString;
    private String mRequestId;
    private JSONObject mRequestObj;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class InvalidJavaScriptRequestException extends Exception {
    }

    public JavaScriptRequest(String str) {
        this.mRawRequestString = str;
    }

    public String getParameterString(String str) {
        JSONObject jSONObject = this.mRequestObj;
        if (jSONObject != null) {
            return jSONObject.optString(str, null);
        }
        return null;
    }

    public String getRequestId() {
        return this.mRequestId;
    }

    public JavaScriptResponse prepareResponse() {
        JavaScriptResponse javaScriptResponse = new JavaScriptResponse();
        javaScriptResponse.setResponse(new JSONObject());
        javaScriptResponse.setRequestId(this.mRequestId);
        return javaScriptResponse;
    }

    public void tryParse() throws InvalidJavaScriptRequestException {
        try {
            JSONObject jSONObject = new JSONObject(this.mRawRequestString);
            this.mRequestObj = jSONObject;
            this.mRequestId = jSONObject.getString("requestId");
        } catch (JSONException e) {
            Log.e(TAG, e, "Received invalid JavaScriptRequest: " + this.mRawRequestString, new Object[0]);
            throw new InvalidJavaScriptRequestException();
        }
    }
}
