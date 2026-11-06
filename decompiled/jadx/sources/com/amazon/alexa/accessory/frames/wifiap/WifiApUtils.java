package com.amazon.alexa.accessory.frames.wifiap;

import com.amazon.alexa.accessory.frames.utils.Log;
import com.amazon.alexa.accessory.internal.http.HttpCall$$ExternalSyntheticLambda2;
import com.amazon.alexa.accessory.protocol.StateOuterClass;
import com.amazon.alexa.accessory.repositories.state.StateFeature;
import com.amazon.alexa.accessory.repositories.state.StateRepository;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Observable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class WifiApUtils {
    public static final int AMA_REQUEST_TIMEOUT_SECONDS = 5;
    public static final int EVENT_TIMEOUT_SECONDS = 10;
    public static final int OTA_CONNECT_CONFIRM_TIMEOUT_SECONDS = 30;
    public static final Integer STATE_FEATURE_WIFI_CONFIG_AP_STATUS = 1793;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WifiApError extends Error {
        public static final String INVALID_STATUS = "Invalid WifiConfigApStatus value received: ";
        public static final String INVALID_WIFI_INFO = "Wifi info elements are null";
        public static final String NOT_SUPPORTED = "WifiAp not supported on this device";
        public static final String OPERATION_FAILED = "Operation failed: ";
        public static final String SERVICE_NOT_AVAILABLE = "AMA Service is not available";

        public WifiApError(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum WifiConfigApStatus {
        NOT_SUPPORTED,
        NOT_ACTIVE,
        ACTIVE_OK,
        ACTIVE_CONNECTION_LIMIT_REACHED
    }

    private WifiApUtils() {
    }

    public static Observable<WifiConfigApStatus> getWifiConfigApStatus(StateRepository stateRepository) {
        return stateRepository == null ? Observable.error(new WifiApError(WifiApError.SERVICE_NOT_AVAILABLE)) : stateRepository.query(StateFeature.from(STATE_FEATURE_WIFI_CONFIG_AP_STATUS.intValue())).map(new HttpCall$$ExternalSyntheticLambda2(5)).observeOn(AndroidSchedulers.mainThread()).toObservable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ WifiConfigApStatus lambda$getWifiConfigApStatus$0(StateOuterClass.State state) throws Throwable {
        try {
            Log.i("WifiApUtils", "WifiConfigApStatus: %s, integer value: %d", state, Integer.valueOf(state.getInteger()));
            return WifiConfigApStatus.values()[state.getInteger()];
        } catch (Error unused) {
            throw new WifiApError(WifiApError.INVALID_STATUS + state.getInteger());
        }
    }
}
