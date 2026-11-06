package com.amazon.comms.calling.sdk.handlers;

import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.commsbridge.RequestHandler;
import com.amazon.commscore.api.commsbridge.ResponseResolver;
import com.amazon.deecomms.calling.api.ICallingAPI;
import defpackage.a;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/amazon/comms/calling/sdk/handlers/RejectCallHandler;", "Lcom/amazon/commscore/api/commsbridge/RequestHandler;", "", "callingAPI", "Lcom/amazon/deecomms/calling/api/ICallingAPI;", "<init>", "(Lcom/amazon/deecomms/calling/api/ICallingAPI;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "handleRequest", "", "payload", "responseResolver", "Lcom/amazon/commscore/api/commsbridge/ResponseResolver;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RejectCallHandler implements RequestHandler<String> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(RejectCallHandler.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final ICallingAPI callingAPI;

    public RejectCallHandler(@NotNull ICallingAPI iCallingAPI) {
        iCallingAPI.getClass();
        this.callingAPI = iCallingAPI;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.amazon.commscore.api.commsbridge.RequestHandler
    public void handleRequest(@Nullable String payload, @NotNull ResponseResolver responseResolver) {
        responseResolver.getClass();
        try {
            this.callingAPI.rejectCall(payload);
            responseResolver.resolve(Boolean.TRUE);
        } catch (Exception e) {
            getLOG().e("Cannot reject call", e);
            responseResolver.reject(e);
        }
    }
}
