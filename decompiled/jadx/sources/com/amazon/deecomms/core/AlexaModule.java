package com.amazon.deecomms.core;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.deecomms.alexa.AlexaInterface;
import com.amazon.deecomms.alexa.ModeSwitchHelper;
import com.amazon.deecomms.alexa.NoOpModeSwitchHelper;
import com.amazon.deecomms.alexa.VoxBridge;
import com.amazon.deecomms.alexa.fireos.DefaultModeSwitchHelper;
import com.amazon.deecomms.alexa.fireos.SimClientAlexaInterface;
import com.amazon.deecomms.alexa.voice.EventSenderImpl;
import com.amazon.deecomms.alexa.voice.IEventSender;
import com.amazon.deecomms.alexa.voice.usecase.EventSenderUseCase;
import com.amazon.deecomms.calling.util.VoxUtils;
import com.amazon.deecomms.common.metrics.MetricsService;
import com.amazon.deecomms.common.util.Utils;
import com.amazon.deecomms.perms.VoicePermissionsAuthority;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes5.dex */
public class AlexaModule {
    @Provides
    @Singleton
    public AlexaInterface providesAlexaInterface(@NonNull Context context) {
        return (Utils.isFireOS() && Utils.isSimClientAvailable(context)) ? new SimClientAlexaInterface(context) : new VoxBridge(context);
    }

    @Provides
    @Singleton
    public ModeSwitchHelper providesAlexaModeSwitchHelper(@NonNull Context context) {
        return (Utils.isFireOS() && context.getPackageManager().hasSystemFeature(com.amazon.comms.util.modeswitch.ModeSwitchHelper.MODE_SWITCH_PACKAGE)) ? new DefaultModeSwitchHelper(context) : new NoOpModeSwitchHelper();
    }

    @Provides
    public IEventSender providesEventSender(EventSenderUseCase eventSenderUseCase, VoicePermissionsAuthority voicePermissionsAuthority, MetricsService metricsService) {
        return new EventSenderImpl(eventSenderUseCase, voicePermissionsAuthority, metricsService);
    }

    @Provides
    @Singleton
    public VoxUtils providesVoxUtils() {
        return new VoxUtils();
    }
}
