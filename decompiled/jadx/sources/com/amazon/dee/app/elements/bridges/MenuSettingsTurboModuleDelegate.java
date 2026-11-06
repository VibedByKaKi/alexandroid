package com.amazon.dee.app.elements.bridges;

import androidx.annotation.Nullable;
import com.amazon.alexa.elements.turbomodules.menusettingsturbomodule.MenuSettingsTurboModuleAPI;
import com.amazon.dee.app.services.logging.Log;
import com.amazon.dee.app.ui.menu.AlexaMenu;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public class MenuSettingsTurboModuleDelegate implements MenuSettingsTurboModuleAPI {
    private static final String CHANNELS_IDENTIFIER_SUFFIX = "_channels";
    private static final String KEY_BADGE_ICON = "badgeIcon";
    private static final String KEY_MENU_ITEM = "menuItem";
    public static final String MODULE_NAME = "MenuSettingsTurboModule";
    private static final String REMOVE_BADGE_FAILURE_MESSAGE = "MENU_REMOVE_BADGE_ICON_FAILED";
    private static final String SET_BADGE_FAILURE_MESSAGE = "MENU_SET_BADGE_ICON_FAILED";
    private static final String TAG = Log.tag((Class<?>) MenuSettingsTurboModuleDelegate.class);
    private final AlexaMenu alexaMenu;

    @Nullable
    private ReactApplicationContext reactContext;

    public MenuSettingsTurboModuleDelegate(AlexaMenu alexaMenu) {
        this.alexaMenu = alexaMenu;
    }

    @Override // com.amazon.alexa.elements.turbomodules.menusettingsturbomodule.MenuSettingsTurboModuleAPI
    public void setReactContext(@Nullable ReactApplicationContext reactApplicationContext) {
        this.reactContext = reactApplicationContext;
    }

    @Override // com.amazon.alexa.elements.turbomodules.menusettingsturbomodule.MenuSettingsTurboModuleAPI
    public void removeBadgeForMenuItem(ReadableMap readableMap, Promise promise) {
    }

    @Override // com.amazon.alexa.elements.turbomodules.menusettingsturbomodule.MenuSettingsTurboModuleAPI
    public void setBadgeForMenuItem(ReadableMap readableMap, Promise promise) {
    }
}
