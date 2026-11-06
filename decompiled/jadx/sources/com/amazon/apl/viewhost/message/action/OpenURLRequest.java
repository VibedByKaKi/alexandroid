package com.amazon.apl.viewhost.message.action;

import com.amazon.apl.viewhost.internal.message.action.OpenURLRequestImpl;
import com.amazon.apl.viewhost.message.BaseMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class OpenURLRequest extends BaseMessage {
    public static OpenURLRequest create(ActionMessage actionMessage) {
        return new OpenURLRequestImpl(actionMessage);
    }

    public abstract boolean fail(String str);

    public abstract String getSource();

    public abstract boolean succeed();
}
