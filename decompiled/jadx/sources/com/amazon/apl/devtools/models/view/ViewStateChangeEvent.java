package com.amazon.apl.devtools.models.view;

import android.util.Log;
import com.amazon.apl.devtools.enums.EventMethod;
import com.amazon.apl.devtools.enums.ViewState;
import com.amazon.apl.devtools.models.common.Event;
import io.branch.rnbranch.RNBranchModule;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ViewStateChangeEvent extends Event {
    private static final String TAG = "ViewStateChangeEvent";
    private final Params mParams;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Params {
        private final int mDocumentId;
        private final ViewState mState;
        private final double mTimestamp;

        public Params(ViewState viewState, int i, double d) {
            this.mState = viewState;
            this.mDocumentId = i;
            this.mTimestamp = d;
        }

        public int getDocumentId() {
            return this.mDocumentId;
        }

        public ViewState getState() {
            return this.mState;
        }

        public double getTimestamp() {
            return this.mTimestamp;
        }
    }

    public ViewStateChangeEvent(String str, ViewState viewState, int i, double d) {
        super(EventMethod.VIEW_STATE_CHANGE, str);
        this.mParams = new Params(viewState, i, d);
    }

    public Params getParams() {
        return this.mParams;
    }

    @Override // com.amazon.apl.devtools.models.common.Event, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + EventMethod.VIEW_STATE_CHANGE + " event object");
        return super.toJSONObject().put(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS, new JSONObject().put("state", getParams().getState()).put("documentId", getParams().getDocumentId()).put("timestamp", getParams().getTimestamp()));
    }
}
