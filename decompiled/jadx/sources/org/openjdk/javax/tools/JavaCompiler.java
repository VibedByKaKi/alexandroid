package org.openjdk.javax.tools;

import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.Callable;
import org.openjdk.javax.annotation.processing.Processor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface JavaCompiler extends Tool, OptionChecker {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface CompilationTask extends Callable<Boolean> {
        void addModules(Iterable<String> iterable);

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        Boolean call();

        void setLocale(Locale locale);

        void setProcessors(Iterable<? extends Processor> iterable);
    }

    StandardJavaFileManager getStandardFileManager(DiagnosticListener<? super JavaFileObject> diagnosticListener, Locale locale, Charset charset);

    CompilationTask getTask(Writer writer, JavaFileManager javaFileManager, DiagnosticListener<? super JavaFileObject> diagnosticListener, Iterable<String> iterable, Iterable<String> iterable2, Iterable<? extends JavaFileObject> iterable3);
}
