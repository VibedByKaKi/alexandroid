package dagger.internal.codegen.base;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class DiagnosticFormatting {
    private static final Pattern COMMON_PACKAGE_PATTERN = Pattern.compile("(?:^|[^.a-z_])((?:java[.]lang|java[.]util|javax[.]inject|dagger|dagger[.]multibindings|com[.]google[.]common[.]base|com[.]google[.]common[.]collect)[.])[A-Z]");

    private DiagnosticFormatting() {
    }

    public static String stripCommonTypePrefixes(String str) {
        Matcher matcher = COMMON_PACKAGE_PATTERN.matcher(str);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (matcher.find()) {
            sb.append(str.subSequence(i, matcher.start(1)));
            i = matcher.end(1);
        }
        sb.append(str.subSequence(i, str.length()));
        return sb.toString();
    }
}
