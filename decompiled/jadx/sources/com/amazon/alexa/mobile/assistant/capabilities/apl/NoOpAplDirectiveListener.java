package com.amazon.alexa.mobile.assistant.capabilities.apl;

import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/capabilities/apl/NoOpAplDirectiveListener;", "Lcom/amazon/alexa/mobile/assistant/capabilities/apl/AplDirectiveListener;", "<init>", "()V", "onAplDirective", "", VoiceBridgePayloadUtil.PayloadKey.COMMAND, "", "payload", "dialogRequestId", "capabilities_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NoOpAplDirectiveListener implements AplDirectiveListener {
    @Override // com.amazon.alexa.mobile.assistant.capabilities.apl.AplDirectiveListener
    public void onAplDirective(@NotNull String command, @NotNull String payload, @Nullable String dialogRequestId) {
        command.getClass();
        payload.getClass();
    }
}
