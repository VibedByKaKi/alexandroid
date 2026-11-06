package com.amazon.alexa.apl.metrics;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.amazon.alexa.api.AlexaMetadataBundleKey;
import com.amazon.alexa.api.UiEventName;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/amazon/alexa/apl/metrics/APLEventReporter;", "", "context", "Landroid/content/Context;", "localBroadcastManager", "Landroidx/localbroadcastmanager/content/LocalBroadcastManager;", "(Landroid/content/Context;Landroidx/localbroadcastmanager/content/LocalBroadcastManager;)V", "mContext", "(Landroid/content/Context;)V", "mLocalBroadcastManager", "sendEvent", "", "eventName", "Lcom/amazon/alexa/api/UiEventName;", "eventData", "Landroid/os/Bundle;", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class APLEventReporter {

    @NotNull
    private static final String ACTION_PUBLISH_UI_EVENT = "com.amazon.alexa.intent.action.PUBLISH_UI_EVENT";

    @NotNull
    private static final String EXTRA_EVENT_DATA = "com.amazon.alexa.intent.extra.EVENT_DATA";

    @NotNull
    private static final String EXTRA_EVENT_NAME = "com.amazon.alexa.intent.extra.EVENT_NAME";

    @NotNull
    private LocalBroadcastManager mLocalBroadcastManager;

    @Inject
    public APLEventReporter(@NotNull Context context) {
        context.getClass();
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance(context);
        localBroadcastManager.getClass();
        this.mLocalBroadcastManager = localBroadcastManager;
    }

    public final void sendEvent(@NotNull UiEventName eventName, @NotNull Bundle eventData) {
        eventName.getClass();
        eventData.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = new Intent("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT");
        intent.putExtra("com.amazon.alexa.intent.extra.EVENT_NAME", eventName.name());
        eventData.putLong(AlexaMetadataBundleKey.EVENT_REALTIME_MS.name(), elapsedRealtime);
        intent.putExtra("com.amazon.alexa.intent.extra.EVENT_DATA", eventData);
        this.mLocalBroadcastManager.sendBroadcast(intent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @VisibleForTesting
    public APLEventReporter(@NotNull Context context, @NotNull LocalBroadcastManager localBroadcastManager) {
        this(context);
        context.getClass();
        localBroadcastManager.getClass();
        this.mLocalBroadcastManager = localBroadcastManager;
    }
}
