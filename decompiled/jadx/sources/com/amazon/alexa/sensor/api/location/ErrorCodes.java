package com.amazon.alexa.sensor.api.location;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ErrorCodes {
    private ErrorCodes() {
    }

    @NonNull
    public static String schemaString(int i) {
        if (i == 1) {
            return "authorization_failure_feature_not_authorized";
        }
        if (i == 2) {
            return "authorization_failure_background_location_not_allowed";
        }
        if (i == 3) {
            return "authorization_failure_priority_tracking_not_allowed";
        }
        switch (i) {
            case 10:
                return "location_not_available_no_location_sensor";
            case 11:
                return "location_not_available_device_location_disabled";
            case 12:
                return "location_not_available_gms_not_available";
            default:
                switch (i) {
                    case 20:
                        return "missing_device_permission_general_location";
                    case 21:
                        return "missing_device_permission_fine_location";
                    case 22:
                        return "missing_device_permission_background_location";
                    default:
                        switch (i) {
                            case 30:
                                return "priority_tracking_not_available_app_in_background";
                            case 31:
                                return "priority_tracking_not_available_time_limit_exceeded";
                            case 32:
                                return "priority_tracking_not_available_denied_by_user";
                            default:
                                return "unknown";
                        }
                }
        }
    }
}
