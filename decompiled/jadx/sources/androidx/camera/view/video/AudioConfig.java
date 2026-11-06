package androidx.camera.view.video;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresPermission;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class AudioConfig {

    @NonNull
    public static final AudioConfig AUDIO_DISABLED = new AudioConfig(false);
    private final boolean mIsAudioEnabled;

    public AudioConfig(boolean z) {
        this.mIsAudioEnabled = z;
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioConfig create(boolean z) {
        return new AudioConfig(z);
    }

    public boolean getAudioEnabled() {
        return this.mIsAudioEnabled;
    }
}
