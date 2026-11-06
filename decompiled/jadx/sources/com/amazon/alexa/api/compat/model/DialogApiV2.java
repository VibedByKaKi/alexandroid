package com.amazon.alexa.api.compat.model;

import com.amazon.alexa.api.compat.model.assistant.subcomponent.DialogExtrasBundleKeys;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.UserSpeechProviderBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/DialogApiV2;", "", "start", "", "invocationType", "", "launchType", "Lcom/amazon/alexa/api/compat/model/LaunchType;", DialogExtrasBundleKeys.USER_INTERFACE_OPTIONS, "Lcom/amazon/alexa/api/compat/model/AlexaUserInterfaceOptions;", UserSpeechProviderBundleKeys.DIALOG_EXTRAS, "Lcom/amazon/alexa/api/compat/model/AlexaDialogExtras;", "stop", "cancel", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface DialogApiV2 {
    void cancel();

    void start(@NotNull AlexaDialogExtras dialogExtras);

    void start(@Nullable String invocationType, @Nullable LaunchType launchType, @Nullable AlexaUserInterfaceOptions userInterfaceOptions);

    void stop();
}
