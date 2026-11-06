package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProviderBundleKeys;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/WakeWordApiV2;", "", "startListening", "", UserSpeechProviderBundleKeys.DIALOG_EXTRAS, "Lcom/amazon/alexa/api/compat/model/AlexaDialogExtras;", "stopListening", "registerWakeWordStateListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/WakeWordStateListener;", "deregisterWakeWordStateListener", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface WakeWordApiV2 {
    void deregisterWakeWordStateListener(@NotNull WakeWordStateListener listener);

    void registerWakeWordStateListener(@NotNull WakeWordStateListener listener);

    void startListening();

    void startListening(@NotNull AlexaDialogExtras dialogExtras);

    void stopListening();
}
