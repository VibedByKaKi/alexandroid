package com.amazon.alexa.voice.handsfree.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.voice.handsfree.features.IdentityServiceProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class IdentityServiceSignInContract implements AlexaAppSignInContract {
    private static final String TAG = "IdentityServiceSignInContract";
    private final IdentityServiceProvider mIdentityServiceProvider;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public enum MetricType {
        GET_SIGN_IN_STATE_SUCCESS("GetSignInStateSuccess");

        private final String mValue;

        MetricType(@NonNull String str) {
            this.mValue = str;
        }

        public String getValue() {
            return this.mValue;
        }
    }

    public IdentityServiceSignInContract() {
        this(new IdentityServiceProvider());
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract
    public boolean getSignInState(@NonNull Context context, boolean z) {
        IdentityService provideIdentityService = this.mIdentityServiceProvider.provideIdentityService();
        if (provideIdentityService == null) {
            Log.w(TAG, "isAlexaAppSignedIn: identity service not available.");
            return z;
        }
        String str = TAG;
        UserIdentity user = provideIdentityService.getUser(str);
        return user != null && user.hasAcceptedEula() && provideIdentityService.isAuthenticated(str);
    }

    @VisibleForTesting
    public IdentityServiceSignInContract(@NonNull IdentityServiceProvider identityServiceProvider) {
        this.mIdentityServiceProvider = identityServiceProvider;
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract
    public void teardown(@NonNull Context context) {
    }

    @Override // com.amazon.alexa.handsfree.protocols.utils.AlexaAppSignInContract
    public void setup(@NonNull Context context, boolean z) {
    }
}
