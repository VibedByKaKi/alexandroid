package com.amazon.alexa.identity;

import com.amazon.alexa.identity.AvatarURIModel;
import java.util.List;
import java.util.function.Predicate;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class AvatarURIModel {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Account {
        private String customerId;
        private List<Profile> profiles;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AvatarInfo {
        private String avatarId;
        private String avatarURI;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DataWrapper {
        private Account account;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Profile {
        private AvatarInfo avatarInfo;
        private String personId;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ResponseWrapper {
        private DataWrapper data;
    }

    public static String getAvatarUriForPersonId(ResponseWrapper responseWrapper, final String str) {
        return (String) responseWrapper.data.account.profiles.stream().filter(new Predicate() { // from class: com.amazon.alexa.identity.AvatarURIModel$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean lambda$getAvatarUriForPersonId$0;
                lambda$getAvatarUriForPersonId$0 = AvatarURIModel.lambda$getAvatarUriForPersonId$0(str, (AvatarURIModel.Profile) obj);
                return lambda$getAvatarUriForPersonId$0;
            }
        }).findFirst().map(new AvatarURIModel$$ExternalSyntheticLambda1(0)).orElse(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$getAvatarUriForPersonId$0(String str, Profile profile) {
        return profile.personId.equals(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$getAvatarUriForPersonId$1(Profile profile) {
        return profile.avatarInfo.avatarURI;
    }
}
