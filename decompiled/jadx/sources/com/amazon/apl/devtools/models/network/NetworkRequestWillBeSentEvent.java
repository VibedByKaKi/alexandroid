package com.amazon.apl.devtools.models.network;

import android.util.Log;
import com.amazon.apl.devtools.enums.EventMethod;
import com.amazon.apl.devtools.models.common.Event;
import io.branch.rnbranch.RNBranchModule;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class NetworkRequestWillBeSentEvent extends Event {
    private static final String TAG = "NetworkRequestWillBeSentEvent";
    private final Params mParams;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Params {
        private final String mDocumentURL;
        private final int mRequestId;
        private final double mTimestamp;
        private final String mType;

        public Params(int i, double d, String str, String str2) {
            this.mRequestId = i;
            this.mTimestamp = d;
            this.mDocumentURL = str;
            this.mType = str2;
        }

        public String getDocumentURL() {
            return this.mDocumentURL;
        }

        public int getRequestId() {
            return this.mRequestId;
        }

        public double getTimestamp() {
            return this.mTimestamp;
        }

        public String getType() {
            return this.mType;
        }
    }

    public NetworkRequestWillBeSentEvent(String str, int i, double d, String str2, String str3) {
        super(EventMethod.NETWORK_REQUEST_WILL_BE_SENT, str);
        this.mParams = new Params(i, d, str2, str3);
    }

    public Params getParams() {
        return this.mParams;
    }

    @Override // com.amazon.apl.devtools.models.common.Event, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + EventMethod.NETWORK_REQUEST_WILL_BE_SENT + " event object");
        return super.toJSONObject().put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, new JSONObject().put("requestId", getParams().getRequestId()).put("timestamp", getParams().getTimestamp()).put("type", getParams().getType()).put("documentURL", getParams().getDocumentURL()));
    }
}
