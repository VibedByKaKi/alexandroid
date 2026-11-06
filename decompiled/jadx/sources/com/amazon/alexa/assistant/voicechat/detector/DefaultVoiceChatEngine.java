package com.amazon.alexa.assistant.voicechat.detector;

import com.amazon.alexa.assistant.foundation.model.VadEvent;
import com.amazon.alexa.assistant.foundation.model.VadMetricsListener;
import com.amazon.alexa.assistant.foundation.model.VoiceChatEngine;
import com.amazon.alexa.assistant.foundation.model.VoiceChatEngineMetricsCapable;
import com.amazon.alexa.assistant.foundation.model.VoiceChatIntentClassifier;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u000bH\u0016J\b\u0010\u0014\u001a\u00020\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/assistant/voicechat/detector/DefaultVoiceChatEngine;", "Lcom/amazon/alexa/assistant/foundation/model/VoiceChatEngine;", "Lcom/amazon/alexa/assistant/foundation/model/VoiceChatEngineMetricsCapable;", "vadEngine", "intentClassifier", "Lcom/amazon/alexa/assistant/foundation/model/VoiceChatIntentClassifier;", "<init>", "(Lcom/amazon/alexa/assistant/foundation/model/VoiceChatEngine;Lcom/amazon/alexa/assistant/foundation/model/VoiceChatIntentClassifier;)V", "getIntentClassifier", "()Lcom/amazon/alexa/assistant/foundation/model/VoiceChatIntentClassifier;", "initialize", "", "processAudio", "Lcom/amazon/alexa/assistant/foundation/model/VadEvent;", "pcm", "", "offset", "", "length", "reset", "release", "attachMetricsListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/assistant/foundation/model/VadMetricsListener;", "voicechat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DefaultVoiceChatEngine implements VoiceChatEngine, VoiceChatEngineMetricsCapable {

    @NotNull
    private final VoiceChatIntentClassifier intentClassifier;

    @NotNull
    private final VoiceChatEngine vadEngine;

    public DefaultVoiceChatEngine(@NotNull VoiceChatEngine voiceChatEngine, @NotNull VoiceChatIntentClassifier voiceChatIntentClassifier) {
        voiceChatEngine.getClass();
        voiceChatIntentClassifier.getClass();
        this.vadEngine = voiceChatEngine;
        this.intentClassifier = voiceChatIntentClassifier;
    }

    @Override // com.amazon.alexa.assistant.foundation.model.VoiceChatEngineMetricsCapable
    public void attachMetricsListener(@NotNull VadMetricsListener listener) {
        listener.getClass();
        VoiceChatEngine voiceChatEngine = this.vadEngine;
        VoiceChatEngineMetricsCapable voiceChatEngineMetricsCapable = voiceChatEngine instanceof VoiceChatEngineMetricsCapable ? (VoiceChatEngineMetricsCapable) voiceChatEngine : null;
        if (voiceChatEngineMetricsCapable != null) {
            voiceChatEngineMetricsCapable.attachMetricsListener(listener);
        }
    }

    @Override // com.amazon.alexa.assistant.foundation.model.VoiceChatEngine
    @NotNull
    public VoiceChatIntentClassifier getIntentClassifier() {
        return this.intentClassifier;
    }

    @Override // com.amazon.alexa.assistant.foundation.model.VoiceChatEngine
    public void initialize() {
        this.vadEngine.initialize();
    }

    @Override // com.amazon.alexa.assistant.foundation.model.VoiceChatEngine
    @NotNull
    public VadEvent processAudio(@NotNull byte[] pcm, int offset, int length) {
        pcm.getClass();
        return this.vadEngine.processAudio(pcm, offset, length);
    }

    @Override // com.amazon.alexa.assistant.foundation.model.VoiceChatEngine
    public void release() {
        this.vadEngine.release();
    }

    @Override // com.amazon.alexa.assistant.foundation.model.VoiceChatEngine
    public void reset() {
        this.vadEngine.reset();
    }
}
