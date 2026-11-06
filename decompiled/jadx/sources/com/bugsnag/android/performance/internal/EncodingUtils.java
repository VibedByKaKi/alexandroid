package com.bugsnag.android.performance.internal;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001a\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u001a\u0010\b\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0004j\u0002`\u00052\u0006\u0010\t\u001a\u00020\u0001\u001a\u001c\u0010\n\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0004j\u0002`\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0000\u001a\u001a\u0010\r\u001a\u00060\u0004j\u0002`\u0005*\u00060\u0004j\u0002`\u00052\u0006\u0010\u000e\u001a\u00020\u000f\u001a\f\u0010\u0010\u001a\u00020\u0007*\u00020\u0011H\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u000fH\u0000\u001a\f\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"LONG_ID_STRING_LENGTH", "", "UUID_ID_STRING_LENGTH", "appendHexLong", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "", "appendHexPair", "b", "appendHexString", "bytes", "", "appendHexUUID", "uuid", "Ljava/util/UUID;", "parseUnsignedLong", "", "toHexString", "bugsnag-android-performance_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@JvmName(name = "EncodingUtils")
@SourceDebugExtension({"SMAP\nEncodings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Encodings.kt\ncom/bugsnag/android/performance/internal/EncodingUtils\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,54:1\n13586#2,2:55\n*S KotlinDebug\n*F\n+ 1 Encodings.kt\ncom/bugsnag/android/performance/internal/EncodingUtils\n*L\n47#1:55,2\n*E\n"})
/* loaded from: classes6.dex */
public final class EncodingUtils {
    private static final int LONG_ID_STRING_LENGTH = 16;
    private static final int UUID_ID_STRING_LENGTH = 32;

    @NotNull
    public static final StringBuilder appendHexLong(@NotNull StringBuilder sb, long j) {
        sb.getClass();
        sb.ensureCapacity(sb.length() + 16);
        return appendHexPair(appendHexPair(appendHexPair(appendHexPair(appendHexPair(appendHexPair(appendHexPair(appendHexPair(sb, (int) ((j >>> 56) & 255)), (int) ((j >>> 48) & 255)), (int) ((j >>> 40) & 255)), (int) ((j >>> 32) & 255)), (int) ((j >>> 24) & 255)), (int) ((j >>> 16) & 255)), (int) ((j >>> 8) & 255)), (int) (j & 255));
    }

    @NotNull
    public static final StringBuilder appendHexPair(@NotNull StringBuilder sb, int i) {
        sb.getClass();
        if (i < 16) {
            sb.append('0');
        }
        String num = Integer.toString(i, CharsKt.checkRadix(16));
        num.getClass();
        sb.append(num);
        return sb;
    }

    @NotNull
    public static final StringBuilder appendHexString(@NotNull StringBuilder sb, @NotNull byte[] bArr) {
        sb.getClass();
        bArr.getClass();
        sb.ensureCapacity((bArr.length * 2) + sb.length());
        for (byte b : bArr) {
            appendHexPair(sb, b & 255);
        }
        return sb;
    }

    @NotNull
    public static final StringBuilder appendHexUUID(@NotNull StringBuilder sb, @NotNull UUID uuid) {
        sb.getClass();
        uuid.getClass();
        sb.ensureCapacity(sb.length() + 32);
        return appendHexLong(appendHexLong(sb, uuid.getMostSignificantBits()), uuid.getLeastSignificantBits());
    }

    public static final long parseUnsignedLong(@NotNull String str) {
        str.getClass();
        return Long.parseUnsignedLong(str, 16);
    }

    @NotNull
    public static final String toHexString(@NotNull UUID uuid) {
        uuid.getClass();
        return appendHexUUID(new StringBuilder(32), uuid).toString();
    }

    @NotNull
    public static final String toHexString(long j) {
        return appendHexLong(new StringBuilder(16), j).toString();
    }
}
