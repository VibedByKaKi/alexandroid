package com.amazon.alexa.ra.chrome.features.alexastate;

import com.amazon.alexa.ra.chrome.model.AlexaUiState;
import com.amazon.alexa.ra.chrome.model.AlexaVoiceInvocationSource;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003H&J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\nH&¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/amazon/alexa/ra/chrome/features/alexastate/AlexaStateSourceApi;", "", "getAlexaUiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/amazon/alexa/ra/chrome/model/AlexaUiState;", "getAlexaVoiceInvocationSource", "Lcom/amazon/alexa/ra/chrome/model/AlexaVoiceInvocationSource;", "getVolumeLevel", "", "start", "", "stop", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public interface AlexaStateSourceApi {
    @NotNull
    StateFlow<AlexaUiState> getAlexaUiState();

    @NotNull
    StateFlow<AlexaVoiceInvocationSource> getAlexaVoiceInvocationSource();

    @NotNull
    StateFlow<Float> getVolumeLevel();

    void start();

    void stop();
}
