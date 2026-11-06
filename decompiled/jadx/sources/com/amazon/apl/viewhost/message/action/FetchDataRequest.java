package com.amazon.apl.viewhost.message.action;

import com.amazon.apl.viewhost.internal.message.action.FetchDataRequestImpl;
import com.amazon.apl.viewhost.message.BaseMessage;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class FetchDataRequest extends BaseMessage {
    public static FetchDataRequest create(ActionMessage actionMessage) {
        return new FetchDataRequestImpl(actionMessage);
    }

    public abstract boolean fail(String str);

    public abstract String getDataType();

    public abstract Map<String, Object> getParameters();

    public abstract boolean succeed();
}
