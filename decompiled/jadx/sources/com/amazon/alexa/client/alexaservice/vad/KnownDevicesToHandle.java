package com.amazon.alexa.client.alexaservice.vad;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class KnownDevicesToHandle {

    @VisibleForTesting
    static final List<DeviceRule> RULES;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class DeviceRule {
        final FeatureGate featureGate;
        final VoiceChatAudioFlow flow;
        final String manufacturer;

        @Nullable
        final String model;

        public DeviceRule(@NonNull String str, @Nullable String str2, @NonNull VoiceChatAudioFlow voiceChatAudioFlow, @NonNull FeatureGate featureGate) {
            Locale locale = Locale.ROOT;
            this.manufacturer = str.toLowerCase(locale);
            this.model = str2 == null ? null : str2.toLowerCase(locale);
            this.flow = voiceChatAudioFlow;
            this.featureGate = featureGate;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum FeatureGate {
        KH
    }

    static {
        VoiceChatAudioFlow voiceChatAudioFlow = VoiceChatAudioFlow.PREFER_AUDIO_MODE_NORMAL;
        FeatureGate featureGate = FeatureGate.KH;
        RULES = Arrays.asList(new DeviceRule("Amazon", "ATROWI", voiceChatAudioFlow, featureGate), new DeviceRule("Amazon", "ATROUWI", voiceChatAudioFlow, featureGate), new DeviceRule("Amazon", "ATSPWI", voiceChatAudioFlow, featureGate), new DeviceRule("Amazon", "ATSPUWI", voiceChatAudioFlow, featureGate), new DeviceRule("Amazon", "ATTQWI", voiceChatAudioFlow, featureGate), new DeviceRule("Amazon", "ATTQUWI", voiceChatAudioFlow, featureGate));
    }

    private KnownDevicesToHandle() {
    }

    @Nullable
    public static DeviceRule match(@Nullable String str, @Nullable String str2) {
        String str3;
        DeviceRule deviceRule = null;
        if (str == null) {
            return null;
        }
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        String lowerCase2 = str2 == null ? "" : str2.toLowerCase(locale);
        for (DeviceRule deviceRule2 : RULES) {
            if (lowerCase.equals(deviceRule2.manufacturer) && ((str3 = deviceRule2.model) == null || lowerCase2.equals(str3))) {
                if (deviceRule == null || (deviceRule2.model != null && deviceRule.model == null)) {
                    deviceRule = deviceRule2;
                }
            }
        }
        return deviceRule;
    }
}
