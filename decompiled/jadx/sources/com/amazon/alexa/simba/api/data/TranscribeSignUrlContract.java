package com.amazon.alexa.simba.api.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/simba/api/data/TranscribeSignUrlContract;", "", "()V", "ACTION_TRANSCRIBE_SIGN_URL", "", "BUNDLE_KEY_RESPONSE", "EXTRA_LOCALE", "RESULT_CODE_FAILURE", "", "RESULT_CODE_SUCCESS", "AVSMobileFramework-android-suggestions-api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class TranscribeSignUrlContract {

    @NotNull
    public static final String ACTION_TRANSCRIBE_SIGN_URL = "amazon.intent.action.TRANSCRIBE_SIGN_URL";

    @NotNull
    public static final String BUNDLE_KEY_RESPONSE = "transcribe_sign_url_response";

    @NotNull
    public static final String EXTRA_LOCALE = "transcribe_sign_url_locale";

    @NotNull
    public static final TranscribeSignUrlContract INSTANCE = new TranscribeSignUrlContract();
    public static final int RESULT_CODE_FAILURE = 1;
    public static final int RESULT_CODE_SUCCESS = 0;

    private TranscribeSignUrlContract() {
    }
}
