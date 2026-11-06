package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword;

import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model.WakeWordDetectionResult;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model.WakeWordRecognizerError;
import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordEngineDetectionListener;", "", "onWakeWordDetected", "", "result", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;", LoadIndexListDataEventHandler.START_INDEX_KEY, "", "endIndex", "audio", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordAudioExtract;", "onDetectionError", "error", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface WakeWordEngineDetectionListener {
    void onDetectionError(@NotNull WakeWordRecognizerError error);

    @InternalAssistantSdkApi
    void onWakeWordDetected(@NotNull WakeWordDetectionResult result, long startIndex, long endIndex, @NotNull WakeWordAudioExtract audio);
}
