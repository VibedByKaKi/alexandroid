package com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider;

import com.amazon.alexa.assistant.capability.speechrecognizer.wakeword.model.WakeWordDetectionResult;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignal;", "", "<init>", "()V", "StartCaptureRequested", "StopCapture", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignal$StartCaptureRequested;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignal$StopCapture;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public abstract class SpeechProviderSignal {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignal$StartCaptureRequested;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignal;", Scopes.PROFILE, "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;", AlexaMetricsConstants.AssistantSdkDimensions.INITIATOR, "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechInitiator;", "wakeWordDetection", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;", "extras", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/VoiceDialogExtras;", "callback", "Lkotlin/Function1;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderError;", "", "<init>", "(Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechInitiator;Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/VoiceDialogExtras;Lkotlin/jvm/functions/Function1;)V", "getProfile", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechRecognitionProfile;", "getInitiator", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechInitiator;", "getWakeWordDetection", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/wakeword/model/WakeWordDetectionResult;", "getExtras", "()Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/VoiceDialogExtras;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StartCaptureRequested extends SpeechProviderSignal {

        @NotNull
        private final Function1<SpeechProviderError, Unit> callback;

        @NotNull
        private final VoiceDialogExtras extras;

        @NotNull
        private final SpeechInitiator initiator;

        @NotNull
        private final SpeechRecognitionProfile profile;

        @Nullable
        private final WakeWordDetectionResult wakeWordDetection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public StartCaptureRequested(@NotNull SpeechRecognitionProfile speechRecognitionProfile, @NotNull SpeechInitiator speechInitiator, @Nullable WakeWordDetectionResult wakeWordDetectionResult, @NotNull VoiceDialogExtras voiceDialogExtras, @NotNull Function1<? super SpeechProviderError, Unit> function1) {
            super(null);
            speechRecognitionProfile.getClass();
            speechInitiator.getClass();
            voiceDialogExtras.getClass();
            function1.getClass();
            this.profile = speechRecognitionProfile;
            this.initiator = speechInitiator;
            this.wakeWordDetection = wakeWordDetectionResult;
            this.extras = voiceDialogExtras;
            this.callback = function1;
        }

        @NotNull
        public final Function1<SpeechProviderError, Unit> getCallback() {
            return this.callback;
        }

        @NotNull
        public final VoiceDialogExtras getExtras() {
            return this.extras;
        }

        @NotNull
        public final SpeechInitiator getInitiator() {
            return this.initiator;
        }

        @NotNull
        public final SpeechRecognitionProfile getProfile() {
            return this.profile;
        }

        @Nullable
        public final WakeWordDetectionResult getWakeWordDetection() {
            return this.wakeWordDetection;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignal$StopCapture;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/SpeechProviderSignal;", "<init>", "()V", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StopCapture extends SpeechProviderSignal {

        @NotNull
        public static final StopCapture INSTANCE = new StopCapture();

        private StopCapture() {
            super(null);
        }

        public boolean equals(@Nullable Object other) {
            return this == other || (other instanceof StopCapture);
        }

        public int hashCode() {
            return 1881178973;
        }

        @NotNull
        public String toString() {
            return "StopCapture";
        }
    }

    public /* synthetic */ SpeechProviderSignal(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private SpeechProviderSignal() {
    }
}
