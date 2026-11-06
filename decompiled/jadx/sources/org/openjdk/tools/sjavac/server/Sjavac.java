package org.openjdk.tools.sjavac.server;

import org.openjdk.tools.javac.main.Main;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface Sjavac {
    Main.Result compile(String[] strArr);

    void shutdown();
}
