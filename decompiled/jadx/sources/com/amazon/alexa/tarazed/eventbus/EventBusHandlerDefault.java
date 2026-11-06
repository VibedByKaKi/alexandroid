package com.amazon.alexa.tarazed.eventbus;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.RequiresApi;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.identity.api.IdentityEvent;
import com.amazon.alexa.tarazed.acrs.TarazedACRSSubscriber;
import com.amazon.alexa.tarazed.dmps.DMPSHandlerDefault;
import com.amazon.tarazed.TarazedIntents;
import com.amazon.tarazed.logging.TarazedSessionLogger;
import com.amazon.tarazed.metrics.TarazedMetricsHelper;
import com.amazon.tarazed.notification.type.TarazedLaunchRequest;
import com.amazon.tarazed.sessionmanager.TarazedSessionAndroidService;
import com.amazon.tarazed.type.NotificationSource;
import defpackage.a$$ExternalSyntheticOutline0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010 \u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\n8\u0000@\u0000X\u0081.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006&"}, d2 = {"Lcom/amazon/alexa/tarazed/eventbus/EventBusHandlerDefault;", "Lcom/amazon/alexa/tarazed/eventbus/EventBusHandler;", "context", "Landroid/content/Context;", "logger", "Lcom/amazon/tarazed/logging/TarazedSessionLogger;", "metricsHelper", "Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;", "(Landroid/content/Context;Lcom/amazon/tarazed/logging/TarazedSessionLogger;Lcom/amazon/tarazed/metrics/TarazedMetricsHelper;)V", "tarazedScope", "Lkotlinx/coroutines/CoroutineScope;", "getTarazedScope$AlexaMobileAndroidTarazedIntegration_release", "()Lkotlinx/coroutines/CoroutineScope;", "setTarazedScope$AlexaMobileAndroidTarazedIntegration_release", "(Lkotlinx/coroutines/CoroutineScope;)V", "handle", "", "message", "Lcom/amazon/alexa/eventbus/api/Message;", "handleIdentitySignOut", "handleLaunchEvent", "handleLaunchString", "launchRequestString", "", "shouldShow3pLaunchNotification", "", "source", "Lcom/amazon/tarazed/type/NotificationSource;", "handleLaunchV2Event", "handlePauseEvent", "isAcrsMessage", "parseV1Payload", "parseV2Payload", "setupServiceConnection", "Landroid/content/ServiceConnection;", "tarazedLaunchRequest", "Lcom/amazon/tarazed/notification/type/TarazedLaunchRequest;", "Companion", "AlexaMobileAndroidTarazedIntegration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class EventBusHandlerDefault implements EventBusHandler {

    @NotNull
    private static final String METRIC_EVENT_BUS_EVENT_RECEIVED = "EventReceived";

    @NotNull
    private static final String METRIC_EVENT_BUS_LAUNCH_EVENT = "LaunchEvent";

    @NotNull
    private static final String METRIC_EVENT_BUS_NULL_LAUNCH_REQUEST = "NullLaunchRequest";

    @NotNull
    private static final String METRIC_EVENT_BUS_PAUSE_EVENT = "PauseEvent";

    @NotNull
    private static final String METRIC_EVENT_BUS_SDK31_LAUNCH_EVENT = "SDK31LaunchEvent";

    @NotNull
    private static final String METRIC_EVENT_BUS_SDK31_SESSION_FAILED = "SDK31SessionFailed";

    @NotNull
    private static final String METRIC_EVENT_BUS_SDK34_LAUNCH_EVENT = "SDK34LaunchEvent";

    @NotNull
    private static final String METRIC_EVENT_BUS_SDK34_SESSION_FAILED = "SDK34SessionFailed";

    @NotNull
    private static final String METRIC_EVENT_BUS_SIGNOUT_EVENT = "SignoutEvent";

    @NotNull
    private static final String METRIC_EVENT_BUS_UNEXPECTED_EVENT = "UnexpectedEvent";

    @NotNull
    private static final String TAG = "EventBusHandlerDefault";

    @NotNull
    private final Context context;

    @NotNull
    private final TarazedSessionLogger logger;

    @NotNull
    private final TarazedMetricsHelper metricsHelper;

    @Inject
    public CoroutineScope tarazedScope;

    public EventBusHandlerDefault(@NotNull Context context, @NotNull TarazedSessionLogger tarazedSessionLogger, @NotNull TarazedMetricsHelper tarazedMetricsHelper) {
        context.getClass();
        tarazedSessionLogger.getClass();
        tarazedMetricsHelper.getClass();
        this.context = context;
        this.logger = tarazedSessionLogger;
        this.metricsHelper = tarazedMetricsHelper;
    }

    private final void handleIdentitySignOut() {
        if (TarazedSessionAndroidService.INSTANCE.isSessionActive()) {
            this.logger.i(TAG, "User has signed out of the app, ending session");
            this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_SIGNOUT_EVENT, 1.0d);
            Intent intent = new Intent(this.context, (Class<?>) TarazedSessionAndroidService.class);
            intent.setAction(TarazedIntents.SessionAndroidService.END_SESSION_ON_3P_APP_EVENT);
            this.context.startService(intent);
        }
    }

    private final void handleLaunchEvent(Message message) {
        String parseV1Payload = parseV1Payload(message);
        if (parseV1Payload == null) {
            this.logger.e(TAG, "Could not get launch request from V1 payload");
            this.metricsHelper.addCountHighPriority(TAG, METRIC_EVENT_BUS_NULL_LAUNCH_REQUEST, 1.0d);
            return;
        }
        boolean isAcrsMessage = isAcrsMessage(message);
        boolean z = !isAcrsMessage;
        if (isAcrsMessage) {
            this.logger.i(TAG, "ACRS notification detected, setting shouldShow3pLaunchNotification to false");
        }
        NotificationSource notificationSource = isAcrsMessage ? NotificationSource.ACRS : NotificationSource.DMPS;
        this.logger.i(TAG, "Successfully parsed v1 launch request: ".concat(parseV1Payload));
        handleLaunchString(parseV1Payload, z, notificationSource);
    }

    private final void handleLaunchString(String launchRequestString, boolean shouldShow3pLaunchNotification, NotificationSource source) {
        TarazedLaunchRequest tarazedLaunchRequest = (TarazedLaunchRequest) JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.amazon.alexa.tarazed.eventbus.EventBusHandlerDefault$handleLaunchString$tarazedLaunchRequest$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull JsonBuilder jsonBuilder) {
                jsonBuilder.getClass();
                jsonBuilder.setIgnoreUnknownKeys(true);
            }
        }, 1, null).decodeFromString(TarazedLaunchRequest.INSTANCE.serializer(), launchRequestString);
        TarazedMetricsHelper.addMetricTimer$default(this.metricsHelper, TAG, a$$ExternalSyntheticOutline0.m(TarazedMetricsHelper.METRIC_SESSION_REQUEST_RECEIPT_DELAY, source.getMetricSuffix()), System.currentTimeMillis() - tarazedLaunchRequest.getNotificationTime(), 0, 8, null);
        ServiceConnection serviceConnection = setupServiceConnection(tarazedLaunchRequest);
        this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_LAUNCH_EVENT, 1.0d);
        Intent intent = new Intent(this.context, (Class<?>) TarazedSessionAndroidService.class);
        intent.setAction(TarazedIntents.SessionAndroidService.START_SESSION);
        intent.putExtra(TarazedIntents.SessionAndroidService.EXTRA_LAUNCH_REQUEST, launchRequestString);
        intent.putExtra(TarazedIntents.SessionAndroidService.EXTRA_SHOULD_SHOW_3P_LAUNCH_NOTIFICATION, shouldShow3pLaunchNotification);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_SDK34_LAUNCH_EVENT, 1.0d);
            try {
                this.context.bindService(intent, serviceConnection, 1);
                return;
            } catch (IllegalStateException unused) {
                this.logger.e(TAG, "[SDK34] Failed to bind to TarazedSessionAndroidService");
                try {
                    this.context.startForegroundService(intent);
                    return;
                } catch (IllegalStateException unused2) {
                    this.logger.e(TAG, "[SDK34] Failed to start service in foreground");
                    this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_SDK34_SESSION_FAILED, 1.0d);
                    return;
                }
            }
        }
        if (i < 31) {
            this.context.startForegroundService(intent);
            return;
        }
        this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_SDK31_LAUNCH_EVENT, 1.0d);
        try {
            this.context.startForegroundService(intent);
        } catch (IllegalStateException unused3) {
            this.logger.e(TAG, "[SDK31] Failed to start service in foreground");
            this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_SDK31_SESSION_FAILED, 1.0d);
        }
    }

    public static /* synthetic */ void handleLaunchString$default(EventBusHandlerDefault eventBusHandlerDefault, String str, boolean z, NotificationSource notificationSource, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            notificationSource = NotificationSource.UNKNOWN;
        }
        eventBusHandlerDefault.handleLaunchString(str, z, notificationSource);
    }

    private final void handleLaunchV2Event(Message message) {
        String parseV2Payload = parseV2Payload(message);
        TarazedSessionLogger tarazedSessionLogger = this.logger;
        if (parseV2Payload == null) {
            tarazedSessionLogger.e(TAG, "Could not get launch request from DMPS V2 payload");
            this.metricsHelper.addCountHighPriority(TAG, METRIC_EVENT_BUS_NULL_LAUNCH_REQUEST, 1.0d);
        } else {
            tarazedSessionLogger.i(TAG, "Successfully parsed v2 launch request: ".concat(parseV2Payload));
            handleLaunchString(parseV2Payload, false, NotificationSource.DMPS);
        }
    }

    private final void handlePauseEvent() {
        if (TarazedSessionAndroidService.INSTANCE.isSessionActive()) {
            this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_PAUSE_EVENT, 1.0d);
            Intent intent = new Intent(this.context, (Class<?>) TarazedSessionAndroidService.class);
            intent.setAction(TarazedIntents.SessionAndroidService.PAUSE_SESSION);
            this.context.startService(intent);
        }
    }

    private final boolean isAcrsMessage(Message message) {
        try {
            JSONArray jSONArray = new JSONArray(message.getPayloadAsString());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                if (jSONArray.getJSONObject(i).optBoolean(TarazedACRSSubscriber.ACRS_SOURCE_MARKER, false)) {
                    return true;
                }
            }
            return false;
        } catch (JSONException e) {
            this.logger.w(TAG, "Failed to check for ACRS marker in payload", e);
            return false;
        }
    }

    private final String parseV1Payload(Message message) {
        try {
            JSONArray jSONArray = new JSONArray(message.getPayloadAsString());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.getJSONObject(i).optJSONObject(TarazedACRSSubscriber.REQUEST_CONTENT_PROP);
                if (optJSONObject != null) {
                    return optJSONObject.getString("original_uri");
                }
            }
            return null;
        } catch (JSONException e) {
            this.logger.w(TAG, "Failed to parse V1 payload", e);
            return null;
        }
    }

    private final String parseV2Payload(Message message) {
        try {
            JSONArray jSONArray = new JSONArray(message.getPayloadAsString());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.getJSONObject(i).optJSONObject(PayloadUtils.PayloadKeys.ADDITIONAL_ATTRIBUTES);
                if (optJSONObject != null) {
                    String optString = optJSONObject.optString("original_uri");
                    optString.getClass();
                    if (optString.length() > 0) {
                        this.logger.d(TAG, "Found additionalAttributes original_uri: " + optString);
                        return optString;
                    }
                }
            }
            this.logger.w(TAG, "Could not find additionalAttributes with original_uri in DMPS V2 payload");
            return null;
        } catch (JSONException e) {
            this.logger.w(TAG, "Failed to parse V2 payload", e);
            return null;
        }
    }

    private final ServiceConnection setupServiceConnection(final TarazedLaunchRequest tarazedLaunchRequest) {
        return new ServiceConnection() { // from class: com.amazon.alexa.tarazed.eventbus.EventBusHandlerDefault$setupServiceConnection$tarazedSessionAndroidServiceConnection$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(@Nullable ComponentName name) {
                TarazedSessionLogger tarazedSessionLogger;
                tarazedSessionLogger = this.logger;
                tarazedSessionLogger.w("EventBusHandlerDefault", "Binding has died.");
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(@Nullable ComponentName name) {
                TarazedSessionLogger tarazedSessionLogger;
                tarazedSessionLogger = this.logger;
                tarazedSessionLogger.w("EventBusHandlerDefault", "Bind was null.");
            }

            @Override // android.content.ServiceConnection
            @RequiresApi(26)
            public void onServiceConnected(@Nullable ComponentName p0, @Nullable IBinder service) {
                service.getClass();
                ((TarazedSessionAndroidService.LocalBinder) service).getThis$0().handleControllerLaunchRequest(TarazedLaunchRequest.this);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(@Nullable ComponentName name) {
                TarazedSessionLogger tarazedSessionLogger;
                tarazedSessionLogger = this.logger;
                tarazedSessionLogger.w("EventBusHandlerDefault", "Service is disconnected.");
            }
        };
    }

    @NotNull
    public final CoroutineScope getTarazedScope$AlexaMobileAndroidTarazedIntegration_release() {
        CoroutineScope coroutineScope = this.tarazedScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("tarazedScope");
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.amazon.alexa.tarazed.eventbus.EventBusHandler
    public void handle(@NotNull Message message) {
        message.getClass();
        this.logger.i(TAG, "Tarazed event (" + message.getEventType() + ") received from event bus");
        this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_EVENT_RECEIVED, 1.0d);
        String eventType = message.getEventType();
        if (eventType != null) {
            switch (eventType.hashCode()) {
                case -1848576398:
                    if (eventType.equals(DMPSHandlerDefault.EVENT_BUS_TARAZED_PAUSE_EVENT_TYPE)) {
                        handlePauseEvent();
                        return;
                    }
                    break;
                case -1717819618:
                    if (eventType.equals(IdentityEvent.IDENTITY_SIGN_OUT_SUCCESS)) {
                        handleIdentitySignOut();
                        return;
                    }
                    break;
                case -1585814857:
                    if (eventType.equals(DMPSHandlerDefault.EVENT_BUS_TARAZED_LAUNCH_EVENT_TYPE)) {
                        handleLaunchEvent(message);
                        return;
                    }
                    break;
                case 745315219:
                    if (eventType.equals(DMPSHandlerDefault.EVENT_BUS_TARAZED_LAUNCHV2_EVENT_TYPE)) {
                        handleLaunchV2Event(message);
                        return;
                    }
                    break;
            }
        }
        this.logger.w(TAG, "unexpected type: " + message.getEventType() + " from event bus, ignored");
        this.metricsHelper.addCount(TAG, METRIC_EVENT_BUS_UNEXPECTED_EVENT, 1.0d);
    }

    public final void setTarazedScope$AlexaMobileAndroidTarazedIntegration_release(@NotNull CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        this.tarazedScope = coroutineScope;
    }
}
