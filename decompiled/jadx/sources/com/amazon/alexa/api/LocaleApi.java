package com.amazon.alexa.api;

import com.amazon.alexa.client.annotations.NonNull;
import com.amazon.alexa.client.annotations.Nullable;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface LocaleApi {
    void deregisterListener(@NonNull AlexaLocalesListener alexaLocalesListener);

    void deregisterListener(@NonNull AlexaSupportedLocalesListener alexaSupportedLocalesListener);

    void registerListener(@NonNull AlexaLocalesListener alexaLocalesListener);

    void registerListener(@NonNull AlexaSupportedLocalesListener alexaSupportedLocalesListener);

    void setLocale(@NonNull java.util.Locale locale);

    void setLocale(@NonNull java.util.Locale locale, @Nullable AlexaApiCallbacks alexaApiCallbacks);

    void setLocales(@NonNull List<java.util.Locale> list);

    void setLocales(@NonNull List<java.util.Locale> list, @Nullable AlexaApiCallbacks alexaApiCallbacks);
}
