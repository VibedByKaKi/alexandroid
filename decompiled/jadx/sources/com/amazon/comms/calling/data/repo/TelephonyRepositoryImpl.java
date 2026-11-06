package com.amazon.comms.calling.data.repo;

import com.amazon.comms.calling.domain.repo.TelephonyRepository;
import com.amazon.comms.calling.infrastructure.telecom.TelephonyProvider;
import com.amazon.comms.calling.infrastructure.telecom.TelephonyState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.ConflatedBroadcastChannel;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/data/repo/TelephonyRepositoryImpl;", "Lcom/amazon/comms/calling/domain/repo/TelephonyRepository;", "telephonyProvider", "Lcom/amazon/comms/calling/infrastructure/telecom/TelephonyProvider;", "<init>", "(Lcom/amazon/comms/calling/infrastructure/telecom/TelephonyProvider;)V", "getTelephonyState", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "Lcom/amazon/comms/calling/infrastructure/telecom/TelephonyState;", "observeTelephonyState", "", "updateCallState", "state", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class TelephonyRepositoryImpl implements TelephonyRepository {

    @NotNull
    private final TelephonyProvider telephonyProvider;

    @Inject
    public TelephonyRepositoryImpl(@NotNull TelephonyProvider telephonyProvider) {
        telephonyProvider.getClass();
        this.telephonyProvider = telephonyProvider;
    }

    @Override // com.amazon.comms.calling.domain.repo.TelephonyRepository
    @NotNull
    public ConflatedBroadcastChannel<TelephonyState> getTelephonyState() {
        return this.telephonyProvider.getTelephonyEventChannel();
    }

    @Override // com.amazon.comms.calling.domain.repo.TelephonyRepository
    public void observeTelephonyState() {
        this.telephonyProvider.observeTelephonyState();
    }

    @Override // com.amazon.comms.calling.domain.repo.TelephonyRepository
    public void updateCallState(int state) {
        this.telephonyProvider.updateCallState(state);
    }
}
