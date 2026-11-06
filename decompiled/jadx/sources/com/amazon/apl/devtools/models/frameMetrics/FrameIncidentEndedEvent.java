package com.amazon.apl.devtools.models.frameMetrics;

import android.util.Log;
import com.amazon.apl.devtools.enums.EventMethod;
import com.amazon.apl.devtools.models.common.Event;
import io.branch.rnbranch.RNBranchModule;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class FrameIncidentEndedEvent extends Event {
    private static final String TAG = "FrameIncidentEndedEvent";
    private final long mEndingTimeStamp;
    private final int mIncidentId;

    public FrameIncidentEndedEvent(String str, int i, long j) {
        super(EventMethod.FRAMEMETRICS_INCIDENT_ENDED, str);
        this.mIncidentId = i;
        this.mEndingTimeStamp = j;
    }

    @Override // com.amazon.apl.devtools.models.common.Event, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + EventMethod.FRAMEMETRICS_INCIDENT_ENDED + " event object");
        return super.toJSONObject().put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, new JSONObject().put("incidentId", this.mIncidentId).put("timestamp", this.mEndingTimeStamp));
    }
}
