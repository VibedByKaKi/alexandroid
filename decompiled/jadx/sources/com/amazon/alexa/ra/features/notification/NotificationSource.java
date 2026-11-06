package com.amazon.alexa.ra.features.notification;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.R;
import com.amazon.alexa.ra.core.data.model.Constants;
import com.amazon.alexa.ra.core.features.notification.NotificationSourceApi;
import com.amazon.alexa.ra.core.ui.ResourceProvider;
import com.amazon.alexa.ra.core.ui.backgroundmode.NotificationCompatProvider;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/ra/features/notification/NotificationSource;", "Lcom/amazon/alexa/ra/core/features/notification/NotificationSourceApi;", "context", "Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "resourceProvider", "Lcom/amazon/alexa/ra/core/ui/ResourceProvider;", "notificationCompatProvider", "Lcom/amazon/alexa/ra/core/ui/backgroundmode/NotificationCompatProvider;", "<init>", "(Landroid/content/Context;Landroid/app/NotificationManager;Lcom/amazon/alexa/ra/core/ui/ResourceProvider;Lcom/amazon/alexa/ra/core/ui/backgroundmode/NotificationCompatProvider;)V", "start", "", "stop", "postOptInNotification", "createNotificationChannel", "Companion", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class NotificationSource implements NotificationSourceApi {

    @NotNull
    private static final String OPT_IN_CHANNEL_ID = "live_mode_opt_in";
    private static final int OPT_IN_NOTIFICATION_ID = 3;

    @NotNull
    private static final String TAG = "NotificationSource";

    @NotNull
    private final Context context;

    @NotNull
    private final NotificationCompatProvider notificationCompatProvider;

    @NotNull
    private final NotificationManager notificationManager;

    @NotNull
    private final ResourceProvider resourceProvider;
    public static final int $stable = 8;

    public NotificationSource(@NotNull Context context, @NotNull NotificationManager notificationManager, @NotNull ResourceProvider resourceProvider, @NotNull NotificationCompatProvider notificationCompatProvider) {
        context.getClass();
        notificationManager.getClass();
        resourceProvider.getClass();
        notificationCompatProvider.getClass();
        this.context = context;
        this.notificationManager = notificationManager;
        this.resourceProvider = resourceProvider;
        this.notificationCompatProvider = notificationCompatProvider;
    }

    private final void createNotificationChannel() {
        String string = this.resourceProvider.getString(R.string.ra_opt_in_channel_name);
        String string2 = this.resourceProvider.getString(R.string.ra_opt_in_channel_description);
        NotificationChannel notificationChannel = new NotificationChannel(OPT_IN_CHANNEL_ID, string, 3);
        notificationChannel.setDescription(string2);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setSound(null, null);
        this.notificationManager.createNotificationChannel(notificationChannel);
    }

    @Override // com.amazon.alexa.ra.core.features.notification.NotificationSourceApi
    public void postOptInNotification() {
        Log.i(TAG, "postOptInNotification() - Posting opt-in notification with ID 3");
        RaUiOptions build = new RaUiOptions.Builder().setStartingState("liveMode").setReferer(Constants.REFERER_LIVE_MODE_OPT_IN_NOTIFICATION).build();
        Intent intent = new Intent("amazon.intent.action.SHOW_RA_UI");
        intent.setPackage(this.context.getPackageName());
        intent.putExtra("ra_ui_options", build);
        intent.addFlags(268435456);
        Notification build2 = this.notificationCompatProvider.getBuilder(this.context, OPT_IN_CHANNEL_ID).setSmallIcon(R.drawable.alexa_input_icon).setContentText(this.resourceProvider.getString(R.string.ra_opt_in_notification_text)).setContentIntent(PendingIntent.getActivity(this.context, 0, intent, 201326592)).setPriority(0).setAutoCancel(true).build();
        build2.getClass();
        this.notificationManager.notify(3, build2);
    }

    @Override // com.amazon.alexa.ra.core.features.notification.NotificationSourceApi
    public void start() {
        createNotificationChannel();
    }

    @Override // com.amazon.alexa.ra.core.features.notification.NotificationSourceApi
    public void stop() {
    }

    public /* synthetic */ NotificationSource(Context context, NotificationManager notificationManager, ResourceProvider resourceProvider, NotificationCompatProvider notificationCompatProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, notificationManager, resourceProvider, (i & 8) != 0 ? NotificationCompatProvider.INSTANCE : notificationCompatProvider);
    }
}
