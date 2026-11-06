package com.amazon.alexa.client.alexaservice.features.profiles;

import android.util.Log;
import com.amazon.alexa.api.AlexaUserProfile;
import com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ChildProfileHelper {
    private static final String TAG = "ChildProfileHelper";
    private final AuthorizationAuthority authorizationAuthority;
    private final UserProfileAuthority userProfileAuthority;

    @Inject
    public ChildProfileHelper(UserProfileAuthority userProfileAuthority, AuthorizationAuthority authorizationAuthority) {
        this.userProfileAuthority = userProfileAuthority;
        this.authorizationAuthority = authorizationAuthority;
    }

    public boolean isChildProfile() {
        AlexaUserProfile userProfile = this.userProfileAuthority.getUserProfile();
        if (userProfile != null) {
            return userProfile.isChildProfile();
        }
        Log.w(TAG, "User profile is not available; falling back on call to AccountManager");
        return this.authorizationAuthority.isChildProfile();
    }
}
