package com.amazon.alexa.assistant.toolkit.security;

import com.amazon.alexa.assistant.foundation.model.Event$$ExternalSyntheticLambda0;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/security/ChecksumUtils;", "", "<init>", "()V", "calculateMD5", "", "data", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ChecksumUtils {

    @NotNull
    public static final ChecksumUtils INSTANCE = new ChecksumUtils();

    private ChecksumUtils() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence calculateMD5$lambda$0(byte b) {
        return String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
    }

    @NotNull
    public final String calculateMD5(@NotNull byte[] data) {
        data.getClass();
        byte[] digest = MessageDigest.getInstance(MessageDigestAlgorithms.MD5).digest(data);
        digest.getClass();
        return ArraysKt.joinToString$default(digest, "", null, null, 0, new Event$$ExternalSyntheticLambda0(21), 30);
    }
}
