package com.amazon.apl.devtools.models.view;

import android.util.Log;
import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.SessionCommandResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ViewSetDocumentCommandResponse extends SessionCommandResponse {
    private static final String TAG = "ViewSetDocumentCommandResponse";
    private int mDocumentId;

    public ViewSetDocumentCommandResponse(int i, String str, int i2) {
        super(i, str);
        this.mDocumentId = i2;
    }

    @Override // com.amazon.apl.devtools.models.common.SessionCommandResponse, com.amazon.apl.devtools.models.common.Response, com.amazon.apl.devtools.models.common.IResponseParser
    public JSONObject toJSONObject() throws JSONException {
        Log.i(TAG, "Serializing " + CommandMethod.VIEW_SET_DOCUMENT + " response object");
        return super.toJSONObject().put("result", new JSONObject().put("documentId", this.mDocumentId));
    }
}
