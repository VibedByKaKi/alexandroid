package com.amazon.whisperjoin.deviceprovisioningservice.service;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CBLGenerationConfiguration {
    private static final String CUSTOMER_ID_KEY = "CBLGenerationConfiguration.CustomerID";
    private static final String PREFIX = "CBLGenerationConfiguration.";
    private static final String PROFILE_ID_KEY = "CBLGenerationConfiguration.ProfileID";
    private static final String USE_GIVEN_CID_AND_PID_KEY = "CBLGenerationConfiguration.useGivenPidAndCid";
    private final String mCustomerID;
    private final String mProfileID;
    private final Boolean mUseGivenCidAndPid;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private String mCustomerID;
        private String mProfileID;
        private Boolean mUseGivenCidAndPid;

        public CBLGenerationConfiguration build() {
            Boolean bool = this.mUseGivenCidAndPid;
            if (bool == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("mUseGivenCidAndPid can not be null");
                return null;
            }
            String str = this.mCustomerID;
            if (str == null) {
                Single$$ExternalSyntheticBUOutline0.m$3("mCustomerID can not be null");
                return null;
            }
            String str2 = this.mProfileID;
            if (str2 != null) {
                return new CBLGenerationConfiguration(bool, str, str2, 0);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("mProfileID can not be null");
            return null;
        }

        public Builder setCustomerID(String str) {
            this.mCustomerID = str;
            return this;
        }

        public Builder setProfileID(String str) {
            this.mProfileID = str;
            return this;
        }

        public Builder setUseGivenCidAndPid(Boolean bool) {
            this.mUseGivenCidAndPid = bool;
            return this;
        }
    }

    private CBLGenerationConfiguration(Boolean bool, String str, String str2) {
        this.mUseGivenCidAndPid = bool;
        this.mCustomerID = str;
        this.mProfileID = str2;
    }

    public static CBLGenerationConfiguration Default() {
        return new CBLGenerationConfiguration(Boolean.FALSE, "", "");
    }

    public static CBLGenerationConfiguration fromBundle(Bundle bundle) {
        if (bundle == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bundle can not be null");
            return null;
        }
        boolean z = bundle.getBoolean(USE_GIVEN_CID_AND_PID_KEY, false);
        return new CBLGenerationConfiguration(Boolean.valueOf(z), bundle.getString(CUSTOMER_ID_KEY, null), bundle.getString(PROFILE_ID_KEY, null));
    }

    public static CBLGenerationConfiguration fromSharedPreferences(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("sharedPreferences can not be null");
            return null;
        }
        boolean z = sharedPreferences.getBoolean(USE_GIVEN_CID_AND_PID_KEY, false);
        return new CBLGenerationConfiguration(Boolean.valueOf(z), sharedPreferences.getString(CUSTOMER_ID_KEY, null), sharedPreferences.getString(PROFILE_ID_KEY, null));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            CBLGenerationConfiguration cBLGenerationConfiguration = (CBLGenerationConfiguration) obj;
            if (Objects.equal(this.mUseGivenCidAndPid, cBLGenerationConfiguration.mUseGivenCidAndPid) && Objects.equal(this.mCustomerID, cBLGenerationConfiguration.mCustomerID) && Objects.equal(this.mProfileID, cBLGenerationConfiguration.mProfileID)) {
                return true;
            }
        }
        return false;
    }

    public String getCustomerID() {
        return this.mCustomerID;
    }

    public String getProfileID() {
        return this.mProfileID;
    }

    public Boolean getUseGivenCidAndPid() {
        return this.mUseGivenCidAndPid;
    }

    public int hashCode() {
        return Objects.hashCode(this.mUseGivenCidAndPid, this.mCustomerID, this.mProfileID);
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("mUseGivenCidAndPid", this.mUseGivenCidAndPid).add("mCustomerID", this.mCustomerID).add("mProfileID", this.mProfileID).toString();
    }

    public void writeToBundle(Bundle bundle) {
        if (bundle == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("bundle can not be null");
            return;
        }
        bundle.putBoolean(USE_GIVEN_CID_AND_PID_KEY, this.mUseGivenCidAndPid.booleanValue());
        bundle.putString(CUSTOMER_ID_KEY, this.mCustomerID);
        bundle.putString(PROFILE_ID_KEY, this.mProfileID);
    }

    public void writeToSharedPreferences(SharedPreferences.Editor editor) {
        if (editor == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("editor can not be null");
            return;
        }
        editor.putBoolean(USE_GIVEN_CID_AND_PID_KEY, this.mUseGivenCidAndPid.booleanValue());
        editor.putString(CUSTOMER_ID_KEY, this.mCustomerID);
        editor.putString(PROFILE_ID_KEY, this.mProfileID);
        editor.apply();
    }

    public /* synthetic */ CBLGenerationConfiguration(Boolean bool, String str, String str2, int i) {
        this(bool, str, str2);
    }
}
