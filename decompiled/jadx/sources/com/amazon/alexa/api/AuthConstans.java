package com.amazon.alexa.api;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/api/AuthConstans;", "", "()V", "ACTION_LOGOUT", "", "EXTRA_LOGOUT_ELAPSED_REALTIME_MS", "EXTRA_RESULT_CODE_FAILURE", "", "EXTRA_RESULT_CODE_SUCCESS", "EXTRA_RESULT_RECEIVER", "AVSAndroidClient-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AuthConstans {

    @NotNull
    public static final String ACTION_LOGOUT = "com.amazon.alexa.intent.action.USER_LOGOUT";

    @NotNull
    public static final String EXTRA_LOGOUT_ELAPSED_REALTIME_MS = "com.amazon.alexa.intent.logout.ElapsedRealtimeMs";
    public static final int EXTRA_RESULT_CODE_FAILURE = 1;
    public static final int EXTRA_RESULT_CODE_SUCCESS = 0;

    @NotNull
    public static final String EXTRA_RESULT_RECEIVER = "com.amazon.alexa.intent.logout.ResultReceiver";

    @NotNull
    public static final AuthConstans INSTANCE = new AuthConstans();

    private AuthConstans() {
    }
}
