package com.amazon.alexa.handsfree.notification;

import androidx.annotation.ArrayRes;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.notification.metrics.NotificationEventMetadata;
import com.amazon.alexa.handsfree.settings.voxsettings.VoxSettingsRequestHandler;
import com.amazon.alexa.voice.ui.suggestions.SuggestionAction;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'TIME_BASED' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class NotificationType {
    private static final /* synthetic */ NotificationType[] $VALUES;
    public static final NotificationType ENABLE_HANDS_FREE;
    public static final NotificationType KILL_SWITCH;
    public static final NotificationType LANGUAGE_SWITCHING;
    public static final NotificationType PERMISSION_REQUEST;
    public static final NotificationType QUICK_SETTINGS;
    public static final NotificationType SHOW_ON_LOCK_SCREEN;
    public static final NotificationType TIME_BASED;
    public static final NotificationType UTTERANCE;
    public static final NotificationType VOICE_PROFILE;
    public static final NotificationType VOICE_PROFILE_ON_LOCK_SCREEN;
    private final NotificationEventMetadata.Component mComponent;

    @ArrayRes
    private final int mDefaultTimeIntervalsResId;
    private final boolean mIsTriggeredByUtterance;
    private final NotificationEventMetadata.NotificationType mNotificationType;
    private final String mRemoteConfigKey;
    private final String mSharedPreferencesKey;

    private static /* synthetic */ NotificationType[] $values() {
        return new NotificationType[]{TIME_BASED, UTTERANCE, KILL_SWITCH, VOICE_PROFILE, VOICE_PROFILE_ON_LOCK_SCREEN, SHOW_ON_LOCK_SCREEN, QUICK_SETTINGS, PERMISSION_REQUEST, ENABLE_HANDS_FREE, LANGUAGE_SWITCHING};
    }

    static {
        NotificationEventMetadata.Component component = NotificationEventMetadata.Component.HANDSFREE_SETUP;
        TIME_BASED = new NotificationType("TIME_BASED", 0, "TIME_BASED_COUNT", "timeBased", component, NotificationEventMetadata.NotificationType.TIME_BASED, false, R.array.decider_notification_time_intervals);
        UTTERANCE = new NotificationType(SuggestionAction.UTTERANCE, 1, "UTTERANCE_BASED_COUNT", "utteranceBased", component, NotificationEventMetadata.NotificationType.UTTERANCE_BASED, true);
        KILL_SWITCH = new NotificationType("KILL_SWITCH", 2, "KILL_SWITCH_COUNT", "killSwitch", component, NotificationEventMetadata.NotificationType.DISABLED_STATE, false, R.array.decider_notification_time_intervals);
        NotificationEventMetadata.Component component2 = NotificationEventMetadata.Component.UVR_SETUP;
        VOICE_PROFILE = new NotificationType("VOICE_PROFILE", 3, "VOICE_PROFILE_COUNT", "voiceProfile", component2, NotificationEventMetadata.NotificationType.VOICE_PROFILE, true);
        VOICE_PROFILE_ON_LOCK_SCREEN = new NotificationType("VOICE_PROFILE_ON_LOCK_SCREEN", 4, "VOICE_PROFILE_ON_LOCK_SCREEN_COUNT", "voiceProfileOnLockScreen", component2, NotificationEventMetadata.NotificationType.VOICE_PROFILE_ON_LOCK_SCREEN, true);
        SHOW_ON_LOCK_SCREEN = new NotificationType("SHOW_ON_LOCK_SCREEN", 5, "SHOW_ON_LOCK_SCREEN_COUNT", VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY, component2, NotificationEventMetadata.NotificationType.SHOW_ON_LOCK_SCREEN, true);
        QUICK_SETTINGS = new NotificationType("QUICK_SETTINGS", 6, "QUICK_SETTINGS_COUNT", "quickSettings", component, NotificationEventMetadata.NotificationType.QUICK_SETTINGS, false);
        PERMISSION_REQUEST = new NotificationType("PERMISSION_REQUEST", 7, "PERMISSION_REQUEST", "permissionRequest", component, NotificationEventMetadata.NotificationType.PERMISSION_REQUEST, false, R.array.permission_notification_time_intervals);
        ENABLE_HANDS_FREE = new NotificationType("ENABLE_HANDS_FREE", 8, "ENABLE_HANDS_FREE_COUNT", "enableHandsFree", component, NotificationEventMetadata.NotificationType.ENABLE_HANDS_FREE, false, R.array.enable_hands_free_notification_time_intervals);
        LANGUAGE_SWITCHING = new NotificationType("LANGUAGE_SWITCHING", 9, "LANGUAGE_SWITCHING", "languageSwitching", component, NotificationEventMetadata.NotificationType.LANGUAGE_SWITCHING, false);
        $VALUES = $values();
    }

    private NotificationType(@NonNull String str, @NonNull int i, @NonNull String str2, @NonNull String str3, NotificationEventMetadata.Component component, @ArrayRes NotificationEventMetadata.NotificationType notificationType, boolean z, int i2) {
        this.mSharedPreferencesKey = str2;
        this.mRemoteConfigKey = str3;
        this.mComponent = component;
        this.mNotificationType = notificationType;
        this.mIsTriggeredByUtterance = z;
        this.mDefaultTimeIntervalsResId = i2;
    }

    public static NotificationType valueOf(String str) {
        return (NotificationType) Enum.valueOf(NotificationType.class, str);
    }

    public static NotificationType[] values() {
        return (NotificationType[]) $VALUES.clone();
    }

    public NotificationEventMetadata.Component getComponent() {
        return this.mComponent;
    }

    @ArrayRes
    public int getDefaultTimeIntervalsResId() {
        return this.mDefaultTimeIntervalsResId;
    }

    public NotificationEventMetadata.NotificationType getNotificationType() {
        return this.mNotificationType;
    }

    public String getRemoteConfigKey() {
        return this.mRemoteConfigKey;
    }

    public String getSharedPreferencesKey() {
        return this.mSharedPreferencesKey;
    }

    public boolean isTriggeredByUtterance() {
        return this.mIsTriggeredByUtterance;
    }

    @Override // java.lang.Enum
    public String toString() {
        return name();
    }

    private NotificationType(@NonNull String str, @NonNull int i, @NonNull String str2, @NonNull String str3, NotificationEventMetadata.Component component, NotificationEventMetadata.NotificationType notificationType, boolean z) {
        this(str, i, str2, str3, component, notificationType, z, 0);
    }
}
