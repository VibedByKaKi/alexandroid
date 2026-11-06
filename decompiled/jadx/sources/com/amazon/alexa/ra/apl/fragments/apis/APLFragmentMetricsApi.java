package com.amazon.alexa.ra.apl.fragments.apis;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.UiEventName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/ra/apl/fragments/apis/APLFragmentMetricsApi;", "", "mContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "sendEvent", "", "eventName", "Lcom/amazon/alexa/api/UiEventName;", "eventData", "Landroid/os/Bundle;", "Companion", "AVSMobileFramework-ra-apl-fragment-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class APLFragmentMetricsApi {

    @NotNull
    private static final String ACTION_PUBLISH_UI_EVENT = "com.amazon.alexa.intent.action.PUBLISH_UI_EVENT";

    @NotNull
    private static final String EXTRA_EVENT_DATA = "com.amazon.alexa.intent.extra.EVENT_DATA";

    @NotNull
    private static final String EXTRA_EVENT_NAME = "com.amazon.alexa.intent.extra.EVENT_NAME";

    @NotNull
    private final Context mContext;
    public static final int $stable = 8;

    public APLFragmentMetricsApi(@NotNull Context context) {
        context.getClass();
        this.mContext = context;
    }

    public final void sendEvent(@NotNull UiEventName eventName, @NotNull Bundle eventData) {
        eventName.getClass();
        eventData.getClass();
        eventData.putLong("EVENT_REALTIME_MS", SystemClock.elapsedRealtime());
        Intent intent = new Intent("com.amazon.alexa.intent.action.PUBLISH_UI_EVENT");
        intent.setPackage(this.mContext.getPackageName());
        intent.putExtra("com.amazon.alexa.intent.extra.EVENT_NAME", eventName.name());
        intent.putExtra("com.amazon.alexa.intent.extra.EVENT_DATA", eventData);
        this.mContext.sendBroadcast(intent);
    }
}
