package com.amazon.apl.devtools.models.error;

import android.util.Log;
import com.amazon.apl.devtools.models.common.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ErrorResponse extends Response {
    private static final String TAG = "ErrorResponse";
    private final Error mError;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Error {
        private final int mCode;
        private final String mMessage;

        private Error(int i, String str) {
            this.mCode = i;
            this.mMessage = str;
        }

        public int getCode() {
            return this.mCode;
        }

        public String getMessage() {
            return this.mMessage;
        }
    }

    public ErrorResponse(DTException dTException) {
        super(dTException.getId());
        Log.i(TAG, "Creating error response from DTException");
        this.mError = new Error(dTException.getCode(), dTException.getMessage());
    }

    @Override // com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        return super.toJSONObject().put("error", new JSONObject().put("code", this.mError.mCode).put("message", this.mError.mMessage));
    }

    public ErrorResponse(int i, int i2, String str) {
        super(i);
        Log.i(TAG, "Creating error response");
        this.mError = new Error(i2, str);
    }
}
