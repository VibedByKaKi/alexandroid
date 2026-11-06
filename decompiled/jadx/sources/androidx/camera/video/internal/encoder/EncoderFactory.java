package androidx.camera.video.internal.encoder;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface EncoderFactory {
    @NonNull
    Encoder createEncoder(@NonNull Executor executor, @NonNull EncoderConfig encoderConfig) throws InvalidConfigException;
}
