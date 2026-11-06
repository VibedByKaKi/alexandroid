package org.openjdk.javax.lang.model.type;

import org.openjdk.javax.lang.model.UnknownEntityException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class UnknownTypeException extends UnknownEntityException {
    private static final long serialVersionUID = 269;
    private transient Object parameter;
    private transient TypeMirror type;

    public UnknownTypeException(TypeMirror typeMirror, Object obj) {
        super("Unknown type: " + typeMirror);
        this.type = typeMirror;
        this.parameter = obj;
    }

    public Object getArgument() {
        return this.parameter;
    }

    public TypeMirror getUnknownType() {
        return this.type;
    }
}
