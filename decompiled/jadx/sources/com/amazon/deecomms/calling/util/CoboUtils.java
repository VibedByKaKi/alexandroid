package com.amazon.deecomms.calling.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.network.ServiceException;
import com.amazon.deecomms.core.CapabilitiesManager;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.amazon.deecomms.settings.IdentityPreferencesProvider;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.google.i18n.phonenumbers.ShortNumberInfo;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.inject.Inject;
import rx.Observable;
import rx.functions.Func0;
import rx.schedulers.Schedulers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class CoboUtils {
    private static final String DEFAULT_REGION = "US";
    private static final String PHONE_NUMBER = "PHONE_NUMBER";
    private static final Dependencies sDependencies;
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, CoboUtils.class);
    private static final Pattern PATTERN_PHONE_NUMBER = Pattern.compile("(sips:([^@]+))");
    private static final PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
    private static final ShortNumberInfo shortNumberInfo = ShortNumberInfo.getInstance();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Dependencies {

        @Inject
        public CapabilitiesManager capabilitiesManager;
    }

    static {
        Dependencies dependencies = new Dependencies();
        sDependencies = dependencies;
        CommsDaggerWrapper.getComponent().inject(dependencies);
    }

    private CoboUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Observable<Boolean> deferredSubscribeForGetter() {
        try {
            CommsLogger commsLogger = LOG;
            commsLogger.d("Retrieving user's caller id preference from ACMS...");
            boolean fetchShowPhoneNumberToCalleePreference = fetchShowPhoneNumberToCalleePreference();
            commsLogger.d("Retrieved user's caller id preference from ACMS.");
            return Observable.just(Boolean.valueOf(fetchShowPhoneNumberToCalleePreference));
        } catch (ServiceException e) {
            LOG.e("Could not retrieve user's caller id preference from ACMS.", e);
            return Observable.error(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Observable<Boolean> deferredSubscribeForSetter(boolean z) {
        try {
            CommsLogger commsLogger = LOG;
            commsLogger.d("Updating caller id preference on ACMS...");
            saveShowPhoneNumberToCalleePreference(z);
            commsLogger.d("Updated caller id preference on ACMS.");
            return Observable.just(Boolean.valueOf(z));
        } catch (ServiceException e) {
            LOG.e("Could not update caller id preference on ACMS.", e);
            return Observable.error(e);
        }
    }

    private static boolean fetchShowPhoneNumberToCalleePreference() throws ServiceException {
        return !Boolean.valueOf(new IdentityPreferencesProvider(IdentityPreferencesProvider.AuthenticationType.AS_COMMS_USER).get(CommsDaggerWrapper.getComponent().getCommsIdentityManager().getCommsId("fetchShowPhoneNumberToCalleePreference", false), Constants.IDENTITY_PREFERENCE_COBO_PRIVATE_NUMBER)).booleanValue();
    }

    @Nullable
    private static String formatPhoneNumber(@Nullable String str, @NonNull PhoneNumberUtil.PhoneNumberFormat phoneNumberFormat) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            PhoneNumberUtil phoneNumberUtil2 = phoneNumberUtil;
            Phonenumber.PhoneNumber parse = phoneNumberUtil2.parse(str, "US");
            return !shortNumberInfo.isPossibleShortNumber(parse) ? phoneNumberUtil2.format(parse, phoneNumberFormat) : str;
        } catch (NumberParseException e) {
            CommsLogger commsLogger = LOG;
            commsLogger.e("Could not format phone number: " + commsLogger.sensitive(str), e);
            return str;
        }
    }

    @Nullable
    public static String formatPhoneNumberForDisplay(@Nullable String str) {
        return formatPhoneNumber(str, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
    }

    @Nullable
    public static String generatePstnSipUri(@NonNull String str) {
        if (TextUtils.isEmpty(str)) {
            CommsLogger commsLogger = LOG;
            commsLogger.e("Invalid phone number: " + commsLogger.sensitive(str));
            return null;
        }
        String pstnUriFormat = getPstnUriFormat();
        if (TextUtils.isEmpty(pstnUriFormat)) {
            LOG.e("Invalid pstn uri format: null");
            return null;
        }
        String formatPhoneNumber = formatPhoneNumber(str);
        return formatPhoneNumber != null ? pstnUriFormat.replace("PHONE_NUMBER", formatPhoneNumber) : pstnUriFormat.replace("PHONE_NUMBER", str);
    }

    @Nullable
    public static String getPhoneNumberFromPstnSipUri(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = PATTERN_PHONE_NUMBER.matcher(str);
        if (matcher.find()) {
            return matcher.group(matcher.groupCount());
        }
        return null;
    }

    @Nullable
    public static String getPstnUriFormat() {
        return CommsDaggerWrapper.getComponent().getArcusConfig().getConfigString("SIPProxy.PstnUriFormats.PFM.${PFM}");
    }

    public static Observable<Boolean> getShowPhoneNumberToCalleeObservable() {
        return Observable.defer(new CoboUtils$$ExternalSyntheticLambda1()).subscribeOn(Schedulers.io());
    }

    public static boolean isCallerIDToggleAvailable() {
        if (sDependencies.capabilitiesManager.getCoboValue()) {
            return true;
        }
        LOG.d("User is not permitted to use COBO callerID toggle .");
        return false;
    }

    public static boolean isCoboCallingAvailable() {
        if (sDependencies.capabilitiesManager.getCyborgValue()) {
            return true;
        }
        LOG.d("User is not permitted to use COBO.");
        return false;
    }

    private static void saveShowPhoneNumberToCalleePreference(boolean z) throws ServiceException {
        new IdentityPreferencesProvider(IdentityPreferencesProvider.AuthenticationType.AS_COMMS_USER).set(CommsDaggerWrapper.getComponent().getCommsIdentityManager().getCommsId("saveShowPhoneNumberToCalleePreference", false), Constants.IDENTITY_PREFERENCE_COBO_PRIVATE_NUMBER, Boolean.valueOf(!z));
    }

    public static Observable<Boolean> setShowPhoneNumberToCalleeObservable(final boolean z) {
        return Observable.defer(new Func0() { // from class: com.amazon.deecomms.calling.util.CoboUtils$$ExternalSyntheticLambda0
            @Override // rx.functions.Func0, java.util.concurrent.Callable
            public final Object call() {
                Observable deferredSubscribeForSetter;
                deferredSubscribeForSetter = CoboUtils.deferredSubscribeForSetter(z);
                return deferredSubscribeForSetter;
            }
        }).subscribeOn(Schedulers.io());
    }

    public static boolean shouldShowPSTNForNonCOBORegion() {
        return sDependencies.capabilitiesManager.showPSTNForNonCOBORegions();
    }

    @Nullable
    public static String formatPhoneNumber(@NonNull String str) {
        return formatPhoneNumber(str, PhoneNumberUtil.PhoneNumberFormat.E164);
    }
}
