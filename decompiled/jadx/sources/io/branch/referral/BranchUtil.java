package io.branch.referral;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import io.branch.referral.BranchJsonConfig;
import io.branch.referral.Defines;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class BranchUtil {
    private static final String BRANCH_KEY_LIVE = "io.branch.sdk.BranchKey";
    private static final String BRANCH_KEY_TEST = "io.branch.sdk.BranchKey.test";
    private static final String SOURCE_BRANCH_JSON = "branch_json";
    private static final String SOURCE_MANIFEST = "manifest";
    private static final String SOURCE_MANIFEST_TEST_FALLBACK = "manifest_test_fallback";
    private static final String SOURCE_STRINGS = "strings";
    private static boolean isTestModeEnabled_ = false;
    private static Boolean testModeEnabledViaCompileTimeConfiguration;

    public static boolean checkTestMode(Context context) {
        if (!isTestModeEnabled_ && testModeEnabledViaCompileTimeConfiguration == null) {
            BranchJsonConfig branchJsonConfig = BranchJsonConfig.getInstance(context);
            if (branchJsonConfig.isValid(BranchJsonConfig.BranchJsonKey.useTestInstance)) {
                Boolean useTestInstance = branchJsonConfig.getUseTestInstance();
                isTestModeEnabled_ = useTestInstance != null ? useTestInstance.booleanValue() : false;
            } else {
                isTestModeEnabled_ = readTestMode(context);
            }
            testModeEnabledViaCompileTimeConfiguration = Boolean.valueOf(isTestModeEnabled_);
        }
        return isTestModeEnabled_;
    }

    public static String decodeResourceId(Context context, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return context.getResources().getString(i);
        } catch (Exception e) {
            BranchLogger.d(e.getMessage());
            return null;
        }
    }

    public static int dpToPx(Context context, int i) {
        return Math.round((context.getResources().getDisplayMetrics().xdpi / 160.0f) * i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r0 != null) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070 A[Catch: IOException -> 0x006c, TRY_LEAVE, TryCatch #7 {IOException -> 0x006c, blocks: (B:34:0x0068, B:27:0x0070), top: B:33:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject getDeepLinkSchemes(android.content.Context r5) {
        /*
            boolean r0 = isLowOnMemory(r5)
            r1 = 0
            if (r0 != 0) goto L7c
            java.util.jar.JarFile r0 = new java.util.jar.JarFile     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            android.content.pm.PackageManager r2 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r3 = r5.getPackageName()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r4 = 0
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r2 = r2.publicSourceDir     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L54
            java.lang.String r2 = "AndroidManifest.xml"
            java.util.zip.ZipEntry r2 = r0.getEntry(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            java.io.InputStream r2 = r0.getInputStream(r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4e
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r2.read(r3)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            io.branch.referral.ApkParser r4 = new io.branch.referral.ApkParser     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r4.<init>()     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            org.json.JSONObject r1 = r4.decompressXMLForValidator(r3, r5)     // Catch: java.lang.Throwable -> L47 java.lang.Exception -> L4a
            r2.close()     // Catch: java.io.IOException -> L3e
        L3a:
            r0.close()     // Catch: java.io.IOException -> L3e
            goto L7c
        L3e:
            r5 = move-exception
            java.lang.String r5 = r5.getMessage()
            io.branch.referral.BranchLogger.d(r5)
            goto L7c
        L47:
            r5 = move-exception
            r1 = r2
            goto L66
        L4a:
            r5 = move-exception
            goto L57
        L4c:
            r5 = move-exception
            goto L66
        L4e:
            r5 = move-exception
            r2 = r1
            goto L57
        L51:
            r5 = move-exception
            r0 = r1
            goto L66
        L54:
            r5 = move-exception
            r0 = r1
            r2 = r0
        L57:
            java.lang.String r5 = r5.getMessage()     // Catch: java.lang.Throwable -> L47
            io.branch.referral.BranchLogger.d(r5)     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L3e
        L63:
            if (r0 == 0) goto L7c
            goto L3a
        L66:
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.io.IOException -> L6c
            goto L6e
        L6c:
            r0 = move-exception
            goto L74
        L6e:
            if (r0 == 0) goto L7b
            r0.close()     // Catch: java.io.IOException -> L6c
            goto L7b
        L74:
            java.lang.String r0 = r0.getMessage()
            io.branch.referral.BranchLogger.d(r0)
        L7b:
            throw r5
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.branch.referral.BranchUtil.getDeepLinkSchemes(android.content.Context):org.json.JSONObject");
    }

    public static boolean getDeferInitForPluginRuntimeConfig(Context context) {
        BranchJsonConfig branchJsonConfig = BranchJsonConfig.getInstance(context);
        if (branchJsonConfig.isValid()) {
            return Boolean.TRUE.equals(branchJsonConfig.getDeferInitForPluginRuntime());
        }
        return false;
    }

    public static Drawable getDrawable(@NonNull Context context, @DrawableRes int i) {
        return context.getResources().getDrawable(i, context.getTheme());
    }

    public static boolean getEnableLoggingConfig(Context context) {
        BranchJsonConfig branchJsonConfig = BranchJsonConfig.getInstance(context);
        if (branchJsonConfig.isValid()) {
            return Boolean.TRUE.equals(branchJsonConfig.getEnableLogging());
        }
        return false;
    }

    private static String handleTestModeFallback(Context context, ApplicationInfo applicationInfo) {
        if (!isTestModeEnabled()) {
            BranchLogger.v("Branch key not found for live mode in manifest");
            return null;
        }
        BranchLogger.v("Test mode enabled but test key not found, attempting fallback to live key...");
        String string = applicationInfo.metaData.getString(BRANCH_KEY_LIVE);
        if (string == null) {
            BranchLogger.v("No live key found for test mode fallback");
            return string;
        }
        BranchLogger.v("Found live branch key for test mode fallback: ".concat(string.length() > 10 ? string.substring(0, 10).concat("...") : string));
        setBranchKeyAndSource(context, string, SOURCE_MANIFEST_TEST_FALLBACK);
        return string;
    }

    public static boolean isLowOnMemory(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public static boolean isTestModeEnabled() {
        return isTestModeEnabled_;
    }

    public static String readBranchKey(Context context) {
        BranchLogger.v("Reading branch key from available sources...");
        BranchLogger.v("Attempting to read branch key from branch.json configuration...");
        String readBranchKeyFromJson = readBranchKeyFromJson(context);
        if (readBranchKeyFromJson != null) {
            BranchLogger.v("Successfully read branch key from branch.json configuration");
            setBranchKeyAndSource(context, readBranchKeyFromJson, SOURCE_BRANCH_JSON);
            return readBranchKeyFromJson;
        }
        BranchLogger.v("Branch key not found in branch.json, falling back to manifest...");
        BranchLogger.v("Attempting to read branch key from manifest meta-data...");
        String readBranchKeyFromManifest = readBranchKeyFromManifest(context);
        if (readBranchKeyFromManifest != null) {
            BranchLogger.v("Successfully read branch key from manifest meta-data");
            return readBranchKeyFromManifest;
        }
        BranchLogger.v("Branch key not found in manifest, falling back to string resources...");
        BranchLogger.v("Attempting to read branch key from string resources...");
        String readBranchKeyFromStringResources = readBranchKeyFromStringResources(context);
        if (readBranchKeyFromStringResources != null) {
            BranchLogger.v("Successfully read branch key from string resources");
            return readBranchKeyFromStringResources;
        }
        BranchLogger.w("Branch key not found in any source (branch.json, manifest, or string resources)");
        return readBranchKeyFromStringResources;
    }

    private static String readBranchKeyFromJson(Context context) {
        BranchJsonConfig branchJsonConfig = BranchJsonConfig.getInstance(context);
        String branchKey = branchJsonConfig.isValid() ? branchJsonConfig.getBranchKey() : null;
        if (branchKey != null) {
            BranchLogger.v("Found branch key in branch.json: ".concat(branchKey.length() > 10 ? branchKey.substring(0, 10).concat("...") : branchKey));
            return branchKey;
        }
        BranchLogger.v("branch.json configuration not valid or branch key not present");
        return branchKey;
    }

    private static String readBranchKeyFromManifest(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData != null) {
                return readBranchKeyFromMetaData(context, applicationInfo);
            }
            BranchLogger.v("No meta-data found in manifest");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            BranchLogger.d("Error reading manifest: " + e.getMessage());
            return null;
        }
    }

    private static String readBranchKeyFromMetaData(Context context, ApplicationInfo applicationInfo) {
        String str = isTestModeEnabled() ? BRANCH_KEY_TEST : BRANCH_KEY_LIVE;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Looking for branch key in manifest with key: ", str, " (test mode: ");
        m2m.append(isTestModeEnabled());
        m2m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        BranchLogger.v(m2m.toString());
        String string = applicationInfo.metaData.getString(str);
        if (string == null) {
            return handleTestModeFallback(context, applicationInfo);
        }
        BranchLogger.v("Found branch key in manifest meta-data: ".concat(string.length() > 10 ? string.substring(0, 10).concat("...") : string));
        setBranchKeyAndSource(context, string, "manifest");
        return string;
    }

    private static String readBranchKeyFromStringResources(Context context) {
        String str = isTestModeEnabled() ? BRANCH_KEY_TEST : BRANCH_KEY_LIVE;
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Looking for branch key in string resources with key: ", str, " (test mode: ");
        m2m.append(isTestModeEnabled());
        m2m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        BranchLogger.v(m2m.toString());
        try {
            Resources resources = context.getResources();
            String string = resources.getString(resources.getIdentifier(str, TypedValues.Custom.S_STRING, context.getPackageName()));
            if (TextUtils.isEmpty(string)) {
                BranchLogger.v("Branch key string resource is empty");
                return string;
            }
            BranchLogger.v("Found branch key in string resources: ".concat(string.length() > 10 ? string.substring(0, 10).concat("...") : string));
            setBranchKeyAndSource(context, string, SOURCE_STRINGS);
            return string;
        } catch (Resources.NotFoundException unused) {
            BranchLogger.v("Branch key string resource not found: ".concat(str));
            return null;
        }
    }

    private static boolean readTestMode(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null && bundle.containsKey("io.branch.sdk.TestMode")) {
                return applicationInfo.metaData.getBoolean("io.branch.sdk.TestMode", false);
            }
            Resources resources = context.getResources();
            return Boolean.parseBoolean(resources.getString(resources.getIdentifier("io.branch.sdk.TestMode", TypedValues.Custom.S_STRING, context.getPackageName())));
        } catch (Exception unused) {
            return isTestModeEnabled_;
        }
    }

    public static void setAPIBaseUrlFromConfig(Context context) {
        String aPIUrl = BranchJsonConfig.getInstance(context).getAPIUrl();
        if (TextUtils.isEmpty(aPIUrl)) {
            return;
        }
        Branch.setAPIUrl(aPIUrl);
    }

    private static void setBranchKeyAndSource(Context context, String str, String str2) {
        PrefHelper prefHelper = PrefHelper.getInstance(context);
        prefHelper.setBranchKey(str);
        prefHelper.setBranchKeySource(str2);
    }

    public static void setCPPLevelFromConfig(Context context) {
        String consumerProtectionAttributionLevel = BranchJsonConfig.getInstance(context).getConsumerProtectionAttributionLevel();
        if (TextUtils.isEmpty(consumerProtectionAttributionLevel)) {
            return;
        }
        Branch.getInstance().setConsumerProtectionAttributionLevel(Defines.BranchAttributionLevel.valueOf(consumerProtectionAttributionLevel));
    }

    public static void setFbAppIdFromConfig(Context context) {
        String fbAppId = BranchJsonConfig.getInstance(context).getFbAppId();
        if (TextUtils.isEmpty(fbAppId)) {
            return;
        }
        Branch.setFBAppID(fbAppId);
    }

    public static void setInstallReferrerTimeoutFromConfig(Context context) {
        Integer installReferrerFetchTimeout = BranchJsonConfig.getInstance(context).getInstallReferrerFetchTimeout();
        if (installReferrerFetchTimeout == null || installReferrerFetchTimeout.intValue() < 0) {
            return;
        }
        PrefHelper.getInstance(context).setInstallReferrerTimeout(installReferrerFetchTimeout.intValue());
    }

    public static void setTestMode(boolean z) {
        isTestModeEnabled_ = z;
    }

    public static void shutDown() {
        isTestModeEnabled_ = false;
        testModeEnabledViaCompileTimeConfiguration = null;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class JsonReader {
        private final JSONObject jsonObject;

        public JsonReader(JSONObject jSONObject) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2 = new JSONObject(jSONObject.toString());
            } catch (JSONException e) {
                BranchLogger.d(e.getMessage());
            }
            this.jsonObject = jSONObject2;
        }

        public JSONObject getJsonObject() {
            return this.jsonObject;
        }

        public boolean has(String str) {
            return this.jsonObject.has(str);
        }

        public Iterator<String> keys() {
            return this.jsonObject.keys();
        }

        public Object readOut(String str) {
            Object opt = this.jsonObject.opt(str);
            this.jsonObject.remove(str);
            return opt;
        }

        public boolean readOutBoolean(String str) {
            boolean optBoolean = this.jsonObject.optBoolean(str);
            this.jsonObject.remove(str);
            return optBoolean;
        }

        public Double readOutDouble(String str, Double d) {
            if (!this.jsonObject.has(str)) {
                return d;
            }
            Double valueOf = Double.valueOf(this.jsonObject.optDouble(str));
            this.jsonObject.remove(str);
            return valueOf;
        }

        public Integer readOutInt(String str, Integer num) {
            if (!this.jsonObject.has(str)) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.jsonObject.optInt(str));
            this.jsonObject.remove(str);
            return valueOf;
        }

        public JSONArray readOutJsonArray(String str) {
            JSONArray optJSONArray = this.jsonObject.optJSONArray(str);
            this.jsonObject.remove(str);
            return optJSONArray;
        }

        public long readOutLong(String str) {
            long optLong = this.jsonObject.optLong(str);
            this.jsonObject.remove(str);
            return optLong;
        }

        public String readOutString(String str) {
            String optString = this.jsonObject.optString(str);
            this.jsonObject.remove(str);
            return optString;
        }

        public String readOutString(String str, String str2) {
            String optString = this.jsonObject.optString(str, str2);
            this.jsonObject.remove(str);
            return optString;
        }

        public double readOutDouble(String str) {
            double optDouble = this.jsonObject.optDouble(str);
            this.jsonObject.remove(str);
            return optDouble;
        }

        public int readOutInt(String str) {
            int optInt = this.jsonObject.optInt(str);
            this.jsonObject.remove(str);
            return optInt;
        }
    }
}
