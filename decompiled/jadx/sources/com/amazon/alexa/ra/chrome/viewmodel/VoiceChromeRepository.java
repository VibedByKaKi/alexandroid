package com.amazon.alexa.ra.chrome.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.chrome.features.alexastate.AlexaStateSourceApi;
import com.amazon.alexa.ra.chrome.features.personality.PersonalitySourceApi;
import com.amazon.alexa.ra.chrome.model.AlexaUiState;
import com.amazon.alexa.ra.chrome.model.AlexaVoiceInvocationSource;
import com.amazon.alexa.ra.chrome.model.PersonalityInfo;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\tJ\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\tJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/ra/chrome/viewmodel/VoiceChromeRepository;", "", "alexaStateSource", "Lcom/amazon/alexa/ra/chrome/features/alexastate/AlexaStateSourceApi;", "personalitySource", "Lcom/amazon/alexa/ra/chrome/features/personality/PersonalitySourceApi;", "<init>", "(Lcom/amazon/alexa/ra/chrome/features/alexastate/AlexaStateSourceApi;Lcom/amazon/alexa/ra/chrome/features/personality/PersonalitySourceApi;)V", "getAlexaUiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", "getAlexaVoiceInvocationSource", "Lcom/amazon/alexa/ra/chrome/model/AlexaVoiceInvocationSource;", "getVolumeLevel", "", "getPersonality", "Lcom/amazon/alexa/ra/chrome/model/PersonalityInfo;", "start", "", "stop", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class VoiceChromeRepository {
    public static final int $stable = 0;

    @NotNull
    private final AlexaStateSourceApi alexaStateSource;

    @NotNull
    private final PersonalitySourceApi personalitySource;

    public VoiceChromeRepository(@NotNull AlexaStateSourceApi alexaStateSourceApi, @NotNull PersonalitySourceApi personalitySourceApi) {
        alexaStateSourceApi.getClass();
        personalitySourceApi.getClass();
        this.alexaStateSource = alexaStateSourceApi;
        this.personalitySource = personalitySourceApi;
    }

    @NotNull
    public final StateFlow<AlexaUiState> getAlexaUiState() {
        return this.alexaStateSource.getAlexaUiState();
    }

    @NotNull
    public final StateFlow<AlexaVoiceInvocationSource> getAlexaVoiceInvocationSource() {
        return this.alexaStateSource.getAlexaVoiceInvocationSource();
    }

    @NotNull
    public final StateFlow<PersonalityInfo> getPersonality() {
        return this.personalitySource.getPersonality();
    }

    @NotNull
    public final StateFlow<Float> getVolumeLevel() {
        return this.alexaStateSource.getVolumeLevel();
    }

    public final void start() {
        this.alexaStateSource.start();
        this.personalitySource.start();
    }

    public final void stop() {
        this.personalitySource.stop();
        this.alexaStateSource.stop();
    }
}
