package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword;

import com.amazon.alexa.accessorykit.accessories.session.system.SystemModelI18nConfigTransformer;
import com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider.SpeechProvider;
import com.amazon.alexa.assistant.foundation.model.WakeWord;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001e\u0010\u0015\u001a\u00020\u00162\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0012\u001a\u00020\u0013H&J\b\u0010\u0017\u001a\u00020\u0016H&J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0018\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u000eX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordRegistry;", "", "prioritizedWakeWords", "", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "getPrioritizedWakeWords", "()Ljava/util/List;", "systemWakeWords", "getSystemWakeWords", "userWakeWords", "getUserWakeWords", "allWakeWords", "getAllWakeWords", "registeredWakeWordsFlow", "Lkotlinx/coroutines/flow/StateFlow;", "getRegisteredWakeWordsFlow", "()Lkotlinx/coroutines/flow/StateFlow;", SystemModelI18nConfigTransformer.KEY_WAKEWORDS, "provider", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProvider;", "speechProviders", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "deregisterAll", "deregister", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface WakeWordRegistry {
    void deregister(@NotNull SpeechProvider provider);

    void deregisterAll();

    @NotNull
    List<WakeWord> getAllWakeWords();

    @NotNull
    List<WakeWord> getPrioritizedWakeWords();

    @NotNull
    StateFlow<List<WakeWord>> getRegisteredWakeWordsFlow();

    @NotNull
    List<WakeWord> getSystemWakeWords();

    @NotNull
    List<WakeWord> getUserWakeWords();

    void register(@NotNull List<WakeWord> wakeWords, @NotNull SpeechProvider provider);

    @NotNull
    List<SpeechProvider> speechProviders(@NotNull List<WakeWord> wakeWords);

    @NotNull
    List<WakeWord> wakeWords(@NotNull SpeechProvider provider);
}
