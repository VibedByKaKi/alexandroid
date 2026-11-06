package com.amazon.comms.calling.dependency;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import com.amazon.comms.calling.R;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneConnected;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneDisconnected;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneError;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneIncoming;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneOutgoing;
import com.amazon.comms.calling.infrastructure.RingtonePlayer;
import com.amazon.comms.calling.infrastructure.RingtonePlayerImpl;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0018\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0010H\u0002¨\u0006\u0017"}, d2 = {"Lcom/amazon/comms/calling/dependency/RingtoneModule;", "", "<init>", "()V", "providesIncomingRingtone", "Landroid/media/Ringtone;", "context", "Landroid/content/Context;", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "providesOutgoingRingtone", "providesRingtoneConnected", "providesRingtoneError", "providesRingtoneDisconnected", "playSound", "soundResourceToPlay", "", "providesRingtonePlayer", "Lcom/amazon/comms/calling/infrastructure/RingtonePlayer;", "ringtonePlayerImpl", "Lcom/amazon/comms/calling/infrastructure/RingtonePlayerImpl;", "playSoundInLoop", "rawFile", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Module
/* loaded from: classes20.dex */
public final class RingtoneModule {
    private final Ringtone playSound(Context context, int soundResourceToPlay) {
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse("android.resource://" + context.getPackageName() + "/" + soundResourceToPlay));
        ringtone.setAudioAttributes(new AudioAttributes.Builder().setUsage(13).setContentType(4).build());
        return ringtone;
    }

    private final Ringtone playSoundInLoop(Context context, Utils utils, int rawFile) {
        Ringtone ringtone = RingtoneManager.getRingtone(context, Uri.parse("android.resource://" + context.getPackageName() + "/" + rawFile));
        ringtone.setAudioAttributes(new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
        if (utils.isPieAndAbove()) {
            ringtone.setLooping(true);
        }
        return ringtone;
    }

    @Provides
    @RingtoneIncoming
    @NotNull
    public final Ringtone providesIncomingRingtone(@NotNull Context context, @NotNull Utils utils) {
        context.getClass();
        utils.getClass();
        return playSoundInLoop(context, utils, R.raw.alexa_app_system_comm_call_incoming_ringtone);
    }

    @Provides
    @RingtoneOutgoing
    @NotNull
    public final Ringtone providesOutgoingRingtone(@NotNull Context context, @NotNull Utils utils) {
        context.getClass();
        utils.getClass();
        return playSoundInLoop(context, utils, R.raw.alexa_app_system_comms_outbound_ringtone);
    }

    @RingtoneConnected
    @Provides
    @NotNull
    public final Ringtone providesRingtoneConnected(@NotNull Context context) {
        context.getClass();
        return playSound(context, R.raw.alexa_app_system_comm_call_connected);
    }

    @Provides
    @RingtoneDisconnected
    @NotNull
    public final Ringtone providesRingtoneDisconnected(@NotNull Context context) {
        context.getClass();
        return playSound(context, R.raw.alexa_app_system_comm_call_disconnected);
    }

    @RingtoneError
    @Provides
    @NotNull
    public final Ringtone providesRingtoneError(@NotNull Context context) {
        context.getClass();
        return playSound(context, R.raw.alexa_app_system_state_error_generic_1);
    }

    @Provides
    @Singleton
    @NotNull
    public final RingtonePlayer providesRingtonePlayer(@NotNull RingtonePlayerImpl ringtonePlayerImpl) {
        ringtonePlayerImpl.getClass();
        return ringtonePlayerImpl;
    }
}
