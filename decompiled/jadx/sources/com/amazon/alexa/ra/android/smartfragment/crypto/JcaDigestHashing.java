package com.amazon.alexa.ra.android.smartfragment.crypto;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.transport.MissingTokenPull;
import java.security.MessageDigest;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/ra/android/smartfragment/crypto/JcaDigestHashing;", "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestHashing;", "<init>", "()V", "digest", "", "input", "", MissingTokenPull.TRIGGER_REQUEST, "Lcom/amazon/alexa/ra/android/smartfragment/crypto/DigestRequest;", "AVSMobileFramework-ra-android-smart-fragment-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class JcaDigestHashing implements DigestHashing {
    public static final int $stable = 0;

    @Override // com.amazon.alexa.ra.android.smartfragment.crypto.DigestHashing
    @NotNull
    public String digest(@NotNull byte[] input, @NotNull DigestRequest request) {
        input.getClass();
        request.getClass();
        byte[] digest = MessageDigest.getInstance(request.getAlgorithm().getJcaName()).digest(input);
        DigestEncoding encoding = request.getEncoding();
        digest.getClass();
        return encoding.encode(digest);
    }
}
