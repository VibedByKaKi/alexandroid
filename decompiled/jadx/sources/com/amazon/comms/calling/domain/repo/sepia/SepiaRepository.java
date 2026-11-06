package com.amazon.comms.calling.domain.repo.sepia;

import com.amazon.comms.calling.data.repo.sepia.EffectError;
import com.amazon.comms.calling.domain.model.InCallExperienceEvent;
import com.amazon.comms.calling.domain.model.dataChannel.sepia.SepiaData;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\n\u0010\f\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\tH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0010H&¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/domain/repo/sepia/SepiaRepository;", "", "saveEffectData", "", "sepiaData", "Lcom/amazon/comms/calling/domain/model/dataChannel/sepia/SepiaData;", "getEffectData", "deleteEffectData", "isEffectActive", "", "isEffectAvailable", "saveReactionData", "getReactionData", "deleteReactionData", "isReactionAvailable", "getReactionsEventFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/amazon/comms/calling/domain/model/InCallExperienceEvent;", "getEffectsEventFlow", "getEffectErrorFlow", "Lcom/amazon/comms/calling/data/repo/sepia/EffectError;", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface SepiaRepository {
    void deleteEffectData();

    void deleteReactionData();

    @Nullable
    SepiaData getEffectData();

    @NotNull
    Flow<EffectError> getEffectErrorFlow();

    @NotNull
    Flow<InCallExperienceEvent> getEffectsEventFlow();

    @Nullable
    SepiaData getReactionData();

    @NotNull
    Flow<InCallExperienceEvent> getReactionsEventFlow();

    boolean isEffectActive();

    boolean isEffectAvailable();

    boolean isReactionAvailable();

    void saveEffectData(@NotNull SepiaData sepiaData);

    void saveReactionData(@NotNull SepiaData sepiaData);
}
