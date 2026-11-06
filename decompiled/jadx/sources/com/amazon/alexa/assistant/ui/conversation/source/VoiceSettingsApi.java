package com.amazon.alexa.assistant.ui.conversation.source;

import com.amazon.alexa.lifecycle.api.LifecycleEvent;
import kotlin.Metadata;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&J\b\u0010\u000e\u001a\u00020\u0006H&J\b\u0010\u000f\u001a\u00020\u0006H&J\b\u0010\u0010\u001a\u00020\u0006H&R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/source/VoiceSettingsApi;", "", "isFollowUpModeEnabled", "Lkotlinx/coroutines/flow/StateFlow;", "", "setFollowUpModeEnabled", "", "enabled", "isBriefModeEnabled", "setBriefModeEnabled", "isWhisperModeEnabled", "setWhisperModeEnabled", "isAdaptiveVolumeEnabled", "setAdaptiveVolumeEnabled", "start", "stop", "refresh", LifecycleEvent.IS_LOADED, "()Lkotlinx/coroutines/flow/StateFlow;", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface VoiceSettingsApi {
    @NotNull
    StateFlow<Boolean> isAdaptiveVolumeEnabled();

    @NotNull
    StateFlow<Boolean> isBriefModeEnabled();

    @NotNull
    StateFlow<Boolean> isFollowUpModeEnabled();

    @NotNull
    StateFlow<Boolean> isLoaded();

    @NotNull
    StateFlow<Boolean> isWhisperModeEnabled();

    void refresh();

    void setAdaptiveVolumeEnabled(boolean enabled);

    void setBriefModeEnabled(boolean enabled);

    void setFollowUpModeEnabled(boolean enabled);

    void setWhisperModeEnabled(boolean enabled);

    void start();

    void stop();
}
