package com.amazon.comms.calling.data.dataSource;

import com.amazon.comms.calling.domain.model.BeginCallPayload;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/BeginCallDataSourceImpl;", "Lcom/amazon/comms/calling/data/dataSource/BeginCallDataSource;", "<init>", "()V", "beginCallPayloadMap", "", "", "Lcom/amazon/comms/calling/domain/model/BeginCallPayload;", "updateBeginCallPayload", "", "beginCallPayload", "getBeginCallPayload", "callId", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class BeginCallDataSourceImpl implements BeginCallDataSource {

    @NotNull
    private Map<String, BeginCallPayload> beginCallPayloadMap = MapsKt.emptyMap();

    @Inject
    public BeginCallDataSourceImpl() {
    }

    @Override // com.amazon.comms.calling.data.dataSource.BeginCallDataSource
    @Nullable
    public BeginCallPayload getBeginCallPayload(@NotNull String callId) {
        callId.getClass();
        return this.beginCallPayloadMap.get(callId);
    }

    @Override // com.amazon.comms.calling.data.dataSource.BeginCallDataSource
    public void updateBeginCallPayload(@NotNull BeginCallPayload beginCallPayload) {
        beginCallPayload.getClass();
        Map<String, BeginCallPayload> mutableMap = MapsKt.toMutableMap(this.beginCallPayloadMap);
        String callId = beginCallPayload.getCallId();
        if (callId != null) {
            mutableMap.put(callId, beginCallPayload);
        }
        this.beginCallPayloadMap = mutableMap;
    }
}
