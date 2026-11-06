package com.amazon.apl.devtools.models;

import com.amazon.apl.devtools.models.common.Request;
import com.amazon.apl.devtools.models.error.DTException;
import com.amazon.apl.devtools.util.CommandMethodUtil;
import com.dee.app.metrics.MetricsConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class RequestHeader extends Request {
    public RequestHeader(CommandMethodUtil commandMethodUtil, JSONObject jSONObject) throws JSONException, DTException {
        super(commandMethodUtil.parseMethod(jSONObject.getString(MetricsConstants.NativeFetch.METHOD)), jSONObject);
    }
}
