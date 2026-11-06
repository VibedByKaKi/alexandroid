package lombok.launch;

import java.lang.reflect.Field;
import java.util.Set;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Completion;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.AnnotationMirror;
import javax.lang.model.element.Element;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.TypeElement;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
class AnnotationProcessorHider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AnnotationProcessor extends AbstractProcessor {
        private final AbstractProcessor instance = createWrappedInstance();

        private static AbstractProcessor createWrappedInstance() {
            try {
                return (AbstractProcessor) Main.getShadowClassLoader().loadClass("lombok.core.AnnotationProcessor").getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable th) {
                if (th instanceof Error) {
                    throw ((Error) th);
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                Buffer$$ExternalSyntheticBUOutline0.m(th);
                return null;
            }
        }

        private void disableJava9SillyWarning() {
            try {
                Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                declaredField.setAccessible(true);
                Unsafe unsafe = (Unsafe) declaredField.get(null);
                Class<?> cls = Class.forName("jdk.internal.module.IllegalAccessLogger");
                unsafe.putObjectVolatile(cls, unsafe.staticFieldOffset(cls.getDeclaredField("logger")), (Object) null);
            } catch (Throwable unused) {
            }
        }

        public Iterable<? extends Completion> getCompletions(Element element, AnnotationMirror annotationMirror, ExecutableElement executableElement, String str) {
            return this.instance.getCompletions(element, annotationMirror, executableElement, str);
        }

        public Set<String> getSupportedAnnotationTypes() {
            return this.instance.getSupportedAnnotationTypes();
        }

        public Set<String> getSupportedOptions() {
            return this.instance.getSupportedOptions();
        }

        public SourceVersion getSupportedSourceVersion() {
            return this.instance.getSupportedSourceVersion();
        }

        public void init(ProcessingEnvironment processingEnvironment) {
            disableJava9SillyWarning();
            AstModificationNotifierData.lombokInvoked = true;
            this.instance.init(processingEnvironment);
            super.init(processingEnvironment);
        }

        public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
            return this.instance.process(set, roundEnvironment);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AstModificationNotifierData {
        public static volatile boolean lombokInvoked = false;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @SupportedAnnotationTypes({"lombok.*"})
    public static class ClaimingProcessor extends AbstractProcessor {
        public SourceVersion getSupportedSourceVersion() {
            return SourceVersion.latest();
        }

        public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
            return true;
        }
    }
}
