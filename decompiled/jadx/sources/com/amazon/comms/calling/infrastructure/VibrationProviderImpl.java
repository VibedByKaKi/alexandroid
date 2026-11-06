package com.amazon.comms.calling.infrastructure;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.provider.Settings;
import com.amazon.comms.calling.data.util.Utils;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u000f\u001a\u00020\rH\u0003J\b\u0010\u0010\u001a\u00020\rH\u0003J\b\u0010\u0011\u001a\u00020\rH\u0003J\b\u0010\u0012\u001a\u00020\rH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/infrastructure/VibrationProviderImpl;", "Lcom/amazon/comms/calling/infrastructure/VibrationProvider;", "context", "Landroid/content/Context;", "audioManager", "Landroid/media/AudioManager;", "vibrator", "Landroid/os/Vibrator;", "utils", "Lcom/amazon/comms/calling/data/util/Utils;", "<init>", "(Landroid/content/Context;Landroid/media/AudioManager;Landroid/os/Vibrator;Lcom/amazon/comms/calling/data/util/Utils;)V", "performRingerVibration", "", "stopRingerVibration", "performRingerVibrationFor26AndAbove", "performRingerVibrationFor24AndAbove", "performRingerVibrationFor23", "performRingerVibrationFor21AndAbove", "Companion", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class VibrationProviderImpl implements VibrationProvider {
    private static final int CALL_VIBRATION_REPEAT_INDEX = 0;
    private static final int VIBRATE_WHEN_RINGING = 1;

    @NotNull
    private final AudioManager audioManager;

    @NotNull
    private final Context context;

    @NotNull
    private final Utils utils;

    @NotNull
    private final Vibrator vibrator;

    @NotNull
    private static final long[] CALL_VIBRATION_PATTERN = ArraysKt.toLongArray(new Long[]{0L, 400L, 1000L});

    @Inject
    public VibrationProviderImpl(@NotNull Context context, @NotNull AudioManager audioManager, @NotNull Vibrator vibrator, @NotNull Utils utils) {
        context.getClass();
        audioManager.getClass();
        vibrator.getClass();
        utils.getClass();
        this.context = context;
        this.audioManager = audioManager;
        this.vibrator = vibrator;
        this.utils = utils;
    }

    @TargetApi(21)
    private final void performRingerVibrationFor21AndAbove() {
        if (this.audioManager.getRingerMode() != 1 || this.utils.isDoNotDisturbActive()) {
            return;
        }
        this.vibrator.vibrate(CALL_VIBRATION_PATTERN, 0);
    }

    @TargetApi(23)
    private final void performRingerVibrationFor23() {
        int i = Settings.System.getInt(this.context.getContentResolver(), "vibrate_when_ringing", 0);
        if (this.audioManager.getRingerMode() == 1 || (i == 1 && !this.utils.isDoNotDisturbActive())) {
            this.vibrator.vibrate(CALL_VIBRATION_PATTERN, 0);
        }
    }

    @TargetApi(24)
    private final void performRingerVibrationFor24AndAbove() {
        if (this.utils.isDoNotDisturbActive()) {
            return;
        }
        this.vibrator.vibrate(CALL_VIBRATION_PATTERN, 0, new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
    }

    @TargetApi(26)
    private final void performRingerVibrationFor26AndAbove() {
        if (this.utils.isDoNotDisturbActive()) {
            return;
        }
        this.vibrator.vibrate(VibrationEffect.createWaveform(CALL_VIBRATION_PATTERN, 0), new AudioAttributes.Builder().setUsage(6).setContentType(4).build());
    }

    @Override // com.amazon.comms.calling.infrastructure.VibrationProvider
    public void performRingerVibration() {
        if (this.utils.isOreoAndAbove()) {
            performRingerVibrationFor26AndAbove();
            return;
        }
        if (this.utils.isNougatAndAbove()) {
            performRingerVibrationFor24AndAbove();
        } else if (this.utils.isMarshMallowAndAbove()) {
            performRingerVibrationFor23();
        } else if (this.utils.isLollipopAndAbove()) {
            performRingerVibrationFor21AndAbove();
        }
    }

    @Override // com.amazon.comms.calling.infrastructure.VibrationProvider
    public void stopRingerVibration() {
        this.vibrator.cancel();
    }
}
