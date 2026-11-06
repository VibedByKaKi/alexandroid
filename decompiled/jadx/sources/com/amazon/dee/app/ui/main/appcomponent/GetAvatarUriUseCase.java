package com.amazon.dee.app.ui.main.appcomponent;

import com.amazon.alexa.identity.ApesCallerInterface;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.identity.api.UserIdentity;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/amazon/dee/app/ui/main/appcomponent/GetAvatarUriUseCase;", "", "apesCaller", "Lcom/amazon/alexa/identity/ApesCallerInterface;", "globalHeaderState", "Lcom/amazon/dee/app/ui/main/appcomponent/GlobalHeaderState;", "identityService", "Lcom/amazon/alexa/identity/api/IdentityService;", "<init>", "(Lcom/amazon/alexa/identity/ApesCallerInterface;Lcom/amazon/dee/app/ui/main/appcomponent/GlobalHeaderState;Lcom/amazon/alexa/identity/api/IdentityService;)V", "getApesCaller", "()Lcom/amazon/alexa/identity/ApesCallerInterface;", "getGlobalHeaderState", "()Lcom/amazon/dee/app/ui/main/appcomponent/GlobalHeaderState;", "getIdentityService", "()Lcom/amazon/alexa/identity/api/IdentityService;", "run", "", "isDefaultAvatar", "", "uri", "", "Companion", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetAvatarUriUseCase {
    private static final String TAG = "GetAvatarUriUseCase";

    @NotNull
    private final ApesCallerInterface apesCaller;

    @NotNull
    private final GlobalHeaderState globalHeaderState;

    @NotNull
    private final IdentityService identityService;

    @Inject
    public GetAvatarUriUseCase(@NotNull ApesCallerInterface apesCallerInterface, @NotNull GlobalHeaderState globalHeaderState, @NotNull IdentityService identityService) {
        apesCallerInterface.getClass();
        globalHeaderState.getClass();
        identityService.getClass();
        this.apesCaller = apesCallerInterface;
        this.globalHeaderState = globalHeaderState;
        this.identityService = identityService;
    }

    private final boolean isDefaultAvatar(String uri) {
        boolean contains;
        boolean contains2;
        contains = StringsKt__StringsKt.contains((CharSequence) uri, (CharSequence) "/DefaultAvatars/", true);
        if (!contains) {
            contains2 = StringsKt__StringsKt.contains((CharSequence) uri, (CharSequence) "/default-avatars/", true);
            if (!contains2) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final ApesCallerInterface getApesCaller() {
        return this.apesCaller;
    }

    @NotNull
    public final GlobalHeaderState getGlobalHeaderState() {
        return this.globalHeaderState;
    }

    @NotNull
    public final IdentityService getIdentityService() {
        return this.identityService;
    }

    public final void run() {
        UserIdentity user = this.identityService.getUser(TAG);
        String avatarUri = user != null ? this.apesCaller.getAvatarUri(user.getUserProfile().getPersonId()) : null;
        if (avatarUri == null || avatarUri.length() == 0 || isDefaultAvatar(avatarUri)) {
            return;
        }
        this.globalHeaderState.setProfileImageUrl(avatarUri);
    }
}
