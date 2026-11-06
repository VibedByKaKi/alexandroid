package com.amazon.coral.util.reflection;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.media3.exoplayer.upstream.CmcdData;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.ProcessingEnvironment;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import javax.tools.FileObject;
import javax.tools.StandardLocation;
import org.apache.commons.io.FileUtils$$ExternalSyntheticLambda2;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public abstract class AbstractManifestAnnotationProcessor extends AbstractProcessor {
    protected final Class<? extends Annotation> annotation;
    private final String outputPath;
    private final SortedSet<String> providerClasses = new TreeSet();
    private final Class<?> serviceType;

    public AbstractManifestAnnotationProcessor(Class<? extends Annotation> cls, Class cls2, String str) {
        this.annotation = cls;
        this.serviceType = cls2;
        this.outputPath = str;
    }

    private void emit(Set<String> set) throws IOException {
        if (set.isEmpty()) {
            log("No custom providers found for %s", this.serviceType.getName());
            return;
        }
        TreeSet treeSet = new TreeSet(set);
        treeSet.addAll(readOldProviders());
        FileObject createResource = this.processingEnv.getFiler().createResource(StandardLocation.CLASS_OUTPUT, "", this.outputPath, new Element[0]);
        log("Detected provider classnames will be stored at: %s", createResource.toUri().toString());
        Writer openWriter = createResource.openWriter();
        try {
            Iterator it2 = treeSet.iterator();
            while (it2.hasNext()) {
                openWriter.append((CharSequence) it2.next()).append('\n');
            }
            if (openWriter != null) {
                openWriter.close();
            }
        } catch (Throwable th) {
            if (openWriter != null) {
                try {
                    openWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    private Set<? extends Element> getElementsAnnotatedWith(RoundEnvironment roundEnvironment) {
        Set<? extends Element> elementsAnnotatedWith;
        try {
            elementsAnnotatedWith = roundEnvironment.getElementsAnnotatedWith(this.annotation);
        } catch (RuntimeException e) {
            this.processingEnv.getMessager().printMessage(Diagnostic.Kind.WARNING, a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("An error, ", e.getClass().getSimpleName(), "('", e.getMessage(), "'), occurred while attempting to retrieve elements annotated with '"), this.annotation.getSimpleName(), "'.  Retrying..."));
            elementsAnnotatedWith = roundEnvironment.getElementsAnnotatedWith(this.annotation);
        }
        this.processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, String.format("Successfully retrieved %d element%s annotated with '%s'", Integer.valueOf(elementsAnnotatedWith.size()), elementsAnnotatedWith.size() == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS, this.annotation.getSimpleName()));
        return elementsAnnotatedWith;
    }

    private TypeElement getProviderTypeElement() {
        return this.processingEnv.getElementUtils().getTypeElement(this.serviceType.getCanonicalName());
    }

    private boolean isSubtype(TypeElement typeElement, TypeElement typeElement2) {
        return this.processingEnv.getTypeUtils().isSubtype(typeElement.asType(), typeElement2.asType());
    }

    private void log(String str, Object... objArr) {
        this.processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, String.format(str, objArr));
    }

    private void processAnnotations(RoundEnvironment roundEnvironment) {
        TreeSet treeSet = new TreeSet();
        TypeElement providerTypeElement = getProviderTypeElement();
        Iterator<? extends Element> it2 = getElementsAnnotatedWith(roundEnvironment).iterator();
        while (it2.hasNext()) {
            TypeElement typeElement = (TypeElement) it2.next();
            this.processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, String.format("processing '%s'", typeElement.getQualifiedName()));
            if (isSubtype(typeElement, providerTypeElement)) {
                treeSet.add(this.processingEnv.getElementUtils().getBinaryName(typeElement).toString());
            } else {
                this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, "Annotated type does not extend ".concat(this.serviceType.getName()), typeElement);
            }
        }
        this.providerClasses.addAll(treeSet);
    }

    private void processOrThrow(RoundEnvironment roundEnvironment) throws Exception {
        if (roundEnvironment.processingOver()) {
            emit(this.providerClasses);
        } else {
            processAnnotations(roundEnvironment);
        }
    }

    private Set<String> readOldProviders() {
        HashSet hashSet = new HashSet();
        try {
            Enumeration<URL> resources = AbstractManifestAnnotationProcessor.class.getClassLoader().getResources(this.outputPath);
            while (resources.hasMoreElements()) {
                URL nextElement = resources.nextElement();
                if ("file".equals(nextElement.getProtocol())) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(nextElement.openStream(), StandardCharsets.UTF_8));
                    try {
                        bufferedReader.lines().forEach(new FileUtils$$ExternalSyntheticLambda2(hashSet, 13));
                        log("Reused %d provider%s from preexisting output file %s", Integer.valueOf(hashSet.size()), hashSet.size() == 1 ? "" : CmcdData.Factory.STREAMING_FORMAT_SS, nextElement.getPath());
                        bufferedReader.close();
                    } finally {
                    }
                }
            }
        } catch (IOException unused) {
        }
        return hashSet;
    }

    public Set<String> getSupportedAnnotationTypes() {
        return Collections.singleton(this.annotation.getCanonicalName());
    }

    public final SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latestSupported();
    }

    public final synchronized void init(ProcessingEnvironment processingEnvironment) {
        super.init(processingEnvironment);
        processingEnvironment.getMessager().printMessage(Diagnostic.Kind.NOTE, getClass().getCanonicalName() + " initialized...");
    }

    public final boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        this.processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, a$$ExternalSyntheticOutline0.m("Annotation processor for '", this.annotation.getName(), "'"));
        try {
            processOrThrow(roundEnvironment);
            return true;
        } catch (Exception e) {
            StringWriter stringWriter = new StringWriter();
            stringWriter.append((CharSequence) String.format("Uncaught exception in %s:%n", getClass().getSimpleName()));
            e.printStackTrace(new PrintWriter(stringWriter));
            this.processingEnv.getMessager().printMessage(Diagnostic.Kind.ERROR, stringWriter.toString());
            return true;
        }
    }
}
