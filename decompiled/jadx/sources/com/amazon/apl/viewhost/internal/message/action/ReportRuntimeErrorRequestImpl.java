package com.amazon.apl.viewhost.internal.message.action;

import androidx.annotation.NonNull;
import com.amazon.apl.viewhost.DocumentHandle;
import com.amazon.apl.viewhost.internal.DecodableShim;
import com.amazon.apl.viewhost.message.action.ActionMessage;
import com.amazon.apl.viewhost.message.action.ReportRuntimeErrorRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ReportRuntimeErrorRequestImpl extends ReportRuntimeErrorRequest {

    @NonNull
    private final ActionMessage mActionMessage;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Payload extends DecodableShim {
        public Object[] errors;
    }

    public ReportRuntimeErrorRequestImpl(ActionMessage actionMessage) {
        this.mActionMessage = actionMessage;
    }

    @Override // com.amazon.apl.viewhost.message.action.ReportRuntimeErrorRequest
    public boolean fail(String str) {
        return this.mActionMessage.fail(str);
    }

    @Override // com.amazon.apl.viewhost.message.BaseMessage
    public DocumentHandle getDocument() {
        return this.mActionMessage.getDocument();
    }

    @Override // com.amazon.apl.viewhost.message.action.ReportRuntimeErrorRequest
    public Object[] getErrors() {
        return ((Payload) this.mActionMessage.getPayload()).errors;
    }

    @Override // com.amazon.apl.viewhost.message.BaseMessage
    public int getId() {
        return this.mActionMessage.getId();
    }

    @Override // com.amazon.apl.viewhost.message.action.ReportRuntimeErrorRequest
    public boolean succeed() {
        return this.mActionMessage.succeed();
    }
}
