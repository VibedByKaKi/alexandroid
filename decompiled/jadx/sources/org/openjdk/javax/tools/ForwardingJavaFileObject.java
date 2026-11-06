package org.openjdk.javax.tools;

import org.openjdk.javax.lang.model.element.Modifier;
import org.openjdk.javax.lang.model.element.NestingKind;
import org.openjdk.javax.tools.JavaFileObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class ForwardingJavaFileObject<F extends JavaFileObject> extends ForwardingFileObject<F> implements JavaFileObject {
    public ForwardingJavaFileObject(F f) {
        super(f);
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public Modifier getAccessLevel() {
        return ((JavaFileObject) this.fileObject).getAccessLevel();
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public JavaFileObject.Kind getKind() {
        return ((JavaFileObject) this.fileObject).getKind();
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public NestingKind getNestingKind() {
        return ((JavaFileObject) this.fileObject).getNestingKind();
    }

    @Override // org.openjdk.javax.tools.JavaFileObject
    public boolean isNameCompatible(String str, JavaFileObject.Kind kind) {
        return ((JavaFileObject) this.fileObject).isNameCompatible(str, kind);
    }
}
