package org.openjdk.tools.javac.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import java.util.regex.Pattern;
import org.openjdk.javax.lang.model.SourceVersion;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class MatchingUtils {
    private static final Pattern allMatches = Pattern.compile(".*");
    private static final String allMatchesString = ".*";

    public static boolean isValidImportString(String str) {
        if (str.equals("*")) {
            return true;
        }
        int indexOf = str.indexOf(42);
        if (indexOf != -1) {
            if (indexOf != str.length() - 1) {
                return false;
            }
            int i = indexOf - 1;
            if (i >= 0) {
                r1 = str.charAt(i) == '.';
                str = AppLaunchChecker$$ExternalSyntheticOutline0.m(2, 0, str);
            }
        }
        if (r1) {
            for (String str2 : str.split(ArcusConfig.PATH_SEPARATOR, str.length() + 2)) {
                r1 &= SourceVersion.isIdentifier(str2);
            }
        }
        return r1;
    }

    public static Pattern validImportStringToPattern(String str) {
        String validImportStringToPatternString = validImportStringToPatternString(str);
        return validImportStringToPatternString == ".*" ? allMatches : Pattern.compile(validImportStringToPatternString);
    }

    public static String validImportStringToPatternString(String str) {
        if (str.equals("*")) {
            return ".*";
        }
        String replace = str.replace(".", ArcusConfig.PATH_SEPARATOR);
        return replace.endsWith("*") ? replace.substring(0, replace.length() - 1).concat(".+") : replace;
    }
}
