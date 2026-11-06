package com.amazon.alexa.handsfree.protocols.utils;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.callback.CallbackErrorMetadata;
import com.amazon.alexa.handsfree.protocols.callback.ResponseCallback;
import com.amazon.alexa.handsfree.protocols.settings.WakeWordSettingsManagerProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AudioRoutingUtil {
    private static final String REGISTER_HANDSFREE_CAPABLE_APP = "RegisterHandsFreeCapableApp";
    private static final String SET_PREFERRED_AMAZON_APP = "SetPreferredAmazonHFApp";
    private static final String TAG = "AudioRoutingUtil";
    private final Context mContext;
    private final VoiceAppStatusProvider mVoiceAppStatusProvider;
    private final WakeWordSettingsManagerProvider mWakeWordSettingsManagerProvider;
    private static final String ALEXA_PACKAGE_NAME = HandsFreeSupportedPackageName.ALEXA_PACKAGE_NAME.toString();
    private static final String ALEXA_BETA_PACKAGE_NAME = HandsFreeSupportedPackageName.ALEXA_BETA_PACKAGE_NAME.toString();

    public AudioRoutingUtil(@NonNull Context context, @NonNull VoiceAppStatusProvider voiceAppStatusProvider, @NonNull WakeWordSettingsManagerProvider wakeWordSettingsManagerProvider) {
        this.mContext = context;
        this.mVoiceAppStatusProvider = voiceAppStatusProvider;
        this.mWakeWordSettingsManagerProvider = wakeWordSettingsManagerProvider;
    }

    private ResponseCallback getResponseCallback(@NonNull final String str) {
        return new ResponseCallback() { // from class: com.amazon.alexa.handsfree.protocols.utils.AudioRoutingUtil.1
            @Override // com.amazon.alexa.handsfree.protocols.callback.ResponseCallback
            public void onError(@NonNull CallbackErrorMetadata callbackErrorMetadata) {
                Log.e(AudioRoutingUtil.TAG, str + " onError: " + callbackErrorMetadata.getErrorMessage());
            }

            @Override // com.amazon.alexa.handsfree.protocols.callback.ResponseCallback
            public void onSuccess() {
                Log.d(AudioRoutingUtil.TAG, str + " onSuccess");
            }
        };
    }

    private boolean isAudioRoutingSupported() {
        return this.mVoiceAppStatusProvider.isAHFSdkSupported();
    }

    private boolean isPackageNameValid(String str) {
        if (str != null) {
            return str.equals(ALEXA_PACKAGE_NAME) || str.equals(ALEXA_BETA_PACKAGE_NAME);
        }
        return false;
    }

    public void setDefaultValues() {
        try {
            String packageName = this.mContext.getPackageName();
            if (isPackageNameValid(packageName) && isAudioRoutingSupported()) {
                this.mWakeWordSettingsManagerProvider.get().registerHandsFreeCapableApp(packageName, getResponseCallback(REGISTER_HANDSFREE_CAPABLE_APP));
                this.mWakeWordSettingsManagerProvider.get().setPreferredAmazonApp(packageName, getResponseCallback(SET_PREFERRED_AMAZON_APP));
                Log.d(TAG, "Register and set " + packageName + " as capable preferred app.");
            }
        } catch (Exception e) {
            Log.e(TAG, "Set default values exception: " + e.toString());
        }
    }
}
