package com.amazon.alexa.cam.utils;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/cam/utils/FileUtils;", "", "()V", "BYTE_ARRAY_SIZE", "", "MD5_ALGORITHM", "", "calculateMd5AndReadContent", "Lkotlin/Pair;", "", "inputStream", "Ljava/io/InputStream;", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUtils.kt\ncom/amazon/alexa/cam/utils/FileUtils\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,38:1\n1#2:39\n*E\n"})
/* loaded from: classes17.dex */
public final class FileUtils {
    private static final int BYTE_ARRAY_SIZE = 8192;

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    @NotNull
    private static final String MD5_ALGORITHM = "md5";

    private FileUtils() {
    }

    @NotNull
    public final Pair<String, byte[]> calculateMd5AndReadContent(@NotNull InputStream inputStream) {
        inputStream.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("md5");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                byte[] digest = messageDigest.digest();
                digest.getClass();
                return new Pair<>(ArraysKt.joinToString$default(digest, "", null, null, 0, new Function1<Byte, CharSequence>() { // from class: com.amazon.alexa.cam.utils.FileUtils$calculateMd5AndReadContent$md5$1
                    @NotNull
                    public final CharSequence invoke(byte b) {
                        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
                        return invoke(b.byteValue());
                    }
                }, 30), byteArrayOutputStream.toByteArray());
            }
            messageDigest.update(bArr, 0, read);
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }
}
