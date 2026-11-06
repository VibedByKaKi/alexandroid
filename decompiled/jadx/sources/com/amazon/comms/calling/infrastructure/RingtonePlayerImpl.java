package com.amazon.comms.calling.infrastructure;

import android.media.Ringtone;
import com.amazon.comms.calling.R;
import com.amazon.comms.calling.data.util.Utils;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneConnected;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneDisconnected;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneError;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneIncoming;
import com.amazon.comms.calling.dependency.qualifiers.RingtoneOutgoing;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001BK\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u000fH\u0002J\b\u0010\u0017\u001a\u00020\u000fH\u0002J\b\u0010\u0018\u001a\u00020\u000fH\u0002J\b\u0010\u0019\u001a\u00020\u000fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/RingtonePlayerImpl;", "Lcom/amazon/comms/calling/infrastructure/RingtonePlayer;", "ringtoneIncoming", "Landroid/media/Ringtone;", "ringtoneOutgoing", "ringtoneConnected", "ringtoneError", "ringtoneDisconnected", "callAudioPlayer", "Lcom/amazon/comms/calling/infrastructure/CallAudioPlayer;", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "<init>", "(Landroid/media/Ringtone;Landroid/media/Ringtone;Landroid/media/Ringtone;Landroid/media/Ringtone;Landroid/media/Ringtone;Lcom/amazon/comms/calling/infrastructure/CallAudioPlayer;Lcom/amazon/comms/calling/data/util/Utils;)V", "play", "", "type", "Lcom/amazon/comms/calling/infrastructure/RingtoneType;", "stop", "applyIfNoIllegalStateException", "cb", "Lkotlin/Function0;", "playIncoming", "playOutgoing", "playMuted", "playUnMuted", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class RingtonePlayerImpl implements RingtonePlayer {

    @NotNull
    private final CallAudioPlayer callAudioPlayer;

    @NotNull
    private final Ringtone ringtoneConnected;

    @NotNull
    private final Ringtone ringtoneDisconnected;

    @NotNull
    private final Ringtone ringtoneError;

    @NotNull
    private final Ringtone ringtoneIncoming;

    @NotNull
    private final Ringtone ringtoneOutgoing;

    @NotNull
    private final Utils utils;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RingtoneType.values().length];
            try {
                iArr[RingtoneType.INCOMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RingtoneType.OUTGOING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RingtoneType.CONNECTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[RingtoneType.DISCONNECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[RingtoneType.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[RingtoneType.MUTED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[RingtoneType.UNMUTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public RingtonePlayerImpl(@RingtoneIncoming @NotNull Ringtone ringtone, @RingtoneOutgoing @NotNull Ringtone ringtone2, @RingtoneConnected @NotNull Ringtone ringtone3, @RingtoneError @NotNull Ringtone ringtone4, @RingtoneDisconnected @NotNull Ringtone ringtone5, @NotNull CallAudioPlayer callAudioPlayer, @NotNull Utils utils) {
        ringtone.getClass();
        ringtone2.getClass();
        ringtone3.getClass();
        ringtone4.getClass();
        ringtone5.getClass();
        callAudioPlayer.getClass();
        utils.getClass();
        this.ringtoneIncoming = ringtone;
        this.ringtoneOutgoing = ringtone2;
        this.ringtoneConnected = ringtone3;
        this.ringtoneError = ringtone4;
        this.ringtoneDisconnected = ringtone5;
        this.callAudioPlayer = callAudioPlayer;
        this.utils = utils;
    }

    private final void applyIfNoIllegalStateException(Function0<Unit> cb) {
        try {
            cb.invoke();
        } catch (IllegalStateException unused) {
        }
    }

    private final void playIncoming() {
        if (this.utils.isPieAndAbove()) {
            this.ringtoneIncoming.play();
        } else {
            this.callAudioPlayer.play(R.raw.alexa_app_system_comm_call_incoming_ringtone, true, 2, true, 1);
        }
    }

    private final void playMuted() {
        this.callAudioPlayer.play(R.raw.accessory_mute_tts, false, 0, false, 2);
    }

    private final void playOutgoing() {
        if (this.utils.isPieAndAbove()) {
            this.ringtoneOutgoing.play();
        } else {
            this.callAudioPlayer.play(R.raw.alexa_app_system_comms_outbound_ringtone, true, 2, true, 1);
        }
    }

    private final void playUnMuted() {
        this.callAudioPlayer.play(R.raw.accessory_unmute_tts, false, 0, false, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stop$lambda$0(RingtoneType ringtoneType, RingtonePlayerImpl ringtonePlayerImpl) {
        if (ringtoneType == RingtoneType.INCOMING && ringtonePlayerImpl.ringtoneIncoming.isPlaying()) {
            try {
                ringtonePlayerImpl.ringtoneIncoming.stop();
            } catch (NullPointerException unused) {
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit stop$lambda$1(RingtoneType ringtoneType, RingtonePlayerImpl ringtonePlayerImpl) {
        if (ringtoneType == RingtoneType.OUTGOING && ringtonePlayerImpl.ringtoneOutgoing.isPlaying()) {
            try {
                ringtonePlayerImpl.ringtoneOutgoing.stop();
            } catch (NullPointerException unused) {
            }
        }
        return Unit.INSTANCE;
    }

    @Override // com.amazon.comms.calling.infrastructure.RingtonePlayer
    public void play(@NotNull RingtoneType type) {
        type.getClass();
        switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                playIncoming();
                break;
            case 2:
                playOutgoing();
                break;
            case 3:
                this.ringtoneConnected.play();
                break;
            case 4:
                this.ringtoneDisconnected.play();
                break;
            case 5:
                this.ringtoneError.play();
                break;
            case 6:
                playMuted();
                break;
            case 7:
                playUnMuted();
                break;
            default:
                PathKt$$ExternalSyntheticBUOutline0.m();
                break;
        }
    }

    @Override // com.amazon.comms.calling.infrastructure.RingtonePlayer
    public void stop(@NotNull final RingtoneType type) {
        type.getClass();
        if (!this.utils.isPieAndAbove()) {
            this.callAudioPlayer.stop(1);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            final int i2 = 1;
            applyIfNoIllegalStateException(new Function0() { // from class: com.amazon.comms.calling.infrastructure.RingtonePlayerImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit stop$lambda$1;
                    Unit stop$lambda$0;
                    switch (i2) {
                        case 0:
                            stop$lambda$1 = RingtonePlayerImpl.stop$lambda$1(type, this);
                            return stop$lambda$1;
                        default:
                            stop$lambda$0 = RingtonePlayerImpl.stop$lambda$0(type, this);
                            return stop$lambda$0;
                    }
                }
            });
        } else {
            if (i != 2) {
                return;
            }
            final int i3 = 0;
            applyIfNoIllegalStateException(new Function0() { // from class: com.amazon.comms.calling.infrastructure.RingtonePlayerImpl$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit stop$lambda$1;
                    Unit stop$lambda$0;
                    switch (i3) {
                        case 0:
                            stop$lambda$1 = RingtonePlayerImpl.stop$lambda$1(type, this);
                            return stop$lambda$1;
                        default:
                            stop$lambda$0 = RingtonePlayerImpl.stop$lambda$0(type, this);
                            return stop$lambda$0;
                    }
                }
            });
        }
    }
}
