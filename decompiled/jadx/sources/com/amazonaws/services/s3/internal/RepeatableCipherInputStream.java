package com.amazonaws.services.s3.internal;

import com.amazonaws.services.s3.internal.crypto.CipherFactory;
import java.io.FilterInputStream;
import java.io.InputStream;
import javax.crypto.CipherInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class RepeatableCipherInputStream extends AbstractRepeatableCipherInputStream<CipherFactory> {
    public RepeatableCipherInputStream(InputStream inputStream, CipherFactory cipherFactory) {
        super(inputStream, newCipherInputStream(inputStream, cipherFactory), cipherFactory);
    }

    private static FilterInputStream newCipherInputStream(InputStream inputStream, CipherFactory cipherFactory) {
        return new CipherInputStream(inputStream, cipherFactory.createCipher());
    }

    @Override // com.amazonaws.services.s3.internal.AbstractRepeatableCipherInputStream
    public FilterInputStream createCipherInputStream(InputStream inputStream, CipherFactory cipherFactory) {
        return newCipherInputStream(inputStream, cipherFactory);
    }
}
