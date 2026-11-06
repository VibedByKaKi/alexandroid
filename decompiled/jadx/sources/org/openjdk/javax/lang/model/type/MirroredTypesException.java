package org.openjdk.javax.lang.model.type;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class MirroredTypesException extends RuntimeException {
    private static final long serialVersionUID = 269;
    transient List<? extends TypeMirror> types;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MirroredTypesException(java.util.List<? extends org.openjdk.javax.lang.model.type.TypeMirror> r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempt to access Class objects for TypeMirrors "
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            java.lang.String r3 = r1.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            java.util.List r3 = java.util.Collections.unmodifiableList(r1)
            r2.types = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.openjdk.javax.lang.model.type.MirroredTypesException.<init>(java.util.List):void");
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.types = null;
    }

    public List<? extends TypeMirror> getTypeMirrors() {
        return this.types;
    }

    public MirroredTypesException(String str, TypeMirror typeMirror) {
        super(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(typeMirror);
        this.types = Collections.unmodifiableList(arrayList);
    }
}
