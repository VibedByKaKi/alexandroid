package com.amazon.comms.calling.data.network;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.comms.calling.domain.model.InCallEvent;
import com.amazon.comms.calling.foundation.CallingLogger;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.smsmessaging.messagingcontroller.MessagingControllerConstant;
import defpackage.a;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0016\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/data/network/HalloProviderServiceImpl;", "Lcom/amazon/comms/calling/data/network/HalloProviderService;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "sendCommsEvent", "", "inCallEvent", "Lcom/amazon/comms/calling/domain/model/InCallEvent;", "sendExplicitBroadcastIntent", "intent", "Landroid/content/Intent;", MessagingControllerConstant.MESSAGING_CONTROLLER_ENDPOINT_PERMISSIONS_KEY, "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class HalloProviderServiceImpl implements HalloProviderService {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(HalloProviderServiceImpl.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final Context context;

    @Inject
    public HalloProviderServiceImpl(@NotNull Context context) {
        context.getClass();
        this.context = context;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.amazon.comms.calling.data.network.HalloProviderService
    public void sendCommsEvent(@NotNull InCallEvent inCallEvent) {
        inCallEvent.getClass();
        Bundle bundle = new Bundle();
        boolean z = inCallEvent instanceof InCallEvent.HalloEvent;
        if (z) {
            InCallEvent.HalloEvent halloEvent = (InCallEvent.HalloEvent) inCallEvent;
            bundle.putString("inCallEvent", halloEvent.getHalloEventType().getEventName());
            bundle.putString("callId", halloEvent.getCallId());
            bundle.putString("callState", halloEvent.getHalloEventType().getCallState().name());
            bundle.putString("SipClientState", halloEvent.getSipCallContext());
            bundle.putString("statusCode", halloEvent.getSipStatusCode());
            bundle.putString("halloEvent", halloEvent.getHalloEventType().getEventName());
        } else {
            if (!(inCallEvent instanceof InCallEvent.CallTypeEvent)) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
            }
            InCallEvent.CallTypeEvent callTypeEvent = (InCallEvent.CallTypeEvent) inCallEvent;
            bundle.putString("inCallEvent", callTypeEvent.getHalloEventType().getEventName());
            bundle.putString("callId", callTypeEvent.getCallId());
            bundle.putStringArrayList("callFlags", new ArrayList<>(callTypeEvent.getCallFlags()));
            bundle.putString("callExperienceType", callTypeEvent.getCallExperienceType().name());
            bundle.putString("SipClientState", callTypeEvent.getSipCallContext());
        }
        Intent intent = new Intent();
        if (z) {
            intent.setAction(((InCallEvent.HalloEvent) inCallEvent).getHalloEventType().getAction());
        } else {
            if (!(inCallEvent instanceof InCallEvent.CallTypeEvent)) {
                PathKt$$ExternalSyntheticBUOutline0.m();
                return;
            }
            intent.setAction(((InCallEvent.CallTypeEvent) inCallEvent).getHalloEventType().getAction());
        }
        intent.putExtras(bundle);
        sendExplicitBroadcastIntent(intent, "com.amazon.deecomms.permission");
    }

    public final void sendExplicitBroadcastIntent(@NotNull Intent intent, @NotNull String permissions) {
        intent.getClass();
        permissions.getClass();
        List<ResolveInfo> queryBroadcastReceivers = this.context.getPackageManager().queryBroadcastReceivers(intent, 0);
        queryBroadcastReceivers.getClass();
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            getLOG().i("Resolving to the broadcast receiver .." + resolveInfo.activityInfo.name);
            Intent intent2 = new Intent(intent);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            boolean isEmpty = TextUtils.isEmpty(permissions);
            Context context = this.context;
            if (isEmpty) {
                context.sendBroadcast(intent2);
            } else {
                context.sendBroadcast(intent2, permissions);
            }
        }
    }
}
