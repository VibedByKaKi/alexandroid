package com.amazon.alexa.alertsca.utils.datetime.overriders;

import androidx.annotation.NonNull;
import com.google.common.collect.Sets;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlertsTimeOrderOverrider implements AlertsDateTimeOverrider<Boolean> {
    private static final Set<Locale> LOCALES_WITH_REVERSED_TIME_ORDER = Sets.newHashSet(Locale.JAPAN);

    @Override // com.amazon.alexa.alertsca.utils.datetime.overriders.AlertsDateTimeOverrider
    public Boolean overrideOrDefault(@NonNull Locale locale, Boolean bool) {
        return LOCALES_WITH_REVERSED_TIME_ORDER.contains(locale) ? Boolean.TRUE : bool;
    }
}
