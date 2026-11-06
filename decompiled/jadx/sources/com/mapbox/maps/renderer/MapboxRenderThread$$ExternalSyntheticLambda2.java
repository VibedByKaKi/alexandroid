package com.mapbox.maps.renderer;

import android.os.Handler;
import android.os.Message;
import com.amazon.alexa.api.compat.model.assistant.UserSpeechProvidersApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.VoiceActivityDetectionApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.VoiceActivityDetectionListenerProcessor;
import com.amazon.alexa.api.compat.model.assistant.WakeWordApiProcessor;
import com.amazon.alexa.api.compat.model.assistant.WakeWordStateListenerProcessor;
import com.google.android.exoplayer2.util.ListenerSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final /* synthetic */ class MapboxRenderThread$$ExternalSyntheticLambda2 implements Handler.Callback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapboxRenderThread$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        boolean handlerCallback$lambda$2;
        boolean handleMessage;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                handlerCallback$lambda$2 = MapboxRenderThread.handlerCallback$lambda$2((MapboxRenderThread) obj, message);
                return handlerCallback$lambda$2;
            case 1:
                return ((UserSpeechProvidersApiProcessor) obj).handleMessage(message);
            case 2:
                return ((VoiceActivityDetectionApiProcessor) obj).handleMessage(message);
            case 3:
                return ((VoiceActivityDetectionListenerProcessor) obj).handleMessage(message);
            case 4:
                return ((WakeWordApiProcessor) obj).handleMessage(message);
            case 5:
                return ((WakeWordStateListenerProcessor) obj).handleMessage(message);
            default:
                handleMessage = ((ListenerSet) obj).handleMessage(message);
                return handleMessage;
        }
    }
}
