package com.amazon.rtvi.mobile.alexa;

import com.amazon.rtvi.alexa.model.events.RTVIEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/amazon/rtvi/mobile/alexa/AlexaEventSender;", "", "sendEvent", "", "eventType", "Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", "payload", "", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface AlexaEventSender {
    void sendEvent(@NotNull RTVIEvent eventType, @Nullable String payload);
}
