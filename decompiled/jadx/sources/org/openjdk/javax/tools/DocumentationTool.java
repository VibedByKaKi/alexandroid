package org.openjdk.javax.tools;

import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.openjdk.javax.tools.JavaFileManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface DocumentationTool extends Tool, OptionChecker {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: org.openjdk.javax.tools.DocumentationTool$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$tools$DocumentationTool$Location;

        static {
            int[] iArr = new int[Location.values().length];
            $SwitchMap$javax$tools$DocumentationTool$Location = iArr;
            try {
                iArr[Location.DOCUMENTATION_OUTPUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DocumentationTask extends Callable<Boolean> {
        void addModules(Iterable<String> iterable);

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        Boolean call();

        void setLocale(Locale locale);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Location implements JavaFileManager.Location {
        DOCUMENTATION_OUTPUT,
        DOCLET_PATH,
        TAGLET_PATH;

        @Override // org.openjdk.javax.tools.JavaFileManager.Location
        public String getName() {
            return name();
        }

        @Override // org.openjdk.javax.tools.JavaFileManager.Location
        public boolean isOutputLocation() {
            return AnonymousClass1.$SwitchMap$javax$tools$DocumentationTool$Location[ordinal()] == 1;
        }
    }

    StandardJavaFileManager getStandardFileManager(DiagnosticListener<? super JavaFileObject> diagnosticListener, Locale locale, Charset charset);

    DocumentationTask getTask(Writer writer, JavaFileManager javaFileManager, DiagnosticListener<? super JavaFileObject> diagnosticListener, Class<?> cls, Iterable<String> iterable, Iterable<? extends JavaFileObject> iterable2);
}
