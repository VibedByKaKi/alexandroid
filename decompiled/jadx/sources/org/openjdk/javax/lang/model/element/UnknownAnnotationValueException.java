package org.openjdk.javax.lang.model.element;

import org.openjdk.javax.lang.model.UnknownEntityException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UnknownAnnotationValueException extends UnknownEntityException {
    private static final long serialVersionUID = 269;
    private transient AnnotationValue av;
    private transient Object parameter;

    public UnknownAnnotationValueException(AnnotationValue annotationValue, Object obj) {
        super("Unknown annotation value: " + annotationValue);
        this.av = annotationValue;
        this.parameter = obj;
    }

    public Object getArgument() {
        return this.parameter;
    }

    public AnnotationValue getUnknownAnnotationValue() {
        return this.av;
    }
}
