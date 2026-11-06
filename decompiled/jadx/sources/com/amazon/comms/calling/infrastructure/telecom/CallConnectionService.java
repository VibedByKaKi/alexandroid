package com.amazon.comms.calling.infrastructure.telecom;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.comms.calling.dependency.CallUiComponent;
import com.amazon.comms.calling.dependency.DaggerWrapper;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.calling.foundation.metrics.MetricsManager;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001c\u0010 \u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/telecom/CallConnectionService;", "Landroid/telecom/ConnectionService;", "<init>", "()V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "telecomProviderService", "Lcom/amazon/comms/calling/infrastructure/telecom/TelecomProviderService;", "getTelecomProviderService", "()Lcom/amazon/comms/calling/infrastructure/telecom/TelecomProviderService;", "setTelecomProviderService", "(Lcom/amazon/comms/calling/infrastructure/telecom/TelecomProviderService;)V", "metricsManager", "Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;", "getMetricsManager", "()Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;", "setMetricsManager", "(Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;)V", "onCreate", "", "onCreateOutgoingConnection", "Landroid/telecom/Connection;", "connectionManagerPhoneAccount", "Landroid/telecom/PhoneAccountHandle;", MissingTokenPull.TRIGGER_REQUEST, "Landroid/telecom/ConnectionRequest;", "onCreateOutgoingConnectionFailed", "onCreateIncomingConnection", "onCreateIncomingConnectionFailed", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallConnectionService extends ConnectionService {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CallConnectionService.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG = new CallingLogger();

    @Inject
    public MetricsManager metricsManager;

    @Inject
    public TelecomProviderService telecomProviderService;

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(CallConnectionService callConnectionService, CallUiComponent callUiComponent) {
        callUiComponent.getClass();
        DaggerWrapper.INSTANCE.getComponent().inject(callConnectionService);
        return Unit.INSTANCE;
    }

    @NotNull
    public final MetricsManager getMetricsManager() {
        MetricsManager metricsManager = this.metricsManager;
        if (metricsManager != null) {
            return metricsManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("metricsManager");
        return null;
    }

    @NotNull
    public final TelecomProviderService getTelecomProviderService() {
        TelecomProviderService telecomProviderService = this.telecomProviderService;
        if (telecomProviderService != null) {
            return telecomProviderService;
        }
        Intrinsics.throwUninitializedPropertyAccessException("telecomProviderService");
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        DaggerWrapper daggerWrapper = DaggerWrapper.INSTANCE;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        daggerWrapper.initialize(applicationContext, new CallConnectionService$$ExternalSyntheticLambda0(this, 0));
    }

    @Override // android.telecom.ConnectionService
    @Nullable
    public Connection onCreateIncomingConnection(@Nullable PhoneAccountHandle connectionManagerPhoneAccount, @NotNull ConnectionRequest request) {
        request.getClass();
        Bundle bundle = (Bundle) request.getExtras().getParcelable("android.telecom.extra.INCOMING_CALL_EXTRAS");
        String string = bundle != null ? bundle.getString("name") : null;
        if (string == null) {
            string = "";
        }
        Uri address = request.getAddress();
        getLOG().i("[Telecom]: onCreateIncomingConnection");
        MetricsManager.DefaultImpls.recordCounterMetric$default(getMetricsManager(), "comms.telecom.addIncomingCall.callback", null, false, 6, null);
        Connection connection = getTelecomProviderService().getConnection();
        if (connection == null) {
            return null;
        }
        connection.setConnectionProperties(128);
        connection.setCallerDisplayName(string, 1);
        connection.setAddress(address, 1);
        connection.setVideoState(request.getVideoState());
        connection.setAudioModeIsVoip(true);
        return connection;
    }

    @Override // android.telecom.ConnectionService
    public void onCreateIncomingConnectionFailed(@Nullable PhoneAccountHandle connectionManagerPhoneAccount, @Nullable ConnectionRequest request) {
        getLOG().i("[Telecom]: onCreateIncomingConnectionFailed");
        MetricsManager.DefaultImpls.recordCounterMetric$default(getMetricsManager(), "comms.telecom.addIncomingCall.fail", null, false, 6, null);
        super.onCreateIncomingConnectionFailed(connectionManagerPhoneAccount, request);
    }

    @Override // android.telecom.ConnectionService
    @Nullable
    public Connection onCreateOutgoingConnection(@Nullable PhoneAccountHandle connectionManagerPhoneAccount, @NotNull ConnectionRequest request) {
        request.getClass();
        getLOG().i("[Telecom]: onCreateOutgoingConnection");
        String string = request.getExtras().getString("name");
        getLOG().i("Telecom Connection is " + (getTelecomProviderService().getConnection() == null));
        MetricsManager.DefaultImpls.recordCounterMetric$default(getMetricsManager(), "comms.telecom.placeCall.callback", null, false, 6, null);
        Connection connection = getTelecomProviderService().getConnection();
        if (connection == null) {
            return null;
        }
        connection.setConnectionProperties(128);
        connection.setCallerDisplayName(string, 1);
        connection.setVideoState(request.getVideoState());
        connection.setInitializing();
        connection.setAudioModeIsVoip(true);
        return connection;
    }

    @Override // android.telecom.ConnectionService
    public void onCreateOutgoingConnectionFailed(@Nullable PhoneAccountHandle connectionManagerPhoneAccount, @NotNull ConnectionRequest request) {
        request.getClass();
        getLOG().i("[Telecom]: onCreateOutgoingConnectionFailed");
        MetricsManager.DefaultImpls.recordCounterMetric$default(getMetricsManager(), "comms.telecom.placeCall.fail", null, false, 6, null);
        super.onCreateOutgoingConnectionFailed(connectionManagerPhoneAccount, request);
    }

    public final void setMetricsManager(@NotNull MetricsManager metricsManager) {
        metricsManager.getClass();
        this.metricsManager = metricsManager;
    }

    public final void setTelecomProviderService(@NotNull TelecomProviderService telecomProviderService) {
        telecomProviderService.getClass();
        this.telecomProviderService = telecomProviderService;
    }
}
