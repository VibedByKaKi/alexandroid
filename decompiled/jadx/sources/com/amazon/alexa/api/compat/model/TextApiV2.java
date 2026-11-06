package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProviderBundleKeys;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\rH&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0010H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0016H&J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0016H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/TextApiV2;", "", "sendMessage", "", "message", "", UserSpeechProviderBundleKeys.DIALOG_EXTRAS, "Lcom/amazon/alexa/api/compat/model/TextAlexaDialogExtras;", "registerLivePreviewListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/AlexaLivePreviewListener;", "deregisterLivePreviewListener", "registerTextResponseListener", "Lcom/amazon/alexa/api/compat/model/AlexaTextResponseListener;", "deregisterTextResponseListener", "registerCaptionListener", "Lcom/amazon/alexa/api/compat/model/AlexaCaptionListener;", "deregisterCaptionListener", "registerPlaybackSyncedCaptionListener", "Lcom/amazon/alexa/api/compat/model/PlaybackSyncedCaptionListener;", "deregisterPlaybackSyncedCaptionListener", "registerExpectTextListener", "Lcom/amazon/alexa/api/compat/model/AlexaExpectTextListenerV2;", "deregisterExpectTextListener", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface TextApiV2 {
    void deregisterCaptionListener(@NotNull AlexaCaptionListener listener);

    void deregisterExpectTextListener(@NotNull AlexaExpectTextListenerV2 listener);

    void deregisterLivePreviewListener(@NotNull AlexaLivePreviewListener listener);

    default void deregisterPlaybackSyncedCaptionListener(@NotNull PlaybackSyncedCaptionListener listener) {
        listener.getClass();
    }

    void deregisterTextResponseListener(@NotNull AlexaTextResponseListener listener);

    void registerCaptionListener(@NotNull AlexaCaptionListener listener);

    void registerExpectTextListener(@NotNull AlexaExpectTextListenerV2 listener);

    void registerLivePreviewListener(@NotNull AlexaLivePreviewListener listener);

    default void registerPlaybackSyncedCaptionListener(@NotNull PlaybackSyncedCaptionListener listener) {
        listener.getClass();
    }

    void registerTextResponseListener(@NotNull AlexaTextResponseListener listener);

    void sendMessage(@NotNull String message, @NotNull TextAlexaDialogExtras dialogExtras);
}
