package com.amazon.dee.app.elements.bridges;

import android.text.TextUtils;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.ui.menu.AlexaMenu;
import com.amazon.dee.app.ui.menu.MenuOperationStatus;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ReactModule(name = "MenuSettings")
/* loaded from: classes3.dex */
public class MenuSettingsModule extends ReactContextBaseJavaModule {
    private static final String CHANNELS_IDENTIFIER_SUFFIX = "_channels";
    private static final String KEY_BADGE_ICON = "badgeIcon";
    private static final String KEY_MENU_ITEM = "menuItem";
    public static final String MODULE_NAME = "MenuSettingsModule";
    private static final String REMOVE_BADGE_FAILURE_MESSAGE = "MENU_REMOVE_BADGE_ICON_FAILED";
    private static final String SET_BADGE_FAILURE_MESSAGE = "MENU_SET_BADGE_ICON_FAILED";
    private static final String TAG = Log.tag((Class<?>) MenuSettingsModule.class);
    private final AlexaMenu alexaMenu;

    public MenuSettingsModule(ReactApplicationContext reactApplicationContext, AlexaMenu alexaMenu) {
        super(reactApplicationContext);
        this.alexaMenu = alexaMenu;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void removeBadgeForMenuItem(ReadableMap readableMap, Promise promise) {
        String string = readableMap.getString(KEY_MENU_ITEM);
        String str = TAG;
        if (TextUtils.isEmpty(string)) {
            Log.e(str, "removeBadgeForMenuItem failed due to invalid parameters");
            promise.reject(REMOVE_BADGE_FAILURE_MESSAGE, "Invalid parameters received");
            return;
        }
        MenuOperationStatus removeBadgeFor = this.alexaMenu.removeBadgeFor(string);
        MenuOperationStatus removeBadgeFor2 = this.alexaMenu.removeBadgeFor(string + CHANNELS_IDENTIFIER_SUFFIX);
        MenuOperationStatus menuOperationStatus = MenuOperationStatus.SUCCESS;
        if (removeBadgeFor == menuOperationStatus || removeBadgeFor2 == menuOperationStatus) {
            promise.resolve(null);
        } else {
            Log.e(str, "removeBadgeForMenuItem failed due to %s", removeBadgeFor);
            promise.reject(REMOVE_BADGE_FAILURE_MESSAGE, removeBadgeFor.toString());
        }
    }

    @ReactMethod
    public void setBadgeForMenuItem(ReadableMap readableMap, Promise promise) {
        String string = readableMap.getString(KEY_MENU_ITEM);
        String string2 = readableMap.getString(KEY_BADGE_ICON);
        String str = TAG;
        if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2)) {
            Log.e(str, "setBadgeForMenuItem failed due to invalid parameters");
            promise.reject(SET_BADGE_FAILURE_MESSAGE, "Invalid parameters received");
            return;
        }
        MenuOperationStatus badgeFor = this.alexaMenu.setBadgeFor(string, string2);
        MenuOperationStatus badgeFor2 = this.alexaMenu.setBadgeFor(string + CHANNELS_IDENTIFIER_SUFFIX, string2);
        MenuOperationStatus menuOperationStatus = MenuOperationStatus.SUCCESS;
        if (badgeFor == menuOperationStatus || badgeFor2 == menuOperationStatus) {
            promise.resolve(null);
        } else {
            Log.e(str, "setBadgeForMenuItem failed due to %s", badgeFor);
            promise.reject(SET_BADGE_FAILURE_MESSAGE, badgeFor.toString());
        }
    }
}
