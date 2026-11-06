package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword;

import com.amazon.alexa.accessorykit.accessories.session.system.SystemModelI18nConfigTransformer;
import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model.WakeWordDetectionResult;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model.WakeWordRecognizerError;
import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model.WakeWordRecognizerState;
import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import com.amazon.alexa.assistant.foundation.model.WakeWord;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J(\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH'J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H&J\u0016\u0010\u0013\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H&¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordRecognizerListener;", "", "shouldStartRecognizer", "", "onStateChanged", "", "state", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerState;", "onWakeWordDetected", "detection", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;", LoadIndexListDataEventHandler.START_INDEX_KEY, "", "endIndex", "audio", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordAudioExtract;", "onError", "error", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordRecognizerError;", "onWakeWordsChanged", SystemModelI18nConfigTransformer.KEY_WAKEWORDS, "", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface WakeWordRecognizerListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static boolean shouldStartRecognizer(@NotNull WakeWordRecognizerListener wakeWordRecognizerListener) {
            return true;
        }
    }

    void onError(@NotNull WakeWordRecognizerError error);

    void onStateChanged(@NotNull WakeWordRecognizerState state);

    @InternalAssistantSdkApi
    void onWakeWordDetected(@NotNull WakeWordDetectionResult detection, long startIndex, long endIndex, @NotNull WakeWordAudioExtract audio);

    void onWakeWordsChanged(@NotNull List<WakeWord> wakeWords);

    boolean shouldStartRecognizer();
}
