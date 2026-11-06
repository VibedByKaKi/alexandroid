package kotlin.io.encoding;

import com.ReactNativeBlobUtil.ReactNativeBlobUtilConst;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"decodingWith", "Ljava/io/InputStream;", ReactNativeBlobUtilConst.RNFB_RESPONSE_BASE64, "Lkotlin/io/encoding/Base64;", "encodingWith", "Ljava/io/OutputStream;", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/io/encoding/StreamEncodingKt")
/* loaded from: classes10.dex */
class StreamEncodingKt__Base64IOStreamKt {
    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final InputStream decodingWith(@NotNull InputStream inputStream, @NotNull Base64 base64) {
        inputStream.getClass();
        base64.getClass();
        return new DecodeInputStream(inputStream, base64);
    }

    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final OutputStream encodingWith(@NotNull OutputStream outputStream, @NotNull Base64 base64) {
        outputStream.getClass();
        base64.getClass();
        return new EncodeOutputStream(outputStream, base64);
    }
}
