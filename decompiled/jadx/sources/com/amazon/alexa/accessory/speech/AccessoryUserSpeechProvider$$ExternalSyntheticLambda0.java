package com.amazon.alexa.accessory.speech;

import com.amazon.alexa.accessory.repositories.device.DeviceFeature;
import io.reactivex.rxjava3.functions.Consumer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AccessoryUserSpeechProvider$$ExternalSyntheticLambda0 implements Consumer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccessoryUserSpeechProvider f$0;

    public /* synthetic */ AccessoryUserSpeechProvider$$ExternalSyntheticLambda0(AccessoryUserSpeechProvider accessoryUserSpeechProvider, int i) {
        this.$r8$classId = i;
        this.f$0 = accessoryUserSpeechProvider;
    }

    @Override // io.reactivex.rxjava3.functions.Consumer
    public final void accept(Object obj) {
        int i = this.$r8$classId;
        AccessoryUserSpeechProvider accessoryUserSpeechProvider = this.f$0;
        switch (i) {
            case 0:
                accessoryUserSpeechProvider.lambda$initializeDeviceType$0((String) obj);
                break;
            case 1:
                accessoryUserSpeechProvider.lambda$checkDeviceFeaturesIfLocalCommandsSupported$5((Boolean) obj);
                break;
            case 2:
                accessoryUserSpeechProvider.lambda$checkDeviceFeaturesIfLocalCommandsSupported$6((Throwable) obj);
                break;
            case 3:
                accessoryUserSpeechProvider.lambda$initializeDeviceType$1((Throwable) obj);
                break;
            case 4:
                accessoryUserSpeechProvider.lambda$checkDeviceFeaturesAndRegisterAudioPlaybackStatusListener$9((DeviceFeature) obj);
                break;
            case 5:
                accessoryUserSpeechProvider.lambda$initializeOtaGroupName$2((String) obj);
                break;
            default:
                accessoryUserSpeechProvider.lambda$initializeOtaGroupName$3((Throwable) obj);
                break;
        }
    }
}
