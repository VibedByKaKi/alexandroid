package com.amazon.alexa.biloba.utils;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.model.AlertConfiguration;
import com.amazon.alexa.biloba.model.AlertErrorCode;
import com.amazon.alexa.biloba.model.Device;
import com.amazon.alexa.biloba.routing.Routes;
import com.amazon.alexa.biloba.service.AlertConfigurationException;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.routing.api.RoutingService;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class AlertUtils {
    private static final String TAG = "AlertUtils";
    private static final Set<Device.DeviceCategory> SUPPORTED_DEVICE_CATEGORIES = ImmutableSet.of(Device.DeviceCategory.CONTACT_SENSOR, Device.DeviceCategory.ECHO_ALEXA_DEVICE, Device.DeviceCategory.LIGHT, Device.DeviceCategory.MOTION_SENSOR, Device.DeviceCategory.SMARTLOCK, Device.DeviceCategory.SMARTPLUG, new Device.DeviceCategory[0]);
    public static final Set<String> CREATE_ALERT_ROUTES = ImmutableSet.of(Routes.BILOBA_CUSTOM_ALERTS_NEW_ALERT, Routes.BILOBA_CUSTOM_ALERTS_SCHEDULE, Routes.BILOBA_CUSTOM_ALERTS_ACTIVITY, Routes.BILOBA_CUSTOM_ALERTS_ALERT_NAME, Routes.BILOBA_CONFIRMATION);
    public static final Set<String> CUSTOM_ALERT_ROUTES = ImmutableSet.of(Routes.BILOBA_CUSTOM_ALERTS_LIST, Routes.BILOBA_CUSTOM_ALERTS_NEW_ALERT, Routes.BILOBA_CUSTOM_ALERTS_EDIT, Routes.BILOBA_CUSTOM_ALERTS_SCHEDULE, Routes.BILOBA_CUSTOM_ALERTS_ACTIVITY, Routes.BILOBA_CUSTOM_ALERTS_ALERT_NAME, Routes.BILOBA_CONFIRMATION);

    private AlertUtils() {
    }

    public static void decodeAlertConfigurationTitle(AlertConfiguration alertConfiguration) {
        if (alertConfiguration == null || alertConfiguration.getAlertCategory() == null || AlertConfiguration.AlertCategory.HOUSEHOLD.equals(alertConfiguration.getAlertCategory())) {
            return;
        }
        alertConfiguration.setTitle(AndroidUtils.base64Decode(alertConfiguration.getTitle()));
    }

    public static void encodeAlertConfigurationTitle(AlertConfiguration alertConfiguration) {
        if (alertConfiguration == null || alertConfiguration.getAlertCategory() == null || AlertConfiguration.AlertCategory.HOUSEHOLD.equals(alertConfiguration.getAlertCategory())) {
            return;
        }
        alertConfiguration.setTitle(AndroidUtils.base64Encode(alertConfiguration.getTitle()));
    }

    public static AlertErrorCode getAlertErrorCode(@NonNull Throwable th) {
        if (th instanceof AlertConfigurationException) {
            return ((AlertConfigurationException) th).getAlertErrorCode();
        }
        return null;
    }

    @StringRes
    public static int getMessageForErrorCode(String str, AlertErrorCode alertErrorCode, @StringRes int i) {
        if (AlertErrorCode.ALERT_CONFIGURATION_LIMIT_EXCEEDED.equals(alertErrorCode)) {
            LogUtils.e(str, "Received alert limit exceeded error code");
            return R.string.max_alerts_banner_no_max_count;
        }
        if (AlertErrorCode.ALERT_CONFIGURATION_DUPLICATE_NAME.equals(alertErrorCode)) {
            LogUtils.e(str, "Received alert duplicate name error code");
            return R.string.duplicate_name_alert_error;
        }
        if (alertErrorCode == null) {
            LogUtils.e(str, "Received null alert error.");
            return i;
        }
        LogUtils.e(str, "Received unknown alert error.");
        return i;
    }

    @VisibleForTesting
    public static Set<Device.DeviceCategory> getSupportedDeviceCategories() {
        return SUPPORTED_DEVICE_CATEGORIES;
    }

    public static boolean hasDeregisteredDevice(AlertConfiguration alertConfiguration) {
        return alertConfiguration != null && AlertConfiguration.AlertCategory.CUSTOM.equals(alertConfiguration.getAlertCategory()) && AlertConfiguration.DeviceStatus.DEREGISTERED.equals(alertConfiguration.getDeviceStatus());
    }

    public static boolean isDeviceSupported(@NonNull Device.DeviceCategory deviceCategory) {
        return SUPPORTED_DEVICE_CATEGORIES.contains(deviceCategory);
    }

    public static void popRouteBackstackForRoutes(RoutingService routingService, Set<String> set) {
        String str = TAG;
        LogUtils.d(str, "Clearing the routes from backstack within Alexa Together");
        if (set == null || set.isEmpty()) {
            LogUtils.d(str, "Invalid param routesToRemove, no routes were cleared");
            return;
        }
        RouteContext[] backstack = routingService.getBackstack();
        for (int length = backstack.length - 1; length >= 0; length += -1) {
            String name = backstack[length].getRoute().getName();
            String str2 = TAG;
            LogUtils.d(str2, "Processing route " + name);
            if (!set.contains(name)) {
                return;
            }
            LogUtils.d(str2, "Removing route " + name + " from backstack");
            routingService.removeTopFromBackStack();
        }
    }
}
