package com.amazon.alexa.client.alexaservice.base.application.configuration;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.base.system.EndpointAuthority;
import com.amazon.alexa.client.core.configuration.ClientConfiguration;
import com.amazon.alexa.client.core.configuration.ConfigurationLoader;
import com.amazon.alexa.client.core.configuration.ExperimentalLocale;
import com.amazon.alexa.client.core.configuration.ExperimentalLocaleCombination;
import com.amazon.alexa.client.core.configuration.Loader;
import com.amazon.alexa.client.core.configuration.Stage;
import com.amazon.alexa.client.metrics.core.DefaultMetricsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DefaultConfigurationLoader implements Loader<ClientConfiguration.Builder> {
    private final ApplicationMetadata applicationMetadata;
    private static final Locale LOCALE_DE_DE = Locale.GERMANY;
    private static final Locale LOCALE_EN_US = Locale.US;
    private static final Locale LOCALE_EN_GB = Locale.UK;
    private static final Locale LOCALE_EN_IE = Locale.forLanguageTag("en-IE");
    private static final Locale LOCALE_FR_FR = Locale.FRANCE;
    private static final Locale LOCALE_DE_AT = Locale.forLanguageTag("de-AT");
    private static final Locale LOCALE_ES_US = Locale.forLanguageTag("es-US");
    private static final Locale LOCALE_EN_AU = Locale.forLanguageTag("en-AU");
    private static final Locale LOCALE_EN_NZ = Locale.forLanguageTag("en-NZ");
    private static final Locale LOCALE_EN_IN = Locale.forLanguageTag("en-IN");
    private static final Locale LOCALE_HI_IN = Locale.forLanguageTag("hi-IN");
    private static final Locale LOCALE_EN_CA = Locale.CANADA;
    private static final Locale LOCALE_FR_CA = Locale.CANADA_FRENCH;
    private static final Locale LOCALE_ES_ES = Locale.forLanguageTag("es-ES");
    private static final Locale LOCALE_ES_MX = Locale.forLanguageTag("es-MX");
    private static final Locale LOCALE_IT_IT = Locale.ITALY;
    private static final Locale LOCALE_JP_JP = Locale.JAPAN;
    private static final Locale LOCALE_PT_BR = Locale.forLanguageTag("pt-BR");
    private static final Locale LOCALE_AR_SA = Locale.forLanguageTag("ar-SA");
    private static final Locale LOCALE_NL_NL = Locale.forLanguageTag("nl-NL");
    private static final Locale LOCALE_NL_BE = Locale.forLanguageTag("nl-BE");

    @Inject
    public DefaultConfigurationLoader(ApplicationMetadata applicationMetadata) {
        this.applicationMetadata = applicationMetadata;
    }

    @VisibleForTesting
    public static Set<Locale> getActualSupportedLocales() {
        return new HashSet(Arrays.asList(LOCALE_DE_DE, LOCALE_EN_US, LOCALE_EN_GB, LOCALE_EN_AU, LOCALE_EN_CA, LOCALE_EN_IN, LOCALE_ES_ES, LOCALE_ES_MX, LOCALE_ES_US, LOCALE_FR_CA, LOCALE_FR_FR, LOCALE_IT_IT, LOCALE_JP_JP, LOCALE_PT_BR, LOCALE_HI_IN, LOCALE_AR_SA, LOCALE_NL_NL));
    }

    @VisibleForTesting
    public static Set<ExperimentalLocaleCombination> getExperimentalLocaleCombinations() {
        Locale locale = LOCALE_AR_SA;
        Locale locale2 = LOCALE_EN_US;
        Feature feature = Feature.ALEXA_VOX_ANDROID_EXPERIMENTAL_PAIR_ARABIC_ENGLISH_LOCALES;
        ExperimentalLocaleCombination experimentalLocaleCombination = new ExperimentalLocaleCombination(locale, locale2, feature);
        ExperimentalLocaleCombination experimentalLocaleCombination2 = new ExperimentalLocaleCombination(locale2, locale, feature);
        Locale locale3 = LOCALE_DE_DE;
        Locale locale4 = LOCALE_IT_IT;
        Feature feature2 = Feature.ALEXA_VOX_ANDROID_EXPERIMENTAL_PAIR_GERMAN_ITALIAN_LOCALES;
        ExperimentalLocaleCombination experimentalLocaleCombination3 = new ExperimentalLocaleCombination(locale3, locale4, feature2);
        ExperimentalLocaleCombination experimentalLocaleCombination4 = new ExperimentalLocaleCombination(locale4, locale3, feature2);
        Locale locale5 = LOCALE_HI_IN;
        Locale locale6 = LOCALE_EN_GB;
        Feature feature3 = Feature.ALEXA_VOX_ANDROID_EXPERIMENTAL_PAIR_HINDI_ENGLISH_LOCALES;
        ExperimentalLocaleCombination experimentalLocaleCombination5 = new ExperimentalLocaleCombination(locale5, locale6, feature3);
        ExperimentalLocaleCombination experimentalLocaleCombination6 = new ExperimentalLocaleCombination(locale6, locale5, feature3);
        Locale locale7 = LOCALE_FR_FR;
        Feature feature4 = Feature.ALEXA_VOX_ANDROID_EXPERIMENTAL_PAIR_FRENCH_GERMAN_LOCALES;
        return new HashSet(Arrays.asList(experimentalLocaleCombination, experimentalLocaleCombination2, experimentalLocaleCombination3, experimentalLocaleCombination4, experimentalLocaleCombination5, experimentalLocaleCombination6, new ExperimentalLocaleCombination(locale3, locale7, feature4), new ExperimentalLocaleCombination(locale7, locale3, feature4)));
    }

    @VisibleForTesting
    public static Set<ExperimentalLocale> getExperimentalLocales() {
        return new HashSet(Arrays.asList(new ExperimentalLocale(LOCALE_EN_IE, Feature.ALEXA_VOX_ANDROID_EXPERIMENTAL_EN_IE_LOCALE), new ExperimentalLocale(LOCALE_DE_AT, Feature.ALEXA_VOX_ANDROID_EXPERIMENTAL_DEAT_LOCALE), new ExperimentalLocale(LOCALE_EN_NZ, Feature.ALEXA_VOX_ANDROID_EXPERIMENTAL_EN_NZ_LOCALE)));
    }

    @VisibleForTesting
    public static Set<List<Locale>> getSupportedLocaleCombinations() {
        Locale locale = LOCALE_EN_US;
        Locale locale2 = LOCALE_ES_US;
        ArrayList arrayList = new ArrayList(Arrays.asList(locale, locale2));
        ArrayList arrayList2 = new ArrayList(Arrays.asList(locale2, locale));
        Locale locale3 = LOCALE_EN_IN;
        Locale locale4 = LOCALE_HI_IN;
        ArrayList arrayList3 = new ArrayList(Arrays.asList(locale3, locale4));
        ArrayList arrayList4 = new ArrayList(Arrays.asList(locale4, locale3));
        Locale locale5 = LOCALE_FR_CA;
        Locale locale6 = LOCALE_EN_CA;
        ArrayList arrayList5 = new ArrayList(Arrays.asList(locale5, locale6));
        ArrayList arrayList6 = new ArrayList(Arrays.asList(locale6, locale5));
        Locale locale7 = LOCALE_IT_IT;
        Locale locale8 = LOCALE_EN_GB;
        ArrayList arrayList7 = new ArrayList(Arrays.asList(locale7, locale8));
        ArrayList arrayList8 = new ArrayList(Arrays.asList(locale8, locale7));
        Locale locale9 = LOCALE_ES_ES;
        ArrayList arrayList9 = new ArrayList(Arrays.asList(locale9, locale8));
        ArrayList arrayList10 = new ArrayList(Arrays.asList(locale8, locale9));
        Locale locale10 = LOCALE_DE_DE;
        ArrayList arrayList11 = new ArrayList(Arrays.asList(locale10, locale));
        ArrayList arrayList12 = new ArrayList(Arrays.asList(locale, locale10));
        ArrayList arrayList13 = new ArrayList(Arrays.asList(locale10, locale8));
        ArrayList arrayList14 = new ArrayList(Arrays.asList(locale8, locale10));
        Locale locale11 = LOCALE_JP_JP;
        ArrayList arrayList15 = new ArrayList(Arrays.asList(locale11, locale));
        ArrayList arrayList16 = new ArrayList(Arrays.asList(locale, locale11));
        Locale locale12 = LOCALE_FR_FR;
        ArrayList arrayList17 = new ArrayList(Arrays.asList(locale12, locale8));
        ArrayList arrayList18 = new ArrayList(Arrays.asList(locale8, locale12));
        ArrayList arrayList19 = new ArrayList(Arrays.asList(locale12, locale));
        ArrayList arrayList20 = new ArrayList(Arrays.asList(locale, locale12));
        ArrayList arrayList21 = new ArrayList(Arrays.asList(locale, locale7));
        ArrayList arrayList22 = new ArrayList(Arrays.asList(locale7, locale));
        ArrayList arrayList23 = new ArrayList(Arrays.asList(locale, locale9));
        ArrayList arrayList24 = new ArrayList(Arrays.asList(locale9, locale));
        Locale locale13 = LOCALE_PT_BR;
        ArrayList arrayList25 = new ArrayList(Arrays.asList(locale, locale13));
        ArrayList arrayList26 = new ArrayList(Arrays.asList(locale13, locale));
        Locale locale14 = LOCALE_ES_MX;
        return new HashSet(Arrays.asList(arrayList, arrayList2, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7, arrayList8, arrayList9, arrayList10, arrayList11, arrayList12, arrayList13, arrayList14, arrayList15, arrayList16, arrayList17, arrayList18, arrayList19, arrayList20, arrayList21, arrayList22, arrayList23, arrayList24, arrayList25, arrayList26, new ArrayList(Arrays.asList(locale, locale14)), new ArrayList(Arrays.asList(locale14, locale)), new ArrayList(Arrays.asList(locale, locale4)), new ArrayList(Arrays.asList(locale4, locale))));
    }

    @VisibleForTesting
    public static Set<Locale> getSupportedLocales() {
        return new HashSet(Arrays.asList(LOCALE_DE_DE, LOCALE_DE_AT, LOCALE_EN_US, LOCALE_EN_GB, LOCALE_EN_AU, LOCALE_EN_IN, LOCALE_EN_IE, LOCALE_EN_NZ, LOCALE_EN_CA, LOCALE_ES_ES, LOCALE_ES_MX, LOCALE_ES_US, LOCALE_FR_CA, LOCALE_FR_FR, LOCALE_IT_IT, LOCALE_JP_JP, LOCALE_PT_BR, LOCALE_HI_IN, LOCALE_AR_SA, LOCALE_NL_NL, LOCALE_NL_BE));
    }

    @Override // com.amazon.alexa.client.core.configuration.Loader
    public void load(ClientConfiguration.Builder builder) {
        ClientConfiguration.Builder playbackResumingTimeout = builder.setEnabledFeatures(new HashSet(Arrays.asList(Feature.WAKEWORD_ACTIVATION_SOUND, Feature.TOUCH_ACTIVATION_SOUND))).setStage(Stage.PROD).setAvsEndpoint(Uri.parse(EndpointAuthority.getDefaultAVSEndpoint().getUrl())).setCapabilitiesEndpoint(Uri.parse(EndpointAuthority.getDefaultCapabilitiesEndpoint().getUrl())).setSupportedLocales(getSupportedLocales()).setActualSupportedLocales(getActualSupportedLocales()).setSupportedLocaleCombinations(getSupportedLocaleCombinations()).setExperimentalLocales(getExperimentalLocales()).setExperimentalLocaleCombinations(getExperimentalLocaleCombinations()).setNetworkTotalWriteTimeout(50L).setFirstTurnNetworkTotalWriteTimeout(30L).setNetworkWriteBytesTimeout(3000L).setMaxUtteranceDuration(45L).setMetricsServiceName(DefaultMetricsConstants.DEFAULT_METRICS_SERVICE_NAME).setAwsMobileAnalyticsApplicationId("901ad8be11e4424f875dc792db51f34d").setAwsMobileAnalyticsIdentityPoolId("us-east-1:dbcce1fd-ea8a-4a85-a2ee-80a7b04ff098").setMobilyticsKinesisStreamName("alexa-mobile-analytics").setMobilyticsKinesisCognitoIdentityPoolId("us-east-1:5de045a1-113d-437d-be67-68496504240c").setMobilyticsKinesisRegion("us-east-1").setPlaybackResumingTimeout(60L);
        Boolean bool = Boolean.FALSE;
        playbackResumingTimeout.setRemoveNotificationOnTeardown(bool).setLocationPermissionsAllowed(Boolean.TRUE).setTransportBarCustomActionsEnabled(bool).setFeaturesToDisable(Collections.EMPTY_SET).setHostAppName(ConfigurationLoader.UNKNOWN_APP);
    }
}
