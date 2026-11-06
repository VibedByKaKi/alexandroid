package com.amazon.alexa.elements.turbomodules.notificationsettingsturbomodule;

import androidx.annotation.NonNull;
import com.amazon.alexa.elements.turbomodules.NativeNotificationSettingsModuleSpec;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "NotificationSettingsTurboModule")
/* loaded from: classes17.dex */
public class NotificationSettingsTurboModule extends NativeNotificationSettingsModuleSpec {
    public static final String NAME = "NotificationSettingsTurboModule";
    private final NotificationSettingsTurboModuleAPI notificationSettingsTurboModuleAPI;

    public NotificationSettingsTurboModule(ReactApplicationContext reactApplicationContext, NotificationSettingsTurboModuleAPI notificationSettingsTurboModuleAPI) {
        super(reactApplicationContext);
        this.notificationSettingsTurboModuleAPI = notificationSettingsTurboModuleAPI;
        notificationSettingsTurboModuleAPI.setReactContext(reactApplicationContext);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNotificationSettingsModuleSpec, com.facebook.react.bridge.NativeModule
    @NonNull
    public String getName() {
        return "NotificationSettingsTurboModule";
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNotificationSettingsModuleSpec
    @ReactMethod
    public void getNotificationSettings(Promise promise) {
        this.notificationSettingsTurboModuleAPI.getNotificationSettings(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNotificationSettingsModuleSpec
    @ReactMethod
    public void hasSeenNotificationRequestOniOS(Promise promise) {
        this.notificationSettingsTurboModuleAPI.hasSeenNotificationRequestOniOS(promise);
    }

    @Override // com.amazon.alexa.elements.turbomodules.NativeNotificationSettingsModuleSpec
    @ReactMethod
    public void navigateToGlobalNotificationSettings(Promise promise) {
        this.notificationSettingsTurboModuleAPI.navigateToGlobalNotificationSettings(promise);
    }
}
