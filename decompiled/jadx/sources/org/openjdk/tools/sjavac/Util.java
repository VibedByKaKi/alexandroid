package org.openjdk.tools.sjavac;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Util {
    public static String cleanSubOptions(Set<String> set, String str) {
        StringBuilder sb = new StringBuilder();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            int indexOf = nextToken.indexOf(61);
            if (indexOf > 0) {
                String substring = nextToken.substring(0, indexOf);
                String substring2 = nextToken.substring(indexOf + 1);
                if (set.contains(substring)) {
                    if (sb.length() > 0) {
                        sb.append(AbstractJsonLexerKt.COMMA);
                    }
                    sb.append(substring + "=" + substring2);
                }
            }
        }
        return sb.toString();
    }

    public static boolean extractBooleanOption(String str, String str2, boolean z) {
        String extractStringOption = extractStringOption(str, str2);
        if ("true".equals(extractStringOption)) {
            return true;
        }
        if ("false".equals(extractStringOption)) {
            return false;
        }
        return z;
    }

    public static int extractIntOption(String str, String str2, int i) {
        int indexOf = str2.indexOf(str + "=");
        if (indexOf == -1) {
            return i;
        }
        int length = str.length() + 1 + indexOf;
        int indexOf2 = str2.indexOf(44, length);
        if (indexOf2 == -1) {
            indexOf2 = str2.length();
        }
        try {
            return Integer.parseInt(str2.substring(length, indexOf2));
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String extractStringOption(String str, String str2, String str3) {
        int indexOf = str2.indexOf(str + "=");
        if (indexOf == -1) {
            return str3;
        }
        int length = str.length() + 1 + indexOf;
        int indexOf2 = str2.indexOf(44, length);
        if (indexOf2 == -1) {
            indexOf2 = str2.length();
        }
        return str2.substring(length, indexOf2);
    }

    public static String fileSuffix(Path path) {
        String path2 = path.getFileName().toString();
        int indexOf = path2.indexOf(46);
        return indexOf == -1 ? "" : path2.substring(indexOf);
    }

    public static String findServerSettings(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("--server:")) {
                return str;
            }
        }
        return null;
    }

    public static Stream<String> getLines(String str) {
        return str.isEmpty() ? Stream.empty() : Stream.of((Object[]) str.split(Pattern.quote(System.lineSeparator())));
    }

    public static String getStackTrace(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static <I, T> Map<I, T> indexBy(Collection<? extends T> collection, Function<? super T, ? extends I> function) {
        return (Map) collection.stream().collect(Collectors.toMap(function, new Util$$ExternalSyntheticLambda0(0)));
    }

    public static <E> Set<E> intersection(Collection<? extends E> collection, Collection<? extends E> collection2) {
        HashSet hashSet = new HashSet(collection);
        hashSet.retainAll(collection2);
        return hashSet;
    }

    public static String justPackageName(String str) {
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            return str.substring(indexOf + 1);
        }
        Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("Expected ':' in package name (", str, MarkdownConstants.RIGHT_PARENTHESIS));
        return null;
    }

    public static String normalizeDriveLetter(String str) {
        if (str.length() > 2 && str.charAt(1) == ':') {
            return Character.toUpperCase(str.charAt(0)) + str.substring(1);
        }
        if (str.length() <= 3 || str.charAt(0) != '*' || str.charAt(2) != ':') {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str.substring(0, 1));
        sb.append(Character.toUpperCase(str.charAt(1)));
        return a$$ExternalSyntheticOutline0.m(str, 2, sb);
    }

    public static File pathToFile(Path path) {
        if (path == null) {
            return null;
        }
        return path.toFile();
    }

    public static String pkgNameOfClassName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return ":".concat(lastIndexOf == -1 ? "" : str.substring(0, lastIndexOf));
    }

    public static Set<String> set(String... strArr) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(Arrays.asList(strArr));
        return hashSet;
    }

    public static <E> Set<E> subtract(Set<? extends E> set, Set<? extends E> set2) {
        HashSet hashSet = new HashSet(set);
        hashSet.removeAll(set2);
        return hashSet;
    }

    public static String toFileSystemPath(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (str.charAt(0) == ':') {
            return str.substring(1).replace('.', File.separatorChar);
        }
        int indexOf = str.indexOf(58);
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str.substring(0, indexOf));
        char c = File.separatorChar;
        m.append(c);
        m.append(str.substring(indexOf + 1).replace('.', c));
        return m.toString();
    }

    public static <E> Set<E> union(Set<? extends E> set, Set<? extends E> set2) {
        HashSet hashSet = new HashSet();
        hashSet.addAll(set);
        hashSet.addAll(set2);
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$indexBy$0(Object obj) {
        return obj;
    }

    public static String extractStringOption(String str, String str2) {
        return extractStringOption(str, str2, null);
    }

    public static int extractIntOption(String str, String str2) {
        return extractIntOption(str, str2, 0);
    }
}
