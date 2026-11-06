package org.openjdk.javax.lang.model.element;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface ModuleElement extends Element, QualifiedNameable {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Directive {
        <R, P> R accept(DirectiveVisitor<R, P> directiveVisitor, P p);

        DirectiveKind getKind();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DirectiveKind {
        REQUIRES,
        EXPORTS,
        OPENS,
        USES,
        PROVIDES
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ExportsDirective extends Directive {
        PackageElement getPackage();

        List<? extends ModuleElement> getTargetModules();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface OpensDirective extends Directive {
        PackageElement getPackage();

        List<? extends ModuleElement> getTargetModules();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ProvidesDirective extends Directive {
        List<? extends TypeElement> getImplementations();

        TypeElement getService();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RequiresDirective extends Directive {
        ModuleElement getDependency();

        boolean isStatic();

        boolean isTransitive();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface UsesDirective extends Directive {
        TypeElement getService();
    }

    List<? extends Directive> getDirectives();

    @Override // org.openjdk.javax.lang.model.element.Element
    List<? extends Element> getEnclosedElements();

    @Override // org.openjdk.javax.lang.model.element.Element
    Element getEnclosingElement();

    @Override // org.openjdk.javax.lang.model.element.QualifiedNameable
    Name getQualifiedName();

    @Override // org.openjdk.javax.lang.model.element.Element
    Name getSimpleName();

    boolean isOpen();

    boolean isUnnamed();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface DirectiveVisitor<R, P> {
        default R visit(Directive directive) {
            return (R) directive.accept(this, null);
        }

        R visitExports(ExportsDirective exportsDirective, P p);

        R visitOpens(OpensDirective opensDirective, P p);

        R visitProvides(ProvidesDirective providesDirective, P p);

        R visitRequires(RequiresDirective requiresDirective, P p);

        default R visitUnknown(Directive directive, P p) {
            throw new UnknownDirectiveException(directive, p);
        }

        R visitUses(UsesDirective usesDirective, P p);

        default R visit(Directive directive, P p) {
            return (R) directive.accept(this, p);
        }
    }
}
