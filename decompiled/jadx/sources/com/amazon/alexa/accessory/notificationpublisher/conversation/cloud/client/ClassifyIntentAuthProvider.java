package com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client;

import androidx.annotation.VisibleForTesting;
import androidx.lifecycle.ViewModelLazy$$ExternalSyntheticLambda0;
import com.amazon.alexa.accessory.notificationpublisher.providers.DependencyProvider;
import com.amazon.alexa.accessory.notificationpublisher.utils.Log;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0019\b\u0001\u0012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0016R\u0016\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentAuthProvider;", "Lcom/amazon/alexa/accessory/notificationpublisher/conversation/cloud/client/ClassifyIntentAuthProviding;", "tokenSupplier", "Lkotlin/Function0;", "", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "()V", "accessToken", "Companion", "AlexaAccessoryNotificationPublisherAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ClassifyIntentAuthProvider implements ClassifyIntentAuthProviding {
    private static final String TAG = "ClassifyIntentAuthProvider";

    @NotNull
    private final Function0<String> tokenSupplier;

    public ClassifyIntentAuthProvider() {
        this(new ViewModelLazy$$ExternalSyntheticLambda0(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String _init_$lambda$0() {
        return DependencyProvider.getAccessToken(TAG);
    }

    @Override // com.amazon.alexa.accessory.notificationpublisher.conversation.cloud.client.ClassifyIntentAuthProviding
    @Nullable
    public String accessToken() {
        try {
            String invoke = this.tokenSupplier.invoke();
            if (invoke != null && invoke.length() != 0) {
                Log.d(TAG, "Retrieved MAP access token.");
                return invoke;
            }
            Log.i(TAG, "No MAP access token available.");
            return null;
        } catch (Exception e) {
            Log.e(TAG, "Failed to obtain MAP access token: %s", e.getClass().getSimpleName());
            return null;
        }
    }

    @VisibleForTesting
    public ClassifyIntentAuthProvider(@NotNull Function0<String> function0) {
        function0.getClass();
        this.tokenSupplier = function0;
    }
}
