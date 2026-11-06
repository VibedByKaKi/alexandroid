package org.openjdk.javax.lang.model.element;

import org.openjdk.javax.lang.model.UnknownEntityException;
import org.openjdk.javax.lang.model.element.ModuleElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UnknownDirectiveException extends UnknownEntityException {
    private static final long serialVersionUID = 269;
    private final transient ModuleElement.Directive directive;
    private final transient Object parameter;

    public UnknownDirectiveException(ModuleElement.Directive directive, Object obj) {
        super("Unknown directive: " + directive);
        this.directive = directive;
        this.parameter = obj;
    }

    public Object getArgument() {
        return this.parameter;
    }

    public ModuleElement.Directive getUnknownDirective() {
        return this.directive;
    }
}
