package com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator;
import com.amazon.whisperjoin.protobuf.ErrorCodes;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class WifiConnectionDetails implements Parcelable {
    public static final Parcelable.ClassLoaderCreator<WifiConnectionDetails> CREATOR = new Parcelable.ClassLoaderCreator<WifiConnectionDetails>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConnectionDetails.1
        @Override // android.os.Parcelable.Creator
        public WifiConnectionDetails createFromParcel(Parcel parcel) {
            if (parcel != null) {
                return new WifiConnectionDetails(parcel, WifiConnectionDetails.class.getClassLoader());
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public WifiConnectionDetails[] newArray(int i) {
            if (i >= 0) {
                return new WifiConnectionDetails[i];
            }
            Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public WifiConnectionDetails createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel != null) {
                return new WifiConnectionDetails(parcel, classLoader);
            }
            Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
            return null;
        }
    };
    private static final String KEY_MANAGEMENT_KEY = "key-mgmt";
    private static final String KEY_WPAPSKTYPE = "key-wpapsktype";
    private static final String SSID_KEY = "ssid";
    private static final String STATE_KEY = "state";
    private String mSsid;
    private State mState;
    private WifiKeyManagement mWifiKeyManagement;
    private WpaPskType mWpaPskType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConnectionDetails$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiConnectionDetails$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiConnectionDetails$State = iArr;
            try {
                iArr[State.CONNECTION_FAILED_INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiConnectionDetails$State[State.CONNECTED_BEHIND_CAPTIVE_PORTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiConnectionDetails$State[State.CONNECTED_LIMITED_CONNECTIVITY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiConnectionDetails$State[State.CONNECTION_FAILED_PSK_AUTHENTICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiConnectionDetails$State[State.CONNECTION_FAILED_AP_NOT_FOUND.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum State implements Parcelable {
        INITIATING_CONNECTION_ATTEMPT(0, "Initiating connection attempt"),
        DISCONNECTED(1, "Disconnected"),
        CONNECTING(2, "Connecting"),
        ASSOCIATED(3, "Associated with AP"),
        CONNECTED(4, "Connected"),
        CONNECTION_FAILED_INTERNAL_ERROR(-1, "Connection failed due to internal error"),
        CONNECTED_BEHIND_CAPTIVE_PORTAL(-2, "Connected, but behind captive portal"),
        CONNECTED_LIMITED_CONNECTIVITY(-3, "Connected, but with limited connectivity"),
        CONNECTION_FAILED_PSK_AUTHENTICATION(-4, "Connection failed due to PSK authentation error"),
        CONNECTION_FAILED_AP_NOT_FOUND(-5, "Connection failed due to Access Point Not Found");

        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new Parcelable.ClassLoaderCreator<State>() { // from class: com.amazon.whisperjoin.common.sharedtypes.provisioning.data.wifi.WifiConnectionDetails.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public State createFromParcel(Parcel parcel, ClassLoader classLoader) {
                if (parcel != null) {
                    return State.fromInt(parcel.readInt());
                }
                Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i) {
                if (i >= 0) {
                    return new State[i];
                }
                Single$$ExternalSyntheticBUOutline0.m$3("size cannot be negative.");
                return null;
            }

            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                if (parcel != null) {
                    return State.fromInt(parcel.readInt());
                }
                Single$$ExternalSyntheticBUOutline0.m$3("source cannot be null.");
                return null;
            }
        };
        private final String mDescription;
        private final int mValue;

        State(int i, String str) {
            this.mValue = i;
            this.mDescription = str;
        }

        public static State fromInt(int i) {
            switch (i) {
                case -5:
                    return CONNECTION_FAILED_AP_NOT_FOUND;
                case -4:
                    return CONNECTION_FAILED_PSK_AUTHENTICATION;
                case -3:
                    return CONNECTED_LIMITED_CONNECTIVITY;
                case -2:
                    return CONNECTED_BEHIND_CAPTIVE_PORTAL;
                case -1:
                    return CONNECTION_FAILED_INTERNAL_ERROR;
                case 0:
                    return INITIATING_CONNECTION_ATTEMPT;
                case 1:
                    return DISCONNECTED;
                case 2:
                    return CONNECTING;
                case 3:
                    return ASSOCIATED;
                case 4:
                    return CONNECTED;
                default:
                    Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Unknown WifiConnectionDetails.State: "));
                    return null;
            }
        }

        public static ErrorCodes.ProvisioningErrorType getProvisioningError(State state) {
            int i = AnonymousClass2.$SwitchMap$com$amazon$whisperjoin$common$sharedtypes$provisioning$data$wifi$WifiConnectionDetails$State[state.ordinal()];
            if (i == 1) {
                return ErrorCodes.ProvisioningErrorType.WIFI_CONN_ERROR_INTERNAL_ERROR;
            }
            if (i == 2) {
                return ErrorCodes.ProvisioningErrorType.WIFI_CONN_ERROR_CAPTIVE_PORTAL;
            }
            if (i == 3) {
                return ErrorCodes.ProvisioningErrorType.WIFI_CONN_ERROR_LIMITED_CONNECTIVITY;
            }
            if (i == 4) {
                return ErrorCodes.ProvisioningErrorType.WIFI_CONN_ERROR_BAD_PSK;
            }
            if (i == 5) {
                return ErrorCodes.ProvisioningErrorType.WIFI_CONN_ERROR_AP_NOT_FOUND;
            }
            Gson$$ExternalSyntheticBUOutline0.m((Object) state, "Unknown WifiConnectionDetails.State: ");
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getDescription() {
            return this.mDescription;
        }

        public int getValue() {
            return this.mValue;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.mDescription;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            if (parcel != null) {
                parcel.writeInt(this.mValue);
            } else {
                Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            }
        }
    }

    public WifiConnectionDetails(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle(classLoader);
        this.mSsid = readBundle.getString("ssid");
        this.mWifiKeyManagement = (WifiKeyManagement) readBundle.getParcelable(KEY_MANAGEMENT_KEY);
        this.mWpaPskType = (WpaPskType) readBundle.getParcelable(KEY_WPAPSKTYPE);
        this.mState = (State) readBundle.getParcelable("state");
        validate();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof WifiConnectionDetails)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        WifiConnectionDetails wifiConnectionDetails = (WifiConnectionDetails) obj;
        String str = this.mSsid;
        String str2 = wifiConnectionDetails.mSsid;
        return (str == null ? str2 == null : str.equals(str2)) && this.mWifiKeyManagement == wifiConnectionDetails.mWifiKeyManagement && this.mState == wifiConnectionDetails.mState;
    }

    public State getConnectionState() {
        return this.mState;
    }

    public WifiKeyManagement getKeyManagement() {
        return this.mWifiKeyManagement;
    }

    public String getSsid() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE), this.mSsid, DeviceConfigConstants.DOUBLE_QUOTE);
    }

    public WpaPskType getWpaPskType() {
        return this.mWpaPskType;
    }

    public int hashCode() {
        String str = this.mSsid;
        int hashCode = str == null ? 0 : str.hashCode();
        return this.mState.ordinal() + ((this.mWifiKeyManagement.ordinal() + ((hashCode + 41) * 41)) * 41);
    }

    public void setConnectionState(State state) {
        this.mState = state;
        validate();
    }

    public String toString() {
        return "WifiConnectionDetails [state=" + this.mState + ", ssid=--REDACTED--, key-mgmt=" + this.mWifiKeyManagement + MarkdownConstants.RIGHT_BRACKET;
    }

    public void validate() {
        if (this.mSsid != null && !InputValidator.isValidSsid(getSsid())) {
            Single$$ExternalSyntheticBUOutline0.m$3("Invalid mSsid in wifi connection details. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
            return;
        }
        WifiKeyManagement wifiKeyManagement = this.mWifiKeyManagement;
        if (wifiKeyManagement == null || InputValidator.isValidWifiKeyManagement(wifiKeyManagement)) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Invalid key management in wifi connection details. Please use com.amazon.whisperjoin.common.sharedtypes.utility.InputValidator to validate wifi parameters.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (parcel == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("dest cannot be null.");
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("ssid", this.mSsid);
        bundle.putParcelable(KEY_MANAGEMENT_KEY, this.mWifiKeyManagement);
        bundle.putParcelable("state", this.mState);
        bundle.putParcelable(KEY_WPAPSKTYPE, this.mWpaPskType);
        parcel.writeBundle(bundle);
    }

    public WifiConnectionDetails(String str, WifiKeyManagement wifiKeyManagement, State state) {
        if (str != null && (!str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE))) {
            Single$$ExternalSyntheticBUOutline0.m$3("SSID is not quoted. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            throw null;
        }
        this.mSsid = str == null ? null : AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        this.mWifiKeyManagement = wifiKeyManagement;
        this.mState = state;
        validate();
    }

    public WifiConnectionDetails(String str, WifiKeyManagement wifiKeyManagement, WpaPskType wpaPskType, State state) {
        if (str != null && (!str.startsWith(DeviceConfigConstants.DOUBLE_QUOTE) || !str.endsWith(DeviceConfigConstants.DOUBLE_QUOTE))) {
            Single$$ExternalSyntheticBUOutline0.m$3("SSID is not quoted. Please use com.amazon.whisperjoin.utils.InputValidator to validate wifi parameters.");
            throw null;
        }
        this.mSsid = str == null ? null : AppLaunchChecker$$ExternalSyntheticOutline0.m(1, 1, str);
        this.mWifiKeyManagement = wifiKeyManagement;
        this.mWpaPskType = wpaPskType;
        this.mState = state;
        validate();
    }
}
