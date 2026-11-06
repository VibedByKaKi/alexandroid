package com.amazon.alexa.accessory.repositories.system;

import com.amazon.alexa.accessory.davs.DavsI18nConfig;
import com.amazon.alexa.accessory.protocol.System;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface SystemProvider {
    void provideI18nConfig(DavsI18nConfig davsI18nConfig);

    void provideI18nConfigError(Throwable th);

    void provideLocales(System.Locales locales);

    void provideLocalesError(Throwable th);

    void provideUsers(System.Users users);

    void provideUsersError(Throwable th);

    void provideWakewords(System.Wakewords wakewords);

    void provideWakewordsError(Throwable th);
}
