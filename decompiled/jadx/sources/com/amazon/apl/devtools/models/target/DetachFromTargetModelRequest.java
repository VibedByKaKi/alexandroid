package com.amazon.apl.devtools.models.target;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.TargetDomainCommandRequest;
import com.amazon.apl.devtools.models.error.DTException;
import io.branch.rnbranch.RNBranchModule;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DetachFromTargetModelRequest extends TargetDomainCommandRequest<DetachFromTargetCommandResponse> {
    private final Params mParams;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Params {
        private final String mSessionId;

        private Params(String str) {
            this.mSessionId = str;
        }

        public String getSessionId() {
            return this.mSessionId;
        }
    }

    public DetachFromTargetModelRequest(JSONObject jSONObject) throws JSONException, DTException {
        super(CommandMethod.TARGET_DETACH_FROM_TARGET, jSONObject);
        this.mParams = new Params(jSONObject.getJSONObject(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS).getString(LiveTranslationCapabilityConstants.KEY_SESSION_ID));
    }

    public Params getParams() {
        return this.mParams;
    }

    @Override // com.amazon.apl.devtools.models.common.Request, com.amazon.apl.devtools.executers.ICommandValidator
    public void validate() throws DTException {
    }
}
