package com.amazon.coral.util.contextualendpoint;

import com.amazon.coral.google.common.annotations.VisibleForTesting;
import java.lang.invoke.MethodHandle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
final class ApolloDataSource implements DataSource {
    private static final MethodHandle GET_FULL_NAME;
    private static final MethodHandle GET_STAGE_NAME;
    static final ApolloDataSource INSTANCE;
    private final Object envInfo;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 0
            java.lang.invoke.MethodHandles$Lookup r2 = java.lang.invoke.MethodHandles.lookup()     // Catch: java.lang.Throwable -> L22
            java.lang.String r3 = "amazon.platform.tools.ApolloEnvironmentInfo"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.String r4 = "getStageName"
            java.lang.invoke.MethodType r5 = java.lang.invoke.MethodType.methodType(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.invoke.MethodHandle r4 = r2.findVirtual(r3, r4, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r5 = "getFullName"
            java.lang.invoke.MethodType r0 = java.lang.invoke.MethodType.methodType(r0)     // Catch: java.lang.Throwable -> L23
            java.lang.invoke.MethodHandle r0 = r2.findVirtual(r3, r5, r0)     // Catch: java.lang.Throwable -> L23
            goto L25
        L22:
            r3 = r1
        L23:
            r0 = r1
            r4 = r0
        L25:
            com.amazon.coral.util.contextualendpoint.ApolloDataSource.GET_STAGE_NAME = r4
            com.amazon.coral.util.contextualendpoint.ApolloDataSource.GET_FULL_NAME = r0
            if (r3 == 0) goto L39
            com.amazon.coral.util.contextualendpoint.ApolloDataSource r0 = new com.amazon.coral.util.contextualendpoint.ApolloDataSource     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Constructor r2 = r3.getConstructor(r1)     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.newInstance(r1)     // Catch: java.lang.Throwable -> L39
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L39
            r1 = r0
        L39:
            com.amazon.coral.util.contextualendpoint.ApolloDataSource.INSTANCE = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.coral.util.contextualendpoint.ApolloDataSource.<clinit>():void");
    }

    @VisibleForTesting
    public ApolloDataSource(Object obj) {
        this.envInfo = obj;
    }

    @Override // com.amazon.coral.util.contextualendpoint.DataSource
    public Boolean isOneBox() {
        boolean z;
        try {
            String invoke = (String) GET_FULL_NAME.invoke(this.envInfo);
            if (invoke == null) {
                return null;
            }
            String lowerCase = invoke.toLowerCase();
            if (!lowerCase.contains("/onebox") && !lowerCase.contains("/onepod") && !lowerCase.contains("/1box")) {
                z = false;
                return Boolean.valueOf(z);
            }
            z = true;
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            throw new UnsupportedOperationException(th);
        }
    }

    @Override // com.amazon.coral.util.contextualendpoint.DataSource
    public Boolean isProduction() {
        try {
            String invoke = (String) GET_STAGE_NAME.invoke(this.envInfo);
            if (invoke == null) {
                return null;
            }
            return Boolean.valueOf(invoke.equalsIgnoreCase("prod"));
        } catch (Throwable th) {
            throw new UnsupportedOperationException(th);
        }
    }
}
