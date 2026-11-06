package com.amazon.whisperjoin.deviceprovisioningservice.smarthome;

import android.content.SharedPreferences;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AssociatedDeviceCredentialsSyncResult {
    private static final String SHARED_PREF_CREDENTIALS_JSON = "associatedDeviceCredentialsSyncResultEntryJSON";
    private static final String SHARED_PREF_TIMESTAMP = "associatedDeviceCredentialsSyncResultTimestamp";
    private final String mCredentialsJSON;
    private final long mTimestamp;

    public AssociatedDeviceCredentialsSyncResult(String str, long j) {
        this.mCredentialsJSON = str;
        this.mTimestamp = j;
    }

    public static AssociatedDeviceCredentialsSyncResult readFromSharedPreferences(SharedPreferences sharedPreferences) {
        if (sharedPreferences.contains(SHARED_PREF_CREDENTIALS_JSON)) {
            return new AssociatedDeviceCredentialsSyncResult(sharedPreferences.getString(SHARED_PREF_CREDENTIALS_JSON, "{}"), sharedPreferences.getLong(SHARED_PREF_TIMESTAMP, 0L));
        }
        return null;
    }

    public static void writeToSharedPreferences(AssociatedDeviceCredentialsSyncResult associatedDeviceCredentialsSyncResult, SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(SHARED_PREF_CREDENTIALS_JSON, associatedDeviceCredentialsSyncResult.getCredentialsJSON());
        edit.putLong(SHARED_PREF_TIMESTAMP, associatedDeviceCredentialsSyncResult.getTimestamp());
        edit.apply();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociatedDeviceCredentialsSyncResult associatedDeviceCredentialsSyncResult = (AssociatedDeviceCredentialsSyncResult) obj;
        return new EqualsBuilder().append(this.mTimestamp, associatedDeviceCredentialsSyncResult.mTimestamp).append(this.mCredentialsJSON, associatedDeviceCredentialsSyncResult.mCredentialsJSON).isEquals();
    }

    public String getCredentialsJSON() {
        return this.mCredentialsJSON;
    }

    public long getTimestamp() {
        return this.mTimestamp;
    }

    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(this.mCredentialsJSON).append(this.mTimestamp).toHashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AssociatedDeviceCredentialsSyncResult{mCredentialsJSON='");
        sb.append(this.mCredentialsJSON);
        sb.append("', mTimestamp=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, this.mTimestamp, AbstractJsonLexerKt.END_OBJ);
    }
}
