package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink;

import android.net.Uri;
import com.amazon.alexa.hho.navigation.constants.DeeplinkConstants;
import com.amazon.alexa.hho.navigation.constants.NavigationConstants;
import java.util.Locale;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class GoogleMapsDeeplinkHelper {
    private static final String TAG = "GoogleMapsDeeplinkHelper";

    @Inject
    public GoogleMapsDeeplinkHelper() {
    }

    public Uri getCancelNavigationUri() {
        return Uri.parse(DeeplinkConstants.GoogleMapsUniversalDeeplink.BASE_URI);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public Uri getStartNavigationUri(String str, double d, double d2, String str2, boolean z) {
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case -1656617049:
                if (str2.equals(NavigationConstants.NavigationDirectiveTransportMode.DRIVING)) {
                    c = 0;
                    break;
                }
                break;
            case -349077069:
                if (str2.equals(NavigationConstants.NavigationDirectiveTransportMode.TRANSIT)) {
                    c = 1;
                    break;
                }
                break;
            case 1836798297:
                if (str2.equals(NavigationConstants.NavigationDirectiveTransportMode.WALKING)) {
                    c = 2;
                    break;
                }
                break;
            case 1959247966:
                if (str2.equals(NavigationConstants.NavigationDirectiveTransportMode.BIKING)) {
                    c = 3;
                    break;
                }
                break;
        }
        String str3 = DeeplinkConstants.GoogleMapsUniversalDeeplink.GoogleMapsTravelMode.DRIVING;
        switch (c) {
            case 1:
                str3 = "transit";
                break;
            case 2:
                str3 = DeeplinkConstants.GoogleMapsUniversalDeeplink.GoogleMapsTravelMode.WALKING;
                break;
            case 3:
                str3 = DeeplinkConstants.GoogleMapsUniversalDeeplink.GoogleMapsTravelMode.BICYCLING;
                break;
        }
        if (str == null || str.trim().isEmpty()) {
            str = String.format(Locale.US, "%f,%f", Double.valueOf(d), Double.valueOf(d2));
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.AUTHORITY).path(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.PATH).appendQueryParameter(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.API_QUERY_PARAM_KEY, "1").appendQueryParameter(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DESTINATION_QUERY_PARAM_KEY, str).appendQueryParameter(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.TRAVEL_MODE_QUERY_PARAM_KEY, str3);
        if (z) {
            appendQueryParameter.appendQueryParameter(DeeplinkConstants.GoogleMapsUniversalDeeplink.Uri.DIR_ACTION_QUERY_PARAM_KEY, "navigate");
        }
        return appendQueryParameter.build();
    }
}
