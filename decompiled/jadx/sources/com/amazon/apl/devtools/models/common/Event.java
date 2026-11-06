package com.amazon.apl.devtools.models.common;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import com.amazon.apl.devtools.enums.EventMethod;
import com.dee.app.metrics.MetricsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Event implements IResponseParser {
    private final EventMethod mMethod;
    private final String mSessionId;

    public Event(EventMethod eventMethod, String str) {
        this.mMethod = eventMethod;
        this.mSessionId = str;
    }

    public EventMethod getMethod() {
        return this.mMethod;
    }

    public String getSessionId() {
        return this.mSessionId;
    }

    @Override // com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        return new JSONObject().put(MetricsConstants.NativeFetch.METHOD, getMethod().toString()).put(LiveTranslationCapabilityConstants.KEY_SESSION_ID, getSessionId());
    }
}
