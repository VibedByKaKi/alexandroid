package com.amazon.alexa.ra.features.newchat;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.features.newchat.NewChatAssistBroadcaster;
import com.dee.app.metrics.MetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/ra/features/newchat/NewChatAssistBroadcasterProvider;", "", "<init>", "()V", MetricsConstants.Method.CACHE_GET, "Lcom/amazon/alexa/ra/core/features/newchat/NewChatAssistBroadcaster;", "context", "Landroid/content/Context;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NewChatAssistBroadcasterProvider {
    public static final int $stable = 0;

    @NotNull
    public static final NewChatAssistBroadcasterProvider INSTANCE = new NewChatAssistBroadcasterProvider();

    private NewChatAssistBroadcasterProvider() {
    }

    @NotNull
    public final NewChatAssistBroadcaster get(@NotNull Context context) {
        context.getClass();
        return NewChatAssistBroadcaster.INSTANCE.getNoOp();
    }
}
