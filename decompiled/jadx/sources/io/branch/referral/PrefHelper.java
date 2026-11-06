package io.branch.referral;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import io.branch.referral.Defines;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class PrefHelper {
    static final String BRANCH_BASE_URL_V1 = "https://api.branch.io/";
    static final String BRANCH_BASE_URL_V2 = "https://api2.branch.io/";
    static final String BRANCH_CDN_BASE_URL = "https://cdn.branch.io/";
    static final String BRANCH_EU_BASE_URL_V3 = "https://api3-eu.branch.io/";
    static final int CONNECT_TIMEOUT = 10000;
    static final int DEFAULT_NO_CONNECTION_RETRY_MAX = 3;
    static final long DEFAULT_VALID_WINDOW_FOR_REFERRER_GCLID = 2592000000L;
    private static final int INTERVAL_RETRY = 1000;
    private static final String KEY_ACTIONS = "bnc_actions";
    static final String KEY_AD_NETWORK_CALLOUTS_DISABLED = "bnc_ad_network_callouts_disabled";
    static final String KEY_ANON_ID = "bnc_anon_id";
    private static final String KEY_APP_LINK = "bnc_app_link";
    private static final String KEY_APP_STORE_SOURCE = "bnc_app_store_source";
    private static final String KEY_APP_VERSION = "bnc_app_version";
    private static final String KEY_BRANCH_KEY = "bnc_branch_key";
    static final String KEY_BRANCH_KEY_SOURCE = "bnc_branch_key_source";
    private static final String KEY_BRANCH_VIEW_NUM_OF_USE = "bnc_branch_view_use";
    private static final String KEY_CONNECT_TIMEOUT = "bnc_connect_timeout";
    private static final String KEY_CONSUMER_PROTECTION_ATTRIBUTION_LEVEL = "bnc_consumer_protection_attribution_level";
    static final String KEY_DELAYED_SESSION_INIT_USED = "bnc_delayed_session_init_used";
    private static final String KEY_DEVICE_FINGERPRINT_ID = "bnc_device_fingerprint_id";
    private static final String KEY_DMA_AD_PERSONALIZATION = "bnc_dma_ad_personalization";
    private static final String KEY_DMA_AD_USER_DATA = "bnc_dma_ad_user_data";
    private static final String KEY_DMA_EEA = "bnc_dma_eea";
    static final String KEY_ENHANCED_WEB_LINK_UX_USED = "bnc_enhanced_web_link_ux_used";
    private static final String KEY_EXTERNAL_INTENT_EXTRA = "bnc_external_intent_extra";
    private static final String KEY_EXTERNAL_INTENT_URI = "bnc_external_intent_uri";
    private static final String KEY_GCLID_EXPIRATION_DATE = "bnc_gclid_expiration_date";
    private static final String KEY_GCLID_JSON_OBJECT = "bnc_gclid_json_object";
    private static final String KEY_GCLID_VALID_FOR_WINDOW = "bnc_gclid_expiration_window";
    private static final String KEY_GCLID_VALUE = "bnc_gclid_value";
    private static final String KEY_GOOGLE_PLAY_INSTALL_REFERRER_EXTRA = "bnc_google_play_install_referrer_extras";
    private static final String KEY_GOOGLE_SEARCH_INSTALL_IDENTIFIER = "bnc_google_search_install_identifier";
    private static final String KEY_IDENTITY = "bnc_identity";
    private static final String KEY_IDENTITY_ID = "bnc_identity_id";
    private static final String KEY_INITIAL_REFERRER = "bnc_initial_referrer";
    static final String KEY_INSTALL_BEGIN_SERVER_TS = "bnc_install_begin_server_ts";
    static final String KEY_INSTALL_BEGIN_TS = "bnc_install_begin_ts";
    private static final String KEY_INSTALL_PARAMS = "bnc_install_params";
    private static final String KEY_INSTALL_REFERRER = "bnc_install_referrer";
    static final String KEY_INSTALL_REFERRER_TIMEOUT_MS = "bnc_install_referrer_timeout";
    private static final String KEY_IS_FULL_APP_CONVERSION = "bnc_is_full_app_conversion";
    static final String KEY_IS_META_CLICKTHROUGH = "bnc_is_meta_clickthrough";
    static final String KEY_LAST_KNOWN_UPDATE_TIME = "bnc_last_known_update_time";
    private static final String KEY_LAST_READ_SYSTEM = "bnc_system_read_date";
    private static final String KEY_LATD_ATTRIBUTION_WINDOW = "bnc_latd_attributon_window";
    private static final String KEY_LIMIT_FACEBOOK_TRACKING = "bnc_limit_facebook_tracking";
    private static final String KEY_LINK_CLICK_ID = "bnc_link_click_id";
    private static final String KEY_LINK_CLICK_IDENTIFIER = "bnc_link_click_identifier";
    private static final String KEY_LOG_IAP_AS_EVENTS = "bnc_log_iap_as_events";
    private static final String KEY_NO_CONNECTION_RETRY_MAX = "bnc_no_connection_retry_max";
    static final String KEY_ORIGINAL_INSTALL_TIME = "bnc_original_install_time";
    static final String KEY_PREVIOUS_UPDATE_TIME = "bnc_previous_update_time";
    private static final String KEY_PUSH_IDENTIFIER = "bnc_push_identifier";
    private static final String KEY_RANDOMIZED_BUNDLE_TOKEN = "bnc_randomized_bundle_token";
    private static final String KEY_RANDOMIZED_DEVICE_TOKEN = "bnc_randomized_device_token";
    static final String KEY_RANDOMLY_GENERATED_UUID = "bnc_randomly_generated_uuid";
    static final String KEY_REFERRER_CLICK_SERVER_TS = "bnc_referrer_click_server_ts";
    static final String KEY_REFERRER_CLICK_TS = "bnc_referrer_click_ts";
    static final String KEY_REFERRING_URL_QUERY_PARAMETERS = "bnc_referringUrlQueryParameters";
    private static final String KEY_RETRY_COUNT = "bnc_retry_count";
    private static final String KEY_RETRY_INTERVAL = "bnc_retry_interval";
    private static final String KEY_SESSION_ID = "bnc_session_id";
    private static final String KEY_SESSION_PARAMS = "bnc_session_params";
    private static final String KEY_TASK_TIMEOUT = "bnc_task_timeout";
    private static final String KEY_TIMEOUT = "bnc_timeout";
    private static final String KEY_TOTAL_BASE = "bnc_total_base_";
    static final String KEY_TRACKING_STATE = "bnc_tracking_state";
    private static final String KEY_UNIQUE_BASE = "bnc_balance_base_";
    static final String KEY_URL_LOAD_MS = "bnc_url_load_ms";
    private static final String KEY_USER_URL = "bnc_user_url";
    private static final int MAX_RETRIES = 3;
    static final long MAX_VALID_WINDOW_FOR_REFERRER_GCLID = 100000000000L;
    static final long MIN_VALID_WINDOW_FOR_REFERRER_GCLID = 0;
    public static final String NO_STRING_VALUE = "bnc_no_value";
    private static final String SHARED_PREF_FILE = "branch_referral_shared_pref";
    private static final String TAG = "BranchSDK";
    static final int TASK_TIMEOUT = 15500;
    static final int TIMEOUT = 5500;
    private static String customCDNBaseURL_ = null;
    private static String customServerURL_ = null;
    private static boolean enableLogging_ = false;
    public static String fbAppId_ = null;
    private static PrefHelper prefHelper_ = null;
    private static boolean useEUEndpoint_ = false;
    private final SharedPreferences appSharedPrefs_;
    private SharedPreferences.Editor prefsEditor_;
    private final JSONObject requestMetadata = new JSONObject();
    private final JSONObject installMetadata = new JSONObject();
    private final JSONObject secondaryRequestMetadata = new JSONObject();
    final BranchPartnerParameters partnerParams_ = new BranchPartnerParameters();

    private PrefHelper(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREF_FILE, 0);
        this.appSharedPrefs_ = sharedPreferences;
        this.prefsEditor_ = sharedPreferences.edit();
    }

    private void clearPrefOnBranchKeyChange() {
        BranchLogger.v("clearPrefOnBranchKeyChange");
        String linkClickID = getLinkClickID();
        String linkClickIdentifier = getLinkClickIdentifier();
        String appLink = getAppLink();
        String pushIdentifier = getPushIdentifier();
        this.prefsEditor_.clear();
        setLinkClickID(linkClickID);
        setLinkClickIdentifier(linkClickIdentifier);
        setAppLink(appLink);
        setPushIdentifier(pushIdentifier);
        this.prefsEditor_.apply();
    }

    private ArrayList<String> deserializeString(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, str.split(","));
        return arrayList;
    }

    public static void enableLogging(boolean z) {
        enableLogging_ = z;
    }

    private ArrayList<String> getActions() {
        String string = getString(KEY_ACTIONS);
        return string.equals(NO_STRING_VALUE) ? new ArrayList<>() : deserializeString(string);
    }

    public static String getCDNBaseUrl() {
        return !TextUtils.isEmpty(customCDNBaseURL_) ? customCDNBaseURL_ : BRANCH_CDN_BASE_URL;
    }

    public static PrefHelper getInstance(Context context) {
        if (prefHelper_ == null) {
            prefHelper_ = new PrefHelper(context);
        }
        return prefHelper_;
    }

    public static boolean isValidBranchKey(String str) {
        if (str != null) {
            return str.startsWith(BranchUtil.isTestModeEnabled() ? "key_test_" : "key_");
        }
        return false;
    }

    public static void loadPartnerParams(JSONObject jSONObject, BranchPartnerParameters branchPartnerParameters) throws JSONException {
        if (jSONObject == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, ConcurrentHashMap<String, String>> entry : branchPartnerParameters.allParams().entrySet()) {
            JSONObject jSONObject3 = new JSONObject();
            for (Map.Entry<String, String> entry2 : entry.getValue().entrySet()) {
                jSONObject3.put(entry2.getKey(), entry2.getValue());
            }
            jSONObject2.put(entry.getKey(), jSONObject3);
        }
        jSONObject.put(Defines.Jsonkey.PartnerData.getKey(), jSONObject2);
    }

    private String serializeArrayList(ArrayList<String> arrayList) {
        Iterator<String> it2 = arrayList.iterator();
        String str = "";
        while (it2.hasNext()) {
            str = a$$ExternalSyntheticOutline0.m$1(str, it2.next(), ",");
        }
        return AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 0, str);
    }

    public static void setAPIUrl(String str) {
        customServerURL_ = str;
    }

    private void setActions(ArrayList<String> arrayList) {
        if (arrayList.size() == 0) {
            setString(KEY_ACTIONS, NO_STRING_VALUE);
        } else {
            setString(KEY_ACTIONS, serializeArrayList(arrayList));
        }
    }

    public static void setCDNBaseUrl(String str) {
        customCDNBaseURL_ = str;
    }

    public static void shutDown() {
        PrefHelper prefHelper = prefHelper_;
        if (prefHelper != null) {
            prefHelper.prefsEditor_ = null;
        }
        enableLogging_ = false;
        prefHelper_ = null;
        customCDNBaseURL_ = null;
        customServerURL_ = null;
        useEUEndpoint_ = false;
    }

    public static void useEUEndpoint(boolean z) {
        useEUEndpoint_ = z;
    }

    public void addInstallMetadata(String str, String str2) {
        if (str == null) {
            return;
        }
        try {
            this.installMetadata.putOpt(str, str2);
        } catch (JSONException e) {
            BranchLogger.d(e.getMessage());
        }
    }

    public void clearGclid() {
        removePrefValue(KEY_GCLID_JSON_OBJECT);
    }

    public void clearSystemReadStatus() {
        setLong(KEY_LAST_READ_SYSTEM, Calendar.getInstance().getTimeInMillis() / 1000);
    }

    public void clearUserValues() {
        Iterator<String> it2 = getActions().iterator();
        while (it2.hasNext()) {
            String next = it2.next();
            setActionTotalCount(next, 0);
            setActionUniqueCount(next, 0);
        }
        setActions(new ArrayList<>());
    }

    public String getAPIBaseUrl(boolean z) {
        return (z && URLUtil.isHttpsUrl(customServerURL_)) ? customServerURL_ : useEUEndpoint_ ? BRANCH_EU_BASE_URL_V3 : BRANCH_BASE_URL_V2;
    }

    public int getActionTotalCount(String str) {
        return getInteger(KEY_TOTAL_BASE + str);
    }

    public int getActionUniqueCount(String str) {
        return getInteger(KEY_UNIQUE_BASE + str);
    }

    public boolean getAdNetworkCalloutsDisabled() {
        return getBool(KEY_AD_NETWORK_CALLOUTS_DISABLED);
    }

    public boolean getAdPersonalizationConsent() {
        return getBool(KEY_DMA_AD_PERSONALIZATION);
    }

    public boolean getAdUserDataUsageConsent() {
        return getBool(KEY_DMA_AD_USER_DATA);
    }

    public String getAnonID() {
        return getString(KEY_ANON_ID);
    }

    public String getAppLink() {
        return getString(KEY_APP_LINK);
    }

    public String getAppStoreReferrer() {
        return getString(KEY_GOOGLE_PLAY_INSTALL_REFERRER_EXTRA);
    }

    public String getAppStoreSource() {
        return getString(KEY_APP_STORE_SOURCE);
    }

    public String getAppVersion() {
        return getString(KEY_APP_VERSION);
    }

    public boolean getBool(String str) {
        return this.appSharedPrefs_.getBoolean(str, false);
    }

    public String getBranchKey() {
        return getString(KEY_BRANCH_KEY);
    }

    public String getBranchKeySource() {
        return getString(KEY_BRANCH_KEY_SOURCE);
    }

    public int getConnectTimeout() {
        return getInteger(KEY_CONNECT_TIMEOUT, 10000);
    }

    public Defines.BranchAttributionLevel getConsumerProtectionAttributionLevel() {
        String string = getString(KEY_CONSUMER_PROTECTION_ATTRIBUTION_LEVEL);
        return string.equals(NO_STRING_VALUE) ? Defines.BranchAttributionLevel.FULL : Defines.BranchAttributionLevel.valueOf(string);
    }

    public boolean getDelayedSessionInitUsed() {
        return getBool(KEY_DELAYED_SESSION_INIT_USED);
    }

    public boolean getEEARegion() {
        return getBool(KEY_DMA_EEA);
    }

    public String getExternalIntentExtra() {
        return getString(KEY_EXTERNAL_INTENT_EXTRA);
    }

    public String getExternalIntentUri() {
        return getString(KEY_EXTERNAL_INTENT_URI);
    }

    public float getFloat(String str) {
        return this.appSharedPrefs_.getFloat(str, 0.0f);
    }

    public String getGoogleSearchInstallIdentifier() {
        return getString(KEY_GOOGLE_SEARCH_INSTALL_IDENTIFIER);
    }

    public String getIdentity() {
        return getString(KEY_IDENTITY);
    }

    public String getInitialReferrer() {
        String string = getString(KEY_INITIAL_REFERRER);
        BranchLogger.v("getInitialReferrer " + string);
        return string;
    }

    public String getInstallMetaData(String str) {
        if (str == null) {
            return null;
        }
        try {
            return this.installMetadata.get(str).toString();
        } catch (JSONException e) {
            BranchLogger.d(e.getMessage());
            return null;
        }
    }

    public JSONObject getInstallMetadata() {
        return this.installMetadata;
    }

    public String getInstallParams() {
        return getString(KEY_INSTALL_PARAMS);
    }

    public String getInstallReferrerParams() {
        return getString(KEY_INSTALL_REFERRER);
    }

    public int getInstallReferrerTimeout() {
        return getInteger(KEY_INSTALL_REFERRER_TIMEOUT_MS, 0);
    }

    public int getInteger(String str, int i) {
        return this.appSharedPrefs_.getInt(str, i);
    }

    public boolean getIsMetaClickThrough() {
        return getBool(KEY_IS_META_CLICKTHROUGH);
    }

    public int getLATDAttributionWindow() {
        return getInteger(KEY_LATD_ATTRIBUTION_WINDOW, -1);
    }

    public String getLinkClickID() {
        return getString(KEY_LINK_CLICK_ID);
    }

    public String getLinkClickIdentifier() {
        return getString(KEY_LINK_CLICK_IDENTIFIER);
    }

    public long getLong(String str) {
        return getLong(str, 0L);
    }

    public int getNoConnectionRetryMax() {
        return getInteger(KEY_NO_CONNECTION_RETRY_MAX, 3);
    }

    public String getPushIdentifier() {
        return getString(KEY_PUSH_IDENTIFIER);
    }

    public String getRandomizedBundleToken() {
        String string = getString(KEY_RANDOMIZED_BUNDLE_TOKEN);
        return (TextUtils.isEmpty(string) || string.equals(NO_STRING_VALUE)) ? getString(KEY_IDENTITY_ID) : string;
    }

    public String getRandomizedDeviceToken() {
        String string = getString(KEY_RANDOMIZED_DEVICE_TOKEN);
        return (TextUtils.isEmpty(string) || string.equals(NO_STRING_VALUE)) ? getString(KEY_DEVICE_FINGERPRINT_ID) : string;
    }

    public String getRandomlyGeneratedUuid() {
        return getString(KEY_RANDOMLY_GENERATED_UUID);
    }

    public String getReferrerGclid() {
        String string = getString(KEY_GCLID_JSON_OBJECT);
        if (string.equals(NO_STRING_VALUE)) {
            return NO_STRING_VALUE;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (((Long) jSONObject.get(KEY_GCLID_EXPIRATION_DATE)).longValue() - System.currentTimeMillis() > 0) {
                return jSONObject.getString(KEY_GCLID_VALUE);
            }
            removePrefValue(KEY_GCLID_JSON_OBJECT);
            return null;
        } catch (JSONException e) {
            removePrefValue(KEY_GCLID_JSON_OBJECT);
            e.printStackTrace();
            return null;
        }
    }

    public long getReferrerGclidValidForWindow() {
        return getLong(KEY_GCLID_VALID_FOR_WINDOW, 2592000000L);
    }

    public JSONObject getReferringURLQueryParameters() {
        String string = getString(KEY_REFERRING_URL_QUERY_PARAMETERS);
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(string) && !NO_STRING_VALUE.equals(string)) {
            try {
                return new JSONObject(string);
            } catch (JSONException e) {
                BranchLogger.w("Unable to get URL query parameters as string: " + e);
            }
        }
        return jSONObject;
    }

    public JSONObject getRequestMetadata() {
        return this.requestMetadata;
    }

    public int getRetryCount() {
        return getInteger(KEY_RETRY_COUNT, 3);
    }

    public int getRetryInterval() {
        return getInteger(KEY_RETRY_INTERVAL, 1000);
    }

    public String getSessionID() {
        return getString(KEY_SESSION_ID);
    }

    public String getSessionParams() {
        return getString(KEY_SESSION_PARAMS);
    }

    public String getString(String str) {
        return this.appSharedPrefs_.getString(str, NO_STRING_VALUE);
    }

    public int getTaskTimeout() {
        return getInteger(KEY_CONNECT_TIMEOUT, 10000) + getInteger(KEY_TIMEOUT, TIMEOUT);
    }

    public int getTimeout() {
        return getInteger(KEY_TIMEOUT, TIMEOUT);
    }

    public String getUserURL() {
        return getString(KEY_USER_URL);
    }

    public long getWebLinkLoadTime() {
        return getLong(KEY_URL_LOAD_MS);
    }

    public String getWebLinkUxTypeUsed() {
        return getString(KEY_ENHANCED_WEB_LINK_UX_USED);
    }

    public boolean hasPrefValue(String str) {
        return this.appSharedPrefs_.contains(str);
    }

    public boolean hasValidBranchKey() {
        return isValidBranchKey(getBranchKey());
    }

    public boolean isAppTrackingLimited() {
        return getBool(KEY_LIMIT_FACEBOOK_TRACKING);
    }

    public boolean isAttributionLevelInitialized() {
        return hasPrefValue(KEY_CONSUMER_PROTECTION_ATTRIBUTION_LEVEL);
    }

    public boolean isDMAParamsInitialized() {
        return hasPrefValue(KEY_DMA_EEA);
    }

    public boolean isFullAppConversion() {
        return getBool(KEY_IS_FULL_APP_CONVERSION);
    }

    public void removePrefValue(String str) {
        this.prefsEditor_.remove(str).apply();
    }

    public void setActionTotalCount(String str, int i) {
        ArrayList<String> actions = getActions();
        if (!actions.contains(str)) {
            actions.add(str);
            setActions(actions);
        }
        setInteger(KEY_TOTAL_BASE + str, i);
    }

    public void setActionUniqueCount(String str, int i) {
        setInteger(KEY_UNIQUE_BASE + str, i);
    }

    public void setAdNetworkCalloutsDisabled(boolean z) {
        setBool(KEY_AD_NETWORK_CALLOUTS_DISABLED, Boolean.valueOf(z));
    }

    public void setAdPersonalizationConsent(boolean z) {
        setBool(KEY_DMA_AD_PERSONALIZATION, Boolean.valueOf(z));
    }

    public void setAdUserDataUsageConsent(boolean z) {
        setBool(KEY_DMA_AD_USER_DATA, Boolean.valueOf(z));
    }

    public void setAnonID(String str) {
        setString(KEY_ANON_ID, str);
    }

    public void setAppLink(String str) {
        setString(KEY_APP_LINK, str);
    }

    public void setAppStoreReferrer(String str) {
        setString(KEY_GOOGLE_PLAY_INSTALL_REFERRER_EXTRA, str);
    }

    public void setAppStoreSource(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        setString(KEY_APP_STORE_SOURCE, str);
    }

    public void setAppVersion(String str) {
        setString(KEY_APP_VERSION, str);
    }

    public void setBool(String str, Boolean bool) {
        this.prefsEditor_.putBoolean(str, bool.booleanValue()).apply();
    }

    public boolean setBranchKey(String str) {
        if (getString(KEY_BRANCH_KEY).equals(str)) {
            return false;
        }
        clearPrefOnBranchKeyChange();
        setString(KEY_BRANCH_KEY, str);
        if (Branch.getInstance() == null) {
            return true;
        }
        Branch.getInstance().linkCache_.clear();
        Branch.getInstance().requestQueue_.clear();
        return true;
    }

    public void setBranchKeySource(String str) {
        setString(KEY_BRANCH_KEY_SOURCE, str);
    }

    public void setConnectTimeout(int i) {
        setInteger(KEY_CONNECT_TIMEOUT, i);
    }

    public void setConsumerProtectionAttributionLevel(Defines.BranchAttributionLevel branchAttributionLevel) {
        setString(KEY_CONSUMER_PROTECTION_ATTRIBUTION_LEVEL, branchAttributionLevel.toString());
    }

    public void setDelayedSessionInitUsed(boolean z) {
        setBool(KEY_DELAYED_SESSION_INIT_USED, Boolean.valueOf(z));
    }

    public void setEEARegion(boolean z) {
        setBool(KEY_DMA_EEA, Boolean.valueOf(z));
    }

    public void setExternalIntentExtra(String str) {
        setString(KEY_EXTERNAL_INTENT_EXTRA, str);
    }

    public void setExternalIntentUri(String str) {
        setString(KEY_EXTERNAL_INTENT_URI, str);
    }

    public void setFloat(String str, float f) {
        this.prefsEditor_.putFloat(str, f).apply();
    }

    public void setGoogleSearchInstallIdentifier(String str) {
        setString(KEY_GOOGLE_SEARCH_INSTALL_IDENTIFIER, str);
    }

    public void setIdentity(String str) {
        BranchLogger.v("[Storage] setIdentity: " + str);
        setString(KEY_IDENTITY, str);
    }

    public void setInitialReferrer(String str) {
        BranchLogger.v("setInitialReferrer " + str);
        setString(KEY_INITIAL_REFERRER, str);
    }

    public void setInstallParams(String str) {
        setString(KEY_INSTALL_PARAMS, str);
    }

    public void setInstallReferrerParams(String str) {
        setString(KEY_INSTALL_REFERRER, str);
    }

    public void setInstallReferrerTimeout(int i) {
        setInteger(KEY_INSTALL_REFERRER_TIMEOUT_MS, i);
    }

    public void setInteger(String str, int i) {
        this.prefsEditor_.putInt(str, i).apply();
    }

    public void setIsFullAppConversion(boolean z) {
        setBool(KEY_IS_FULL_APP_CONVERSION, Boolean.valueOf(z));
    }

    public void setIsMetaClickThrough(boolean z) {
        setBool(KEY_IS_META_CLICKTHROUGH, Boolean.valueOf(z));
    }

    public void setLATDAttributionWindow(int i) {
        setInteger(KEY_LATD_ATTRIBUTION_WINDOW, i);
    }

    public void setLimitFacebookTracking(boolean z) {
        setBool(KEY_LIMIT_FACEBOOK_TRACKING, Boolean.valueOf(z));
    }

    public void setLinkClickID(String str) {
        setString(KEY_LINK_CLICK_ID, str);
    }

    public void setLinkClickIdentifier(String str) {
        BranchLogger.v("setLinkClickIdentifier: " + str);
        setString(KEY_LINK_CLICK_IDENTIFIER, str);
    }

    public void setLong(String str, long j) {
        this.prefsEditor_.putLong(str, j).apply();
    }

    public void setNoConnectionRetryMax(int i) {
        setInteger(KEY_NO_CONNECTION_RETRY_MAX, i);
    }

    public void setPushIdentifier(String str) {
        setString(KEY_PUSH_IDENTIFIER, str);
    }

    public void setRandomizedBundleToken(String str) {
        setString(KEY_RANDOMIZED_BUNDLE_TOKEN, str);
    }

    public void setRandomizedDeviceToken(String str) {
        setString(KEY_RANDOMIZED_DEVICE_TOKEN, str);
    }

    public void setRandomlyGeneratedUuid(String str) {
        setString(KEY_RANDOMLY_GENERATED_UUID, str);
    }

    public void setReferrerGclid(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_GCLID_VALUE, str);
            jSONObject.put(KEY_GCLID_EXPIRATION_DATE, System.currentTimeMillis() + getReferrerGclidValidForWindow());
            setString(KEY_GCLID_JSON_OBJECT, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void setReferrerGclidValidForWindow(long j) {
        if (MAX_VALID_WINDOW_FOR_REFERRER_GCLID <= j || j < 0) {
            return;
        }
        setLong(KEY_GCLID_VALID_FOR_WINDOW, j);
    }

    public void setReferringUrlQueryParameters(JSONObject jSONObject) {
        if (jSONObject == null || jSONObject.length() == 0) {
            setString(KEY_REFERRING_URL_QUERY_PARAMETERS, NO_STRING_VALUE);
        } else {
            setString(KEY_REFERRING_URL_QUERY_PARAMETERS, jSONObject.toString());
        }
    }

    public void setRequestMetadata(@NonNull String str, @NonNull String str2) {
        if (str == null) {
            return;
        }
        if (this.requestMetadata.has(str) && str2 == null) {
            this.requestMetadata.remove(str);
        }
        try {
            this.requestMetadata.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public void setRetryCount(int i) {
        setInteger(KEY_RETRY_COUNT, i);
    }

    public void setRetryInterval(int i) {
        setInteger(KEY_RETRY_INTERVAL, i);
    }

    public void setSessionID(String str) {
        setString(KEY_SESSION_ID, str);
    }

    public void setSessionParams(String str) {
        setString(KEY_SESSION_PARAMS, str);
    }

    public void setString(String str, String str2) {
        this.prefsEditor_.putString(str, str2).apply();
    }

    public void setTimeout(int i) {
        setInteger(KEY_TIMEOUT, i);
    }

    public void setUserURL(String str) {
        setString(KEY_USER_URL, str);
    }

    public void setWebLinkLoadTime(long j) {
        setLong(KEY_URL_LOAD_MS, j);
    }

    public void setWebLinkUxTypeUsed(String str) {
        setString(KEY_ENHANCED_WEB_LINK_UX_USED, str);
    }

    public boolean shouldAddModules() {
        try {
            return this.secondaryRequestMetadata.length() != 0;
        } catch (Exception e) {
            BranchLogger.d(e.getMessage());
            return false;
        }
    }

    public int getInteger(String str) {
        return getInteger(str, 0);
    }

    public long getLong(String str, long j) {
        return this.appSharedPrefs_.getLong(str, j);
    }

    public String getAPIBaseUrl() {
        if (URLUtil.isHttpsUrl(customServerURL_)) {
            return customServerURL_;
        }
        if (useEUEndpoint_) {
            return BRANCH_EU_BASE_URL_V3;
        }
        return BRANCH_BASE_URL_V2;
    }

    public void loadPartnerParams(JSONObject jSONObject) throws JSONException {
        loadPartnerParams(jSONObject, this.partnerParams_);
    }
}
