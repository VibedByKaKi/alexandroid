package com.amazon.alexa.handsfree.audio.features;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.frames.translation.util.TranslationLanguageManager;
import com.amazon.alexa.handsfree.audio.api.LocaleApi;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeComponent;
import com.amazon.alexa.handsfree.protocols.utils.HandsFreeSupportedPackageName;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TypingAvailabilityResolver {
    public static final Map<Locale, Locale> DEVICE_LOCALE_AVS_LOCALE_MAP;
    private static final String TAG = "TypingAvailabilityResolver";
    private final ComponentEnablementResolver mComponentEnablementResolver;
    private final Context mContext;
    private final LocaleApi mLocaleApi;
    private static final String ALEXA_PACKAGE_NAME = HandsFreeSupportedPackageName.ALEXA_PACKAGE_NAME.toString();
    private static final Set<Locale> SUPPORTED_LOCALES = new HashSet(Arrays.asList(Locale.US, Locale.UK, new Locale("en", "AU"), new Locale("en", "IN"), new Locale("en", "NZ"), Locale.FRANCE, Locale.GERMANY, Locale.ITALY, new Locale(TranslationLanguageManager.DEFAULT_BYSTANDER_LANGUAGE, "ES"), new Locale(TranslationLanguageManager.DEFAULT_BYSTANDER_LANGUAGE, "MX"), new Locale(TranslationLanguageManager.DEFAULT_BYSTANDER_LANGUAGE, "US"), Locale.JAPAN, Locale.CANADA, Locale.CANADA_FRENCH));

    static {
        HashMap hashMap = new HashMap();
        DEVICE_LOCALE_AVS_LOCALE_MAP = hashMap;
        hashMap.put(new Locale("en", "NZ"), new Locale("en", "AU"));
        hashMap.put(new Locale("en", "IE"), new Locale("en", "GB"));
        hashMap.put(new Locale("de", "AT"), new Locale("de", "DE"));
    }

    public TypingAvailabilityResolver(@NonNull Context context) {
        this(context, new LocaleApi(), new ComponentEnablementResolver(context));
    }

    private Locale getFinalDeviceLocale(Locale locale) {
        Map<Locale, Locale> map = DEVICE_LOCALE_AVS_LOCALE_MAP;
        return map.containsKey(locale) ? map.get(locale) : locale;
    }

    private boolean isFeatureEnabledForI18N() {
        return this.mComponentEnablementResolver.isComponentEnabled(HandsFreeComponent.ALEXA_VOX_TTA);
    }

    private boolean isLocaleSupported(Locale locale) {
        if (locale == null) {
            Log.w(TAG, "Unable to get alexa locale.");
            return false;
        }
        Log.d(TAG, "Locale Supported ? " + locale + " is Weblab enabled ? " + isFeatureEnabledForI18N());
        return SUPPORTED_LOCALES.contains(locale);
    }

    public boolean isTypingEnabled() {
        boolean z = false;
        if (!this.mContext.getPackageName().startsWith(ALEXA_PACKAGE_NAME)) {
            return false;
        }
        Locale currentAlexaLocale = this.mLocaleApi.getCurrentAlexaLocale();
        Locale finalDeviceLocale = getFinalDeviceLocale(this.mLocaleApi.getCurrentDeviceLocale());
        if (currentAlexaLocale != null) {
            if (currentAlexaLocale.equals(finalDeviceLocale) && (isLocaleSupported(currentAlexaLocale) || isFeatureEnabledForI18N())) {
                z = true;
            }
            Log.d(TAG, "avsLocale: " + currentAlexaLocale + "deviceLocale: " + finalDeviceLocale + "isLocaleSupported: " + isLocaleSupported(currentAlexaLocale) + "isFeatureEnableForI18N: " + isFeatureEnabledForI18N());
        } else {
            Log.i(TAG, "avsLocale is null; using deviceLocale instead");
            if (finalDeviceLocale != null && (isLocaleSupported(finalDeviceLocale) || isFeatureEnabledForI18N())) {
                z = true;
            }
        }
        Log.i(TAG, "Typing feature is enabled : " + z);
        return z;
    }

    @VisibleForTesting
    public TypingAvailabilityResolver(@NonNull Context context, @NonNull LocaleApi localeApi, @NonNull ComponentEnablementResolver componentEnablementResolver) {
        this.mContext = context;
        this.mLocaleApi = localeApi;
        this.mComponentEnablementResolver = componentEnablementResolver;
    }
}
