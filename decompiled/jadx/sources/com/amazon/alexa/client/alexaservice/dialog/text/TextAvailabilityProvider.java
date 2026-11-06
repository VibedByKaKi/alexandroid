package com.amazon.alexa.client.alexaservice.dialog.text;

import android.content.Context;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.events.DeviceLocaleChangedEvent;
import com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority;
import com.amazon.alexa.client.alexaservice.base.system.LocaleAuthority;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.ApiCallEvent;
import com.amazon.alexa.client.alexaservice.features.bmclentitlement.BMCLEntitlementAuthority;
import com.amazon.alexa.client.alexaservice.features.bmclentitlement.BMCLEntitlementUpdateEvent;
import com.amazon.alexa.client.alexaservice.features.bmclentitlement.ConversationAvailabilityChangedEvent;
import com.amazon.alexa.utils.device.FireTabletUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class TextAvailabilityProvider {
    private static final Map<Locale, Locale> DEVICE_LOCALE_AVS_LOCALE_MAP;
    private static final String TAG = "TextAvailabilityProvider";
    private BMCLEntitlementAuthority bmclEntitlementAuthority;
    private final Context context;
    private final AlexaClientEventBus eventBus;
    private final FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority;
    private boolean isConversationalExperienceAvailable = false;
    private final LocaleAuthority localeAuthority;

    @VisibleForTesting
    static final Locale EN_US = new Locale("en", "US");

    @VisibleForTesting
    static final Locale JA_JP = new Locale("ja", "JP");
    static final Locale AR_SA = new Locale("ar", "SA");
    private static final Set<Locale> EXCLUDED_LOCALES = new HashSet(Arrays.asList(new Locale("hi", "IN")));

    static {
        HashMap hashMap = new HashMap();
        DEVICE_LOCALE_AVS_LOCALE_MAP = hashMap;
        hashMap.put(new Locale("en", "NZ"), new Locale("en", "AU"));
        hashMap.put(new Locale("en", "IE"), new Locale("en", "GB"));
        hashMap.put(new Locale("de", "AT"), new Locale("de", "DE"));
    }

    @Inject
    public TextAvailabilityProvider(FeatureFlagConfigurationAuthority featureFlagConfigurationAuthority, LocaleAuthority localeAuthority, BMCLEntitlementAuthority bMCLEntitlementAuthority, AlexaClientEventBus alexaClientEventBus, Context context) {
        this.featureFlagConfigurationAuthority = featureFlagConfigurationAuthority;
        this.localeAuthority = localeAuthority;
        this.bmclEntitlementAuthority = bMCLEntitlementAuthority;
        this.eventBus = alexaClientEventBus;
        this.context = context;
        alexaClientEventBus.register(this);
    }

    private boolean isLocaleExcluded(Locale locale) {
        return EXCLUDED_LOCALES.contains(locale);
    }

    private synchronized void updateConversationAvailabilityState() {
        boolean z = this.isConversationalExperienceAvailable;
        boolean isConversationAvailable = isConversationAvailable();
        this.isConversationalExperienceAvailable = isConversationAvailable;
        if (z != isConversationAvailable) {
            Log.i(TAG, "ConversationAvailabilityState: " + z + " -> " + this.isConversationalExperienceAvailable);
            this.eventBus.post(ConversationAvailabilityChangedEvent.create(this.isConversationalExperienceAvailable));
        }
    }

    public boolean isAvailable() {
        Locale primaryLocale = this.localeAuthority.getPrimaryLocale();
        Locale locale = Locale.getDefault();
        Map<Locale, Locale> map = DEVICE_LOCALE_AVS_LOCALE_MAP;
        if (map.get(locale) != null) {
            map.get(locale);
        }
        Objects.toString(primaryLocale);
        if (primaryLocale == null) {
            return false;
        }
        if (primaryLocale.equals(EN_US) || primaryLocale.equals(JA_JP) || primaryLocale.equals(AR_SA)) {
            return true;
        }
        return !isLocaleExcluded(primaryLocale);
    }

    public synchronized boolean isConversationAvailable() {
        boolean z;
        boolean isBMCLEntitled = this.bmclEntitlementAuthority.isBMCLEntitled();
        boolean isEnabled = this.featureFlagConfigurationAuthority.isEnabled(Feature.ALEXA_VOX_ANDROID_RA_LAUNCH);
        boolean isEnabled2 = this.featureFlagConfigurationAuthority.isEnabled(Feature.ALEXA_VOX_ANDROID_RA_LAUNCH_I18N);
        boolean shouldGrootBeEnabled = FireTabletUtils.shouldGrootBeEnabled(this.context);
        z = (isEnabled || shouldGrootBeEnabled || isEnabled2) && isBMCLEntitled;
        Log.i(TAG, "is conversation feature enabled ? " + isEnabled + " isRai18nEnabled: " + isEnabled2 + " isGrootEnabled? " + shouldGrootBeEnabled + " isBMCLEntitled? " + isBMCLEntitled + " allow access ? " + z);
        return z;
    }

    @Subscribe
    public synchronized void on(BMCLEntitlementUpdateEvent bMCLEntitlementUpdateEvent) {
        updateConversationAvailabilityState();
    }

    @VisibleForTesting
    public void setIsConversationalExperience(boolean z) {
        this.isConversationalExperienceAvailable = z;
    }

    @Subscribe
    public synchronized void on(ApiCallEvent.Locale.SetLocaleEvent setLocaleEvent) {
        updateConversationAvailabilityState();
    }

    @Subscribe
    public synchronized void on(DeviceLocaleChangedEvent deviceLocaleChangedEvent) {
        updateConversationAvailabilityState();
    }
}
