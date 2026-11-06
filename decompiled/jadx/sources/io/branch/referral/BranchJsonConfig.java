package io.branch.referral;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class BranchJsonConfig {
    public static final String TAG = "BranchJsonConfig";
    private static final String fileName = "branch.json";
    private static BranchJsonConfig instance;
    private JSONObject mConfiguration;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum BranchJsonKey {
        branchKey,
        testKey,
        liveKey,
        useTestInstance,
        enableLogging,
        deferInitForPluginRuntime,
        apiUrl,
        fbAppId,
        cppLevel,
        installReferrerFetchTimeout
    }

    private BranchJsonConfig(Context context) {
        this.mConfiguration = null;
        try {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getAssets().open(fileName)));
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        this.mConfiguration = new JSONObject(sb.toString());
                        return;
                    }
                    sb.append(readLine);
                }
            } catch (FileNotFoundException unused) {
            }
        } catch (IOException e) {
            Log.e(TAG, "Error loading branch.json: " + e.getMessage());
        } catch (JSONException e2) {
            Log.e(TAG, "Error parsing branch.json: " + e2.getMessage());
        }
    }

    public static BranchJsonConfig getInstance(@NonNull Context context) {
        if (instance == null) {
            instance = new BranchJsonConfig(context);
        }
        return instance;
    }

    @Nullable
    private String getLiveKey() {
        BranchJsonKey branchJsonKey = BranchJsonKey.liveKey;
        if (!isValid(branchJsonKey)) {
            return null;
        }
        try {
            return this.mConfiguration.getString(branchJsonKey.toString());
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    private String getTestKey() {
        JSONObject jSONObject = this.mConfiguration;
        if (jSONObject == null) {
            return null;
        }
        try {
            BranchJsonKey branchJsonKey = BranchJsonKey.testKey;
            if (jSONObject.has(branchJsonKey.toString())) {
                return this.mConfiguration.getString(branchJsonKey.toString());
            }
            return null;
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    public Object get(BranchJsonKey branchJsonKey) {
        if (!isValid(branchJsonKey)) {
            return null;
        }
        try {
            return this.mConfiguration.get(branchJsonKey.toString());
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    public String getAPIUrl() {
        JSONObject jSONObject = this.mConfiguration;
        if (jSONObject == null) {
            return null;
        }
        try {
            BranchJsonKey branchJsonKey = BranchJsonKey.apiUrl;
            if (jSONObject.has(branchJsonKey.toString())) {
                return this.mConfiguration.getString(branchJsonKey.toString());
            }
            return null;
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    public String getBranchKey() {
        BranchJsonKey branchJsonKey = BranchJsonKey.branchKey;
        if (!isValid(branchJsonKey) && (!isValid(BranchJsonKey.liveKey) || !isValid(BranchJsonKey.testKey) || !isValid(BranchJsonKey.useTestInstance))) {
            return null;
        }
        try {
            return isValid(branchJsonKey) ? this.mConfiguration.getString(branchJsonKey.toString()) : getUseTestInstance().booleanValue() ? getTestKey() : getLiveKey();
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    public String getConsumerProtectionAttributionLevel() {
        JSONObject jSONObject = this.mConfiguration;
        if (jSONObject == null) {
            return null;
        }
        try {
            BranchJsonKey branchJsonKey = BranchJsonKey.cppLevel;
            if (jSONObject.has(branchJsonKey.toString())) {
                return this.mConfiguration.getString(branchJsonKey.toString());
            }
            return null;
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    public Boolean getDeferInitForPluginRuntime() {
        BranchJsonKey branchJsonKey = BranchJsonKey.deferInitForPluginRuntime;
        if (!isValid(branchJsonKey)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.mConfiguration.getBoolean(branchJsonKey.toString()));
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    @Nullable
    public Boolean getEnableLogging() {
        BranchJsonKey branchJsonKey = BranchJsonKey.enableLogging;
        if (!isValid(branchJsonKey)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.mConfiguration.getBoolean(branchJsonKey.toString()));
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    @Nullable
    public String getFbAppId() {
        JSONObject jSONObject = this.mConfiguration;
        if (jSONObject == null) {
            return null;
        }
        try {
            BranchJsonKey branchJsonKey = BranchJsonKey.fbAppId;
            if (jSONObject.has(branchJsonKey.toString())) {
                return this.mConfiguration.getString(branchJsonKey.toString());
            }
            return null;
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    public Integer getInstallReferrerFetchTimeout() {
        BranchLogger.v("getInstallReferrerFetchTimeout " + this.mConfiguration);
        JSONObject jSONObject = this.mConfiguration;
        if (jSONObject == null) {
            return null;
        }
        try {
            BranchJsonKey branchJsonKey = BranchJsonKey.installReferrerFetchTimeout;
            if (jSONObject.has(branchJsonKey.toString())) {
                return Integer.valueOf(this.mConfiguration.getInt(branchJsonKey.toString()));
            }
            return null;
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return null;
        }
    }

    @Nullable
    public Boolean getUseTestInstance() {
        BranchJsonKey branchJsonKey = BranchJsonKey.useTestInstance;
        if (!isValid(branchJsonKey)) {
            return null;
        }
        try {
            return Boolean.valueOf(this.mConfiguration.getBoolean(branchJsonKey.toString()));
        } catch (JSONException e) {
            Log.e(TAG, "Error parsing branch.json: " + e.getMessage());
            return Boolean.FALSE;
        }
    }

    public boolean isValid(BranchJsonKey branchJsonKey) {
        JSONObject jSONObject = this.mConfiguration;
        return jSONObject != null && jSONObject.has(branchJsonKey.toString());
    }

    public boolean isValid() {
        return this.mConfiguration != null;
    }
}
