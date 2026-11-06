package org.openjdk.javax.lang.model.element;

import org.openjdk.javax.lang.model.UnknownEntityException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UnknownElementException extends UnknownEntityException {
    private static final long serialVersionUID = 269;
    private transient Element element;
    private transient Object parameter;

    public UnknownElementException(Element element, Object obj) {
        super("Unknown element: " + element);
        this.element = element;
        this.parameter = obj;
    }

    public Object getArgument() {
        return this.parameter;
    }

    public Element getUnknownElement() {
        return this.element;
    }
}
