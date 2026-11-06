package com.amazon.apl.viewhost.message.action;

import com.amazon.apl.viewhost.internal.message.action.SendUserEventRequestImpl;
import com.amazon.apl.viewhost.message.BaseMessage;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class SendUserEventRequest extends BaseMessage {
    public static SendUserEventRequest create(ActionMessage actionMessage) {
        return new SendUserEventRequestImpl(actionMessage);
    }

    public abstract boolean fail(String str);

    public abstract Object[] getArguments();

    public abstract Map<String, Object> getComponents();

    public abstract Map<String, Object> getFlags();

    public abstract Map<String, Object> getSource();

    public abstract boolean succeed();
}
