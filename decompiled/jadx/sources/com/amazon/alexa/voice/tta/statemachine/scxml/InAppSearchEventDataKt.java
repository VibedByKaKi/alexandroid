package com.amazon.alexa.voice.tta.statemachine.scxml;

import com.amazon.scxml.SCXMLContext;
import com.amazon.scxml.SCXMLEvent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¨\u0006\u0004"}, d2 = {"getTypedEventData", "Lcom/amazon/alexa/voice/tta/statemachine/scxml/InAppSearchEventData;", "Lcom/amazon/scxml/SCXMLContext;", "Lcom/amazon/alexa/voice/tta/statemachine/scxml/InAppSearchContext;", "AlexaMobileAndroidVoice-TTA_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class InAppSearchEventDataKt {
    @Nullable
    public static final InAppSearchEventData getTypedEventData(@NotNull SCXMLContext<InAppSearchContext> sCXMLContext) {
        sCXMLContext.getClass();
        SCXMLEvent sCXMLEvent = sCXMLContext.get_event();
        Object data = sCXMLEvent != null ? sCXMLEvent.getData() : null;
        if (data instanceof InAppSearchEventData) {
            return (InAppSearchEventData) data;
        }
        return null;
    }
}
