package com.squareup.kotlinpoet;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.alexa.voice.utils.RouteHelper;
import com.amazon.deecomms.calling.incallcommands.constants.CommsFocusConstants;
import com.amazon.deecomms.common.Constants;
import com.amazon.deecomms.common.metrics.MetricKeys;
import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import com.dee.app.metrics.MetricsConstants;
import com.squareup.kotlinpoet.CodeBlock;
import defpackage.a$$ExternalSyntheticOutline0;
import io.ktor.client.utils.CacheControl;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.kotlin.library.KotlinLibraryKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\b\u0004\u001a\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0000\u001a/\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001c\"\u00020\u001aH\u0000¢\u0006\u0002\u0010\u001d\u001a/\u0010\u001e\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00052\u0012\u0010\u001f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001a0\u001c\"\u00020\u001aH\u0000¢\u0006\u0002\u0010\u001d\u001a$\u0010 \u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00072\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\nH\u0000\u001a\f\u0010$\u001a\u00020\n*\u00020\u0007H\u0002\u001a1\u0010%\u001a\u00020\n\"\u0004\b\u0000\u0010&*\b\u0012\u0004\u0012\u0002H&0'2\u0012\u0010(\u001a\n\u0012\u0006\b\u0001\u0012\u0002H&0\u001c\"\u0002H&H\u0000¢\u0006\u0002\u0010)\u001a\f\u0010*\u001a\u00020+*\u00020+H\u0000\u001a\f\u0010,\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a\f\u0010-\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a\f\u0010.\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a\u0016\u0010/\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u00100\u001a\u00020\nH\u0000\u001a\f\u00101\u001a\u00020\u0007*\u00020\u0007H\u0002\u001a\u0016\u00102\u001a\u00020\u0007*\u00020\u00072\b\b\u0002\u00103\u001a\u00020\u0001H\u0000\u001a\f\u00104\u001a\u00020\u0018*\u00020\u0007H\u0002\u001aW\u00105\u001a\u00020\n\"\u0004\b\u0000\u0010&*\u0002H&2\u0006\u00106\u001a\u0002H&2\u0006\u00107\u001a\u0002H&2\n\b\u0002\u00108\u001a\u0004\u0018\u0001H&2\n\b\u0002\u00109\u001a\u0004\u0018\u0001H&2\n\b\u0002\u0010:\u001a\u0004\u0018\u0001H&2\n\b\u0002\u0010;\u001a\u0004\u0018\u0001H&H\u0000¢\u0006\u0002\u0010<\u001a+\u0010=\u001a\b\u0012\u0004\u0012\u0002H&0\u0005\"\u0010\b\u0000\u0010&\u0018\u0001*\b\u0012\u0004\u0012\u0002H&0>*\b\u0012\u0004\u0012\u0002H&0'H\u0080\b\u001a\u001e\u0010?\u001a\b\u0012\u0004\u0012\u0002H&0@\"\u0004\b\u0000\u0010&*\b\u0012\u0004\u0012\u0002H&0'H\u0000\u001a0\u0010A\u001a\u000e\u0012\u0004\u0012\u0002HC\u0012\u0004\u0012\u0002HD0B\"\u0004\b\u0000\u0010C\"\u0004\b\u0001\u0010D*\u000e\u0012\u0004\u0012\u0002HC\u0012\u0004\u0012\u0002HD0BH\u0000\u001a\u001e\u0010E\u001a\b\u0012\u0004\u0012\u0002H&0\u0005\"\u0004\b\u0000\u0010&*\b\u0012\u0004\u0012\u0002H&0'H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\t\u001a\u00020\n*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\r\u001a\u00020\n*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f\"\u0018\u0010\u000f\u001a\u00020\n*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f\"\u0018\u0010\u0010\u001a\u00020\n*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0018\u0010\u0012\u001a\u00020\n*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\f¨\u0006F"}, d2 = {"ALLOWED_CHARACTER", "", "IDENTIFIER_REGEX", "Lkotlin/text/Regex;", "ILLEGAL_CHARACTERS_TO_ESCAPE", "", "KEYWORDS", "", "UNDERSCORE_CHARACTER", "allCharactersAreUnderscore", "", "getAllCharactersAreUnderscore", "(Ljava/lang/String;)Z", "hasAllowedCharacters", "getHasAllowedCharacters", "isIdentifier", "isIsoControl", "(C)Z", "isKeyword", "characterLiteralWithoutSingleQuotes", "c", "escapeCharacterLiterals", CmcdData.Factory.STREAMING_FORMAT_SS, "requireNoneOf", "", "modifiers", "Lcom/squareup/kotlinpoet/KModifier;", "forbidden", "", "(Ljava/util/Set;[Lcom/squareup/kotlinpoet/KModifier;)V", "requireNoneOrOneOf", "mutuallyExclusive", "stringLiteralWithQuotes", "value", "escapeDollarSign", "isConstantContext", "alreadyEscaped", "containsAnyOf", ExifInterface.GPS_DIRECTION_TRUE, "", "t", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "ensureEndsWithNewLine", "Lcom/squareup/kotlinpoet/CodeBlock;", "escapeIfAllCharactersAreUnderscore", "escapeIfHasAllowedCharacters", "escapeIfKeyword", "escapeIfNecessary", "validate", "escapeIfNotJavaIdentifier", "escapeSegmentsIfNecessary", "delimiter", "failIfEscapeInvalid", "isOneOf", "t1", "t2", "t3", "t4", "t5", "t6", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "toEnumSet", "", "toImmutableList", "", "toImmutableMap", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "toImmutableSet", "kotlinpoet"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class UtilKt {
    private static final char ALLOWED_CHARACTER = '$';
    private static final char UNDERSCORE_CHARACTER = '_';

    @NotNull
    private static final Regex IDENTIFIER_REGEX = new Regex("((\\p{gc=Lu}+|\\p{gc=Ll}+|\\p{gc=Lt}+|\\p{gc=Lm}+|\\p{gc=Lo}+|\\p{gc=Nl}+)+\\d*\\p{gc=Lu}*\\p{gc=Ll}*\\p{gc=Lt}*\\p{gc=Lm}*\\p{gc=Lo}*\\p{gc=Nl}*)|(`[^\n\r`]+`)");

    @NotNull
    private static final Set<String> KEYWORDS = SetsKt.setOf((Object[]) new String[]{"as", "break", RoadProbe.CLASS_PROPERTY, "continue", "do", "else", "false", "for", "fun", "if", "in", CommsFocusConstants.INTERFACE, "is", "null", "object", KotlinLibraryKt.KLIB_PROPERTY_PACKAGE, "return", "super", "this", "throw", "true", "try", "typealias", "typeof", MetricKeys.NON_EMPTY_VALUE, "var", "when", "while", "by", "catch", "constructor", "delegate", "dynamic", "field", "file", "finally", MetricsConstants.Method.CACHE_GET, "import", "init", "param", "property", Constants.BUNDLE_RECEIVER_TAG, "set", "setparam", "where", "actual", "abstract", "annotation", "companion", StringLookupFactory.KEY_CONST, "crossinline", "data", "enum", "expect", RouteHelper.ROUTE_ORIGIN_EXTERNAL, "final", "infix", "inline", "inner", "internal", "lateinit", "noinline", "open", "operator", "out", "override", CacheControl.PRIVATE, "protected", CacheControl.PUBLIC, "reified", "sealed", "suspend", "tailrec", "value", "vararg", "yield"});

    @NotNull
    private static final Set<Character> ILLEGAL_CHARACTERS_TO_ESCAPE = SetsKt.setOf((Object[]) new Character[]{'.', ';', Character.valueOf(AbstractJsonLexerKt.BEGIN_LIST), Character.valueOf(AbstractJsonLexerKt.END_LIST), '/', Character.valueOf(Typography.less), Character.valueOf(Typography.greater), Character.valueOf(AbstractJsonLexerKt.COLON), '\\'});

    private static final boolean alreadyEscaped(String str) {
        boolean startsWith$default;
        boolean endsWith$default;
        startsWith$default = StringsKt__StringsJVMKt.startsWith$default(str, "`", false, 2, null);
        if (!startsWith$default) {
            return false;
        }
        endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, "`", false, 2, null);
        return endsWith$default;
    }

    @NotNull
    public static final String characterLiteralWithoutSingleQuotes(char c) {
        if (c == '\b') {
            return "\\b";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\"') {
            return DeviceConfigConstants.DOUBLE_QUOTE;
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c == '\\') {
            return "\\\\";
        }
        if (!isIsoControl(c)) {
            return String.valueOf(c);
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(c)}, 1));
    }

    public static final <T> boolean containsAnyOf(@NotNull Collection<? extends T> collection, @NotNull T... tArr) {
        collection.getClass();
        tArr.getClass();
        int length = tArr.length;
        int i = 0;
        while (i < length) {
            T t = tArr[i];
            i++;
            if (collection.contains(t)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final CodeBlock ensureEndsWithNewLine(@NotNull CodeBlock codeBlock) {
        codeBlock.getClass();
        if (codeBlock.isEmpty()) {
            return codeBlock;
        }
        CodeBlock.Builder builder = codeBlock.toBuilder();
        String str = (String) CollectionsKt.last((List) codeBlock.trim$kotlinpoet().getFormatParts$kotlinpoet());
        if (!CodeBlock.Companion.isPlaceholder$kotlinpoet(str) || builder.getArgs$kotlinpoet().isEmpty()) {
            builder.getFormatParts$kotlinpoet().set(builder.getFormatParts$kotlinpoet().lastIndexOf(str), StringsKt.trimEnd(str, '\n'));
            builder.getFormatParts$kotlinpoet().add("\n");
        } else {
            Object last = CollectionsKt.last((List<? extends Object>) builder.getArgs$kotlinpoet());
            if (last instanceof String) {
                builder.getArgs$kotlinpoet().set(builder.getArgs$kotlinpoet().size() - 1, Intrinsics.stringPlus(StringsKt.trimEnd((String) last, '\n'), "\n"));
            }
        }
        return builder.build();
    }

    @NotNull
    public static final String escapeCharacterLiterals(@NotNull String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            i++;
            sb.append(characterLiteralWithoutSingleQuotes(charAt));
        }
        return sb.toString();
    }

    private static final String escapeIfAllCharactersAreUnderscore(String str) {
        return (!getAllCharactersAreUnderscore(str) || alreadyEscaped(str)) ? str : AppLaunchChecker$$ExternalSyntheticOutline0.m('`', "`", str);
    }

    private static final String escapeIfHasAllowedCharacters(String str) {
        return (!getHasAllowedCharacters(str) || alreadyEscaped(str)) ? str : AppLaunchChecker$$ExternalSyntheticOutline0.m('`', "`", str);
    }

    private static final String escapeIfKeyword(String str) {
        return (!isKeyword(str) || alreadyEscaped(str)) ? str : AppLaunchChecker$$ExternalSyntheticOutline0.m('`', "`", str);
    }

    @NotNull
    public static final String escapeIfNecessary(@NotNull String str, boolean z) {
        str.getClass();
        String escapeIfAllCharactersAreUnderscore = escapeIfAllCharactersAreUnderscore(escapeIfHasAllowedCharacters(escapeIfKeyword(escapeIfNotJavaIdentifier(str))));
        if (z) {
            failIfEscapeInvalid(escapeIfAllCharactersAreUnderscore);
        }
        return escapeIfAllCharactersAreUnderscore;
    }

    public static /* synthetic */ String escapeIfNecessary$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return escapeIfNecessary(str, z);
    }

    private static final String escapeIfNotJavaIdentifier(String str) {
        String replace$default;
        if (Character.isJavaIdentifierStart(StringsKt.first(str))) {
            String drop = StringsKt.drop(str, 1);
            int i = 0;
            while (i < drop.length()) {
                char charAt = drop.charAt(i);
                i++;
                if (!Character.isJavaIdentifierPart(charAt)) {
                }
            }
            return str;
        }
        if (alreadyEscaped(str)) {
            return str;
        }
        replace$default = StringsKt__StringsJVMKt.replace$default("`" + str + '`', ' ', Typography.middleDot, false, 4, (Object) null);
        return replace$default;
    }

    @NotNull
    public static final String escapeSegmentsIfNecessary(@NotNull String str, char c) {
        List split$default;
        str.getClass();
        split$default = StringsKt__StringsKt.split$default(str, new char[]{c}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : split$default) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.joinToString$default(arrayList, String.valueOf(c), null, null, new Function1<String, CharSequence>() { // from class: com.squareup.kotlinpoet.UtilKt$escapeSegmentsIfNecessary$2
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull String str2) {
                str2.getClass();
                return UtilKt.escapeIfNecessary$default(str2, false, 1, null);
            }
        }, 30);
    }

    public static /* synthetic */ String escapeSegmentsIfNecessary$default(String str, char c, int i, Object obj) {
        if ((i & 1) != 0) {
            c = '.';
        }
        return escapeSegmentsIfNecessary(str, c);
    }

    private static final void failIfEscapeInvalid(String str) {
        Set set;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            Set<Character> set2 = ILLEGAL_CHARACTERS_TO_ESCAPE;
            if (set2.contains(Character.valueOf(charAt))) {
                StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Can't escape identifier ", str, " because it contains illegal characters: ");
                set = StringsKt___StringsKt.toSet(str);
                Buffer$$ExternalSyntheticBUOutline0.m(CollectionsKt.joinToString$default(CollectionsKt.intersect(set2, set), "", null, null, null, 62), m2m);
                return;
            }
        }
    }

    public static final boolean getAllCharactersAreUnderscore(@NotNull String str) {
        str.getClass();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            if (charAt != '_') {
                return false;
            }
        }
        return true;
    }

    public static final boolean getHasAllowedCharacters(@NotNull String str) {
        str.getClass();
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            if (charAt == '$') {
                return true;
            }
        }
        return false;
    }

    public static final boolean isIdentifier(@NotNull String str) {
        str.getClass();
        return IDENTIFIER_REGEX.matches(str);
    }

    private static final boolean isIsoControl(char c) {
        if (c < 0 || c >= ' ') {
            return 127 <= c && c < 160;
        }
        return true;
    }

    public static final boolean isKeyword(@NotNull String str) {
        str.getClass();
        return KEYWORDS.contains(str);
    }

    public static final <T> boolean isOneOf(T t, T t2, T t3, @Nullable T t4, @Nullable T t5, @Nullable T t6, @Nullable T t7) {
        return Intrinsics.areEqual(t, t2) || Intrinsics.areEqual(t, t3) || Intrinsics.areEqual(t, t4) || Intrinsics.areEqual(t, t5) || Intrinsics.areEqual(t, t6) || Intrinsics.areEqual(t, t7);
    }

    public static /* synthetic */ boolean isOneOf$default(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, Object obj8) {
        if ((i & 4) != 0) {
            obj4 = null;
        }
        if ((i & 8) != 0) {
            obj5 = null;
        }
        if ((i & 16) != 0) {
            obj6 = null;
        }
        if ((i & 32) != 0) {
            obj7 = null;
        }
        return isOneOf(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static final void requireNoneOf(@NotNull Set<? extends KModifier> set, @NotNull KModifier... kModifierArr) {
        set.getClass();
        kModifierArr.getClass();
        int length = kModifierArr.length;
        int i = 0;
        while (i < length) {
            KModifier kModifier = kModifierArr[i];
            i++;
            if (set.contains(kModifier)) {
                StringBuilder sb = new StringBuilder("modifiers ");
                sb.append(set);
                String arrays = Arrays.toString(kModifierArr);
                arrays.getClass();
                CodecsKt$$ExternalSyntheticBUOutline0.m((Object) " must contain none of ", (Object) arrays, sb);
                return;
            }
        }
    }

    public static final void requireNoneOrOneOf(@NotNull Set<? extends KModifier> set, @NotNull KModifier... kModifierArr) {
        set.getClass();
        kModifierArr.getClass();
        int length = kModifierArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            KModifier kModifier = kModifierArr[i];
            i++;
            if (set.contains(kModifier)) {
                i2++;
            }
        }
        if (i2 <= 1) {
            return;
        }
        StringBuilder sb = new StringBuilder("modifiers ");
        sb.append(set);
        String arrays = Arrays.toString(kModifierArr);
        arrays.getClass();
        CodecsKt$$ExternalSyntheticBUOutline0.m((Object) " must contain none or only one of ", (Object) arrays, sb);
    }

    @NotNull
    public static final String stringLiteralWithQuotes(@NotNull String str, boolean z, boolean z2) {
        boolean contains$default;
        boolean endsWith$default;
        boolean regionMatches$default;
        str.getClass();
        int i = 0;
        if (!z2) {
            contains$default = StringsKt__StringsKt.contains$default((CharSequence) str, '\n', false, 2, (Object) null);
            if (contains$default) {
                StringBuilder sb = new StringBuilder(str.length() + 32);
                sb.append("\"\"\"\n|");
                int i2 = 0;
                while (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    regionMatches$default = StringsKt__StringsJVMKt.regionMatches$default(str, i2, "\"\"\"", 0, 3, false, 16, (Object) null);
                    if (regionMatches$default) {
                        sb.append("\"\"${'\"'}");
                        i2 += 2;
                    } else if (charAt == '\n') {
                        sb.append("\n|");
                    } else if (charAt == '$' && z) {
                        sb.append("${'$'}");
                    } else {
                        sb.append(charAt);
                    }
                    i2++;
                }
                endsWith$default = StringsKt__StringsJVMKt.endsWith$default(str, "\n", false, 2, null);
                if (!endsWith$default) {
                    sb.append("\n");
                }
                sb.append("\"\"\".trimMargin()");
                return sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 32);
        if (z) {
            sb2.append('\"');
        } else {
            sb2.append("\"\"\"");
        }
        int length = str.length();
        while (i < length) {
            int i3 = i + 1;
            char charAt2 = str.charAt(i);
            if (charAt2 == '\'') {
                sb2.append("'");
            } else if (charAt2 == '\"' && z) {
                sb2.append("\\\"");
            } else if (charAt2 == '$' && z) {
                sb2.append("${'$'}");
            } else {
                sb2.append(characterLiteralWithoutSingleQuotes(charAt2));
            }
            i = i3;
        }
        if (z) {
            sb2.append('\"');
        } else {
            sb2.append("\"\"\"");
        }
        return sb2.toString();
    }

    public static /* synthetic */ String stringLiteralWithQuotes$default(String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return stringLiteralWithQuotes(str, z, z2);
    }

    public static final /* synthetic */ <T extends Enum<T>> Set<T> toEnumSet(Collection<? extends T> collection) {
        collection.getClass();
        Intrinsics.reifiedOperationMarker(5, ExifInterface.GPS_DIRECTION_TRUE);
        return new LinkedHashSet();
    }

    @NotNull
    public static final <T> List<T> toImmutableList(@NotNull Collection<? extends T> collection) {
        collection.getClass();
        List<T> unmodifiableList = Collections.unmodifiableList(new ArrayList(collection));
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    @NotNull
    public static final <K, V> Map<K, V> toImmutableMap(@NotNull Map<K, ? extends V> map) {
        map.getClass();
        Map<K, V> unmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    @NotNull
    public static final <T> Set<T> toImmutableSet(@NotNull Collection<? extends T> collection) {
        collection.getClass();
        Set<T> unmodifiableSet = Collections.unmodifiableSet(new LinkedHashSet(collection));
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }
}
