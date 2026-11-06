package com.amazon.apl.devtools.models.target;

import android.util.Log;
import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.TargetDomainCommandResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class TargetAttachToTargetCommandResponse extends TargetDomainCommandResponse {
    private static final String TAG = "TargetAttachToTargetCommandResponse";
    private final Result mResult;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Result {
        private final String mSessionId;

        public Result(String str) {
            this.mSessionId = str;
        }

        public String getSessionId() {
            return this.mSessionId;
        }
    }

    public TargetAttachToTargetCommandResponse(int i, String str) {
        super(i);
        this.mResult = new Result(str);
    }

    public Result getResult() {
        return this.mResult;
    }

    @Override // com.amazon.apl.devtools.models.common.TargetDomainCommandResponse, com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + CommandMethod.TARGET_ATTACH_TO_TARGET + " response object");
        return super.toJSONObject().put("result", new JSONObject().put(LiveTranslationCapabilityConstants.KEY_SESSION_ID, getResult().getSessionId()));
    }
}
