package com.amazon.comms.calling.data.dataSource.sepia;

import com.amazon.comms.calling.domain.model.InCallExperienceEvent;
import com.amazon.comms.calling.domain.model.dataChannel.sepia.SepiaData;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\n\u001a\u00020\u0003H&J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH&¨\u0006\u000e"}, d2 = {"Lcom/amazon/comms/calling/data/dataSource/sepia/SepiaDataSource;", "", "saveEffectData", "", "sepiaData", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaData;", "getEffectData", "deleteEffectData", "saveCallCaptioningData", "getCallCaptioningData", "deleteCallCaptioningData", "getSepiaSavedEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface SepiaDataSource {
    void deleteCallCaptioningData();

    void deleteEffectData();

    @Nullable
    SepiaData getCallCaptioningData();

    @Nullable
    /* renamed from: getEffectData */
    SepiaData getReactionData();

    @NotNull
    Flow<InCallExperienceEvent> getSepiaSavedEventFlow();

    void saveCallCaptioningData(@NotNull SepiaData sepiaData);

    void saveEffectData(@NotNull SepiaData sepiaData);
}
