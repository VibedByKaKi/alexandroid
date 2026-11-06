package com.amazon.alexa.mobile.assistant.client.launcher;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener;
import com.amazon.alexa.api.compat.model.AlexaStateExtras;
import com.amazon.alexa.api.compat.model.AlexaStateV2;
import com.amazon.alexa.api.compat.model.AttentionSystemApiV2;
import com.amazon.alexa.mobile.assistant.client.observers.SystemUiChromeStateObserver;
import com.dee.app.contacts.common.constants.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/launcher/ConversationUILauncher;", "Lcom/amazon/alexa/api/compat/model/AlexaAttentionSystemListener;", "context", "Landroid/content/Context;", "attentionSystemApi", "Lcom/amazon/alexa/api/compat/model/AttentionSystemApiV2;", "suppressForSystemUiChrome", "", "<init>", "(Landroid/content/Context;Lcom/amazon/alexa/api/compat/model/AttentionSystemApiV2;Z)V", "registered", "start", "", "stop", "onAlexaStateChanged", SystemUiChromeStateObserver.CONTENT_KEY_ALEXA_STATE, "Lcom/amazon/alexa/api/compat/model/AlexaStateV2;", "alexaStateExtras", "Lcom/amazon/alexa/api/compat/model/AlexaStateExtras;", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ConversationUILauncher implements AlexaAttentionSystemListener {

    @Deprecated
    @NotNull
    public static final String ACTION_SHOW_RA_UI = "amazon.intent.action.SHOW_RA_UI";

    @Deprecated
    @NotNull
    public static final String ANIMATION_TYPE_SLIDE = "slide";

    @Deprecated
    @NotNull
    public static final String EXTRA_ANIMATION_TYPE = "animation_type";

    @Deprecated
    @NotNull
    public static final String EXTRA_LAUNCH_SOURCE = "launch_source";

    @Deprecated
    @NotNull
    public static final String EXTRA_START_TIMESTAMP = "startTimestamp";

    @Deprecated
    @NotNull
    public static final String EXTRA_UI_OPTIONS = "ui_options";

    @Deprecated
    @NotNull
    public static final String LAUNCH_SOURCE_WAKE_WORD = "wakeWord";

    @Deprecated
    @NotNull
    public static final String TAG = "ConversationUILauncher";

    @NotNull
    private final AttentionSystemApiV2 attentionSystemApi;

    @NotNull
    private final Context context;
    private volatile boolean registered;
    private final boolean suppressForSystemUiChrome;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public ConversationUILauncher(@NotNull Context context, @NotNull AttentionSystemApiV2 attentionSystemApiV2, boolean z) {
        context.getClass();
        attentionSystemApiV2.getClass();
        this.context = context;
        this.attentionSystemApi = attentionSystemApiV2;
        this.suppressForSystemUiChrome = z;
    }

    @Override // com.amazon.alexa.api.compat.model.AlexaAttentionSystemListener
    public void onAlexaStateChanged(@NotNull AlexaStateV2 alexaState, @NotNull AlexaStateExtras alexaStateExtras) {
        alexaState.getClass();
        alexaStateExtras.getClass();
        if (alexaState != AlexaStateV2.LISTENING || alexaStateExtras.getWakeword() == null) {
            return;
        }
        if (this.suppressForSystemUiChrome) {
            Log.i(TAG, "Suppressing voice UI launch; SystemUI will render RA voice chrome");
            return;
        }
        try {
            Log.i(TAG, "Wake-word-initiated LISTENING detected (wakeword=" + alexaStateExtras.getWakeword() + "); launching voice UI");
            Context context = this.context;
            Intent intent = new Intent("amazon.intent.action.SHOW_RA_UI");
            intent.setPackage(this.context.getPackageName());
            intent.addFlags(268500992);
            intent.putExtra(EXTRA_ANIMATION_TYPE, "slide");
            intent.putExtra("launch_source", "wakeWord");
            intent.putExtra("startTimestamp", SystemClock.elapsedRealtime());
            intent.putExtra("ui_options", Bundle.EMPTY);
            context.startActivity(intent);
        } catch (Exception e) {
            Log.e(TAG, e.getClass().getSimpleName().concat(" launching voice UI on wake word"), e);
        }
    }

    public final void start() {
        if (this.registered) {
            return;
        }
        this.attentionSystemApi.registerStateListener(this);
        this.registered = true;
    }

    public final void stop() {
        if (this.registered) {
            this.attentionSystemApi.deregisterStateListener(this);
            this.registered = false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/launcher/ConversationUILauncher$Companion;", "", "<init>", "()V", Constants.LOG_TAG, "", "ACTION_SHOW_RA_UI", "EXTRA_ANIMATION_TYPE", "EXTRA_LAUNCH_SOURCE", "EXTRA_START_TIMESTAMP", "EXTRA_UI_OPTIONS", "ANIMATION_TYPE_SLIDE", "LAUNCH_SOURCE_WAKE_WORD", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ConversationUILauncher(Context context, AttentionSystemApiV2 attentionSystemApiV2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attentionSystemApiV2, (i & 4) != 0 ? false : z);
    }
}
