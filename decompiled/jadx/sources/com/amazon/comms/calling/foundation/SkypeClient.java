package com.amazon.comms.calling.foundation;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.amazon.comms.calling.foundation.metrics.MetricsManager;
import com.amazon.comms.log.CommsLogger;
import defpackage.a;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J(\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0015H\u0002J\u0006\u0010\u001b\u001a\u00020\u0011J\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u001e"}, d2 = {"Lcom/amazon/comms/calling/foundation/SkypeClient;", "", "metricsManager", "Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;", "packageManager", "Landroid/content/pm/PackageManager;", "commsCallUri", "Lcom/amazon/comms/calling/foundation/CommsCallUri;", "<init>", "(Lcom/amazon/comms/calling/foundation/metrics/MetricsManager;Landroid/content/pm/PackageManager;Lcom/amazon/comms/calling/foundation/CommsCallUri;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lcom/amazon/comms/calling/foundation/CallingLogger;", "startSkypeActivity", "", "context", "Landroid/content/Context;", "rawAddress", "", "startActivityWithIntent", "intent", "Landroid/content/Intent;", "activitySuccessMetric", "activityFailureMetric", "isSkypeClientInstalled", "navigateToPlayStore", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class SkypeClient {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {a.a(SkypeClient.class, "LOG", "getLOG()Lcom/amazon/comms/log/CommsLogger;", 0)};

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final CallingLogger LOG;

    @NotNull
    private final CommsCallUri commsCallUri;

    @NotNull
    private final MetricsManager metricsManager;

    @NotNull
    private final PackageManager packageManager;

    @Inject
    public SkypeClient(@NotNull MetricsManager metricsManager, @NotNull PackageManager packageManager, @NotNull CommsCallUri commsCallUri) {
        metricsManager.getClass();
        packageManager.getClass();
        commsCallUri.getClass();
        this.metricsManager = metricsManager;
        this.packageManager = packageManager;
        this.commsCallUri = commsCallUri;
        this.LOG = new CallingLogger();
    }

    private final CommsLogger getLOG() {
        return this.LOG.getValue(this, $$delegatedProperties[0]);
    }

    private final boolean startActivityWithIntent(Context context, Intent intent, String activitySuccessMetric, String activityFailureMetric) {
        try {
            context.startActivity(intent);
            MetricsManager.DefaultImpls.recordCounterMetric$default(this.metricsManager, activitySuccessMetric, null, false, 6, null);
            return true;
        } catch (ActivityNotFoundException e) {
            getLOG().e("Unexpected failure occurred during startActivity", e);
            MetricsManager.DefaultImpls.recordCounterMetric$default(this.metricsManager, activityFailureMetric, null, false, 6, null);
            return false;
        }
    }

    public final boolean isSkypeClientInstalled() {
        try {
            this.packageManager.getPackageInfo("com.skype.raider", 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void navigateToPlayStore(@NotNull Context context) {
        context.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Intent intent = new Intent("android.intent.action.VIEW", this.commsCallUri.parse(String.format("market://details?id=%s", Arrays.copyOf(new Object[]{"com.skype.raider"}, 1))));
        intent.setFlags(268435456);
        startActivityWithIntent(context, intent, "comms.app.Skype.Market", "comms.app.Skype.Market.fail");
    }

    public final boolean startSkypeActivity(@NotNull Context context, @NotNull String rawAddress) {
        context.getClass();
        rawAddress.getClass();
        if (!isSkypeClientInstalled()) {
            navigateToPlayStore(context);
            return false;
        }
        Intent intent = new Intent("android.intent.action.VIEW", this.commsCallUri.parse(rawAddress));
        intent.setComponent(new ComponentName("com.skype.raider", "com.skype.raider.Main"));
        intent.setFlags(268435456);
        getLOG().i("Preparing to start a Skype Activity using URI");
        return startActivityWithIntent(context, intent, "comms.app.Skype.App", "comms.app.Skype.App.fail");
    }
}
