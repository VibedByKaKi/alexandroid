package com.amazon.alexa.biloba.service;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.amazon.alexa.biloba.metrics.BilobaMetricsService;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.PersonIdProvider;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.identity.api.UserProfile;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class BilobaPersonIdProvider implements PersonIdProvider {
    private static final String DEFAULT_DIRECTED_ID = "0";
    static final String TAG = "BilobaPersonIdProvider";
    private final IdentityService identityService;
    private final BilobaMetricsService metricsService;

    public BilobaPersonIdProvider(IdentityService identityService, BilobaMetricsService bilobaMetricsService) {
        this.identityService = identityService;
        this.metricsService = bilobaMetricsService;
    }

    private boolean isNewUser(String str) {
        return TextUtils.isEmpty(str) || "0".equals(str);
    }

    @Override // com.amazon.alexa.identity.api.PersonIdProvider
    @Nullable
    public String getPersonId() {
        IdentityService identityService = this.identityService;
        String str = TAG;
        UserIdentity user = identityService.getUser(str);
        this.metricsService.recordOccurrence(MetricsConstants.OperationalMetrics.GET_USER_IDENTITY, user != null);
        String str2 = null;
        if (user == null) {
            LogUtils.e(str, "UserIdentity is null");
            this.metricsService.recordOccurrence(MetricsConstants.OperationalMetrics.GET_PERSON_ID, false);
            return null;
        }
        UserProfile userProfile = user.getUserProfile();
        this.metricsService.recordOccurrence(MetricsConstants.OperationalMetrics.GET_USER_PROFILE, userProfile != null);
        if (userProfile == null) {
            LogUtils.e(str, "UserProfile is null");
            this.metricsService.recordOccurrence(MetricsConstants.OperationalMetrics.GET_PERSON_ID, false);
            return null;
        }
        String directedId = userProfile.getDirectedId();
        boolean isNewUser = isNewUser(directedId);
        if (isNewUser) {
            LogUtils.e(str, "directedId in UserProfile is empty, null or default value");
        } else {
            str2 = directedId;
        }
        this.metricsService.recordOccurrence(MetricsConstants.OperationalMetrics.GET_PERSON_ID, !isNewUser);
        return str2;
    }
}
