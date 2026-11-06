package com.amazon.comms.calling.infrastructure;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.amazon.alexa.ra.core.data.repo.NetworkManager$$ExternalSyntheticLambda0;
import com.amazon.comms.calling.dependency.CallUiComponent;
import com.amazon.comms.calling.dependency.DaggerWrapper;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.network.AppUrl;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\"\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/IncomingCallSipService;", "Landroid/app/Service;", "<init>", "()V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "incomingCallSipObserver", "Lcom/amazon/comms/calling/infrastructure/IncomingCallSipObserver;", "getIncomingCallSipObserver", "()Lcom/amazon/comms/calling/infrastructure/IncomingCallSipObserver;", "setIncomingCallSipObserver", "(Lcom/amazon/comms/calling/infrastructure/IncomingCallSipObserver;)V", "onBind", "Landroid/os/IBinder;", "p0", "Landroid/content/Intent;", "onCreate", "", "onDestroy", "onStartCommand", "", "intent", "flags", AppUrl.ACMS.QueryParam.Keys.MESSAGE_START_ID, "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class IncomingCallSipService extends Service {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(IncomingCallSipService.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean hasStarted;

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG = new CallingLogger();

    @Inject
    public IncomingCallSipObserver incomingCallSipObserver;

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(IncomingCallSipService incomingCallSipService, CallUiComponent callUiComponent) {
        callUiComponent.getClass();
        callUiComponent.inject(incomingCallSipService);
        return Unit.INSTANCE;
    }

    @NotNull
    public final IncomingCallSipObserver getIncomingCallSipObserver() {
        IncomingCallSipObserver incomingCallSipObserver = this.incomingCallSipObserver;
        if (incomingCallSipObserver != null) {
            return incomingCallSipObserver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("incomingCallSipObserver");
        return null;
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(@NotNull Intent p0) {
        p0.getClass();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        hasStarted = true;
        super.onCreate();
        getLOG().i("[Comms-calling]: onCreate IncomingCallSipService");
        DaggerWrapper daggerWrapper = DaggerWrapper.INSTANCE;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        daggerWrapper.initialize(applicationContext, new NetworkManager$$ExternalSyntheticLambda0(this, 27));
    }

    @Override // android.app.Service
    public void onDestroy() {
        hasStarted = false;
        super.onDestroy();
        getIncomingCallSipObserver().onDestroy();
        getLOG().i("[Comms-calling]: onDestroy IncomingCallSipService");
    }

    @Override // android.app.Service
    public int onStartCommand(@Nullable Intent intent, int flags, int startId) {
        getLOG().d("[Comms-calling]: IncomingCallSipService onStartCommand");
        getIncomingCallSipObserver().startCallStateObserver(intent);
        return 1;
    }

    public final void setIncomingCallSipObserver(@NotNull IncomingCallSipObserver incomingCallSipObserver) {
        incomingCallSipObserver.getClass();
        this.incomingCallSipObserver = incomingCallSipObserver;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/IncomingCallSipService$Companion;", "", "<init>", "()V", "hasStarted", "", "getHasStarted", "()Z", "setHasStarted", "(Z)V", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean getHasStarted() {
            return IncomingCallSipService.hasStarted;
        }

        public final void setHasStarted(boolean z) {
            IncomingCallSipService.hasStarted = z;
        }

        private Companion() {
        }
    }
}
