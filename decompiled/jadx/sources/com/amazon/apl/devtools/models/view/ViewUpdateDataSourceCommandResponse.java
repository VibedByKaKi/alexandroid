package com.amazon.apl.devtools.models.view;

import android.util.Log;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.SendEventResultBundleKeys;
import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.SessionCommandResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ViewUpdateDataSourceCommandResponse extends SessionCommandResponse {
    private static final String TAG = "ViewUpdateDataSourceCommandResponse";
    private final Result mResult;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result {
        private final String mStatus;

        public Result(String str) {
            this.mStatus = str;
        }

        public String getStatus() {
            return this.mStatus;
        }
    }

    public ViewUpdateDataSourceCommandResponse(int i, String str, boolean z) {
        super(i, str);
        this.mResult = new Result(z ? "success" : SendEventResultBundleKeys.FAILURE);
    }

    @Override // com.amazon.apl.devtools.models.common.SessionCommandResponse, com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + CommandMethod.VIEW_UPDATE_DATASOURCE + " response object");
        return super.toJSONObject().put("result", new JSONObject().put("status", this.mResult.getStatus()));
    }
}
