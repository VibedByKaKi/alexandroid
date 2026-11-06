package kotlinx.io.core.internal;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.functions.Function1;
import kotlinx.io.core.IoBuffer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0001\u001aK\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\r\u001a\u00020\u00012$\u0010\u000e\u001a \b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u0010\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0001H\u0001\u001a\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0001H\u0002\u001a!\u0010!\u001a\u00020\t*\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0$H\u0080\b\u001a!\u0010&\u001a\u00020\u0001*\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\t0$H\u0087\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"HighSurrogateMagic", "", "MaxCodePoint", "MinHighSurrogate", "MinLowSurrogate", "MinSupplementary", "byteCountUtf8", "firstByte", "decodeUTF8LineLoopSuspend", "", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "limit", "nextChunk", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlinx/io/core/ByteReadPacketBase;", "", "(Ljava/lang/Appendable;ILkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "highSurrogate", "cp", "isBmpCodePoint", "isValidCodePoint", "codePoint", "lowSurrogate", "malformedByteCount", "", "byteCount", "malformedCodePoint", "value", "prematureEndOfStreamUtf", "size", "decodeASCII", "Lkotlinx/io/core/IoBuffer;", "consumer", "Lkotlin/Function1;", "", "decodeUTF8", "kotlinx-io"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes10.dex */
public final class UTF8Kt {
    private static final int HighSurrogateMagic = 55232;
    private static final int MaxCodePoint = 1114111;
    private static final int MinHighSurrogate = 55296;
    private static final int MinLowSurrogate = 56320;
    private static final int MinSupplementary = 65536;

    @DangerousInternalIoApi
    public static final int byteCountUtf8(int i) {
        int i2 = 0;
        int i3 = 128;
        for (int i4 = 1; i4 <= 6 && (i & i3) != 0; i4++) {
            i &= ~i3;
            i3 >>= 1;
            i2++;
        }
        return i2;
    }

    public static final boolean decodeASCII(@NotNull IoBuffer ioBuffer, @NotNull Function1<? super Character, Boolean> function1) {
        ioBuffer.getClass();
        function1.getClass();
        int readRemaining = ioBuffer.getReadRemaining();
        for (int i = 0; i < readRemaining; i++) {
            byte readByte = ioBuffer.readByte();
            int i2 = readByte & 255;
            if ((readByte & 128) != 0 || !function1.invoke(Character.valueOf((char) i2)).booleanValue()) {
                ioBuffer.pushBack(1);
                return false;
            }
        }
        return true;
    }

    @DangerousInternalIoApi
    public static final int decodeUTF8(@NotNull IoBuffer ioBuffer, @NotNull Function1<? super Character, Boolean> function1) {
        ioBuffer.getClass();
        function1.getClass();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (ioBuffer.canRead()) {
            byte readByte = ioBuffer.readByte();
            int i4 = readByte & 255;
            if ((readByte & 128) == 0) {
                if (i != 0) {
                    malformedByteCount(i);
                    throw null;
                }
                if (!function1.invoke(Character.valueOf((char) i4)).booleanValue()) {
                    ioBuffer.pushBack(1);
                    return -1;
                }
            } else if (i == 0) {
                int i5 = 128;
                i2 = i4;
                for (int i6 = 1; i6 <= 6 && (i2 & i5) != 0; i6++) {
                    i2 &= ~i5;
                    i5 >>= 1;
                    i++;
                }
                int i7 = i - 1;
                if (i7 > ioBuffer.getReadRemaining()) {
                    ioBuffer.pushBack(1);
                    return i;
                }
                i3 = i;
                i = i7;
            } else {
                i2 = (i2 << 6) | (readByte & Byte.MAX_VALUE);
                i--;
                if (i != 0) {
                    continue;
                } else {
                    if (!isBmpCodePoint(i2)) {
                        if (!isValidCodePoint(i2)) {
                            malformedCodePoint(i2);
                            throw null;
                        }
                        if (!function1.invoke(Character.valueOf((char) highSurrogate(i2))).booleanValue() || !function1.invoke(Character.valueOf((char) lowSurrogate(i2))).booleanValue()) {
                            ioBuffer.pushBack(i3);
                            return -1;
                        }
                    } else if (!function1.invoke(Character.valueOf((char) i2)).booleanValue()) {
                        ioBuffer.pushBack(i3);
                        return -1;
                    }
                    i2 = 0;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x02c4, code lost:
    
        r14.pushBack(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0337, code lost:
    
        if (r3 == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0339, code lost:
    
        kotlinx.io.core.internal.UnsafeKt.completeReadHead(r13, r14);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x00ad -> B:12:0x00b2). Please report as a decompilation issue!!! */
    @kotlinx.io.core.internal.DangerousInternalIoApi
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object decodeUTF8LineLoopSuspend(@org.jetbrains.annotations.NotNull java.lang.Appendable r22, int r23, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super kotlin.coroutines.Continuation<? super kotlinx.io.core.ByteReadPacketBase>, ? extends java.lang.Object> r24, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.lang.Boolean> r25) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.io.core.internal.UTF8Kt.decodeUTF8LineLoopSuspend(java.lang.Appendable, int, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @PublishedApi
    public static final int highSurrogate(int i) {
        return (i >>> 10) + 55232;
    }

    @PublishedApi
    public static final boolean isBmpCodePoint(int i) {
        return (i >>> 16) == 0;
    }

    @PublishedApi
    public static final boolean isValidCodePoint(int i) {
        return i <= 1114111;
    }

    @PublishedApi
    public static final int lowSurrogate(int i) {
        return (i & 1023) + 56320;
    }

    @PublishedApi
    @NotNull
    public static final Void malformedByteCount(int i) {
        throw new MalformedUTF8InputException(a$$ExternalSyntheticOutline0.m(i, "Expected ", " more character bytes"));
    }

    @PublishedApi
    @NotNull
    public static final Void malformedCodePoint(int i) {
        throw new IllegalArgumentException(a$$ExternalSyntheticOutline0.m(i, "Malformed code-point ", " found"));
    }

    private static final Void prematureEndOfStreamUtf(int i) {
        throw new EOFException(a$$ExternalSyntheticOutline0.m(i, "Premature end of stream: expected ", " bytes to decode UTF-8 char"));
    }
}
