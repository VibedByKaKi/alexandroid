package androidx.camera.video.internal.audio;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.video.internal.audio.AudioStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
interface AudioStreamFactory {
    @NonNull
    AudioStream create(@NonNull AudioSettings audioSettings, @Nullable Context context) throws AudioStream.AudioStreamException;
}
