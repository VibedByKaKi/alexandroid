package com.amazon.alexa.api.compat.model;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0012H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0001"}, d2 = {"Lcom/amazon/alexa/api/compat/model/LocaleApiV2;", "", "setLocales", "", "locales", "", "Ljava/util/Locale;", "callbacks", "Lcom/amazon/alexa/api/compat/model/AlexaApiCallbacks;", "registerLocalesListener", "alexaLocalesListener", "Lcom/amazon/alexa/api/compat/model/AlexaLocalesListener;", "deregisterLocalesListener", "registerSupportedLocalesListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/amazon/alexa/api/compat/model/AlexaSupportedLocalesListenerV2;", "deregisterSupportedLocalesListener", "registerSupportedLocalesCombinationsListener", "Lcom/amazon/alexa/api/compat/model/AlexaSupportedLocalesCombinationsListenerV2;", "deregisterSupportedLocalesCombinationsListener", "AlexaMobileAndroidVoiceSDKApiCompatModel_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface LocaleApiV2 {
    void deregisterLocalesListener(@NotNull AlexaLocalesListener alexaLocalesListener);

    void deregisterSupportedLocalesCombinationsListener(@NotNull AlexaSupportedLocalesCombinationsListenerV2 listener);

    void deregisterSupportedLocalesListener(@NotNull AlexaSupportedLocalesListenerV2 listener);

    void registerLocalesListener(@NotNull AlexaLocalesListener alexaLocalesListener);

    void registerSupportedLocalesCombinationsListener(@NotNull AlexaSupportedLocalesCombinationsListenerV2 listener);

    void registerSupportedLocalesListener(@NotNull AlexaSupportedLocalesListenerV2 listener);

    void setLocales(@NotNull List<Locale> locales, @NotNull AlexaApiCallbacks callbacks);
}
