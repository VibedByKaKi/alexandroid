package org.openjdk.javax.tools;

import java.util.Objects;
import org.openjdk.javax.lang.model.element.Modifier;
import org.openjdk.javax.lang.model.element.NestingKind;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface JavaFileObject extends FileObject {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Kind {
        SOURCE(".java"),
        CLASS(".class"),
        HTML(".html"),
        OTHER("");

        public final String extension;

        Kind(String str) {
            Objects.requireNonNull(str);
            this.extension = str;
        }
    }

    Modifier getAccessLevel();

    Kind getKind();

    NestingKind getNestingKind();

    boolean isNameCompatible(String str, Kind kind);
}
