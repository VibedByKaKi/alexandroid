package com.amazon.comms.calling.data.dataSource.sepia;

import com.amazon.comms.calling.domain.model.InCallExperienceEvent;
import com.amazon.comms.calling.domain.model.dataChannel.sepia.SepiaData;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0016J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/sepia/SepiaDataSourceImpl;", "Lcom/amazon/comms/calling/data/dataSource/sepia/SepiaDataSource;", "<init>", "()V", "onSavedListener", "Lcom/amazon/comms/calling/data/dataSource/sepia/SepiaDataSourceListener;", "reactionData", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaData;", "callCaptioningData", "saveEffectData", "", "getEffectData", "deleteEffectData", "saveCallCaptioningData", "getCallCaptioningData", "deleteCallCaptioningData", "getSepiaSavedEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SepiaDataSourceImpl implements SepiaDataSource {

    @Nullable
    private SepiaData callCaptioningData;

    @Nullable
    private SepiaDataSourceListener onSavedListener;

    @Nullable
    private SepiaData reactionData;

    @Inject
    public SepiaDataSourceImpl() {
    }

    @Override // com.amazon.comms.calling.data.dataSource.sepia.SepiaDataSource
    public void deleteCallCaptioningData() {
        this.callCaptioningData = null;
    }

    @Override // com.amazon.comms.calling.data.dataSource.sepia.SepiaDataSource
    public void deleteEffectData() {
        this.reactionData = null;
    }

    @Override // com.amazon.comms.calling.data.dataSource.sepia.SepiaDataSource
    @Nullable
    public SepiaData getCallCaptioningData() {
        return this.callCaptioningData;
    }

    @Override // com.amazon.comms.calling.data.dataSource.sepia.SepiaDataSource
    @Nullable
    /* renamed from: getEffectData, reason: from getter */
    public SepiaData getReactionData() {
        return this.reactionData;
    }

    @Override // com.amazon.comms.calling.data.dataSource.sepia.SepiaDataSource
    @ExperimentalCoroutinesApi
    @NotNull
    public Flow<InCallExperienceEvent> getSepiaSavedEventFlow() {
        return FlowKt.callbackFlow(new SepiaDataSourceImpl$getSepiaSavedEventFlow$1(this, null));
    }

    @Override // com.amazon.comms.calling.data.dataSource.sepia.SepiaDataSource
    public void saveCallCaptioningData(@NotNull SepiaData callCaptioningData) {
        callCaptioningData.getClass();
        this.callCaptioningData = callCaptioningData;
        SepiaDataSourceListener sepiaDataSourceListener = this.onSavedListener;
        if (sepiaDataSourceListener != null) {
            sepiaDataSourceListener.onChanged(callCaptioningData);
        }
    }

    @Override // com.amazon.comms.calling.data.dataSource.sepia.SepiaDataSource
    public void saveEffectData(@NotNull SepiaData reactionData) {
        reactionData.getClass();
        this.reactionData = reactionData;
        SepiaDataSourceListener sepiaDataSourceListener = this.onSavedListener;
        if (sepiaDataSourceListener != null) {
            sepiaDataSourceListener.onChanged(reactionData);
        }
    }
}
