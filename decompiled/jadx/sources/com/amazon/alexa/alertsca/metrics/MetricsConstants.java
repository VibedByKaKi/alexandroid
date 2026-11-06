package com.amazon.alexa.alertsca.metrics;

import com.amazon.alexa.aamb.AAMBMetrics;
import com.amazon.alexa.alertsca.AlertsConstants;
import com.amazon.alexa.app.notification.util.Constants;
import com.amazon.alexa.capabilityagent.deviceproximity.common.event.DeviceProximityEventSender;
import com.amazon.alexa.entertainment.capabilityServiceAgent.AlexaMobilePushCapabilityServiceAgent;
import com.amazon.alexa.mobile.assistant.capabilities.applicationlauncher.ApplicationLauncherCapabilityAgent;
import com.amazon.alexa.mobile.assistant.capabilities.videoexperience.VideoExperienceCapabilityAgent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class MetricsConstants {
    public static final Alerts ALERTS = new Alerts(0);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Actions extends MetricsElement {
        public final MetricsElement NULL_TOKEN;

        public Actions(MetricsElement metricsElement) {
            super("Actions", metricsElement);
            this.NULL_TOKEN = MetricsConstants.create("NullToken", this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AlertsService extends MetricsElement {
        public final Actions ACTIONS;
        public final MetricsElement CONNECTION;
        public final MetricsElement START_FOREGROUND;

        public AlertsService(MetricsElement metricsElement) {
            super("Service", metricsElement);
            this.ACTIONS = new Actions(this);
            this.START_FOREGROUND = MetricsConstants.create("StartForeground", this);
            this.CONNECTION = MetricsConstants.create("Connection", this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AudioFocus extends MetricsElement {
        public final MetricsElement REQUEST_FOCUS_FAILED;
        public final MetricsElement REQUEST_FOCUS_NOT_GRANTED;

        public AudioFocus(MetricsElement metricsElement) {
            super("AudioFocus", metricsElement);
            this.REQUEST_FOCUS_NOT_GRANTED = MetricsConstants.create("RequestFocusNotGranted", this);
            this.REQUEST_FOCUS_FAILED = MetricsConstants.create("RequestFocusFailed", this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Directives extends MetricsElement {
        public final MetricsElement DELETE_ALERT;
        public final MetricsElement DELETE_ALERTS;
        public final MetricsElement DELETE_ALERT_NOT_FOUND;
        public final MetricsElement PARSING_DELETE_ALERT;
        public final MetricsElement PARSING_DELETE_MULTIPLE_ALERTS;
        public final MetricsElement PARSING_SET_ALERT;
        public final MetricsElement PARTIALLY_SUCCESSFUL_DELETE_ALERTS;
        public final MetricsElement SET_ALERT;
        public final MetricsElement UNKNOWN;
        public final MetricsElement UNKNOWN_NAMESPACE;

        public Directives(MetricsElement metricsElement) {
            super("Directives", metricsElement);
            this.DELETE_ALERTS = MetricsConstants.create(AlertsConstants.Alerts.Directives.DeleteAlerts.NAME, this);
            this.DELETE_ALERT = MetricsConstants.create("DeleteAlert", this);
            this.DELETE_ALERT_NOT_FOUND = MetricsConstants.create("DeleteAlertNotFound", this);
            this.SET_ALERT = MetricsConstants.create(AlertsConstants.Alerts.Directives.SetAlert.NAME, this);
            this.UNKNOWN = MetricsConstants.create("Unknown", this);
            this.UNKNOWN_NAMESPACE = MetricsConstants.create("UnknownNamespace", this);
            this.PARSING_DELETE_ALERT = MetricsConstants.create("ParsingDeleteAlert", this);
            this.PARSING_SET_ALERT = MetricsConstants.create("ParsingSetAlert", this);
            this.PARSING_DELETE_MULTIPLE_ALERTS = MetricsConstants.create("ParsingDeleteMultipleAlerts", this);
            this.PARTIALLY_SUCCESSFUL_DELETE_ALERTS = MetricsConstants.create("PartiallySuccessfulDeleteAlerts", this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class DisplayActivity extends MetricsElement {
        public final MetricsElement ALERT_VIEW_DISMISS;
        public final MetricsElement ALERT_VIEW_SHOW;
        public final MetricsElement BACK_PRESSED;
        public final MetricsElement CLICKED_DISMISS;
        public final MetricsElement NEW_INTENT;
        public final MetricsElement ON_DISMISS;
        public final MetricsElement SHOW;

        public DisplayActivity(MetricsElement metricsElement) {
            super("DisplayActivity", metricsElement);
            this.SHOW = MetricsConstants.create("Show", this);
            this.NEW_INTENT = MetricsConstants.create("NewIntent", this);
            this.BACK_PRESSED = MetricsConstants.create("BackPressed", this);
            this.CLICKED_DISMISS = MetricsConstants.create("ClickedDismiss", this);
            this.ON_DISMISS = MetricsConstants.create("OnDismiss", this);
            this.ALERT_VIEW_SHOW = MetricsConstants.create("AlertViewShow", this);
            this.ALERT_VIEW_DISMISS = MetricsConstants.create("AlertViewDismiss", this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ExoPlayer extends MetricsElement {
        public final MetricsElement CANNOT_PREPARE;
        public final MetricsElement CREATE_PLAYER;
        public final MetricsElement PAUSE;
        public final MetricsElement PLAY;
        public final MetricsElement PLAYER_ERROR;
        public final MetricsElement STOP;
        public final MetricsElement USAGE;

        public ExoPlayer(MetricsElement metricsElement) {
            super("ExoPlayer", metricsElement);
            this.PLAY = MetricsConstants.create(VideoExperienceCapabilityAgent.PLAY_DIRECTIVE, this);
            this.PAUSE = MetricsConstants.create("Pause", this);
            this.STOP = MetricsConstants.create("Stop", this);
            this.CREATE_PLAYER = MetricsConstants.create("CreatePlayer", this);
            this.CANNOT_PREPARE = MetricsConstants.create("CannotPrepare", this);
            this.PLAYER_ERROR = MetricsConstants.create("PlayerError", this);
            this.USAGE = MetricsConstants.create("Usage", this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Notifications extends MetricsElement {
        public final MetricsElement CANCEL;
        public final MetricsElement DISMISS;
        public final MetricsElement ENABLED;
        public final MetricsElement FULL_SCREEN_INTENT;
        public final MetricsElement NOTIFICATION_CENTER;
        public final MetricsElement NOTIFY;

        public Notifications(MetricsElement metricsElement) {
            super("Notifications", metricsElement);
            this.NOTIFY = MetricsConstants.create(AlexaMobilePushCapabilityServiceAgent.RING_SCENE_UPDATE_DIRECTIVE_NAME, this);
            this.CANCEL = MetricsConstants.create(AAMBMetrics.Button.CANCEL, this);
            this.DISMISS = MetricsConstants.create("Dismiss", this);
            this.FULL_SCREEN_INTENT = MetricsConstants.create("FullScreenIntent", this);
            this.ENABLED = MetricsConstants.create("Enabled", this);
            this.NOTIFICATION_CENTER = MetricsConstants.create(Constants.MetricsComponents.NOTIFICATION_CENTER_SUBCOMPONENT, this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Permissions extends MetricsElement {
        public final MetricsElement NOTIFICATIONS;
        public final MetricsElement PERMISSION_DIALOG_CLICKED;
        public final MetricsElement SCHEDULE_EXACT_ALARM;

        public Permissions(MetricsElement metricsElement) {
            super("Permissions", metricsElement);
            this.NOTIFICATIONS = MetricsConstants.create("Notifications", this);
            this.SCHEDULE_EXACT_ALARM = MetricsConstants.create("ScheduleExactAlarm", this);
            this.PERMISSION_DIALOG_CLICKED = MetricsConstants.create("PermissionDialogClicked", this);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Unexpected extends MetricsElement {
        public final MetricsElement NULL_DEVICE_INFO;

        public Unexpected(MetricsElement metricsElement) {
            super("Unexpected", metricsElement);
            this.NULL_DEVICE_INFO = MetricsConstants.create("NullDeviceInfo", this);
        }
    }

    private MetricsConstants() {
        throw new AssertionError("Cannot create an instance of this class!");
    }

    public static MetricsElement create(String str, MetricsElement metricsElement) {
        return new MetricsElement(str, metricsElement);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Alerts extends MetricsElement {
        public final Actions ACTIONS;
        public final MetricsElement ALERT_DISPLAY_ACTIVITY_UPDATE_UI_ALARM;
        public final MetricsElement ALERT_DISPLAY_ACTIVITY_UPDATE_UI_TIMER;
        public final MetricsElement ALERT_EXPIRED_AFTER_REBOOT;
        public final MetricsElement ALERT_LAUNCHED_AFTER_REBOOT;
        public final MetricsElement ALERT_WAS_NOT_TRIGGERED_WITHIN_THRESHOLD;
        public final MetricsElement ALERT_WAS_TRIGGERED;
        public final MetricsElement ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_10;
        public final MetricsElement ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_20;
        public final MetricsElement ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_30;
        public final MetricsElement ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_6;
        public final MetricsElement ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_60;
        public final MetricsElement ALREADY_ACTIVE;
        public final AudioFocus AUDIO_FOCUS;
        public final Directives DIRECTIVES;
        public final DisplayActivity DISPLAY_ACTIVITY;
        public final MetricsElement EVENT_SENT;
        public final ExoPlayer EXO_PLAYER;
        public final MetricsElement LAUNCH;
        public final Notifications NOTIFICATIONS;
        public final Permissions PERMISSIONS;
        public final MetricsElement SCHEDULE;
        public final AlertsService SERVICE;
        public final MetricsElement STARTED;
        public final MetricsElement TRIGGER_THRESHOLD_DIFFERENCE;
        public final Unexpected UNEXPECTED;
        public final MetricsElement UNSCHEDULE;

        private Alerts() {
            super("Alerts");
            this.NOTIFICATIONS = new Notifications(this);
            this.EXO_PLAYER = new ExoPlayer(this);
            this.DIRECTIVES = new Directives(this);
            this.ACTIONS = new Actions(this);
            this.DISPLAY_ACTIVITY = new DisplayActivity(this);
            this.SERVICE = new AlertsService(this);
            this.PERMISSIONS = new Permissions(this);
            this.AUDIO_FOCUS = new AudioFocus(this);
            this.UNEXPECTED = new Unexpected(this);
            this.SCHEDULE = MetricsConstants.create("Schedule", this);
            this.UNSCHEDULE = MetricsConstants.create("Unschedule", this);
            this.LAUNCH = MetricsConstants.create(ApplicationLauncherCapabilityAgent.LAUNCH_DIRECTIVE, this);
            this.STARTED = MetricsConstants.create("Started", this);
            this.ALREADY_ACTIVE = MetricsConstants.create("AlreadyActive", this);
            this.ALERT_EXPIRED_AFTER_REBOOT = MetricsConstants.create("AlertExpiredAfterReboot", this);
            this.ALERT_LAUNCHED_AFTER_REBOOT = MetricsConstants.create("AlertLaunchedAfterReboot", this);
            this.ALERT_DISPLAY_ACTIVITY_UPDATE_UI_ALARM = MetricsConstants.create("AlertDisplayActivityUpdateUIAlarm", this);
            this.ALERT_DISPLAY_ACTIVITY_UPDATE_UI_TIMER = MetricsConstants.create("AlertDisplayActivityUpdateUITimer", this);
            this.ALERT_WAS_TRIGGERED = MetricsConstants.create("AlertWasTriggered", this);
            this.ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_6 = MetricsConstants.create("AlertWasTriggeredWithinThreshold6Seconds", this);
            this.ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_10 = MetricsConstants.create("AlertWasTriggeredWithinThreshold10Seconds", this);
            this.ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_20 = MetricsConstants.create("AlertWasTriggeredWithinThreshold20Seconds", this);
            this.ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_30 = MetricsConstants.create("AlertWasTriggeredWithinThreshold30Seconds", this);
            this.ALERT_WAS_TRIGGERED_WITHIN_THRESHOLD_60 = MetricsConstants.create("AlertWasTriggeredWithinThreshold60Seconds", this);
            this.ALERT_WAS_NOT_TRIGGERED_WITHIN_THRESHOLD = MetricsConstants.create("AlertWasNotTriggeredWithinThreshold", this);
            this.TRIGGER_THRESHOLD_DIFFERENCE = MetricsConstants.create("TriggerThresholdDifference", this);
            this.EVENT_SENT = MetricsConstants.create(DeviceProximityEventSender.EVENT_SEND_SUCCEEDED_METRIC_NAME, this);
        }

        public /* synthetic */ Alerts(int i) {
            this();
        }
    }
}
