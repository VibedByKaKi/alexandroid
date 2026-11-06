package com.amazon.alexa.handsfree.notification;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.devices.DeviceInformation;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.notification.api.NotificationContract;
import com.amazon.alexa.handsfree.notification.channels.NotificationChannelManager;
import com.amazon.alexa.handsfree.notification.configurations.languageswitching.LanguageSwitchingConfigHandler;
import com.amazon.alexa.handsfree.notification.configurations.quicksettings.QuickSettingsConfigHandler;
import com.amazon.alexa.handsfree.notification.configurations.scheduler.NotificationScheduler;
import com.amazon.alexa.handsfree.notification.configurations.timebased.TimeIntervalConfigHandler;
import com.amazon.alexa.handsfree.notification.notifiers.EnableHandsFreeNotifier;
import com.amazon.alexa.handsfree.notification.receivers.UtteranceReceiver;
import com.amazon.alexa.handsfree.protocols.features.HandsFreeUserIdentity;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class NotificationModule {
    private static final String TAG = "NotificationModule";
    private DeviceTypeInformationProvider mDeviceTypeInformationProvider;
    private HandsFreeUserIdentity mHandsFreeUserIdentity;
    private final List<Runnable> mInitializationCallbacks;
    private boolean mIsInitialized;
    private boolean mIsWeblabNotificationScheduled;
    private NotificationContract mNotificationContract;
    private EnableHandsFreeNotifier.PreferenceManager mPreferenceManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface InitializationCallback {
        void onInitialized();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LazyHolder {
        private static final NotificationModule INSTANCE = new NotificationModule(0);

        private LazyHolder() {
        }
    }

    @VisibleForTesting
    public NotificationModule(@NonNull NotificationContract notificationContract, @NonNull HandsFreeUserIdentity handsFreeUserIdentity, @NonNull DeviceTypeInformationProvider deviceTypeInformationProvider, @NonNull EnableHandsFreeNotifier.PreferenceManager preferenceManager) {
        this.mInitializationCallbacks = new ArrayList();
        this.mNotificationContract = notificationContract;
        this.mHandsFreeUserIdentity = handsFreeUserIdentity;
        this.mDeviceTypeInformationProvider = deviceTypeInformationProvider;
        this.mPreferenceManager = preferenceManager;
    }

    public static NotificationModule getInstance() {
        return LazyHolder.INSTANCE;
    }

    private void scheduleNotifications(@NonNull Context context) {
        getTimeBasedNotificationScheduler(context).scheduleNextNotification();
        getQuickSettingsNotificationScheduler(context).scheduleNextNotification();
        getLanguageSwitchingNotificationScheduler(context).scheduleNextNotification();
        if (this.mPreferenceManager.shouldShowEnableHandsFreeNotification(context)) {
            getEnableHandsFreeNotificationScheduler(context).scheduleNextNotification();
        }
    }

    private void scheduleWeblabNotifications(boolean z, @NonNull Context context) {
        DeviceInformation supportedDeviceInformation = this.mDeviceTypeInformationProvider.getSupportedDeviceInformation(context);
        if (!getInstanceAMPDInformationProvider(context).isHandsFreeCapable() || supportedDeviceInformation.isDeviceLaunched() || !z || this.mIsWeblabNotificationScheduled) {
            return;
        }
        Log.i(TAG, "scheduleWeblabNotifications.");
        scheduleNotifications(context);
        this.mIsWeblabNotificationScheduled = true;
    }

    public synchronized void addInitializationCallback(@NonNull Runnable runnable) {
        try {
            if (this.mIsInitialized) {
                runnable.run();
            } else {
                this.mInitializationCallbacks.add(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public void enableUtteranceNotification(@NonNull Context context) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, (Class<?>) UtteranceReceiver.class), 1, 1);
    }

    @Nullable
    public NotificationContract getContract() {
        return this.mNotificationContract;
    }

    @NonNull
    @VisibleForTesting
    public NotificationScheduler getEnableHandsFreeNotificationScheduler(@NonNull Context context) {
        return new NotificationScheduler(NotificationType.ENABLE_HANDS_FREE, context, new TimeIntervalConfigHandler(context));
    }

    @Nullable
    public HandsFreeUserIdentity getHandsFreeUserIdentity() {
        return this.mHandsFreeUserIdentity;
    }

    @VisibleForTesting
    public AMPDInformationProvider getInstanceAMPDInformationProvider(Context context) {
        return AMPDInformationProvider.getInstance(context);
    }

    @NonNull
    @VisibleForTesting
    public NotificationScheduler getLanguageSwitchingNotificationScheduler(@NonNull Context context) {
        return new NotificationScheduler(NotificationType.LANGUAGE_SWITCHING, context, new LanguageSwitchingConfigHandler(context));
    }

    @NonNull
    @VisibleForTesting
    public NotificationScheduler getPermissionNotificationScheduler(@NonNull Context context) {
        return new NotificationScheduler(NotificationType.PERMISSION_REQUEST, context, new TimeIntervalConfigHandler(context));
    }

    @NonNull
    @VisibleForTesting
    public NotificationScheduler getQuickSettingsNotificationScheduler(@NonNull Context context) {
        return new NotificationScheduler(NotificationType.QUICK_SETTINGS, context, new QuickSettingsConfigHandler(context));
    }

    @NonNull
    @VisibleForTesting
    public NotificationScheduler getTimeBasedNotificationScheduler(@NonNull Context context) {
        return new NotificationScheduler(NotificationType.TIME_BASED, context, new TimeIntervalConfigHandler(context));
    }

    public synchronized void initialize(@NonNull NotificationContract notificationContract, @NonNull Context context) {
        try {
            if (!this.mIsInitialized) {
                this.mNotificationContract = notificationContract;
                this.mDeviceTypeInformationProvider = DeviceTypeInformationProvider.getInstance(context);
                this.mPreferenceManager = new EnableHandsFreeNotifier.PreferenceManager();
                scheduleInitializationNotifications(context);
                new NotificationChannelManager(context).createNotificationChannels();
                enableUtteranceNotification(context);
                this.mIsInitialized = true;
                Iterator<Runnable> it2 = this.mInitializationCallbacks.iterator();
                while (it2.hasNext()) {
                    it2.next().run();
                }
                this.mInitializationCallbacks.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean isInitialized() {
        return this.mIsInitialized;
    }

    public boolean isWeblabNotificationScheduled() {
        return this.mIsWeblabNotificationScheduled;
    }

    @VisibleForTesting
    public void scheduleInitializationNotifications(@NonNull Context context) {
        DeviceInformation supportedDeviceInformation = this.mDeviceTypeInformationProvider.getSupportedDeviceInformation(context);
        if (getInstanceAMPDInformationProvider(context).isHandsFreeCapable() && supportedDeviceInformation.isDeviceLaunched()) {
            Log.i(TAG, "scheduleInitializationNotifications.");
            scheduleNotifications(context);
        }
    }

    public void schedulePermissionNotification(@NonNull Context context) {
        getPermissionNotificationScheduler(context).scheduleNextNotification();
    }

    public void setHandsFreeUserIdentity(boolean z, @NonNull Context context, @NonNull HandsFreeUserIdentity handsFreeUserIdentity) {
        this.mHandsFreeUserIdentity = handsFreeUserIdentity;
        if (isWeblabNotificationScheduled()) {
            return;
        }
        scheduleWeblabNotifications(z, context);
    }

    private NotificationModule() {
        this.mInitializationCallbacks = new ArrayList();
    }

    public /* synthetic */ NotificationModule(int i) {
        this();
    }
}
