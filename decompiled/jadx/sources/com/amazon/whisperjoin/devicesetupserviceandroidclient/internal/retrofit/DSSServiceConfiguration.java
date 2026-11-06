package com.amazon.whisperjoin.devicesetupserviceandroidclient.internal.retrofit;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DSSServiceConfiguration {
    private static final String KEY_API_GATEWAY_BASE_URL = "DSSServiceConfiguration.ApiGatewayBaseUrl";
    private static final String KEY_BASE_URL = "DSSServiceConfiguration.BaseURL";
    private static final String KEY_DEBUG_ENABLED = "DSSServiceConfiguration.DebugEnabled";
    private static final String KEY_PREFIX = "DSSServiceConfiguration.";
    private static final String KEY_STAGE_INDEX = "DSSServiceConfiguration.StageIndex";
    private final HttpUrl mApiGatewayBaseUrl;
    private final HttpUrl mBaseUrl;
    private final DSSStage mDSSStage;
    private final boolean mDebugEnabled;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DSSStage {
        GAMMA,
        PROD;

        public static List<String> toStringValues() {
            ArrayList arrayList = new ArrayList();
            for (DSSStage dSSStage : values()) {
                arrayList.add(dSSStage.name());
            }
            return arrayList;
        }
    }

    @VisibleForTesting
    public DSSServiceConfiguration(DSSStage dSSStage, HttpUrl httpUrl, HttpUrl httpUrl2, boolean z) {
        if (dSSStage == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dssStage can not be null");
            throw null;
        }
        if (httpUrl == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("httpUrl can not be null");
            throw null;
        }
        if (httpUrl2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("apiGatewayBaseUrl can not be null");
            throw null;
        }
        this.mBaseUrl = httpUrl;
        this.mApiGatewayBaseUrl = httpUrl2;
        this.mDSSStage = dSSStage;
        this.mDebugEnabled = z;
    }

    public static DSSServiceConfiguration fromBundle(Bundle bundle) {
        if (bundle == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bundle can not be null");
            return null;
        }
        if (bundle.containsKey(KEY_BASE_URL)) {
            return new DSSServiceConfiguration(DSSStage.values()[bundle.getInt(KEY_STAGE_INDEX)], bundle.getString(KEY_BASE_URL), bundle.getString(KEY_API_GATEWAY_BASE_URL), bundle.getBoolean(KEY_DEBUG_ENABLED));
        }
        return null;
    }

    public static DSSServiceConfiguration fromSharedPreferences(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sharedPreferences can not be null");
            return null;
        }
        if (sharedPreferences.contains(KEY_BASE_URL)) {
            return new DSSServiceConfiguration(DSSStage.values()[sharedPreferences.getInt(KEY_STAGE_INDEX, 0)], sharedPreferences.getString(KEY_BASE_URL, null), sharedPreferences.getString(KEY_API_GATEWAY_BASE_URL, null), sharedPreferences.getBoolean(KEY_DEBUG_ENABLED, false));
        }
        return null;
    }

    public static DSSServiceConfiguration gamma() {
        return new DSSServiceConfiguration(DSSStage.GAMMA, "https://dss-na-gamma.amazon.com", "https://re8sfystqa.execute-api.us-east-1.amazonaws.com/gamma/", false);
    }

    public static DSSServiceConfiguration prod() {
        return new DSSServiceConfiguration(DSSStage.PROD, "https://dss-na.amazon.com", "https://wl.amazon-dss.com/", false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            DSSServiceConfiguration dSSServiceConfiguration = (DSSServiceConfiguration) obj;
            if (this.mDebugEnabled == dSSServiceConfiguration.mDebugEnabled && Objects.equal(this.mBaseUrl, dSSServiceConfiguration.mBaseUrl) && this.mDSSStage == dSSServiceConfiguration.mDSSStage) {
                return true;
            }
        }
        return false;
    }

    public HttpUrl getApiGatewayBaseUrl() {
        return this.mApiGatewayBaseUrl;
    }

    public HttpUrl getBaseUrl() {
        return this.mBaseUrl;
    }

    public DSSStage getStage() {
        return this.mDSSStage;
    }

    public int hashCode() {
        return Objects.hashCode(this.mBaseUrl, this.mDSSStage, Boolean.valueOf(this.mDebugEnabled));
    }

    public boolean isDebugEnabled() {
        return this.mDebugEnabled;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mBaseUrl", this.mBaseUrl).add("mDSSStage", this.mDSSStage).add("mDebugEnabled", this.mDebugEnabled).toString();
    }

    public void writeToBundle(Bundle bundle) {
        if (bundle == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bundle can not be null");
            return;
        }
        bundle.putString(KEY_BASE_URL, this.mBaseUrl.getUrl());
        bundle.putString(KEY_API_GATEWAY_BASE_URL, this.mApiGatewayBaseUrl.getUrl());
        bundle.putInt(KEY_STAGE_INDEX, this.mDSSStage.ordinal());
        bundle.putBoolean(KEY_DEBUG_ENABLED, this.mDebugEnabled);
    }

    public void writeToSharedPreferences(SharedPreferences.Editor editor) {
        if (editor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("editor can not be null");
            return;
        }
        editor.putString(KEY_BASE_URL, this.mBaseUrl.getUrl());
        editor.putString(KEY_API_GATEWAY_BASE_URL, this.mApiGatewayBaseUrl.getUrl());
        editor.putInt(KEY_STAGE_INDEX, this.mDSSStage.ordinal());
        editor.putBoolean(KEY_DEBUG_ENABLED, this.mDebugEnabled);
    }

    public static DSSServiceConfiguration gamma(boolean z) {
        return new DSSServiceConfiguration(DSSStage.GAMMA, "https://dss-na-gamma.amazon.com", "https://re8sfystqa.execute-api.us-east-1.amazonaws.com/gamma/", z);
    }

    public static DSSServiceConfiguration prod(boolean z) {
        return new DSSServiceConfiguration(DSSStage.PROD, "https://dss-na.amazon.com", "https://wl.amazon-dss.com/", z);
    }

    private DSSServiceConfiguration(DSSStage dSSStage, String str, String str2, boolean z) {
        this(dSSStage, HttpUrl.parse(str), HttpUrl.parse(str2), z);
    }
}
