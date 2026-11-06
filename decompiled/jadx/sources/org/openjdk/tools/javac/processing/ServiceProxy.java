package org.openjdk.tools.javac.processing;

import java.net.MalformedURLException;
import java.net.URL;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
class ServiceProxy {
    private static final String prefix = "META-INF/services/";

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ServiceConfigurationError extends Error {
        static final long serialVersionUID = 7732091036771098303L;

        public ServiceConfigurationError(String str) {
            super(str);
        }
    }

    private static void fail(Class<?> cls, URL url, int i, String str) throws ServiceConfigurationError {
        fail(cls, url + ":" + i + ": " + str);
    }

    public static boolean hasService(Class<?> cls, URL[] urlArr) throws ServiceConfigurationError {
        for (URL url : urlArr) {
            try {
            } catch (MalformedURLException unused) {
            }
            if (parse(cls, new URL(url, prefix + cls.getName()))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c5, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c9, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        fail(r11, com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0.m(": ", r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00fb, code lost:
    
        if (r3 == null) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean parse(java.lang.Class<?> r11, java.net.URL r12) throws org.openjdk.tools.javac.processing.ServiceProxy.ServiceConfigurationError {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.openjdk.tools.javac.processing.ServiceProxy.parse(java.lang.Class, java.net.URL):boolean");
    }

    private static void fail(Class<?> cls, String str) throws ServiceConfigurationError {
        throw new ServiceConfigurationError(cls.getName() + ": " + str);
    }
}
