package com.amazon.apl.devtools.models.common;

import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.models.common.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class TargetDomainCommandRequest<TResponse extends Response> extends Request<TResponse> {
    public TargetDomainCommandRequest(CommandMethod commandMethod, JSONObject jSONObject) throws JSONException {
        super(commandMethod, jSONObject);
    }
}
