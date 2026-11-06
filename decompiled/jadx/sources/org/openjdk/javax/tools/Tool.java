package org.openjdk.javax.tools;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import org.openjdk.javax.lang.model.SourceVersion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public interface Tool {
    Set<SourceVersion> getSourceVersions();

    default String name() {
        return "";
    }

    int run(InputStream inputStream, OutputStream outputStream, OutputStream outputStream2, String... strArr);
}
