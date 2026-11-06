package com.google.zxing.datamatrix.decoder;

import com.amazon.deecomms.common.Constants;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.FormatException;
import com.google.zxing.common.BitSource;
import com.google.zxing.common.ECIStringBuilder;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.Set;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import org.objectweb.asm.signature.SignatureVisitor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
final class DecodedBitStreamParser {
    private static final char[] C40_BASIC_SET_CHARS = {'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO};
    private static final char[] C40_SHIFT2_SET_CHARS;
    private static final char[] TEXT_BASIC_SET_CHARS;
    private static final char[] TEXT_SHIFT2_SET_CHARS;
    private static final char[] TEXT_SHIFT3_SET_CHARS;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    /* renamed from: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode;

        static {
            int[] iArr = new int[Mode.values().length];
            $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode = iArr;
            try {
                iArr[Mode.C40_ENCODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.TEXT_ENCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.ANSIX12_ENCODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.EDIFACT_ENCODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.BASE256_ENCODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode[Mode.ECI_ENCODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum Mode {
        PAD_ENCODE,
        ASCII_ENCODE,
        C40_ENCODE,
        TEXT_ENCODE,
        ANSIX12_ENCODE,
        EDIFACT_ENCODE,
        BASE256_ENCODE,
        ECI_ENCODE
    }

    static {
        char[] cArr = {'!', '\"', '#', '$', '%', Typography.amp, '\'', '(', ')', '*', SignatureVisitor.EXTENDS, AbstractJsonLexerKt.COMMA, '-', '.', '/', AbstractJsonLexerKt.COLON, ';', Typography.less, '=', Typography.greater, Constants.DEFAULT_IMAGE_CHAR, '@', AbstractJsonLexerKt.BEGIN_LIST, '\\', AbstractJsonLexerKt.END_LIST, '^', '_'};
        C40_SHIFT2_SET_CHARS = cArr;
        TEXT_BASIC_SET_CHARS = new char[]{'*', '*', '*', ' ', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z'};
        TEXT_SHIFT2_SET_CHARS = cArr;
        TEXT_SHIFT3_SET_CHARS = new char[]{'`', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, AbstractJsonLexerKt.BEGIN_OBJ, '|', AbstractJsonLexerKt.END_OBJ, JsonPointer.ESC, 127};
    }

    private DecodedBitStreamParser() {
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.zxing.common.DecoderResult decode(byte[] r17) throws com.google.zxing.FormatException {
        /*
            r0 = 5
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 4
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            com.google.zxing.common.BitSource r4 = new com.google.zxing.common.BitSource
            r6 = r17
            r4.<init>(r6)
            com.google.zxing.common.ECIStringBuilder r5 = new com.google.zxing.common.ECIStringBuilder
            r7 = 100
            r5.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r8 = 0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r7.<init>(r8)
            java.util.ArrayList r10 = new java.util.ArrayList
            r11 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r10.<init>(r11)
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r13 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
            java.util.HashSet r14 = new java.util.HashSet
            r14.<init>()
        L33:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r15 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.ASCII_ENCODE
            if (r13 != r15) goto L3c
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r13 = decodeAsciiSegment(r4, r5, r7, r14)
            goto L65
        L3c:
            int[] r16 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.AnonymousClass1.$SwitchMap$com$google$zxing$datamatrix$decoder$DecodedBitStreamParser$Mode
            int r13 = r13.ordinal()
            r13 = r16[r13]
            switch(r13) {
                case 1: goto L61;
                case 2: goto L5d;
                case 3: goto L59;
                case 4: goto L55;
                case 5: goto L51;
                case 6: goto L4c;
                default: goto L47;
            }
        L47:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.getFormatInstance()
            throw r0
        L4c:
            decodeECISegment(r4, r5)
            r8 = r11
            goto L64
        L51:
            decodeBase256Segment(r4, r5, r10)
            goto L64
        L55:
            decodeEdifactSegment(r4, r5)
            goto L64
        L59:
            decodeAnsiX12Segment(r4, r5)
            goto L64
        L5d:
            decodeTextSegment(r4, r5, r14)
            goto L64
        L61:
            decodeC40Segment(r4, r5, r14)
        L64:
            r13 = r15
        L65:
            com.google.zxing.datamatrix.decoder.DecodedBitStreamParser$Mode r15 = com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.Mode.PAD_ENCODE
            if (r13 == r15) goto L6f
            int r15 = r4.available()
            if (r15 > 0) goto L33
        L6f:
            int r4 = r7.length()
            if (r4 <= 0) goto L78
            r5.appendCharacters(r7)
        L78:
            if (r8 == 0) goto L99
            boolean r4 = r14.contains(r9)
            if (r4 != 0) goto L95
            boolean r3 = r14.contains(r3)
            if (r3 == 0) goto L87
            goto L95
        L87:
            boolean r0 = r14.contains(r12)
            if (r0 != 0) goto L97
            boolean r0 = r14.contains(r1)
            if (r0 == 0) goto L94
            goto L97
        L94:
            r0 = r2
        L95:
            r1 = r5
            goto Lba
        L97:
            r0 = 6
            goto L95
        L99:
            boolean r0 = r14.contains(r9)
            if (r0 != 0) goto Lb8
            boolean r0 = r14.contains(r3)
            if (r0 == 0) goto La6
            goto Lb8
        La6:
            boolean r0 = r14.contains(r12)
            if (r0 != 0) goto Lb6
            boolean r0 = r14.contains(r1)
            if (r0 == 0) goto Lb3
            goto Lb6
        Lb3:
            r1 = r5
            r0 = r11
            goto Lba
        Lb6:
            r0 = 3
            goto L95
        Lb8:
            r0 = 2
            goto L95
        Lba:
            com.google.zxing.common.DecoderResult r5 = new com.google.zxing.common.DecoderResult
            java.lang.String r7 = r1.toString()
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto Lc7
            r10 = 0
        Lc7:
            r8 = r10
            r9 = 0
            r10 = r0
            r5.<init>(r6, r7, r8, r9, r10)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.datamatrix.decoder.DecodedBitStreamParser.decode(byte[]):com.google.zxing.common.DecoderResult");
    }

    private static void decodeAnsiX12Segment(BitSource bitSource, ECIStringBuilder eCIStringBuilder) throws FormatException {
        int readBits;
        int[] iArr = new int[3];
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i = 0; i < 3; i++) {
                int i2 = iArr[i];
                if (i2 == 0) {
                    eCIStringBuilder.append('\r');
                } else if (i2 == 1) {
                    eCIStringBuilder.append('*');
                } else if (i2 == 2) {
                    eCIStringBuilder.append(Typography.greater);
                } else if (i2 == 3) {
                    eCIStringBuilder.append(' ');
                } else if (i2 < 14) {
                    eCIStringBuilder.append((char) (i2 + 44));
                } else {
                    if (i2 >= 40) {
                        throw FormatException.getFormatInstance();
                    }
                    eCIStringBuilder.append((char) (i2 + 51));
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static Mode decodeAsciiSegment(BitSource bitSource, ECIStringBuilder eCIStringBuilder, StringBuilder sb, Set<Integer> set) throws FormatException {
        boolean z = false;
        do {
            int readBits = bitSource.readBits(8);
            if (readBits == 0) {
                throw FormatException.getFormatInstance();
            }
            if (readBits > 128) {
                if (readBits != 129) {
                    if (readBits > 229) {
                        switch (readBits) {
                            case 230:
                                return Mode.C40_ENCODE;
                            case 231:
                                return Mode.BASE256_ENCODE;
                            case 232:
                                set.add(Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                                break;
                            case 233:
                            case FTPReply.SECURITY_DATA_EXCHANGE_COMPLETE /* 234 */:
                                break;
                            case 235:
                                z = true;
                                break;
                            case TelnetCommand.EOF /* 236 */:
                                eCIStringBuilder.append("[)>\u001e05\u001d");
                                sb.insert(0, "\u001e\u0004");
                                break;
                            case TelnetCommand.SUSP /* 237 */:
                                eCIStringBuilder.append("[)>\u001e06\u001d");
                                sb.insert(0, "\u001e\u0004");
                                break;
                            case TelnetCommand.ABORT /* 238 */:
                                return Mode.ANSIX12_ENCODE;
                            case TelnetCommand.EOR /* 239 */:
                                return Mode.TEXT_ENCODE;
                            case 240:
                                return Mode.EDIFACT_ENCODE;
                            case TelnetCommand.NOP /* 241 */:
                                return Mode.ECI_ENCODE;
                            default:
                                if (readBits != 254 || bitSource.available() != 0) {
                                    throw FormatException.getFormatInstance();
                                }
                                break;
                        }
                    } else {
                        int i = readBits - 130;
                        if (i < 10) {
                            eCIStringBuilder.append('0');
                        }
                        eCIStringBuilder.append(i);
                    }
                } else {
                    return Mode.PAD_ENCODE;
                }
            } else {
                if (z) {
                    readBits += 128;
                }
                eCIStringBuilder.append((char) (readBits - 1));
                return Mode.ASCII_ENCODE;
            }
        } while (bitSource.available() > 0);
        return Mode.ASCII_ENCODE;
    }

    private static void decodeBase256Segment(BitSource bitSource, ECIStringBuilder eCIStringBuilder, Collection<byte[]> collection) throws FormatException {
        int byteOffset = bitSource.getByteOffset();
        int i = byteOffset + 2;
        int unrandomize255State = unrandomize255State(bitSource.readBits(8), byteOffset + 1);
        if (unrandomize255State == 0) {
            unrandomize255State = bitSource.available() / 8;
        } else if (unrandomize255State >= 250) {
            unrandomize255State = ((unrandomize255State - 249) * 250) + unrandomize255State(bitSource.readBits(8), i);
            i = byteOffset + 3;
        }
        if (unrandomize255State < 0) {
            throw FormatException.getFormatInstance();
        }
        byte[] bArr = new byte[unrandomize255State];
        int i2 = 0;
        while (i2 < unrandomize255State) {
            if (bitSource.available() < 8) {
                throw FormatException.getFormatInstance();
            }
            bArr[i2] = (byte) unrandomize255State(bitSource.readBits(8), i);
            i2++;
            i++;
        }
        collection.add(bArr);
        eCIStringBuilder.append(new String(bArr, StandardCharsets.ISO_8859_1));
    }

    private static void decodeC40Segment(BitSource bitSource, ECIStringBuilder eCIStringBuilder, Set<Integer> set) throws FormatException {
        int readBits;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = C40_SHIFT2_SET_CHARS;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    eCIStringBuilder.append((char) (c + 128));
                                    z = false;
                                } else {
                                    eCIStringBuilder.append(c);
                                }
                            } else if (i3 == 27) {
                                set.add(Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                            } else {
                                if (i3 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z = true;
                            }
                            i = 0;
                        } else {
                            if (i != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            if (z) {
                                eCIStringBuilder.append((char) (i3 + 224));
                                z = false;
                                i = 0;
                            } else {
                                eCIStringBuilder.append((char) (i3 + 96));
                                i = 0;
                            }
                        }
                    } else if (z) {
                        eCIStringBuilder.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        eCIStringBuilder.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr2 = C40_BASIC_SET_CHARS;
                    if (i3 >= cArr2.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c2 = cArr2[i3];
                    if (z) {
                        eCIStringBuilder.append((char) (c2 + 128));
                        z = false;
                    } else {
                        eCIStringBuilder.append(c2);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeECISegment(BitSource bitSource, ECIStringBuilder eCIStringBuilder) throws FormatException {
        if (bitSource.available() < 8) {
            throw FormatException.getFormatInstance();
        }
        int readBits = bitSource.readBits(8);
        if (readBits <= 127) {
            eCIStringBuilder.appendECI(readBits - 1);
        }
    }

    private static void decodeEdifactSegment(BitSource bitSource, ECIStringBuilder eCIStringBuilder) {
        while (bitSource.available() > 16) {
            for (int i = 0; i < 4; i++) {
                int readBits = bitSource.readBits(6);
                if (readBits == 31) {
                    int bitOffset = 8 - bitSource.getBitOffset();
                    if (bitOffset != 8) {
                        bitSource.readBits(bitOffset);
                        return;
                    }
                    return;
                }
                if ((readBits & 32) == 0) {
                    readBits |= 64;
                }
                eCIStringBuilder.append((char) readBits);
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void decodeTextSegment(BitSource bitSource, ECIStringBuilder eCIStringBuilder, Set<Integer> set) throws FormatException {
        int readBits;
        int[] iArr = new int[3];
        boolean z = false;
        int i = 0;
        while (bitSource.available() != 8 && (readBits = bitSource.readBits(8)) != 254) {
            parseTwoBytes(readBits, bitSource.readBits(8), iArr);
            for (int i2 = 0; i2 < 3; i2++) {
                int i3 = iArr[i2];
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            char[] cArr = TEXT_SHIFT2_SET_CHARS;
                            if (i3 < cArr.length) {
                                char c = cArr[i3];
                                if (z) {
                                    eCIStringBuilder.append((char) (c + 128));
                                    z = false;
                                } else {
                                    eCIStringBuilder.append(c);
                                }
                            } else if (i3 == 27) {
                                set.add(Integer.valueOf(eCIStringBuilder.length()));
                                eCIStringBuilder.append((char) 29);
                            } else {
                                if (i3 != 30) {
                                    throw FormatException.getFormatInstance();
                                }
                                z = true;
                            }
                            i = 0;
                        } else {
                            if (i != 3) {
                                throw FormatException.getFormatInstance();
                            }
                            char[] cArr2 = TEXT_SHIFT3_SET_CHARS;
                            if (i3 >= cArr2.length) {
                                throw FormatException.getFormatInstance();
                            }
                            char c2 = cArr2[i3];
                            if (z) {
                                eCIStringBuilder.append((char) (c2 + 128));
                                z = false;
                                i = 0;
                            } else {
                                eCIStringBuilder.append(c2);
                                i = 0;
                            }
                        }
                    } else if (z) {
                        eCIStringBuilder.append((char) (i3 + 128));
                        z = false;
                        i = 0;
                    } else {
                        eCIStringBuilder.append((char) i3);
                        i = 0;
                    }
                } else if (i3 < 3) {
                    i = i3 + 1;
                } else {
                    char[] cArr3 = TEXT_BASIC_SET_CHARS;
                    if (i3 >= cArr3.length) {
                        throw FormatException.getFormatInstance();
                    }
                    char c3 = cArr3[i3];
                    if (z) {
                        eCIStringBuilder.append((char) (c3 + 128));
                        z = false;
                    } else {
                        eCIStringBuilder.append(c3);
                    }
                }
            }
            if (bitSource.available() <= 0) {
                return;
            }
        }
    }

    private static void parseTwoBytes(int i, int i2, int[] iArr) {
        int i3 = ((i << 8) + i2) - 1;
        int i4 = i3 / 1600;
        iArr[0] = i4;
        int i5 = i3 - (i4 * 1600);
        int i6 = i5 / 40;
        iArr[1] = i6;
        iArr[2] = i5 - (i6 * 40);
    }

    private static int unrandomize255State(int i, int i2) {
        int i3 = i - (((i2 * 149) % 255) + 1);
        return i3 >= 0 ? i3 : i3 + 256;
    }
}
