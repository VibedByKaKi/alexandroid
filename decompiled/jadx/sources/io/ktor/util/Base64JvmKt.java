package io.ktor.util;

import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.Base64;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0007¨\u0006\u0006"}, d2 = {"decodeBase64", "", CmcdData.Factory.STREAMING_FORMAT_SS, "", "encodeBase64", "bytes", "ktor-utils"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public final class Base64JvmKt {
    @InternalAPI
    @NotNull
    public static final byte[] decodeBase64(@NotNull String str) {
        str.getClass();
        byte[] decode = Base64.getDecoder().decode(str);
        decode.getClass();
        return decode;
    }

    @InternalAPI
    @NotNull
    public static final String encodeBase64(@NotNull byte[] bArr) {
        bArr.getClass();
        String encodeToString = Base64.getEncoder().encodeToString(bArr);
        encodeToString.getClass();
        return encodeToString;
    }
}
