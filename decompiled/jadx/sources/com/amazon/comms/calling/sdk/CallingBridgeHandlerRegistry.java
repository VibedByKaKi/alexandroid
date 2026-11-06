package com.amazon.comms.calling.sdk;

import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.calling.sdk.handlers.AnswerCallHandler;
import com.amazon.comms.calling.sdk.handlers.EndCallHandler;
import com.amazon.comms.calling.sdk.handlers.GetCallHistoryHandler;
import com.amazon.comms.calling.sdk.handlers.GetCallInformationHandler;
import com.amazon.comms.calling.sdk.handlers.InitiateCallHandler;
import com.amazon.comms.calling.sdk.handlers.RejectCallHandler;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.commsbridge.CommsBridgeService;
import com.amazon.commscore.api.commsbridge.RequestHandler;
import com.amazon.deecomms.calling.api.ICallingAPI;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.facebook.imageutils.BitmapUtil$$ExternalSyntheticLambda0;
import defpackage.a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ&\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001eH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/amazon/comms/calling/sdk/CallingBridgeHandlerRegistry;", "", "<init>", "()V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "CALL_INITIATE", "", "CALL_ANSWER", "CALL_REJECT", "CALL_END", "GET_CALLINFORMATION", "GET_CALLHISTORY", "commsBridgeService", "Lcom/amazon/commscore/api/commsbridge/CommsBridgeService;", "getCommsBridgeService", "()Lcom/amazon/commscore/api/commsbridge/CommsBridgeService;", "commsBridgeService$delegate", "Lkotlin/Lazy;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "callingAPI", "Lcom/amazon/deecomms/calling/api/ICallingAPI;", "registerIfNeeded", "eventName", "eventHandler", "Lcom/amazon/commscore/api/commsbridge/RequestHandler;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallingBridgeHandlerRegistry {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CallingBridgeHandlerRegistry.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG = new CallingLogger();

    @NotNull
    private final String CALL_INITIATE = "calling::call::initiate";

    @NotNull
    private final String CALL_ANSWER = "calling::call::answer";

    @NotNull
    private final String CALL_REJECT = "calling::call::reject";

    @NotNull
    private final String CALL_END = "calling::call::terminate";

    @NotNull
    private final String GET_CALLINFORMATION = "calling::call::getInfo";

    @NotNull
    private final String GET_CALLHISTORY = "calling::history::get";

    /* renamed from: commsBridgeService$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy commsBridgeService = LazyKt.lazy(new BitmapUtil$$ExternalSyntheticLambda0(9));

    @Inject
    public CallingBridgeHandlerRegistry() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommsBridgeService commsBridgeService_delegate$lambda$0() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(CommsBridgeService.class).get();
        return (CommsBridgeService) obj;
    }

    private final CommsBridgeService getCommsBridgeService() {
        Object value = this.commsBridgeService.getValue();
        value.getClass();
        return (CommsBridgeService) value;
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    private final void registerIfNeeded(CommsBridgeService commsBridgeService, String eventName, RequestHandler<String> eventHandler) {
        if (commsBridgeService.isRequestHandlerRegistered(eventName)) {
            ChatData$$ExternalSyntheticOutline0.m("Handler for event ", eventName, " is already registered.", getLOG());
            return;
        }
        try {
            commsBridgeService.registerRequestHandler(eventName, eventHandler);
        } catch (Exception e) {
            getLOG().e("Cannot register Calling handler", e);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void register(@NotNull ICallingAPI callingAPI) {
        callingAPI.getClass();
        getLOG().i("Registering CallingAPI with Comms Bridge");
        registerIfNeeded(getCommsBridgeService(), this.CALL_INITIATE, new InitiateCallHandler(callingAPI));
        registerIfNeeded(getCommsBridgeService(), this.CALL_ANSWER, new AnswerCallHandler(callingAPI));
        registerIfNeeded(getCommsBridgeService(), this.CALL_REJECT, new RejectCallHandler(callingAPI));
        registerIfNeeded(getCommsBridgeService(), this.CALL_END, new EndCallHandler(callingAPI));
        registerIfNeeded(getCommsBridgeService(), this.GET_CALLINFORMATION, new GetCallInformationHandler(callingAPI));
        registerIfNeeded(getCommsBridgeService(), this.GET_CALLHISTORY, new GetCallHistoryHandler(callingAPI));
    }
}
