package com.amazon.alexa.mobile.assistant.client.auth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.deecomms.common.Constants;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\b\u0006*\u0001\u000e\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0010\u001a\u00020\u0006J\u0006\u0010\u0011\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/mobile/assistant/client/auth/AccountChangedBroadcastReceiver;", "", "context", "Landroid/content/Context;", "onAccountAdded", "Lkotlin/Function0;", "", "onAccountRemoved", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "appContext", "kotlin.jvm.PlatformType", "Landroid/content/Context;", Constants.BUNDLE_RECEIVER_TAG, "com/amazon/alexa/mobile/assistant/client/auth/AccountChangedBroadcastReceiver$receiver$1", "Lcom/amazon/alexa/mobile/assistant/client/auth/AccountChangedBroadcastReceiver$receiver$1;", MAPAccountManager.KEY_REGISTER_AFTER_OAUTH, "unregister", "Companion", "client_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class AccountChangedBroadcastReceiver {

    @NotNull
    private static final String BROADCAST_PERMISSION = "com.amazon.dcp.sso.permission.account.changed";

    @NotNull
    private static final String INTENT_ACCOUNT_ADDED = "com.amazon.dcp.sso.action.account.added";

    @NotNull
    private static final String INTENT_ACCOUNT_REMOVED = "com.amazon.dcp.sso.action.account.removed";

    @NotNull
    private static final String TAG = "AccountChangedReceiver";
    private final Context appContext;

    @NotNull
    private final Function0<Unit> onAccountAdded;

    @NotNull
    private final Function0<Unit> onAccountRemoved;

    @NotNull
    private final AccountChangedBroadcastReceiver$receiver$1 receiver;
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.alexa.mobile.assistant.client.auth.AccountChangedBroadcastReceiver$receiver$1] */
    public AccountChangedBroadcastReceiver(@NotNull Context context, @NotNull Function0<Unit> function0, @NotNull Function0<Unit> function02) {
        context.getClass();
        function0.getClass();
        function02.getClass();
        this.onAccountAdded = function0;
        this.onAccountRemoved = function02;
        this.appContext = context.getApplicationContext();
        this.receiver = new BroadcastReceiver() { // from class: com.amazon.alexa.mobile.assistant.client.auth.AccountChangedBroadcastReceiver$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                Function0 function03;
                Function0 function04;
                context2.getClass();
                intent.getClass();
                String action = intent.getAction();
                if (action != null) {
                    int hashCode = action.hashCode();
                    if (hashCode != 2037821440) {
                        if (hashCode == 2081236832 && action.equals("com.amazon.dcp.sso.action.account.removed")) {
                            Log.i("AccountChangedReceiver", "Account removed broadcast received");
                            function04 = AccountChangedBroadcastReceiver.this.onAccountRemoved;
                            function04.invoke();
                            return;
                        }
                    } else if (action.equals("com.amazon.dcp.sso.action.account.added")) {
                        Log.i("AccountChangedReceiver", "Account added broadcast received");
                        function03 = AccountChangedBroadcastReceiver.this.onAccountAdded;
                        function03.invoke();
                        return;
                    }
                }
                intent.getAction();
            }
        };
    }

    public final void register() {
        IntentFilter m = TableInfo$$ExternalSyntheticOutline0.m("com.amazon.dcp.sso.action.account.added", "com.amazon.dcp.sso.action.account.removed");
        int i = Build.VERSION.SDK_INT;
        Context context = this.appContext;
        if (i >= 34) {
            context.registerReceiver(this.receiver, m, "com.amazon.dcp.sso.permission.account.changed", null, 4);
        } else {
            context.registerReceiver(this.receiver, m, "com.amazon.dcp.sso.permission.account.changed", null);
        }
    }

    public final void unregister() {
        try {
            this.appContext.unregisterReceiver(this.receiver);
        } catch (IllegalArgumentException e) {
            Log.w(TAG, "Receiver already unregistered", e);
        }
    }
}
