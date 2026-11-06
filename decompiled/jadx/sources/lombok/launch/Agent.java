package lombok.launch;

import java.lang.instrument.Instrumentation;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
final class Agent {
    public static void agentmain(String str, Instrumentation instrumentation) throws Throwable {
        runLauncher(str, instrumentation, true);
    }

    public static void premain(String str, Instrumentation instrumentation) throws Throwable {
        runLauncher(str, instrumentation, false);
    }

    private static void runLauncher(String str, Instrumentation instrumentation, boolean z) throws Throwable {
        try {
            Main.getShadowClassLoader().loadClass("lombok.core.AgentLauncher").getDeclaredMethod("runAgents", String.class, Instrumentation.class, Boolean.TYPE, Class.class).invoke(null, str, instrumentation, Boolean.valueOf(z), Agent.class);
        } catch (InvocationTargetException e) {
            throw e.getCause();
        }
    }
}
