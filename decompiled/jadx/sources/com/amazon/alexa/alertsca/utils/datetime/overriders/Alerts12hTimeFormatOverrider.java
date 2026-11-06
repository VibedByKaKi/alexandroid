package com.amazon.alexa.alertsca.utils.datetime.overriders;

import androidx.annotation.NonNull;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class Alerts12hTimeFormatOverrider implements AlertsDateTimeOverrider<String> {
    public static final Map<Locale, String> TIME_FORMAT_BY_LOCALE = new ImmutableMap.Builder().put(Locale.JAPAN, "K:mm").build();

    @Override // com.amazon.alexa.alertsca.utils.datetime.overriders.AlertsDateTimeOverrider
    public String overrideOrDefault(@NonNull Locale locale, String str) {
        Map<Locale, String> map = TIME_FORMAT_BY_LOCALE;
        return map.containsKey(locale) ? map.get(locale) : str;
    }
}
