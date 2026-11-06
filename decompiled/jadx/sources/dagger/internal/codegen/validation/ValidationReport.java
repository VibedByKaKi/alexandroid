package dagger.internal.codegen.validation;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.graph.Traverser;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import dagger.internal.codegen.base.ElementFormatter;
import dagger.internal.codegen.extension.DaggerStreams;
import dagger.internal.codegen.xprocessing.XElements;
import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotation;
import dagger.spi.shaded.androidx.room.compiler.processing.XAnnotationValue;
import dagger.spi.shaded.androidx.room.compiler.processing.XElement;
import dagger.spi.shaded.androidx.room.compiler.processing.XMessager;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Optional;
import java.util.stream.Stream;
import javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@CheckReturnValue
/* loaded from: classes9.dex */
public final class ValidationReport {
    private static final Traverser<ValidationReport> SUBREPORTS = Traverser.forTree(new ValidationReport$$ExternalSyntheticLambda1());
    private boolean hasPrintedErrors;
    private final ImmutableSet<Item> items;
    private final boolean markedDirty;
    private final XElement subject;
    private final ImmutableSet<ValidationReport> subreports;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: dagger.internal.codegen.validation.ValidationReport$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$javax$tools$Diagnostic$Kind;

        static {
            int[] iArr = new int[Diagnostic.Kind.values().length];
            $SwitchMap$javax$tools$Diagnostic$Kind = iArr;
            try {
                iArr[Diagnostic.Kind.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue
    public static abstract class Item {
        public abstract Optional<XAnnotation> annotation();

        public abstract Optional<XAnnotationValue> annotationValue();

        public abstract XElement element();

        public abstract Diagnostic.Kind kind();

        public abstract String message();
    }

    private ValidationReport(XElement xElement, ImmutableSet<Item> immutableSet, ImmutableSet<ValidationReport> immutableSet2, boolean z) {
        this.subject = xElement;
        this.items = immutableSet;
        this.subreports = immutableSet2;
        this.markedDirty = z;
    }

    public static Builder about(XElement xElement) {
        return new Builder(xElement, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Stream lambda$allItems$1(ValidationReport validationReport) {
        return validationReport.items.stream();
    }

    public ImmutableSet<Item> allItems() {
        return (ImmutableSet) ImmutableSet.copyOf(SUBREPORTS.depthFirstPreOrder((Traverser<ValidationReport>) this)).stream().flatMap(new InjectValidator$$ExternalSyntheticLambda1(5)).collect(DaggerStreams.toImmutableSet());
    }

    public boolean isClean() {
        if (this.markedDirty) {
            return false;
        }
        UnmodifiableIterator<Item> it2 = this.items.iterator();
        while (it2.hasNext()) {
            if (AnonymousClass1.$SwitchMap$javax$tools$Diagnostic$Kind[it2.next().kind().ordinal()] == 1) {
                return false;
            }
        }
        UnmodifiableIterator<ValidationReport> it3 = this.subreports.iterator();
        while (it3.hasNext()) {
            if (!it3.next().isClean()) {
                return false;
            }
        }
        return true;
    }

    public void printMessagesTo(XMessager xMessager) {
        XMessager xMessager2;
        if (this.hasPrintedErrors) {
            return;
        }
        this.hasPrintedErrors = true;
        UnmodifiableIterator<Item> it2 = this.items.iterator();
        while (it2.hasNext()) {
            Item next = it2.next();
            if (!XElements.transitivelyEncloses(this.subject, next.element())) {
                xMessager2 = xMessager;
                xMessager2.printMessage(next.kind(), a$$ExternalSyntheticOutline0.m(MarkdownConstants.LEFT_BRACKET, ElementFormatter.elementToString(next.element()), "] ", next.message()), this.subject);
            } else if (!next.annotation().isPresent()) {
                xMessager2 = xMessager;
                xMessager2.printMessage(next.kind(), next.message(), next.element());
            } else if (next.annotationValue().isPresent()) {
                xMessager2 = xMessager;
                xMessager2.printMessage(next.kind(), next.message(), next.element(), next.annotation().get(), next.annotationValue().get());
            } else {
                xMessager2 = xMessager;
                xMessager2.printMessage(next.kind(), next.message(), next.element(), next.annotation().get());
            }
            xMessager = xMessager2;
        }
        XMessager xMessager3 = xMessager;
        UnmodifiableIterator<ValidationReport> it3 = this.subreports.iterator();
        while (it3.hasNext()) {
            it3.next().printMessagesTo(xMessager3);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private final ImmutableSet.Builder<Item> items;
        private boolean markedDirty;
        private final XElement subject;
        private final ImmutableSet.Builder<ValidationReport> subreports;

        private Builder(XElement xElement) {
            this.items = ImmutableSet.builder();
            this.subreports = ImmutableSet.builder();
            this.subject = xElement;
        }

        @CanIgnoreReturnValue
        public Builder addError(String str, XElement xElement, XAnnotation xAnnotation, XAnnotationValue xAnnotationValue) {
            return addItem(str, Diagnostic.Kind.ERROR, xElement, xAnnotation, xAnnotationValue);
        }

        @CanIgnoreReturnValue
        public Builder addItem(String str, Diagnostic.Kind kind, XElement xElement) {
            return addItem(str, kind, xElement, Optional.empty(), Optional.empty());
        }

        @CanIgnoreReturnValue
        public Builder addItems(Iterable<Item> iterable) {
            this.items.addAll((Iterable<? extends Item>) iterable);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addNote(String str, XElement xElement, XAnnotation xAnnotation, XAnnotationValue xAnnotationValue) {
            return addItem(str, Diagnostic.Kind.NOTE, xElement, xAnnotation, xAnnotationValue);
        }

        @CanIgnoreReturnValue
        public Builder addSubreport(ValidationReport validationReport) {
            this.subreports.add((ImmutableSet.Builder<ValidationReport>) validationReport);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addWarning(String str, XElement xElement, XAnnotation xAnnotation, XAnnotationValue xAnnotationValue) {
            return addItem(str, Diagnostic.Kind.WARNING, xElement, xAnnotation, xAnnotationValue);
        }

        public ValidationReport build() {
            return new ValidationReport(this.subject, this.items.build(), this.subreports.build(), this.markedDirty, null);
        }

        public void markDirty() {
            this.markedDirty = true;
        }

        @CanIgnoreReturnValue
        public Builder addError(String str, XElement xElement) {
            return addItem(str, Diagnostic.Kind.ERROR, xElement);
        }

        @CanIgnoreReturnValue
        public Builder addNote(String str, XElement xElement) {
            return addItem(str, Diagnostic.Kind.NOTE, xElement);
        }

        @CanIgnoreReturnValue
        public Builder addWarning(String str, XElement xElement) {
            return addItem(str, Diagnostic.Kind.WARNING, xElement);
        }

        @CanIgnoreReturnValue
        public Builder addError(String str, XElement xElement, XAnnotation xAnnotation) {
            return addItem(str, Diagnostic.Kind.ERROR, xElement, xAnnotation);
        }

        @CanIgnoreReturnValue
        public Builder addNote(String str, XElement xElement, XAnnotation xAnnotation) {
            return addItem(str, Diagnostic.Kind.NOTE, xElement, xAnnotation);
        }

        @CanIgnoreReturnValue
        public Builder addWarning(String str, XElement xElement, XAnnotation xAnnotation) {
            return addItem(str, Diagnostic.Kind.WARNING, xElement, xAnnotation);
        }

        @CanIgnoreReturnValue
        public Builder addError(String str) {
            return addError(str, this.subject);
        }

        @CanIgnoreReturnValue
        public Builder addNote(String str) {
            return addNote(str, this.subject);
        }

        @CanIgnoreReturnValue
        public Builder addWarning(String str) {
            return addWarning(str, this.subject);
        }

        @CanIgnoreReturnValue
        public Builder addItem(String str, Diagnostic.Kind kind, XElement xElement, XAnnotation xAnnotation) {
            return addItem(str, kind, xElement, Optional.of(xAnnotation), Optional.empty());
        }

        public /* synthetic */ Builder(XElement xElement, AnonymousClass1 anonymousClass1) {
            this(xElement);
        }

        @CanIgnoreReturnValue
        public Builder addItem(String str, Diagnostic.Kind kind, XElement xElement, XAnnotation xAnnotation, XAnnotationValue xAnnotationValue) {
            return addItem(str, kind, xElement, Optional.of(xAnnotation), Optional.of(xAnnotationValue));
        }

        @CanIgnoreReturnValue
        private Builder addItem(String str, Diagnostic.Kind kind, XElement xElement, Optional<XAnnotation> optional, Optional<XAnnotationValue> optional2) {
            this.items.add((ImmutableSet.Builder<Item>) new AutoValue_ValidationReport_Item(str, kind, xElement, optional, optional2));
            return this;
        }
    }

    public /* synthetic */ ValidationReport(XElement xElement, ImmutableSet immutableSet, ImmutableSet immutableSet2, boolean z, AnonymousClass1 anonymousClass1) {
        this(xElement, immutableSet, immutableSet2, z);
    }
}
