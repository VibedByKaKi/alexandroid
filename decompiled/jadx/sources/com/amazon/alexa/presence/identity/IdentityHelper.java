package com.amazon.alexa.presence.identity;

import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.photos.metrics.MetricsValidator$$ExternalSyntheticLambda0;
import com.amazon.alexa.presence.Presence;
import com.amazon.alexa.presence.library.IdentityHelper$$ExternalSyntheticLambda0;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class IdentityHelper {
    private static final String TAG = Presence.tag();

    @Inject
    public IdentityHelper() {
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[RETURN] */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getAuthToken() {
        /*
            java.lang.Class<com.amazon.alexa.identity.api.IdentityService> r0 = com.amazon.alexa.identity.api.IdentityService.class
            java.lang.Object r0 = com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0.m(r0)
            com.amazon.alexa.identity.api.IdentityService r0 = (com.amazon.alexa.identity.api.IdentityService) r0
            java.lang.String r1 = ""
            if (r0 == 0) goto L1d
            java.lang.Class<com.amazon.alexa.presence.identity.IdentityHelper> r2 = com.amazon.alexa.presence.identity.IdentityHelper.class
            java.lang.String r2 = r2.getName()
            com.amazon.alexa.identity.api.UserIdentity r0 = r0.getUser(r2)
            if (r0 == 0) goto L24
            java.lang.String r0 = r0.getAccessToken()
            goto L25
        L1d:
            java.lang.String r0 = com.amazon.alexa.presence.identity.IdentityHelper.TAG
            java.lang.String r2 = "Unable to retrieve user from identity service."
            android.util.Log.w(r0, r2)
        L24:
            r0 = r1
        L25:
            if (r0 == 0) goto L2d
            int r2 = r0.length()
            if (r2 != 0) goto L34
        L2d:
            java.lang.String r2 = com.amazon.alexa.presence.identity.IdentityHelper.TAG
            java.lang.String r3 = "Unable to retrieve MapToken"
            android.util.Log.w(r2, r3)
        L34:
            if (r0 != 0) goto L37
            return r1
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.presence.identity.IdentityHelper.getAuthToken():java.lang.String");
    }

    @NonNull
    public static String getAuthTokenDirectlyFromMap() {
        String str;
        IdentityService identityService = (IdentityService) Automotive$$ExternalSyntheticOutline0.m(IdentityService.class);
        if (identityService != null) {
            str = identityService.getAccessToken(IdentityHelper.class.getName());
        } else {
            Log.w(TAG, "Unable to retrieve user from identity service.  Service is null.");
            str = "";
        }
        if (str == null || str.length() == 0) {
            Log.w(TAG, "Unable to retrieve MapToken");
        }
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestRefreshAuthToken$1(Throwable th) {
        Log.e(TAG, "failed to get new auth token", th);
    }

    public boolean isUserAuthenticated() {
        IdentityService identityService = (IdentityService) Automotive$$ExternalSyntheticOutline0.m(IdentityService.class);
        return identityService != null && identityService.isAuthenticated(IdentityHelper.class.getName());
    }

    public boolean requestRefreshAuthToken() {
        IdentityService identityService = (IdentityService) Automotive$$ExternalSyntheticOutline0.m(IdentityService.class);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (identityService != null) {
            identityService.refresh(IdentityHelper.class.getName()).toBlocking().subscribe(new IdentityHelper$$ExternalSyntheticLambda0(atomicBoolean, 1), new MetricsValidator$$ExternalSyntheticLambda0(21));
        }
        return atomicBoolean.get();
    }
}
