package org.openjdk.tools.javac.util;

import org.openjdk.tools.javac.util.JDK9Wrappers;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ModuleHelper {
    private static final String[] javacInternalPackages = {"org.openjdk.tools.javac.api", "org.openjdk.tools.javac.code", "org.openjdk.tools.javac.comp", "org.openjdk.tools.javac.file", "org.openjdk.tools.javac.jvm", "org.openjdk.tools.javac.main", "org.openjdk.tools.javac.model", "org.openjdk.tools.javac.parser", "org.openjdk.tools.javac.platform", "org.openjdk.tools.javac.processing", "org.openjdk.tools.javac.tree", "org.openjdk.tools.javac.util", "org.openjdk.tools.doclint"};

    public static void addExports(JDK9Wrappers.Module module, JDK9Wrappers.Module module2) {
        for (String str : javacInternalPackages) {
            module.addExports(str, module2);
        }
    }
}
