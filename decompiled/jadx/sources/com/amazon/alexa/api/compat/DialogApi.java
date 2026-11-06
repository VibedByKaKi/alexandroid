package com.amazon.alexa.api.compat;

import com.amazon.alexa.api.AlexaUserInterfaceOptions;
import com.amazon.alexa.api.LaunchType;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.DialogExtrasBundleKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J&\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/api/compat/DialogApi;", "", "start", "", "invocationType", "", "launchType", "Lcom/amazon/alexa/api/LaunchType;", DialogExtrasBundleKeys.USER_INTERFACE_OPTIONS, "Lcom/amazon/alexa/api/AlexaUserInterfaceOptions;", "stop", "cancel", "AlexaMobileAndroidVoiceSDKApiCompat_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface DialogApi {
    void cancel();

    void start(@Nullable String invocationType, @Nullable LaunchType launchType);

    void start(@Nullable String invocationType, @Nullable LaunchType launchType, @Nullable AlexaUserInterfaceOptions userInterfaceOptions);

    void stop();
}
