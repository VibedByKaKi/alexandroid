package com.amazon.alexa.handsfree.protocols.settings;

import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.callback.ResultCallback;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class WakeWordSettingsManager {
    public abstract void checkHandsFreeState(@NonNull ResultCallback<Boolean> resultCallback);

    public abstract void checkVoiceAppCurrentLocale(@NonNull ResultCallback<String> resultCallback);

    public abstract void checkVoiceAppSupportedLocales(@NonNull ResultCallback<List<String>> resultCallback);

    public abstract void deregisterHandsFreeCapableApp(@NonNull String str, @NonNull ResponseCallback responseCallback);

    public abstract void getHandsFreeCapableAppList(@NonNull ResultCallback<List<String>> resultCallback);

    public abstract void getPreferredAmazonApp(@NonNull ResultCallback<String> resultCallback);

    public abstract void registerHandsFreeCapableApp(@NonNull String str, @NonNull ResponseCallback responseCallback);

    public abstract void setHandsFreeState(boolean z, @NonNull ResponseCallback responseCallback);

    public abstract void setHandsFreeState(boolean z, @NonNull ResponseCallback responseCallback, String str);

    public abstract void setPreferredAmazonApp(@NonNull String str, @NonNull ResponseCallback responseCallback);

    public abstract void setVoiceAppLocale(@NonNull String str, @NonNull ResponseCallback responseCallback);
}
