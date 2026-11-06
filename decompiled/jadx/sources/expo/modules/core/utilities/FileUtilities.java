package expo.modules.core.utilities;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class FileUtilities {
    public static File ensureDirExists(File file) throws IOException {
        if (file.isDirectory() || file.mkdirs()) {
            return file;
        }
        Path$$ExternalSyntheticBUOutline0.m("Couldn't create directory '", file, "'");
        return null;
    }

    public static String generateOutputPath(File file, String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(file);
        String str3 = File.separator;
        File file2 = new File(a$$ExternalSyntheticOutline0.m(sb, str3, str));
        ensureDirExists(file2);
        String uuid = UUID.randomUUID().toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(file2);
        sb2.append(str3);
        sb2.append(uuid);
        if (!str2.startsWith(".")) {
            str2 = ".".concat(str2);
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
