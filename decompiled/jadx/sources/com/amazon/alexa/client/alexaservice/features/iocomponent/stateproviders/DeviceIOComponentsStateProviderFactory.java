package com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders;

import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.base.auth.AuthorizationAuthority;
import com.amazon.alexa.client.alexaservice.base.device.DeviceType;
import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.handsfree.devices.DeviceInformation;
import com.amazon.alexa.handsfree.devices.constants.VoiceApp;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DeviceIOComponentsStateProviderFactory {
    private final String androidId;
    private final AuthorizationAuthority authorizationAuthority;
    private final PackageManager packageManager;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.amazon.alexa.client.alexaservice.features.iocomponent.stateproviders.DeviceIOComponentsStateProviderFactory$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$alexa$handsfree$devices$constants$VoiceApp;

        static {
            int[] iArr = new int[VoiceApp.values().length];
            $SwitchMap$com$amazon$alexa$handsfree$devices$constants$VoiceApp = iArr;
            try {
                iArr[VoiceApp.QUEBEC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$alexa$handsfree$devices$constants$VoiceApp[VoiceApp.MIKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$alexa$handsfree$devices$constants$VoiceApp[VoiceApp.METRO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$alexa$handsfree$devices$constants$VoiceApp[VoiceApp.FOXTROT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Inject
    public DeviceIOComponentsStateProviderFactory(@Named("androidId") String str, PackageManager packageManager, AuthorizationAuthority authorizationAuthority) {
        this.packageManager = packageManager;
        this.androidId = str;
        this.authorizationAuthority = authorizationAuthority;
    }

    private IOComponentsStateProvider createFoxtrotStateProvider(DeviceType deviceType) {
        return new FoxtrotIOComponentsStateProvider(this.androidId, this.packageManager, deviceType, this.authorizationAuthority);
    }

    private IOComponentsStateProvider createMetroStateProvider(DeviceType deviceType) {
        return new MetroIOComponentsStateProvider(this.androidId, this.packageManager, deviceType);
    }

    private IOComponentsStateProvider createMotoStateProvider(DeviceType deviceType) {
        return new MotoIOComponentsStateProvider(this.androidId, this.packageManager, deviceType);
    }

    private IOComponentsStateProvider createQualcommStateProvider(DeviceType deviceType) {
        return new QualcommIOComponentsStateProvider(this.androidId, this.packageManager, deviceType);
    }

    @VisibleForTesting
    public IOComponentsStateProvider createStateProvider(VoiceApp voiceApp, DeviceType deviceType) {
        int i = AnonymousClass1.$SwitchMap$com$amazon$alexa$handsfree$devices$constants$VoiceApp[voiceApp.ordinal()];
        if (i == 1) {
            return createQualcommStateProvider(deviceType);
        }
        if (i == 2) {
            return createMotoStateProvider(deviceType);
        }
        if (i == 3) {
            return createMetroStateProvider(deviceType);
        }
        if (i != 4) {
            return null;
        }
        return createFoxtrotStateProvider(deviceType);
    }

    @VisibleForTesting
    public IOComponentsStateProvider createStateProvider(@Nullable DeviceInformation deviceInformation, AMPDInformationProvider aMPDInformationProvider) {
        if (deviceInformation == null || !aMPDInformationProvider.isHandsFreeCapable()) {
            return null;
        }
        return createStateProvider(deviceInformation.getVoiceApp(), DeviceType.create(deviceInformation.getType()));
    }
}
