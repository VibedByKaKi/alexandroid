package dagger.spi.shaded.androidx.room.compiler.processing;

import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.tools.Diagnostic;
import kotlin.Metadata;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000J<\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H$J\u0016\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ&\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J.\u0010\u0013\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J<\u0010\u0014\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u000e\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XMessager;", "", "()V", "watchers", "", "addMessageWatcher", "", "watcher", "onPrintMessage", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Ljavax/tools/Diagnostic$Kind;", "msg", "", "element", "Ldagger/spi/shaded/androidx/room/compiler/processing/XElement;", "annotation", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotation;", "annotationValue", "Ldagger/spi/shaded/androidx/room/compiler/processing/XAnnotationValue;", "printMessage", "printMsg", "removeMessageWatcher", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public abstract class XMessager {

    @NotNull
    private final List<XMessager> watchers = new ArrayList();

    public static /* synthetic */ void onPrintMessage$default(XMessager xMessager, Diagnostic.Kind kind, String str, XElement xElement, XAnnotation xAnnotation, XAnnotationValue xAnnotationValue, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: onPrintMessage");
            return;
        }
        if ((i & 4) != 0) {
            xElement = null;
        }
        if ((i & 8) != 0) {
            xAnnotation = null;
        }
        if ((i & 16) != 0) {
            xAnnotationValue = null;
        }
        xMessager.onPrintMessage(kind, str, xElement, xAnnotation, xAnnotationValue);
    }

    private final void printMsg(Diagnostic.Kind kind, String msg, XElement element, XAnnotation annotation, XAnnotationValue annotationValue) {
        Iterator<T> it2 = this.watchers.iterator();
        while (it2.hasNext()) {
            ((XMessager) it2.next()).printMsg(kind, msg, element, annotation, annotationValue);
        }
        onPrintMessage(kind, msg, element, annotation, annotationValue);
    }

    public static /* synthetic */ void printMsg$default(XMessager xMessager, Diagnostic.Kind kind, String str, XElement xElement, XAnnotation xAnnotation, XAnnotationValue xAnnotationValue, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: printMsg");
            return;
        }
        if ((i & 4) != 0) {
            xElement = null;
        }
        if ((i & 8) != 0) {
            xAnnotation = null;
        }
        if ((i & 16) != 0) {
            xAnnotationValue = null;
        }
        xMessager.printMsg(kind, str, xElement, xAnnotation, xAnnotationValue);
    }

    public final void addMessageWatcher(@NotNull XMessager watcher) {
        watcher.getClass();
        this.watchers.add(watcher);
    }

    public abstract void onPrintMessage(@NotNull Diagnostic.Kind kind, @NotNull String msg, @Nullable XElement element, @Nullable XAnnotation annotation, @Nullable XAnnotationValue annotationValue);

    public final void printMessage(@NotNull Diagnostic.Kind kind, @NotNull String msg, @NotNull XElement element, @NotNull XAnnotation annotation) {
        kind.getClass();
        msg.getClass();
        element.getClass();
        annotation.getClass();
        printMsg$default(this, kind, msg, element, annotation, null, 16, null);
    }

    public final void removeMessageWatcher(@NotNull XMessager watcher) {
        watcher.getClass();
        this.watchers.remove(watcher);
    }

    public final void printMessage(@NotNull Diagnostic.Kind kind, @NotNull String msg, @NotNull XElement element) {
        kind.getClass();
        msg.getClass();
        element.getClass();
        printMsg$default(this, kind, msg, element, null, null, 24, null);
    }

    public final void printMessage(@NotNull Diagnostic.Kind kind, @NotNull String msg) {
        kind.getClass();
        msg.getClass();
        printMsg$default(this, kind, msg, null, null, null, 28, null);
    }

    public final void printMessage(@NotNull Diagnostic.Kind kind, @NotNull String msg, @NotNull XElement element, @NotNull XAnnotation annotation, @NotNull XAnnotationValue annotationValue) {
        kind.getClass();
        msg.getClass();
        element.getClass();
        annotation.getClass();
        annotationValue.getClass();
        printMsg(kind, msg, element, annotation, annotationValue);
    }
}
