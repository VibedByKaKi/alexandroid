package org.openjdk.source.util;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import org.openjdk.javax.lang.model.element.TypeElement;
import org.openjdk.javax.tools.JavaFileObject;
import org.openjdk.source.tree.CompilationUnitTree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class TaskEvent {
    private TypeElement clazz;
    private JavaFileObject file;
    private Kind kind;
    private CompilationUnitTree unit;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Kind {
        PARSE,
        ENTER,
        ANALYZE,
        GENERATE,
        ANNOTATION_PROCESSING,
        ANNOTATION_PROCESSING_ROUND,
        COMPILATION
    }

    private TaskEvent(Kind kind, JavaFileObject javaFileObject, CompilationUnitTree compilationUnitTree, TypeElement typeElement) {
        this.kind = kind;
        this.file = javaFileObject;
        this.unit = compilationUnitTree;
        this.clazz = typeElement;
    }

    public CompilationUnitTree getCompilationUnit() {
        return this.unit;
    }

    public Kind getKind() {
        return this.kind;
    }

    public JavaFileObject getSourceFile() {
        return this.file;
    }

    public TypeElement getTypeElement() {
        return this.clazz;
    }

    public String toString() {
        return "TaskEvent[" + this.kind + "," + this.file + "," + this.clazz + MarkdownConstants.RIGHT_BRACKET;
    }

    public TaskEvent(Kind kind, JavaFileObject javaFileObject) {
        this(kind, javaFileObject, null, null);
    }

    public TaskEvent(Kind kind, CompilationUnitTree compilationUnitTree) {
        this(kind, compilationUnitTree.getSourceFile(), compilationUnitTree, null);
    }

    public TaskEvent(Kind kind, CompilationUnitTree compilationUnitTree, TypeElement typeElement) {
        this(kind, compilationUnitTree.getSourceFile(), compilationUnitTree, typeElement);
    }

    public TaskEvent(Kind kind) {
        this(kind, null, null, null);
    }
}
