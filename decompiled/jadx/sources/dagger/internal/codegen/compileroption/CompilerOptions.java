package dagger.internal.codegen.compileroption;

import com.amazon.tarazed.ui.toast.SystemToast;
import dagger.spi.shaded.androidx.room.compiler.processing.XTypeElement;
import javax.tools.Diagnostic;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class CompilerOptions {
    public final boolean doCheckForNulls() {
        return nullableValidationKind().equals(Diagnostic.Kind.ERROR);
    }

    public abstract boolean experimentalDaggerErrorMessages();

    public abstract boolean experimentalMergedMode(XTypeElement xTypeElement);

    public abstract ValidationType explicitBindingConflictsWithInjectValidationType();

    public abstract boolean fastInit(XTypeElement xTypeElement);

    public abstract boolean formatGeneratedSource();

    public abstract ValidationType fullBindingGraphValidationType();

    public abstract boolean generatedClassExtendsComponent();

    public abstract boolean headerCompilation();

    public abstract boolean ignorePrivateAndStaticInjectionForComponent();

    public abstract boolean includeStacktraceWithDeferredErrorMessages();

    public int keysPerComponentShard(XTypeElement xTypeElement) {
        return SystemToast.LONG_DELAY_MILLIS;
    }

    public abstract Diagnostic.Kind moduleHasDifferentScopesDiagnosticKind();

    public abstract Diagnostic.Kind nullableValidationKind();

    public abstract boolean pluginsVisitFullBindingGraphs(XTypeElement xTypeElement);

    public abstract Diagnostic.Kind privateMemberValidationKind();

    public abstract ValidationType scopeCycleValidationType();

    public abstract Diagnostic.Kind staticMemberValidationKind();

    public abstract boolean strictMultibindingValidation();

    public abstract boolean strictSuperficialValidation();

    public abstract boolean usesProducers();

    public abstract boolean validateTransitiveComponentDependencies();

    public abstract boolean warnIfInjectionFactoryNotGeneratedUpstream();

    public abstract boolean writeProducerNameInToken();
}
