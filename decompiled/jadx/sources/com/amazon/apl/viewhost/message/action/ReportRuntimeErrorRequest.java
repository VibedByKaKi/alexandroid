package com.amazon.apl.viewhost.message.action;

import com.amazon.apl.viewhost.internal.message.action.ReportRuntimeErrorRequestImpl;
import com.amazon.apl.viewhost.message.BaseMessage;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract class ReportRuntimeErrorRequest extends BaseMessage {
    public static ReportRuntimeErrorRequest create(ActionMessage actionMessage) {
        return new ReportRuntimeErrorRequestImpl(actionMessage);
    }

    public abstract boolean fail(String str);

    public abstract Object[] getErrors();

    public abstract boolean succeed();
}
