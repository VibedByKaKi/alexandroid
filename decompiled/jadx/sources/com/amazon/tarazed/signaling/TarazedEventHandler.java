package com.amazon.tarazed.signaling;

import com.amazon.tarazed.signaling.events.TarazedEvent;
import java.util.List;
import kotlin.Metadata;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH&R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/amazon/tarazed/signaling/TarazedEventHandler;", "PayloadType", "", "handledEventTypes", "", "", "getHandledEventTypes", "()Ljava/util/List;", "payloadSerializer", "Lkotlinx/serialization/DeserializationStrategy;", "getPayloadSerializer", "()Lkotlinx/serialization/DeserializationStrategy;", "handleEvent", "", "e", "Lcom/amazon/tarazed/signaling/events/TarazedEvent;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public interface TarazedEventHandler<PayloadType> {
    @NotNull
    List<String> getHandledEventTypes();

    @NotNull
    DeserializationStrategy<? super PayloadType> getPayloadSerializer();

    void handleEvent(@NotNull TarazedEvent<? extends PayloadType> e);
}
