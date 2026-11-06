package dagger.spi.model;

import com.google.auto.value.AutoValue;
import dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnv;
import dagger.spi.shaded.androidx.room.compiler.processing.compat.XConverters;
import javax.annotation.processing.ProcessingEnvironment;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes9.dex */
public abstract class DaggerProcessingEnv {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Backend {
        JAVAC,
        KSP
    }

    public static DaggerProcessingEnv from(XProcessingEnv xProcessingEnv) {
        return new AutoValue_DaggerProcessingEnv(xProcessingEnv);
    }

    public Backend getBackend() {
        return Backend.valueOf(xprocessing().getBackend().name());
    }

    public ProcessingEnvironment java() {
        return XConverters.toJavac(xprocessing());
    }

    public abstract XProcessingEnv xprocessing();
}
