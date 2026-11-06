package com.amazon.dee.app.ui.main;

import com.amazon.dee.app.services.logging.Log;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class LoginStateManager {
    private static final String TAG = Log.tag((Class<?>) LoginStateManager.class);
    private LoginOption loginOption = LoginOption.REGULAR;
    private boolean isUIUpdateBlockedAfterLogOut = false;
    private boolean routeToCodeBasedLinkingTypeOobe = false;

    public void disableRouteToCodeBasedLinkingTypeOobe() {
        this.routeToCodeBasedLinkingTypeOobe = false;
    }

    public void disableUIUpdateAfterUserLogOut() {
        this.isUIUpdateBlockedAfterLogOut = true;
    }

    public void enableRouteToCodeBasedLinkingTypeOobe() {
        this.routeToCodeBasedLinkingTypeOobe = true;
    }

    public void enableUIUpdateAfterUserLogOut() {
        this.isUIUpdateBlockedAfterLogOut = false;
    }

    public boolean isCodeBasedLinkingTypeOobe() {
        return this.routeToCodeBasedLinkingTypeOobe;
    }

    public boolean isLoginWithCodeBasedLinking() {
        LoginOption loginOption = LoginOption.CODE_BASED_LINKING;
        loginOption.equals(this.loginOption);
        return loginOption.equals(this.loginOption);
    }

    public boolean isUIUpdateBlockedAfterUserLogOut() {
        return this.isUIUpdateBlockedAfterLogOut;
    }

    public void setLoginOption(LoginOption loginOption) {
        Objects.toString(loginOption);
        this.loginOption = loginOption;
    }
}
