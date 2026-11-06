package com.amazon.comms.calling.data.dataSource;

import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import com.amazon.commscore.api.remoteconfiguration.AlexaCommsCoreRemoteConfigurationService;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/CallCounterDataSourceImpl;", "Lcom/amazon/comms/calling/data/dataSource/CallCounterDataSource;", "arcusConfig", "Lcom/amazon/commscore/api/remoteconfiguration/AlexaCommsCoreRemoteConfigurationService;", "<init>", "(Lcom/amazon/commscore/api/remoteconfiguration/AlexaCommsCoreRemoteConfigurationService;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "numberOfWorthyCalls", "", "incrementNumberOfCallsIfNecessary", "callDurationInMillis", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallCounterDataSourceImpl implements CallCounterDataSource {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CallCounterDataSourceImpl.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final AlexaCommsCoreRemoteConfigurationService arcusConfig;
    private int numberOfWorthyCalls;

    @Inject
    public CallCounterDataSourceImpl(@NotNull AlexaCommsCoreRemoteConfigurationService alexaCommsCoreRemoteConfigurationService) {
        alexaCommsCoreRemoteConfigurationService.getClass();
        this.arcusConfig = alexaCommsCoreRemoteConfigurationService;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.amazon.comms.calling.data.dataSource.CallCounterDataSource
    public int incrementNumberOfCallsIfNecessary(long callDurationInMillis) {
        Integer integer = this.arcusConfig.getRemoteConfiguration("CallRating.MinCallDurationSeconds", Constants.FEEDBACK_TYPE_DISLIKE).toInteger();
        getLOG().i("CALL_RATING_MIN_CALL_DURATION: " + integer);
        if (callDurationInMillis / 1000 >= integer.intValue()) {
            this.numberOfWorthyCalls++;
        }
        return this.numberOfWorthyCalls;
    }
}
