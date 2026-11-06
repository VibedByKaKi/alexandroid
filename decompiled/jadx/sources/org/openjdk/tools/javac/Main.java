package org.openjdk.tools.javac;

import java.io.PrintWriter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Main {
    public static int compile(String[] strArr) {
        return new org.openjdk.tools.javac.main.Main("javac").compile(strArr).exitCode;
    }

    public static void main(String[] strArr) throws Exception {
        System.exit(compile(strArr));
    }

    public static int compile(String[] strArr, PrintWriter printWriter) {
        return new org.openjdk.tools.javac.main.Main("javac", printWriter).compile(strArr).exitCode;
    }
}
