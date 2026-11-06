package com.amazon.alexa.voice.ra;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.ProfileType;
import com.amazon.alexa.identity.api.UserIdentity;
import com.amazon.alexa.identity.api.UserProfile;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class UserProfileManager {
    private static final String TAG = "UserProfileManager";
    private final Uri contentUri;
    private final Context context;
    private final IdentityService identityService;

    public UserProfileManager(Context context, IdentityService identityService) {
        this.context = context;
        this.identityService = identityService;
        this.contentUri = ErrorUtils$$ExternalSyntheticOutline0.m28m("content").authority(context.getPackageName() + UserProfileContentProvider.AUTHORITY_SUFFIX).path(UserProfileContentProvider.PATH).build();
    }

    public boolean isChildProfile() {
        IdentityService identityService = this.identityService;
        String str = TAG;
        UserIdentity user = identityService.getUser(str);
        if (user == null) {
            Log.i(str, "User identity is null; isChildProfile will return false");
            return false;
        }
        UserProfile userProfile = user.getUserProfile();
        if (userProfile != null) {
            return userProfile.getProfileType() == ProfileType.CHILD;
        }
        Log.i(str, "User profile is null; isChildProfile will return false");
        return false;
    }

    public List<Uri> saveProfiles() {
        ArrayList arrayList = new ArrayList();
        ContentResolver contentResolver = this.context.getContentResolver();
        List<UserProfile> profiles = this.identityService.getProfiles(UserProfileManager.class.getName());
        if (profiles != null) {
            for (UserProfile userProfile : profiles) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("pid", userProfile.getPersonId());
                contentValues.put("first_name", userProfile.getFirstName());
                try {
                    arrayList.add(contentResolver.insert(this.contentUri, contentValues));
                    contentValues.toString();
                } catch (Exception e) {
                    Log.e(TAG, "Error while storing user profiles to content provider", e);
                }
            }
        }
        return arrayList;
    }
}
