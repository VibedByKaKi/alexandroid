package com.amazon.apl.devtools.models.target;

import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.TargetDomainCommandRequest;
import io.branch.rnbranch.RNBranchModule;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class TargetAttachToTargetCommandRequestModel extends TargetDomainCommandRequest<TargetAttachToTargetCommandResponse> {
    private final Params mParams;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Params {
        private final String mTargetId;

        private Params(String str) {
            this.mTargetId = str;
        }

        public String getTargetId() {
            return this.mTargetId;
        }
    }

    public TargetAttachToTargetCommandRequestModel(JSONObject jSONObject) throws JSONException {
        super(CommandMethod.TARGET_ATTACH_TO_TARGET, jSONObject);
        this.mParams = new Params(jSONObject.getJSONObject(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS).getString("targetId"));
    }

    public Params getParams() {
        return this.mParams;
    }
}
