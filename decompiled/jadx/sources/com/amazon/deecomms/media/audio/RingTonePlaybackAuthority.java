package com.amazon.deecomms.media.audio;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import androidx.annotation.NonNull;
import com.amazon.comms.log.CommsLogger;
import com.amazon.deecomms.common.Constants;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes5.dex */
public class RingTonePlaybackAuthority {
    private static final CommsLogger LOG = CommsLogger.getLogger(Constants.LOG_TAG, RingTonePlaybackAuthority.class);
    private final int DND_OFF = 0;
    private final ContentResolver contentResolver;

    @Inject
    public RingTonePlaybackAuthority(@NonNull Context context) {
        this.contentResolver = context.getContentResolver();
    }

    private boolean isDNDMode() {
        try {
            return Settings.Global.getInt(this.contentResolver, Constants.DND_MODE) != 0;
        } catch (Settings.SettingNotFoundException unused) {
            LOG.e("Unable to determine DND Mode");
            return false;
        }
    }

    public boolean canPlayRingTone() {
        boolean isDNDMode = isDNDMode();
        boolean z = !isDNDMode;
        if (isDNDMode) {
            LOG.i("Cannot play ringtone as we are in DND mode");
        }
        return z;
    }
}
