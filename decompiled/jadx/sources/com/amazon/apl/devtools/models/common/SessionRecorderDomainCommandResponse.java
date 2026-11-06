package com.amazon.apl.devtools.models.common;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SessionRecorderDomainCommandResponse extends Response {
    private final String mSessionId;

    public SessionRecorderDomainCommandResponse(int i, String str) {
        super(i);
        this.mSessionId = str;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    @Override // com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        return super.toJSONObject().put(LiveTranslationCapabilityConstants.KEY_SESSION_ID, getSessionId());
    }
}
