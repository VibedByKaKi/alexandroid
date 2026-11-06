package com.amazon.comms.calling.infrastructure;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.ContextCompat;
import com.amazon.comms.calling.data.util.RegisterCallTargetFactory;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.calling.presentation.ui.CallActivity;
import com.amazon.comms.calling.presentation.ui.NativeCallActivity;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.calling.api.CallRequest;
import com.google.gson.GsonBuilder;
import defpackage.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0016J\u001a\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016J\u0016\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u0011J\b\u0010\u001e\u001a\u00020\u0016H\u0002J\u0006\u0010\u001f\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006!"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/CallLauncher;", "", "context", "Landroid/content/Context;", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "<init>", "(Landroid/content/Context;Lcom/amazon/comms/calling/data/util/Utils;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "bringCallActivityToForeground", "", "fromIntent", "", "startCallActivity", "callRequest", "Lcom/amazon/deecomms/calling/api/CallRequest;", "beginCallPayloadStr", "", "startNativeCallActivity", "action", "", "extraActionText", "startNativeDialer", "phoneNumber", "forceUseNativeDialerApp", "getPackageName", "startActivityWithAnswerCall", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class CallLauncher {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(CallLauncher.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    @NotNull
    public static final String PHONE_PACKAGE_NAME_NEW = "com.android.server.telecom";

    @NotNull
    public static final String PHONE_PACKAGE_NAME_OLD = "com.android.phone";

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final Context context;

    @NotNull
    private final Utils utils;

    @Inject
    public CallLauncher(@NotNull Context context, @NotNull Utils utils) {
        context.getClass();
        utils.getClass();
        this.context = context;
        this.utils = utils;
        this.LOG = new CallingLogger();
    }

    public static /* synthetic */ void bringCallActivityToForeground$default(CallLauncher callLauncher, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        callLauncher.bringCallActivityToForeground(z);
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    private final String getPackageName() {
        if (this.utils.isLollipopAndAbove()) {
            getLOG().i("setting package to com.android.server.telecom for call intent");
            return PHONE_PACKAGE_NAME_NEW;
        }
        getLOG().i("setting package to com.android.phone for call intent");
        return PHONE_PACKAGE_NAME_OLD;
    }

    public static /* synthetic */ void startNativeCallActivity$default(CallLauncher callLauncher, int i, String str, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        callLauncher.startNativeCallActivity(i, str);
    }

    public final void bringCallActivityToForeground(boolean fromIntent) {
        Intent intent = new Intent(this.context, (Class<?>) CallActivity.class);
        intent.setFlags(268566528);
        if (fromIntent) {
            intent.putExtra("have_started_from_pending_intent", true);
        }
        this.context.startActivity(intent);
    }

    public final void startActivityWithAnswerCall() {
        Intent intent = new Intent(this.context, (Class<?>) CallActivity.class);
        intent.setFlags(268566528);
        intent.putExtra("have_answered_call", true);
        intent.putExtra("have_declined_call", false);
        this.context.startActivity(intent);
    }

    public final void startCallActivity(@NotNull CallRequest callRequest) {
        callRequest.getClass();
        Intent intent = new Intent(this.context, (Class<?>) CallActivity.class);
        intent.setFlags(268566528);
        intent.putExtra(IntentConstants.CALL_REQUEST_KEY, new GsonBuilder().registerTypeAdapterFactory(RegisterCallTargetFactory.INSTANCE.getCallTargetFactory()).create().toJson(callRequest));
        this.context.startActivity(intent);
    }

    public final void startNativeCallActivity(int action, @Nullable String extraActionText) {
        Intent intent = new Intent(this.context, (Class<?>) NativeCallActivity.class);
        intent.setFlags(268566528);
        intent.putExtra("NO_CALL_PERMISSIONS_SOURCE", ".ampd");
        intent.putExtra("EXTRA_ACTION_AFTER_PERMISSION_GRANTED", action);
        intent.putExtra("EXTRA_ACTION_PCC", extraActionText);
        ContextCompat.startActivity(this.context, intent, null);
    }

    public final void startNativeDialer(@NotNull String phoneNumber, boolean forceUseNativeDialerApp) {
        phoneNumber.getClass();
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse("tel:" + phoneNumber));
        intent.setFlags(268435456);
        if (forceUseNativeDialerApp) {
            try {
                intent.setPackage(getPackageName());
            } catch (ActivityNotFoundException unused) {
                getLOG().e("No activity found to handle a phone number");
                return;
            }
        }
        this.context.startActivity(intent);
    }

    public final void startCallActivity(@NotNull String beginCallPayloadStr) {
        beginCallPayloadStr.getClass();
        Intent intent = new Intent(this.context, (Class<?>) CallActivity.class);
        intent.setFlags(268566528);
        intent.putExtra(IntentConstants.CALL_REQUEST_WITH_BEGINCALL_KEY, beginCallPayloadStr);
        getLOG().i("startCallActivity with beginCallPayload");
        this.context.startActivity(intent);
    }
}
