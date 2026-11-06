package org.openjdk.tools.sjavac;

import java.util.Arrays;
import org.openjdk.tools.sjavac.client.ClientMain;
import org.openjdk.tools.sjavac.options.Option;
import org.openjdk.tools.sjavac.server.ServerMain;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Main {
    public static int go(String[] strArr) {
        return Arrays.asList(strArr).stream().anyMatch(new Main$$ExternalSyntheticLambda0(0)) ? ServerMain.run(strArr) : ClientMain.run(strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$go$0(String str) {
        return str.startsWith(Option.STARTSERVER.arg);
    }

    public static void main(String... strArr) {
        System.exit(go(strArr));
    }
}
