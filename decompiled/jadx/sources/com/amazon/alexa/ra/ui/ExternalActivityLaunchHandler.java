package com.amazon.alexa.ra.ui;

import android.app.Activity;
import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/ui/ExternalActivityLaunchHandler;", "", "<init>", "()V", "tryLaunch", "", "activity", "Landroid/app/Activity;", "intent", "Landroid/content/Intent;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ExternalActivityLaunchHandler {
    public static final int $stable = 0;

    @NotNull
    public static final ExternalActivityLaunchHandler INSTANCE = new ExternalActivityLaunchHandler();

    private ExternalActivityLaunchHandler() {
    }

    public final boolean tryLaunch(@NotNull Activity activity, @NotNull Intent intent) {
        activity.getClass();
        intent.getClass();
        return false;
    }
}
