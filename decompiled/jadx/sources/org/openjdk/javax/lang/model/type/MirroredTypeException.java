package org.openjdk.javax.lang.model.type;

import java.io.IOException;
import java.io.ObjectInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MirroredTypeException extends MirroredTypesException {
    private static final long serialVersionUID = 269;
    private transient TypeMirror type;

    public MirroredTypeException(TypeMirror typeMirror) {
        super("Attempt to access Class object for TypeMirror " + typeMirror.toString(), typeMirror);
        this.type = typeMirror;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.type = null;
        this.types = null;
    }

    public TypeMirror getTypeMirror() {
        return this.type;
    }
}
