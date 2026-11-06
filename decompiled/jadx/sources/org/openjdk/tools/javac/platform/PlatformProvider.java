package org.openjdk.tools.javac.platform;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public interface PlatformProvider {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class PlatformNotSupported extends Exception {
        private static final long serialVersionUID = 1;
    }

    PlatformDescription getPlatform(String str, String str2) throws PlatformNotSupported;

    Iterable<String> getSupportedPlatformNames();
}
