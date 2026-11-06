package com.amazon.alexa.accessory.frames.translation.service;

import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers$$ExternalSyntheticLambda0;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"Lcom/amazon/alexa/accessory/frames/translation/service/TranslationAuthProviderImpl;", "Lcom/amazon/alexa/accessory/frames/translation/service/TranslationAuthProvider;", "<init>", "()V", "getAuthToken", "", "Companion", "AlexaAccessoryEchoFramesAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class TranslationAuthProviderImpl implements TranslationAuthProvider {
    private static final String TAG = "TranslationAuthProviderImpl";
    private static final long TOKEN_TIMEOUT_SECONDS = 10;

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getAuthToken$lambda$0() {
        return DependencyProvider.getAccessToken(TAG);
    }

    @Override // com.amazon.alexa.accessory.frames.translation.service.TranslationAuthProvider
    @Nullable
    public String getAuthToken() {
        String str;
        try {
            String str2 = TAG;
            Log.i(str2, "getAuthToken: calling DependencyProvider.getAccessToken");
            FutureTask futureTask = new FutureTask(new AndroidSchedulers$$ExternalSyntheticLambda0(4));
            new Thread(futureTask, "auth-token-fetch").start();
            String str3 = (String) futureTask.get(10L, TimeUnit.SECONDS);
            if (str3 != null && str3.length() != 0) {
                if (str3.length() > 12) {
                    str = str3.substring(0, 4) + "..." + str3.substring(str3.length() - 4);
                } else {
                    str = "(short)";
                }
                Log.i(str2, "Obtained MAP token (length=%d, preview=%s)", Integer.valueOf(str3.length()), str);
                return str3;
            }
            Log.w(str2, "MAP token is null or empty");
            return null;
        } catch (Exception e) {
            Log.e(TAG, "Failed to obtain MAP token: %s %s", e.getClass().getSimpleName(), e.getMessage());
            return null;
        }
    }
}
