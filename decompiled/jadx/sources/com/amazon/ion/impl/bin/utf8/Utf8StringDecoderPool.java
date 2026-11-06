package com.amazon.ion.impl.bin.utf8;

import com.amazon.ion.impl.bin.utf8.Pool;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Utf8StringDecoderPool extends Pool<Utf8StringDecoder> {
    private static final Utf8StringDecoderPool INSTANCE = new Utf8StringDecoderPool();

    private Utf8StringDecoderPool() {
        super(new Pool.Allocator<Utf8StringDecoder>() { // from class: com.amazon.ion.impl.bin.utf8.Utf8StringDecoderPool.1
            @Override // com.amazon.ion.impl.bin.utf8.Pool.Allocator
            public Utf8StringDecoder newInstance(Pool<Utf8StringDecoder> pool) {
                return new Utf8StringDecoder(pool);
            }
        });
    }

    public static Utf8StringDecoderPool getInstance() {
        return INSTANCE;
    }
}
