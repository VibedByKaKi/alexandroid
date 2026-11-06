package com.amazon.apl.devtools.models.view;

import android.util.Log;
import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.SessionCommandResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ViewCaptureImageCommandResponse extends SessionCommandResponse {
    private static final String TAG = "ViewCaptureImageCommandResponse";
    private final Result mResult;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result {
        private final String mData;
        private final int mHeight;
        private final String mType;
        private final int mWidth;

        public Result(int i, int i2, String str, String str2) {
            this.mHeight = i;
            this.mWidth = i2;
            this.mType = str;
            this.mData = str2;
        }

        public String getData() {
            return this.mData;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public String getType() {
            return this.mType;
        }

        public int getWidth() {
            return this.mWidth;
        }
    }

    public ViewCaptureImageCommandResponse(int i, String str, int i2, int i3, String str2, String str3) {
        super(i, str);
        this.mResult = new Result(i2, i3, str2, str3);
    }

    public Result getResult() {
        return this.mResult;
    }

    @Override // com.amazon.apl.devtools.models.common.SessionCommandResponse, com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + CommandMethod.VIEW_CAPTURE_IMAGE + " response object");
        return super.toJSONObject().put("result", new JSONObject().put("height", getResult().getHeight()).put("width", getResult().getWidth()).put("type", getResult().getType()).put("data", getResult().getData()));
    }
}
