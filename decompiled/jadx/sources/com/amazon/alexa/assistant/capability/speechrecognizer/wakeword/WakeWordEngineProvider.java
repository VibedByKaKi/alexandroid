package com.amazon.alexa.assistant.capability.speechrecognizer.wakeword;

import com.amazon.alexa.accessorykit.accessories.session.system.SystemModelI18nConfigTransformer;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.SpeechProviderMetadataBundleKeys;
import com.amazon.alexa.assistant.foundation.internal.InternalAssistantSdkApi;
import com.amazon.alexa.assistant.foundation.model.WakeWord;
import com.amazon.alexa.client.alexaservice.voicechat.VoiceChatContract;
import com.facebook.hermes.intl.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAssistantSdkApi
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0017\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u001aH&J\u000e\u0010\u001b\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u0017J\u0016\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H¦@¢\u0006\u0002\u0010\u001dJ$\u0010\u001e\u001a\u00020\u000e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010 \u001a\u00020!H¦@¢\u0006\u0002\u0010\"J\u000e\u0010#\u001a\u00020\u000eH¦@¢\u0006\u0002\u0010\u0017J\b\u0010$\u001a\u00020!H&R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006%"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordEngineProvider;", "", "enabledWakeWords", "", "Lcom/amazon/alexa/assistant/foundation/model/WakeWord;", "getEnabledWakeWords", "()Ljava/util/Set;", SpeechProviderMetadataBundleKeys.SUPPORTED_WAKE_WORDS, "getSupportedWakeWords", "wakeWordsEnabledFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getWakeWordsEnabledFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "initialize", "", "modelData", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordEngineDetectionListener;", Constants.COLLATION_OPTION_SENSITIVITY, "", "([BLcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/WakeWordEngineDetectionListener;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startDetection", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "processAudioFrame", "audioFrame", "", "stopDetection", "setSensitivity", "(FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setWakeWordsEnabled", SystemModelI18nConfigTransformer.KEY_WAKEWORDS, "enabled", "", "(Ljava/util/Set;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "destroy", VoiceChatContract.COLUMN_IS_ACTIVE, "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface WakeWordEngineProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object initialize$default(WakeWordEngineProvider wakeWordEngineProvider, byte[] bArr, WakeWordEngineDetectionListener wakeWordEngineDetectionListener, float f, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: initialize");
                return null;
            }
            if ((i & 4) != 0) {
                f = 0.5f;
            }
            return wakeWordEngineProvider.initialize(bArr, wakeWordEngineDetectionListener, f, continuation);
        }
    }

    @Nullable
    Object destroy(@NotNull Continuation<? super Unit> continuation);

    @NotNull
    Set<WakeWord> getEnabledWakeWords();

    @NotNull
    Set<WakeWord> getSupportedWakeWords();

    @NotNull
    SharedFlow<Set<WakeWord>> getWakeWordsEnabledFlow();

    @Nullable
    Object initialize(@NotNull byte[] bArr, @NotNull WakeWordEngineDetectionListener wakeWordEngineDetectionListener, float f, @NotNull Continuation<? super Unit> continuation);

    boolean isActive();

    void processAudioFrame(@NotNull short[] audioFrame);

    @Nullable
    Object setSensitivity(float f, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setWakeWordsEnabled(@NotNull Set<WakeWord> set, boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object startDetection(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object stopDetection(@NotNull Continuation<? super Unit> continuation);
}
