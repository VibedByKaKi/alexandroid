package com.amazon.deecomms.oobe;

import android.content.SharedPreferences;
import androidx.annotation.Nullable;
import com.amazon.alexa.identity.api.ProfileAttributes;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.core.CommsDaggerWrapper;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PCAProfile {

    @Nullable
    @JsonProperty(ProfileAttributes.PERSON_ID)
    public String personIdV2 = null;

    public static PCAProfile create(JSONObject jSONObject) throws JSONException {
        PCAProfile pCAProfile = new PCAProfile();
        pCAProfile.personIdV2 = jSONObject.isNull(ProfileAttributes.PERSON_ID) ? null : jSONObject.getString(ProfileAttributes.PERSON_ID);
        return pCAProfile;
    }

    public static PCAProfile fromPrefs(SharedPreferences sharedPreferences) {
        PCAProfile pCAProfile = new PCAProfile();
        pCAProfile.personIdV2 = sharedPreferences.getString(Constants.OOBE_PERSON_ID_V2, "");
        return pCAProfile;
    }

    public static String getPersonIDv2() {
        return fromPrefs(CommsDaggerWrapper.getComponent().getContext().getSharedPreferences("SHARED_PREFS", 0)).personIdV2;
    }

    public void toPrefs(SharedPreferences sharedPreferences) {
        sharedPreferences.edit().putString(Constants.OOBE_PERSON_ID_V2, this.personIdV2).apply();
    }
}
