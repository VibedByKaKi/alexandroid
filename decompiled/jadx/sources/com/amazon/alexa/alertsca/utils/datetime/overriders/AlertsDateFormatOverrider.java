package com.amazon.alexa.alertsca.utils.datetime.overriders;

import androidx.annotation.NonNull;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlertsDateFormatOverrider implements AlertsDateTimeOverrider<String> {
    public static final Map<String, String> DATE_FORMAT_BY_LOCALE = new ImmutableMap.Builder().put("en_AU", "EEE, d MMM").put("en_CA", "EEE, MMM d").put("en_GB", "EEE, d MMM").put("en_US", "EEE, MMM d").put("de_DE", "EEE., d. MMM.").put("en_IN", "EEE, d MMM").put("es_ES", "EEE., d MMM.").put("es_MX", "EEE. d 'de' MMM").put("es_US", "EEE., d MMM.").put("fr_CA", "EEE d MMM").put("fr_FR", "EEE d MMM").put("hi_IN", "EEE, d MMM").put("it_IT", "EEE d MMM").put("pt_BR", "EEE, d 'de' MMM").put("ja_JP", "MMMMd'日'(EEE)").build();
    public static final Map<String, String> DATE_FORMAT_BY_LANGUAGE = new ImmutableMap.Builder().put("ar", "EEEE, d MMMM").build();

    @Override // com.amazon.alexa.alertsca.utils.datetime.overriders.AlertsDateTimeOverrider
    public String overrideOrDefault(@NonNull Locale locale, String str) {
        Map<String, String> map = DATE_FORMAT_BY_LOCALE;
        if (map.containsKey(locale.toString())) {
            return map.get(locale.toString());
        }
        Map<String, String> map2 = DATE_FORMAT_BY_LANGUAGE;
        return map2.containsKey(locale.getLanguage()) ? map2.get(locale.getLanguage()) : str;
    }
}
