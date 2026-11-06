package org.apache.commons.lang3;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class RuntimeEnvironment {
    @Deprecated
    public RuntimeEnvironment() {
    }

    private static boolean fileExists(String str) {
        return Files.exists(Paths.get(str, new String[0]), new LinkOption[0]);
    }

    public static boolean inContainer(String str) {
        return readFile(BitVector$$ExternalSyntheticOutline0.m(str, "/proc/1/environ"), "container") != null ? !r0.isEmpty() : fileExists(BitVector$$ExternalSyntheticOutline0.m(str, "/.dockerenv")) || fileExists(BitVector$$ExternalSyntheticOutline0.m(str, "/run/.containerenv"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$readFile$0(String str, String str2) {
        return str2.startsWith(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String[] lambda$readFile$1(String str) {
        return str.split("=", 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$readFile$2(String[] strArr) {
        return strArr[1];
    }

    private static String readFile(String str, String str2) {
        try {
            return (String) Arrays.stream(new String(Files.readAllBytes(Paths.get(str, new String[0])), Charset.defaultCharset()).split(String.valueOf((char) 0))).filter(new LocaleUtils$$ExternalSyntheticLambda0(str2 + "=", 13)).map(new EnumUtils$$ExternalSyntheticLambda4(14)).map(new EnumUtils$$ExternalSyntheticLambda4(15)).findFirst().orElse(null);
        } catch (IOException unused) {
            return null;
        }
    }

    public static Boolean inContainer() {
        return Boolean.valueOf(inContainer(""));
    }
}
