package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword;

import com.amazon.alexa.accessorykit.accessories.session.system.SystemModelI18nConfigTransformer;
import com.amazon.alexa.assistant.foundation.model.SDKError;
import com.amazon.alexa.assistant.foundation.model.WakeWord;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\u0007\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordDelegate;", "", "onWakeWordsChanged", "", SystemModelI18nConfigTransformer.KEY_WAKEWORDS, "", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "onWakeWordsEnabled", "onWakeWordsDisabled", "onWakeWordError", "error", "Lcom/amazon/alexa/assistant/foundation/model/SDKError;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface WakeWordDelegate {
    void onWakeWordError(@NotNull SDKError error);

    void onWakeWordsChanged(@NotNull Set<WakeWord> wakeWords);

    void onWakeWordsDisabled(@NotNull Set<WakeWord> wakeWords);

    void onWakeWordsEnabled(@NotNull Set<WakeWord> wakeWords);
}
