package org.openjdk.javax.lang.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.deecomms.calling.incallcommands.constants.CommsFocusConstants;
import com.amazon.deecomms.remoteConfig.ArcusConfig;
import com.amazon.leapfrogmapgl.indoor.RoadProbe;
import com.amazon.tarazed.logging.TarazedLogFormatter;
import com.facebook.hermes.intl.Constants;
import io.ktor.client.utils.CacheControl;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.text.lookup.StringLookupFactory;
import org.jetbrains.kotlin.library.KotlinLibraryKt;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public enum SourceVersion {
    RELEASE_0,
    RELEASE_1,
    RELEASE_2,
    RELEASE_3,
    RELEASE_4,
    RELEASE_5,
    RELEASE_6,
    RELEASE_7,
    RELEASE_8,
    RELEASE_9;

    private static final SourceVersion latestSupported = getLatestSupported();

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0042, code lost:
    
        if (r0.equals("9") != false) goto L23;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static org.openjdk.javax.lang.model.SourceVersion getLatestSupported() {
        /*
            java.lang.String r0 = "java.specification.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L47
            int r1 = r0.hashCode()     // Catch: java.lang.SecurityException -> L47
            r2 = 57
            if (r1 == r2) goto L3c
            switch(r1) {
                case 48569: goto L31;
                case 48570: goto L26;
                case 48571: goto L1b;
                case 48572: goto L12;
                default: goto L11;
            }     // Catch: java.lang.SecurityException -> L47
        L11:
            goto L47
        L12:
            java.lang.String r1 = "1.9"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.SecurityException -> L47
            if (r0 == 0) goto L47
            goto L44
        L1b:
            java.lang.String r1 = "1.8"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.SecurityException -> L47
            if (r0 == 0) goto L47
            org.openjdk.javax.lang.model.SourceVersion r0 = org.openjdk.javax.lang.model.SourceVersion.RELEASE_8     // Catch: java.lang.SecurityException -> L47
            return r0
        L26:
            java.lang.String r1 = "1.7"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.SecurityException -> L47
            if (r0 == 0) goto L47
            org.openjdk.javax.lang.model.SourceVersion r0 = org.openjdk.javax.lang.model.SourceVersion.RELEASE_7     // Catch: java.lang.SecurityException -> L47
            return r0
        L31:
            java.lang.String r1 = "1.6"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.SecurityException -> L47
            if (r0 == 0) goto L47
            org.openjdk.javax.lang.model.SourceVersion r0 = org.openjdk.javax.lang.model.SourceVersion.RELEASE_6     // Catch: java.lang.SecurityException -> L47
            return r0
        L3c:
            java.lang.String r1 = "9"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.SecurityException -> L47
            if (r0 == 0) goto L47
        L44:
            org.openjdk.javax.lang.model.SourceVersion r0 = org.openjdk.javax.lang.model.SourceVersion.RELEASE_9     // Catch: java.lang.SecurityException -> L47
            return r0
        L47:
            org.openjdk.javax.lang.model.SourceVersion r0 = org.openjdk.javax.lang.model.SourceVersion.RELEASE_5
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.openjdk.javax.lang.model.SourceVersion.getLatestSupported():org.openjdk.javax.lang.model.SourceVersion");
    }

    public static boolean isIdentifier(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        if (charSequence2.length() == 0) {
            return false;
        }
        int codePointAt = charSequence2.codePointAt(0);
        if (!Character.isJavaIdentifierStart(codePointAt)) {
            return false;
        }
        int charCount = Character.charCount(codePointAt);
        while (charCount < charSequence2.length()) {
            int codePointAt2 = charSequence2.codePointAt(charCount);
            if (!Character.isJavaIdentifierPart(codePointAt2)) {
                return false;
            }
            charCount += Character.charCount(codePointAt2);
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean isKeyword(CharSequence charSequence, SourceVersion sourceVersion) {
        String charSequence2 = charSequence.toString();
        charSequence2.getClass();
        char c = 65535;
        switch (charSequence2.hashCode()) {
            case -1888027236:
                if (charSequence2.equals("volatile")) {
                    c = 0;
                    break;
                }
                break;
            case -1466596076:
                if (charSequence2.equals("synchronized")) {
                    c = 1;
                    break;
                }
                break;
            case -1408208058:
                if (charSequence2.equals("assert")) {
                    c = 2;
                    break;
                }
                break;
            case -1325958191:
                if (charSequence2.equals("double")) {
                    c = 3;
                    break;
                }
                break;
            case -1305664359:
                if (charSequence2.equals("extends")) {
                    c = 4;
                    break;
                }
                break;
            case -1184795739:
                if (charSequence2.equals("import")) {
                    c = 5;
                    break;
                }
                break;
            case -1052618729:
                if (charSequence2.equals("native")) {
                    c = 6;
                    break;
                }
                break;
            case -977423767:
                if (charSequence2.equals(CacheControl.PUBLIC)) {
                    c = 7;
                    break;
                }
                break;
            case -934396624:
                if (charSequence2.equals("return")) {
                    c = '\b';
                    break;
                }
                break;
            case -915384400:
                if (charSequence2.equals("implements")) {
                    c = '\t';
                    break;
                }
                break;
            case -892481938:
                if (charSequence2.equals("static")) {
                    c = '\n';
                    break;
                }
                break;
            case -889473228:
                if (charSequence2.equals("switch")) {
                    c = 11;
                    break;
                }
                break;
            case -874432947:
                if (charSequence2.equals("throws")) {
                    c = '\f';
                    break;
                }
                break;
            case -853259901:
                if (charSequence2.equals("finally")) {
                    c = '\r';
                    break;
                }
                break;
            case -807062458:
                if (charSequence2.equals(KotlinLibraryKt.KLIB_PROPERTY_PACKAGE)) {
                    c = 14;
                    break;
                }
                break;
            case -608539730:
                if (charSequence2.equals("protected")) {
                    c = 15;
                    break;
                }
                break;
            case -567202649:
                if (charSequence2.equals("continue")) {
                    c = 16;
                    break;
                }
                break;
            case -314497661:
                if (charSequence2.equals(CacheControl.PRIVATE)) {
                    c = 17;
                    break;
                }
                break;
            case 95:
                if (charSequence2.equals("_")) {
                    c = 18;
                    break;
                }
                break;
            case 3211:
                if (charSequence2.equals("do")) {
                    c = 19;
                    break;
                }
                break;
            case 3357:
                if (charSequence2.equals("if")) {
                    c = 20;
                    break;
                }
                break;
            case 101577:
                if (charSequence2.equals("for")) {
                    c = 21;
                    break;
                }
                break;
            case 104431:
                if (charSequence2.equals("int")) {
                    c = 22;
                    break;
                }
                break;
            case 108960:
                if (charSequence2.equals("new")) {
                    c = 23;
                    break;
                }
                break;
            case 115131:
                if (charSequence2.equals("try")) {
                    c = 24;
                    break;
                }
                break;
            case 3039496:
                if (charSequence2.equals("byte")) {
                    c = 25;
                    break;
                }
                break;
            case 3046192:
                if (charSequence2.equals(Constants.SENSITIVITY_CASE)) {
                    c = 26;
                    break;
                }
                break;
            case 3052374:
                if (charSequence2.equals("char")) {
                    c = 27;
                    break;
                }
                break;
            case 3116345:
                if (charSequence2.equals("else")) {
                    c = TarazedLogFormatter.FILE_SEPARATOR;
                    break;
                }
                break;
            case 3118337:
                if (charSequence2.equals("enum")) {
                    c = 29;
                    break;
                }
                break;
            case 3178851:
                if (charSequence2.equals("goto")) {
                    c = 30;
                    break;
                }
                break;
            case 3327612:
                if (charSequence2.equals("long")) {
                    c = 31;
                    break;
                }
                break;
            case 3392903:
                if (charSequence2.equals("null")) {
                    c = ' ';
                    break;
                }
                break;
            case 3559070:
                if (charSequence2.equals("this")) {
                    c = '!';
                    break;
                }
                break;
            case 3569038:
                if (charSequence2.equals("true")) {
                    c = '\"';
                    break;
                }
                break;
            case 3625364:
                if (charSequence2.equals("void")) {
                    c = '#';
                    break;
                }
                break;
            case 64711720:
                if (charSequence2.equals(TypedValues.Custom.S_BOOLEAN)) {
                    c = '$';
                    break;
                }
                break;
            case 94001407:
                if (charSequence2.equals("break")) {
                    c = '%';
                    break;
                }
                break;
            case 94432955:
                if (charSequence2.equals("catch")) {
                    c = Typography.amp;
                    break;
                }
                break;
            case 94742904:
                if (charSequence2.equals(RoadProbe.CLASS_PROPERTY)) {
                    c = '\'';
                    break;
                }
                break;
            case 94844771:
                if (charSequence2.equals(StringLookupFactory.KEY_CONST)) {
                    c = '(';
                    break;
                }
                break;
            case 97196323:
                if (charSequence2.equals("false")) {
                    c = ')';
                    break;
                }
                break;
            case 97436022:
                if (charSequence2.equals("final")) {
                    c = '*';
                    break;
                }
                break;
            case 97526364:
                if (charSequence2.equals(TypedValues.Custom.S_FLOAT)) {
                    c = SignatureVisitor.EXTENDS;
                    break;
                }
                break;
            case 109413500:
                if (charSequence2.equals("short")) {
                    c = AbstractJsonLexerKt.COMMA;
                    break;
                }
                break;
            case 109801339:
                if (charSequence2.equals("super")) {
                    c = '-';
                    break;
                }
                break;
            case 110339814:
                if (charSequence2.equals("throw")) {
                    c = '.';
                    break;
                }
                break;
            case 113101617:
                if (charSequence2.equals("while")) {
                    c = '/';
                    break;
                }
                break;
            case 502623545:
                if (charSequence2.equals(CommsFocusConstants.INTERFACE)) {
                    c = '0';
                    break;
                }
                break;
            case 902025516:
                if (charSequence2.equals("instanceof")) {
                    c = '1';
                    break;
                }
                break;
            case 1052746378:
                if (charSequence2.equals("transient")) {
                    c = '2';
                    break;
                }
                break;
            case 1544803905:
                if (charSequence2.equals("default")) {
                    c = '3';
                    break;
                }
                break;
            case 1732898850:
                if (charSequence2.equals("abstract")) {
                    c = '4';
                    break;
                }
                break;
            case 1794694483:
                if (charSequence2.equals("strictfp")) {
                    c = '5';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 30:
            case 31:
            case ' ':
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
            case '&':
            case '\'':
            case '(':
            case ')':
            case '*':
            case '+':
            case ',':
            case '-':
            case '.':
            case '/':
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
                return true;
            case 2:
                return sourceVersion.compareTo(RELEASE_4) >= 0;
            case 18:
                return sourceVersion.compareTo(RELEASE_9) >= 0;
            case 29:
                return sourceVersion.compareTo(RELEASE_5) >= 0;
            case '5':
                return sourceVersion.compareTo(RELEASE_2) >= 0;
            default:
                return false;
        }
    }

    public static boolean isName(CharSequence charSequence, SourceVersion sourceVersion) {
        for (String str : charSequence.toString().split(ArcusConfig.PATH_SEPARATOR, -1)) {
            if (!isIdentifier(str) || isKeyword(str, sourceVersion)) {
                return false;
            }
        }
        return true;
    }

    public static SourceVersion latest() {
        return RELEASE_9;
    }

    public static SourceVersion latestSupported() {
        return latestSupported;
    }

    public static boolean isName(CharSequence charSequence) {
        return isName(charSequence, latest());
    }

    public static boolean isKeyword(CharSequence charSequence) {
        return isKeyword(charSequence, latest());
    }
}
