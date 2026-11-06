package com.amazon.alexa.mobile.assistant.client.system;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.api.compat.model.VoiceActivityDetectionApiV2;
import com.amazon.alexa.assistant.foundation.model.DialogControlEvent;
import com.amazon.deecomms.common.Constants;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0011\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\n \u000e*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000fR\u0010\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/system/ScreenOffInteractionCanceller;", "", "context", "Landroid/content/Context;", "isKHTablet", "", "dialogControlEventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/amazon/alexa/assistant/foundation/model/DialogControlEvent;", "voiceActivityDetectionApi", "Lcom/amazon/alexa/api/compat/model/VoiceActivityDetectionApiV2;", "<init>", "(Landroid/content/Context;ZLkotlinx/coroutines/flow/MutableSharedFlow;Lcom/amazon/alexa/api/compat/model/VoiceActivityDetectionApiV2;)V", "appContext", "kotlin.jvm.PlatformType", "Landroid/content/Context;", Constants.BUNDLE_RECEIVER_TAG, "com/amazon/alexa/mobile/assistant/client/system/ScreenOffInteractionCanceller$receiver$1", "Lcom/amazon/alexa/mobile/assistant/client/system/ScreenOffInteractionCanceller$receiver$1;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "", "unregister", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ScreenOffInteractionCanceller {

    @NotNull
    private static final String TAG = "ScreenOffInteractionCanceller";
    private final Context appContext;

    @NotNull
    private final MutableSharedFlow<DialogControlEvent> dialogControlEventFlow;
    private final boolean isKHTablet;

    @NotNull
    private final ScreenOffInteractionCanceller$receiver$1 receiver;

    @NotNull
    private final VoiceActivityDetectionApiV2 voiceActivityDetectionApi;
    public static final int $stable = 8;

    @NotNull
    private static final IntentFilter SCREEN_OFF_FILTER = new IntentFilter("android.intent.action.SCREEN_OFF");

    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.alexa.mobile.assistant.client.system.ScreenOffInteractionCanceller$receiver$1] */
    public ScreenOffInteractionCanceller(@NotNull Context context, boolean z, @NotNull MutableSharedFlow<DialogControlEvent> mutableSharedFlow, @NotNull VoiceActivityDetectionApiV2 voiceActivityDetectionApiV2) {
        context.getClass();
        mutableSharedFlow.getClass();
        voiceActivityDetectionApiV2.getClass();
        this.isKHTablet = z;
        this.dialogControlEventFlow = mutableSharedFlow;
        this.voiceActivityDetectionApi = voiceActivityDetectionApiV2;
        this.appContext = context.getApplicationContext();
        this.receiver = new BroadcastReceiver() { // from class: com.amazon.alexa.mobile.assistant.client.system.ScreenOffInteractionCanceller$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                VoiceActivityDetectionApiV2 voiceActivityDetectionApiV22;
                VoiceActivityDetectionApiV2 voiceActivityDetectionApiV23;
                MutableSharedFlow mutableSharedFlow2;
                context2.getClass();
                intent.getClass();
                if (Intrinsics.areEqual(intent.getAction(), "android.intent.action.SCREEN_OFF")) {
                    voiceActivityDetectionApiV22 = ScreenOffInteractionCanceller.this.voiceActivityDetectionApi;
                    if (voiceActivityDetectionApiV22.isVoiceActivityDetectionActive()) {
                        return;
                    }
                    voiceActivityDetectionApiV23 = ScreenOffInteractionCanceller.this.voiceActivityDetectionApi;
                    if (voiceActivityDetectionApiV23.isMuted()) {
                        return;
                    }
                    mutableSharedFlow2 = ScreenOffInteractionCanceller.this.dialogControlEventFlow;
                    mutableSharedFlow2.tryEmit(DialogControlEvent.CANCEL);
                }
            }
        };
    }

    public final void register() {
        if (this.isKHTablet) {
            int i = Build.VERSION.SDK_INT;
            Context context = this.appContext;
            if (i >= 34) {
                context.registerReceiver(this.receiver, SCREEN_OFF_FILTER, 4);
            } else {
                context.registerReceiver(this.receiver, SCREEN_OFF_FILTER);
            }
        }
    }

    public final void unregister() {
        if (this.isKHTablet) {
            try {
                this.appContext.unregisterReceiver(this.receiver);
            } catch (IllegalArgumentException e) {
                Log.w(TAG, "Receiver already unregistered", e);
            }
        }
    }
}
