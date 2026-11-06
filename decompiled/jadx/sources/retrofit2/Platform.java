package retrofit2;

import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.apache.commons.lang3.SystemProperties;
import org.objenesis.strategy.PlatformDescription;
import retrofit2.BuiltInFactories;
import retrofit2.Reflection;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
final class Platform {
    static final BuiltInFactories builtInFactories;

    @Nullable
    static final Executor callbackExecutor;
    static final Reflection reflection;

    static {
        String property = System.getProperty(SystemProperties.JAVA_VM_NAME);
        property.getClass();
        if (property.equals("RoboVM")) {
            callbackExecutor = null;
            reflection = new Reflection();
            builtInFactories = new BuiltInFactories();
        } else if (property.equals(PlatformDescription.DALVIK)) {
            callbackExecutor = new AndroidMainExecutor();
            reflection = new Reflection.Android24();
            builtInFactories = new BuiltInFactories.Java8();
        } else {
            callbackExecutor = null;
            reflection = new Reflection.Java8();
            builtInFactories = new BuiltInFactories.Java8();
        }
    }

    private Platform() {
    }
}
