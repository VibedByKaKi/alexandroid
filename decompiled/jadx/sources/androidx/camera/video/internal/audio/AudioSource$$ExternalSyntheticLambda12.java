package androidx.camera.video.internal.audio;

import android.content.Context;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class AudioSource$$ExternalSyntheticLambda12 implements AudioStreamFactory {
    @Override // androidx.camera.video.internal.audio.AudioStreamFactory
    public final AudioStream create(AudioSettings audioSettings, Context context) {
        return new AudioStreamImpl(audioSettings, context);
    }
}
