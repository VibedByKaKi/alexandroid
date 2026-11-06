package com.amazon.alexa.alertsca.utils.datetime.overriders;

import androidx.annotation.NonNull;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface AlertsDateTimeOverrider<T> {
    T overrideOrDefault(@NonNull Locale locale, T t);
}
