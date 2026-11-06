package com.amazon.apl.devtools.models.log;

import com.amazon.apl.devtools.enums.EventMethod;
import com.amazon.apl.devtools.models.common.Event;
import io.branch.rnbranch.RNBranchModule;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SessionRecorderEventReported extends Event {
    private final Params mParams;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Params {
        private final JSONObject mData;
        private final String mEventType;
        private final long mTimestamp;

        public Params(long j, String str, JSONObject jSONObject) {
            this.mTimestamp = j;
            this.mEventType = str;
            this.mData = jSONObject;
        }

        public JSONObject getData() {
            return this.mData;
        }

        public String getEventType() {
            return this.mEventType;
        }

        public long getTimestamp() {
            return this.mTimestamp;
        }
    }

    public SessionRecorderEventReported(String str, long j, String str2, JSONObject jSONObject) {
        super(EventMethod.SESSION_RECORDER_EVENT_REPORTED, str);
        this.mParams = new Params(j, str2, jSONObject);
    }

    @Override // com.amazon.apl.devtools.models.common.Event, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        return super.toJSONObject().put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, new JSONObject().put("timestamp", this.mParams.getTimestamp()).put("eventType", this.mParams.getEventType()).put("data", this.mParams.getData()));
    }
}
