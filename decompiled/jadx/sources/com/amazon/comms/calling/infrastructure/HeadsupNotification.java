package com.amazon.comms.calling.infrastructure;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.ColorRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import com.amazon.comms.calling.R;
import com.amazon.comms.calling.data.util.Constants;
import com.amazon.comms.calling.data.util.RetrofitUtilKt$$ExternalSyntheticLambda0;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.infrastructure.extensions.NotificationManagerExtKt;
import com.amazon.comms.calling.presentation.ui.CallActivity;
import com.amazon.comms.log.CommsLogger;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 &2\u00020\u0001:\u0001&B!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u0019\u001a\u00020\u001a2\b\b\u0001\u0010\u001b\u001a\u00020\u001aH\u0002J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J\u0010\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010!\u001a\u00020 H\u0002J\u0018\u0010\"\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010$\u001a\u00020#2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010%\u001a\u00020#H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\n\u001a\n \f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006'"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/HeadsupNotification;", "", "context", "Landroid/content/Context;", "notificationManager", "Landroid/app/NotificationManager;", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "<init>", "(Landroid/content/Context;Landroid/app/NotificationManager;Lcom/amazon/comms/calling/data/util/Utils;)V", "LOG", "Lcom/amazon/comms/log/CommsLogger;", "kotlin.jvm.PlatformType", "getLOG", "()Lcom/amazon/comms/log/CommsLogger;", "LOG$delegate", "Lkotlin/Lazy;", "createHeadupNotification", "Landroid/app/Notification;", "callerName", "", "isVideoCall", "", "getActionText", "Landroid/text/Spannable;", "stringRes", "", "colorRes", "createCommsNotificationBuilder", "Landroid/app/Notification$Builder;", "getCallTypeString", "getAnswerButtonAction", "Landroid/app/Notification$Action;", "getDeclineButtonAction", "getPendingIntent", "Landroid/app/PendingIntent;", "getAnswerIntent", "getDeclineIntent", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class HeadsupNotification {

    @NotNull
    public static final String KEY_CALLER_NAME = "caller_name";
    public static final int KEY_DISMISS_INCOMING_HEADUP_NOTIFICATION = 100;

    @NotNull
    public static final String KEY_HAVE_ANSWERED_CALL = "have_answered_call";

    @NotNull
    public static final String KEY_HAVE_DECLINED_CALL = "have_declined_call";

    @NotNull
    public static final String KEY_IS_VIDEO_CALL = "is_video_call";

    @NotNull
    public static final String KEY_STARTED_FROM_PENDING_INTENT = "have_started_from_pending_intent";

    @NotNull
    public static final String REGISTRATION_EVENT_TYPE_KEY = "REGISTRATION_TYPE";

    @NotNull
    public static final String SHOULD_START_FOREGROUND_NOTI = "should_start_foreground";

    @NotNull
    public static final String START_FROM_SERVICE = "start_from_service";

    /* renamed from: LOG$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy LOG;

    @NotNull
    private final Context context;

    @NotNull
    private final NotificationManager notificationManager;

    @NotNull
    private final Utils utils;

    @Inject
    public HeadsupNotification(@NotNull Context context, @NotNull NotificationManager notificationManager, @NotNull Utils utils) {
        context.getClass();
        notificationManager.getClass();
        utils.getClass();
        this.context = context;
        this.notificationManager = notificationManager;
        this.utils = utils;
        this.LOG = LazyKt.lazy(new RetrofitUtilKt$$ExternalSyntheticLambda0(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CommsLogger LOG_delegate$lambda$0() {
        return CommsLogger.getLogger(Constants.LOG_TAG, HeadsupNotification.class);
    }

    private final Spannable getActionText(@StringRes int stringRes, @ColorRes int colorRes) {
        SpannableString spannableString = new SpannableString(this.context.getText(stringRes));
        spannableString.setSpan(new ForegroundColorSpan(this.context.getColor(colorRes)), 0, spannableString.length(), 0);
        return spannableString;
    }

    private final Notification.Action getAnswerButtonAction(boolean isVideoCall, String callerName) {
        Notification.Action build = new Notification.Action.Builder(Icon.createWithResource(this.context, R.drawable.ic_call), getActionText(R.string.calling_answer, R.color.blueThemeAction10), getAnswerIntent(isVideoCall, callerName)).build();
        build.getClass();
        return build;
    }

    private final PendingIntent getAnswerIntent(boolean isVideoCall, String callerName) {
        Intent intent = new Intent(this.context, (Class<?>) CallActivity.class);
        intent.setFlags(268566528);
        intent.putExtra("start_from_service", true);
        intent.putExtra("caller_name", callerName);
        intent.putExtra("have_answered_call", true);
        intent.putExtra("have_declined_call", false);
        intent.putExtra(KEY_IS_VIDEO_CALL, isVideoCall);
        PendingIntent activity = PendingIntent.getActivity(this.context, 100, intent, 201326592);
        activity.getClass();
        return activity;
    }

    private final String getCallTypeString(boolean isVideoCall) {
        String string = this.context.getString(isVideoCall ? R.string.alexa_video_call_action_name : R.string.alexa_audio_call_action_name);
        string.getClass();
        return string;
    }

    private final Notification.Action getDeclineButtonAction() {
        Notification.Action build = new Notification.Action.Builder(Icon.createWithResource(this.context, R.drawable.ic_call_end), getActionText(R.string.calling_decline, R.color.blueThemeStatus20), getDeclineIntent()).build();
        build.getClass();
        return build;
    }

    private final PendingIntent getDeclineIntent() {
        Intent intent = new Intent(this.context, (Class<?>) CallDeclineBroadcastReceiver.class);
        intent.setAction(CallDeclineBroadcastReceiver.ACTION_CALL_DECLINE);
        PendingIntent broadcast = PendingIntent.getBroadcast(this.context, 101, intent, 201326592);
        broadcast.getClass();
        return broadcast;
    }

    private final CommsLogger getLOG() {
        return (CommsLogger) this.LOG.getValue();
    }

    private final PendingIntent getPendingIntent(boolean isVideoCall, String callerName) {
        Intent intent = new Intent(this.context, (Class<?>) CallActivity.class);
        intent.setFlags(268566528);
        intent.putExtra("start_from_service", true);
        intent.putExtra("caller_name", callerName);
        intent.putExtra("have_started_from_pending_intent", true);
        intent.putExtra(KEY_IS_VIDEO_CALL, isVideoCall);
        PendingIntent activity = PendingIntent.getActivity(this.context, 0, intent, 201326592);
        activity.getClass();
        return activity;
    }

    @RequiresApi(26)
    @VisibleForTesting
    @NotNull
    public final Notification.Builder createCommsNotificationBuilder(@NotNull String callerName, boolean isVideoCall) {
        callerName.getClass();
        Notification.Builder timeoutAfter = new Notification.Builder(this.context, "com.amazon.deecomms.notifications.channel.calling.headup").setSmallIcon(R.drawable.app_icon).setOngoing(true).setPriority(1).setCategory("call").setFullScreenIntent(getPendingIntent(isVideoCall, callerName), true).setVisibility(1).setTimeoutAfter(Constants.DEFAULT_CALL_TIMEOUT);
        timeoutAfter.getClass();
        if (!this.utils.isAndroid12AndAbove()) {
            timeoutAfter.setContentTitle(getCallTypeString(isVideoCall));
            timeoutAfter.setContentText(callerName);
            timeoutAfter.addAction(getDeclineButtonAction());
            timeoutAfter.addAction(getAnswerButtonAction(isVideoCall, callerName));
            return timeoutAfter;
        }
        Person build = new Person.Builder().setName(callerName).setImportant(true).build();
        build.getClass();
        timeoutAfter.setStyle(Notification.CallStyle.forIncomingCall(build, getDeclineIntent(), getAnswerIntent(isVideoCall, callerName)).setIsVideo(isVideoCall));
        timeoutAfter.addPerson(build);
        timeoutAfter.setContentText(getCallTypeString(isVideoCall));
        return timeoutAfter;
    }

    @NotNull
    public final Notification createHeadupNotification(@NotNull String callerName, boolean isVideoCall) {
        callerName.getClass();
        NotificationManagerExtKt.createChannelForCallingIfNeeded(this.notificationManager, this.context);
        getLOG().d("[Comms-calling]: Fire createHeadupNotification");
        Notification build = createCommsNotificationBuilder(callerName, isVideoCall).build();
        build.getClass();
        return build;
    }
}
