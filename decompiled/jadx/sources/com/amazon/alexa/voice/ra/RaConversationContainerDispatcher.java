package com.amazon.alexa.voice.ra;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.accessory.frames.media.MediaImportService$$ExternalSyntheticLambda30;
import com.amazon.alexa.voice.ui.ra.OnDismissCallback;
import com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandler;
import com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandlerRegistry;
import com.amazon.alexa.voice.ui.ra.RaConversationPlugin;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.BooleanSupplier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class RaConversationContainerDispatcher implements RaConversationLaunchHandler {
    private static final String ACTION_SHOW_RA_UI = "amazon.intent.action.SHOW_RA_UI";
    private static final String TAG = "RaConversationContainerDispatcher";

    @Nullable
    private final Context appContext;

    @Nullable
    private volatile WeakReference<Activity> mainActivityRef;
    private final AtomicBoolean mainActivityVisible;

    @NonNull
    private final BooleanSupplier mainProcessCheck;

    @NonNull
    private final ConversationCxPluggableFeatureEnabler pluggableFeatureEnabler;

    @NonNull
    private final RaConversationPlugin plugin;

    @VisibleForTesting
    public RaConversationContainerDispatcher(@Nullable Context context, @NonNull ConversationCxPluggableFeatureEnabler conversationCxPluggableFeatureEnabler, @NonNull RaConversationPlugin raConversationPlugin, @NonNull BooleanSupplier booleanSupplier) {
        this.mainActivityVisible = new AtomicBoolean(false);
        this.appContext = context;
        this.pluggableFeatureEnabler = conversationCxPluggableFeatureEnabler;
        this.plugin = raConversationPlugin;
        this.mainProcessCheck = booleanSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMainProcess(@NonNull Context context) {
        String processName = Application.getProcessName();
        return processName == null || processName.equals(context.getApplicationInfo().processName);
    }

    @Nullable
    private Activity resolveHostableMainActivity() {
        if (!this.pluggableFeatureEnabler.isEnabled() || !this.mainActivityVisible.get()) {
            return null;
        }
        WeakReference<Activity> weakReference = this.mainActivityRef;
        Activity activity = weakReference != null ? weakReference.get() : null;
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return null;
        }
        return activity;
    }

    @Override // com.amazon.alexa.voice.ui.ra.RaConversationLaunchHandler
    public boolean handleConversationLaunch(@NonNull Intent intent) {
        if (!"amazon.intent.action.SHOW_RA_UI".equals(intent.getAction())) {
            return false;
        }
        Activity resolveHostableMainActivity = resolveHostableMainActivity();
        if (resolveHostableMainActivity != null) {
            this.plugin.openConversationView(resolveHostableMainActivity, intent.getExtras(), (OnDismissCallback) null);
            return true;
        }
        boolean booleanExtra = intent.getBooleanExtra(RaConversationLaunchHandler.EXTRA_HOST_TASK_LAUNCH_IN_FLIGHT, false);
        if (this.appContext == null || !this.pluggableFeatureEnabler.isEnabled() || !booleanExtra) {
            this.plugin.cancelPendingHostOpens();
            return false;
        }
        boolean openConversationWhenHostReady = this.plugin.openConversationWhenHostReady(this.appContext, intent.getExtras());
        Automotive$$ExternalSyntheticOutline0.m8396m("host task launch in flight; deferred container open armed=", TAG, openConversationWhenHostReady);
        return openConversationWhenHostReady;
    }

    public void onMainActivityStarted(@NonNull Activity activity) {
        this.mainActivityRef = new WeakReference<>(activity);
        this.mainActivityVisible.set(true);
    }

    public void onMainActivityStopped() {
        this.mainActivityVisible.set(false);
        this.mainActivityRef = null;
    }

    public void registerAsLaunchHandler() {
        if (this.mainProcessCheck.getAsBoolean()) {
            RaConversationLaunchHandlerRegistry.register(this);
        }
    }

    public boolean tryOpenConversation(@NonNull RaUiOptions raUiOptions) {
        Activity resolveHostableMainActivity = resolveHostableMainActivity();
        RaConversationPlugin raConversationPlugin = this.plugin;
        if (resolveHostableMainActivity == null) {
            raConversationPlugin.cancelPendingHostOpens();
            return false;
        }
        raConversationPlugin.openConversationView(resolveHostableMainActivity, raUiOptions, (OnDismissCallback) null);
        return true;
    }

    public void unregisterAsLaunchHandler() {
        RaConversationLaunchHandlerRegistry.unregister(this);
    }

    public RaConversationContainerDispatcher(@NonNull Context context, @NonNull ConversationCxPluggableFeatureEnabler conversationCxPluggableFeatureEnabler, @NonNull RaConversationPlugin raConversationPlugin) {
        this(context.getApplicationContext(), conversationCxPluggableFeatureEnabler, raConversationPlugin, new MediaImportService$$ExternalSyntheticLambda30(context, 1));
    }
}
