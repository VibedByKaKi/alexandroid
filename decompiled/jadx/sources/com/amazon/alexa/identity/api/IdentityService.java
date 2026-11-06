package com.amazon.alexa.identity.api;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;
import rx.Observable;
import rx.Single;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public interface IdentityService {
    public static final String NO_DELEGATED_TOKEN = "";
    public static final String NO_PERSON_ID = "";
    public static final String NO_PROFILE_ACCESS_TOKEN = "";
    public static final String NO_USER_ACCESS_TOKEN = "";

    String getAccessToken(String str);

    String getAccessTokenForPerson(String str);

    default Observable<String[]> getActorCookiesFromDirectedId(String str, String str2) {
        return null;
    }

    Observable<String[]> getCookiesFromDirectedId(String str, String str2);

    String getDelegatedToken(String str);

    @Nullable
    String getDirectedAccountId(String str);

    @Nullable
    default List<UserProfile> getProfiles(String str) {
        UserIdentity user = getUser(str);
        if (user == null) {
            return null;
        }
        return user.getProfileList();
    }

    Single<String> getSessionId(String str);

    @Nullable
    UserIdentity getUser(String str);

    void initiateDelegation(UserProfile userProfile, String str);

    boolean isAuthenticated(String str);

    default boolean isProfileAuthenticated(String str) {
        return false;
    }

    boolean isRegistered(String str);

    @NonNull
    Observable<UserIdentity> refresh(String str);

    void terminateDelegation(String str);

    default void submitLinkCode(String str, String str2) {
    }
}
