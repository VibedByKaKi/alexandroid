package com.amazon.comms.calling.data.network.pcc;

import com.amazon.alexa.api.compat.model.AlexaContext;
import com.amazon.alexa.api.compat.model.AlexaContextsProvider;
import com.amazon.comms.calling.data.network.AlexaEventSenderKt;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/amazon/comms/calling/data/network/pcc/CallingContextProvider;", "Lcom/amazon/alexa/api/compat/model/AlexaContextsProvider;", "<init>", "()V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "deviceCallStateSerialized", "", "getDeviceCallStateSerialized", "()Ljava/lang/String;", "setDeviceCallStateSerialized", "(Ljava/lang/String;)V", "getAlexaContexts", "", "Lcom/amazon/alexa/api/compat/model/AlexaContext;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallingContextProvider implements AlexaContextsProvider {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CallingContextProvider.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG = new CallingLogger();

    @NotNull
    private String deviceCallStateSerialized = "";

    @Inject
    public CallingContextProvider() {
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaContextsProvider
    @NotNull
    public Set<AlexaContext> getAlexaContexts() {
        getLOG().i("PCC context CallingContextProvider -> getAlexaContext payload");
        return SetsKt.setOf(new AlexaContext(AlexaEventSenderKt.createHeaderForHalloEvent("SipClientState"), AlexaEventSenderKt.createPayload(this.deviceCallStateSerialized)));
    }

    @NotNull
    public final String getDeviceCallStateSerialized() {
        return this.deviceCallStateSerialized;
    }

    public final void setDeviceCallStateSerialized(@NotNull String str) {
        str.getClass();
        this.deviceCallStateSerialized = str;
    }
}
