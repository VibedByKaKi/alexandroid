package com.amazon.dee.app.ui.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.protocols.usermessage.UserMessageService;
import com.amazon.dee.app.core.R;
import com.amazon.dee.app.services.usermessage.DefaultUserMessageService;
import com.mapbox.bindgen.Cleaner$$ExternalSyntheticLambda0;
import expo.modules.keepawake.ExpoKeepAwakeManager$$ExternalSyntheticLambda0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class MissingBrowserDialog {
    private MissingBrowserDialog() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$1(Activity activity) {
        Intent intent = new Intent("android.settings.APPLICATION_SETTINGS");
        intent.addFlags(268435456);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.settings.SETTINGS");
            intent2.addFlags(268435456);
            activity.startActivity(intent2);
        }
    }

    @VisibleForTesting
    public static void show(@NonNull Activity activity, UserMessageService userMessageService) {
        userMessageService.message(R.string.missing_default_browser_error_message).withCancel(R.string.cancel_button, new Cleaner$$ExternalSyntheticLambda0(12)).withAction(R.string.settings_button, new ExpoKeepAwakeManager$$ExternalSyntheticLambda0(activity, 1)).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$show$0() {
    }

    public static void show(@NonNull Activity activity) {
        show(activity, new DefaultUserMessageService(activity));
    }
}
