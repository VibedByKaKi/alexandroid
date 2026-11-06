package com.amazon.alexa.voice.locale;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.api.compat.migration.sdk.SdkSelectionState;
import com.amazon.alexa.api.compat.migration.sdk.SdkType;
import com.amazon.alexa.api.compat.model.AlexaApiCallbacks;
import com.amazon.alexa.api.compat.model.AlexaReadyStateV2;
import com.amazon.alexa.api.compat.model.ApiCallFailure;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class SdkSwapDetector {
    private static final String TAG = "SdkSwapDetector";
    private final AlexaMobileFrameworkApisV2 frameworkApis;
    private SdkType lastSdkType;
    private final LocalePreference localePreference;
    private List<Locale> pendingLocaleSnapshot;
    private final Object sdkTypeLock;
    private final SdkTypeSupplier sdkTypeSupplier;
    private final SwapStartListener swapStartListener;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public interface SdkTypeSupplier {
        SdkType get();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SwapStartListener {
        void onSwapStarted(SdkType sdkType, SdkType sdkType2);
    }

    @VisibleForTesting
    public SdkSwapDetector(AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, LocalePreference localePreference, SwapStartListener swapStartListener, SdkTypeSupplier sdkTypeSupplier) {
        this.sdkTypeLock = new Object();
        this.frameworkApis = alexaMobileFrameworkApisV2;
        this.localePreference = localePreference;
        this.swapStartListener = swapStartListener;
        this.sdkTypeSupplier = sdkTypeSupplier;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ SdkType lambda$new$0() {
        return SdkSelectionState.INSTANCE.getSdkType().getValue();
    }

    private void notifySwapStarted(SdkType sdkType, SdkType sdkType2) {
        try {
            this.swapStartListener.onSwapStarted(sdkType, sdkType2);
        } catch (RuntimeException e) {
            Log.w(TAG, "Swap-start listener threw", e);
        }
    }

    private void relayLocaleToActiveSdk(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            Log.w(TAG, "No stored locale to relay to the SDK that just became active");
            return;
        }
        try {
            this.frameworkApis.getLocaleApi().setLocales(list, new AlexaApiCallbacks() { // from class: com.amazon.alexa.voice.locale.SdkSwapDetector.1
                @Override // com.amazon.alexa.api.compat.model.AlexaApiCallbacks
                public void onFailure(ApiCallFailure apiCallFailure) {
                    Log.w(SdkSwapDetector.TAG, "Failed to relay locale to the SDK that just became active: " + apiCallFailure);
                }

                @Override // com.amazon.alexa.api.compat.model.AlexaApiCallbacks
                public void onSuccess() {
                }
            });
        } catch (RuntimeException e) {
            Log.w(TAG, "Locale relay to the SDK that just became active threw", e);
        }
    }

    public void initialize() {
        synchronized (this.sdkTypeLock) {
            this.lastSdkType = this.sdkTypeSupplier.get();
            this.pendingLocaleSnapshot = null;
        }
    }

    public void onReadinessChanged(AlexaReadyStateV2 alexaReadyStateV2) {
        List<Locale> list;
        SdkType sdkType;
        List<Locale> list2;
        boolean z = alexaReadyStateV2 != null && alexaReadyStateV2.isConnected();
        SdkType sdkType2 = this.sdkTypeSupplier.get();
        synchronized (this.sdkTypeLock) {
            try {
                SdkType sdkType3 = this.lastSdkType;
                list = null;
                if (sdkType3 == null || sdkType3 == sdkType2) {
                    sdkType = null;
                } else {
                    this.pendingLocaleSnapshot = this.localePreference.fetchCurrentLocale();
                    sdkType = this.lastSdkType;
                    this.lastSdkType = sdkType2;
                }
                if (z && (list2 = this.pendingLocaleSnapshot) != null) {
                    this.pendingLocaleSnapshot = null;
                    list = list2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sdkType != null) {
            notifySwapStarted(sdkType, sdkType2);
        }
        if (list != null) {
            relayLocaleToActiveSdk(list);
        }
    }

    public void release() {
        synchronized (this.sdkTypeLock) {
            this.lastSdkType = null;
            this.pendingLocaleSnapshot = null;
        }
    }

    public SdkSwapDetector(AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, LocalePreference localePreference, SwapStartListener swapStartListener) {
        this(alexaMobileFrameworkApisV2, localePreference, swapStartListener, new SdkSwapDetector$$ExternalSyntheticLambda0());
    }
}
