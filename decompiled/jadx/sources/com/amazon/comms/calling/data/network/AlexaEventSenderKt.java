package com.amazon.comms.calling.data.network;

import com.amazon.alexa.api.compat.model.AlexaAudioChannel;
import com.amazon.alexa.api.compat.model.AlexaAudioTask;
import com.amazon.alexa.api.compat.model.AlexaAudioTaskBehavior;
import com.amazon.alexa.api.compat.model.AlexaAudioTaskChannelPriority;
import com.amazon.alexa.api.compat.model.AlexaHeader;
import com.amazon.alexa.api.compat.model.AlexaPayload;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007\u001a\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0007\u001a\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u000e"}, d2 = {"commsAudioTask", "Lcom/amazon/alexa/api/compat/model/AlexaAudioTask;", "getCommsAudioTask", "()Lcom/amazon/alexa/api/compat/model/AlexaAudioTask;", "createHeaderForPCCEvent", "Lcom/amazon/alexa/api/compat/model/AlexaHeader;", "namespace", "", "eventName", "pccEventName", "createHeaderForHalloEvent", "createPayload", "Lcom/amazon/alexa/api/compat/model/AlexaPayload;", "payload", "AlexaCommsCallingUI-Android_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class AlexaEventSenderKt {

    @NotNull
    private static final AlexaAudioTask commsAudioTask = new AlexaAudioTask() { // from class: com.amazon.comms.calling.data.network.AlexaEventSenderKt$commsAudioTask$1
        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        /* renamed from: getAlexaAudioChannel */
        public AlexaAudioChannel getChannel() {
            return AlexaAudioChannel.COMMUNICATIONS;
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        /* renamed from: getAlexaAudioTaskBehavior */
        public AlexaAudioTaskBehavior getBehavior() {
            return AlexaAudioTaskBehavior.DEFAULT;
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        /* renamed from: getAlexaAudioTaskChannelPriority */
        public AlexaAudioTaskChannelPriority getPriority() {
            return AlexaAudioTaskChannelPriority.HIGH;
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        /* renamed from: getAudioTaskComponentName */
        public String getComponentName() {
            return "SipClient";
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        public void onBackground() {
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        public void onForeground() {
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        public void onPause() {
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        public void onResume() {
        }

        @Override // com.amazon.alexa.api.compat.model.AlexaAudioTask
        public void onStop() {
        }
    };

    @NotNull
    public static final AlexaHeader createHeaderForHalloEvent(@NotNull String str) {
        str.getClass();
        return createHeaderForPCCEvent("SipClient", str);
    }

    @NotNull
    public static final AlexaHeader createHeaderForPCCEvent(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        return AlexaHeader.INSTANCE.builder().setNamespace(str).setName(str2).build();
    }

    @NotNull
    public static final AlexaPayload createPayload(@NotNull String str) {
        str.getClass();
        return new AlexaPayload(str);
    }

    @NotNull
    public static final AlexaAudioTask getCommsAudioTask() {
        return commsAudioTask;
    }

    @NotNull
    public static final AlexaHeader createHeaderForPCCEvent(@NotNull String str) {
        str.getClass();
        return createHeaderForPCCEvent("Alexa.Comms.PhoneCallController", str);
    }
}
