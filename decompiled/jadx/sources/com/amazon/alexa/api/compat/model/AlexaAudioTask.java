package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000bH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/AlexaAudioTask;", "", "getAlexaAudioChannel", "Lcom/amazon/alexa/api/compat/model/AlexaAudioChannel;", "getAlexaAudioTaskBehavior", "Lcom/amazon/alexa/api/compat/model/AlexaAudioTaskBehavior;", "getAudioTaskComponentName", "", "getAlexaAudioTaskChannelPriority", "Lcom/amazon/alexa/api/compat/model/AlexaAudioTaskChannelPriority;", "onBackground", "", "onForeground", "onPause", "onResume", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface AlexaAudioTask {
    @NotNull
    /* renamed from: getAlexaAudioChannel */
    AlexaAudioChannel getChannel();

    @NotNull
    /* renamed from: getAlexaAudioTaskBehavior */
    default AlexaAudioTaskBehavior getBehavior() {
        return AlexaAudioTaskBehavior.DEFAULT;
    }

    @NotNull
    /* renamed from: getAlexaAudioTaskChannelPriority */
    AlexaAudioTaskChannelPriority getPriority();

    @NotNull
    /* renamed from: getAudioTaskComponentName */
    String getComponentName();

    void onBackground();

    void onForeground();

    void onPause();

    void onResume();

    void onStop();
}
