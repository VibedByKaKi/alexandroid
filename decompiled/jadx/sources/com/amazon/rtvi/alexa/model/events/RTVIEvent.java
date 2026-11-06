package com.amazon.rtvi.alexa.model.events;

import com.amazon.alexa.accessory.frames.translation.capability.LiveTranslationCapabilityConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/amazon/rtvi/alexa/model/events/RTVIEvent;", "", "eventName", "", "getEventName", "()Ljava/lang/String;", LiveTranslationCapabilityConstants.KEY_SESSION_ID, "getSessionId", "RTVIAlexaModel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface RTVIEvent {
    @Nullable
    String getEventName();

    @Nullable
    String getSessionId();
}
