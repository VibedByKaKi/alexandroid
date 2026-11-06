package com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink;

import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.hho.navigation.constants.NavigationConstants;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.device.PreferredNavigationAppContentAccessor;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public abstract class MappingApplication {
    private static MappingApplication googleMappingApplication;
    private static MappingApplication wazeMappingApplication;
    private final String name;
    private final String packageName;

    private MappingApplication(String str, String str2) {
        this.name = str;
        this.packageName = str2;
    }

    public static MappingApplication from(@Nullable String str) {
        if (str == null) {
            return getGoogleMappingApplication();
        }
        int hashCode = str.hashCode();
        if (hashCode != -660073534) {
            if (hashCode == 40719148) {
                str.equals("com.google.android.apps.maps");
            }
        } else if (str.equals(PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME)) {
            return getWazeMappingApplication();
        }
        return getGoogleMappingApplication();
    }

    private static MappingApplication getGoogleMappingApplication() {
        if (googleMappingApplication == null) {
            googleMappingApplication = new GoogleMappingApplication(0);
        }
        return googleMappingApplication;
    }

    private static MappingApplication getWazeMappingApplication() {
        if (wazeMappingApplication == null) {
            wazeMappingApplication = new WazeMappingApplication(0);
        }
        return wazeMappingApplication;
    }

    public Intent getIntent(double d, double d2, String str) {
        Intent intent = new Intent("android.intent.action.VIEW", getUri(d, d2, str));
        intent.setFlags(268435456);
        intent.setPackage(getPackageName());
        return intent;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public abstract Uri getUri(double d, double d2, String str);

    public String name() {
        return this.name;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static final class GoogleMappingApplication extends MappingApplication {
        private static final String NAME = "GOOGLE_MAPS";
        private static final String URI_FORMAT = "google.navigation:q=%f,%f&mode=%s";

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public enum GoogleMapTransportationMode {
            BICYCLE("b"),
            DRIVING("d"),
            WALKING("w");

            private final String transportationMode;

            GoogleMapTransportationMode(String str) {
                this.transportationMode = str;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            public static GoogleMapTransportationMode from(@Nullable String str) {
                String str2;
                if (str == null) {
                    return DRIVING;
                }
                switch (str.hashCode()) {
                    case -1656617049:
                        str2 = NavigationConstants.NavigationDirectiveTransportMode.DRIVING;
                        str.equals(str2);
                        return DRIVING;
                    case -349077069:
                        str2 = NavigationConstants.NavigationDirectiveTransportMode.TRANSIT;
                        str.equals(str2);
                        return DRIVING;
                    case 1836798297:
                        if (str.equals(NavigationConstants.NavigationDirectiveTransportMode.WALKING)) {
                            return WALKING;
                        }
                        return DRIVING;
                    case 1959247966:
                        if (str.equals(NavigationConstants.NavigationDirectiveTransportMode.BIKING)) {
                            return BICYCLE;
                        }
                        return DRIVING;
                    default:
                        return DRIVING;
                }
            }

            public String get() {
                return this.transportationMode;
            }
        }

        private GoogleMappingApplication() {
            super(NAME, "com.google.android.apps.maps", 0);
        }

        @Override // com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink.MappingApplication
        public Uri getUri(double d, double d2, String str) {
            return Uri.parse(String.format(Locale.US, URI_FORMAT, Double.valueOf(d), Double.valueOf(d2), GoogleMapTransportationMode.from(str).get()));
        }

        public /* synthetic */ GoogleMappingApplication(int i) {
            this();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static final class WazeMappingApplication extends MappingApplication {
        private static final String NAME = "WAZE";
        private static final String URI_FORMAT = "https://waze.com/ul?ll=%f,%f&navigate=yes";

        private WazeMappingApplication() {
            super(NAME, PreferredNavigationAppContentAccessor.WAZE_PACKAGENAME, 0);
        }

        @Override // com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink.MappingApplication
        public Uri getUri(double d, double d2, String str) {
            return Uri.parse(String.format(Locale.US, URI_FORMAT, Double.valueOf(d), Double.valueOf(d2)));
        }

        public /* synthetic */ WazeMappingApplication(int i) {
            this();
        }
    }

    public /* synthetic */ MappingApplication(String str, String str2, int i) {
        this(str, str2);
    }
}
