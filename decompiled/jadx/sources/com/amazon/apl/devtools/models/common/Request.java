package com.amazon.apl.devtools.models.common;

import com.amazon.apl.devtools.enums.CommandMethod;
import com.amazon.apl.devtools.executers.ICommandExecutor;
import com.amazon.apl.devtools.executers.ICommandValidator;
import com.amazon.apl.devtools.models.common.Response;
import com.amazon.apl.devtools.models.error.DTException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class Request<TResponse extends Response> implements ICommandExecutor<TResponse>, ICommandValidator {
    private final int mId;
    private final CommandMethod mMethod;

    public Request(CommandMethod commandMethod, JSONObject jSONObject) throws JSONException {
        this.mMethod = commandMethod;
        this.mId = jSONObject.getInt("id");
    }

    public int getId() {
        return this.mId;
    }

    public CommandMethod getMethod() {
        return this.mMethod;
    }

    public void validate() throws DTException {
    }
}
