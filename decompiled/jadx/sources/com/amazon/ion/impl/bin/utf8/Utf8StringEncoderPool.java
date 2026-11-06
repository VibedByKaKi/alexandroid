package com.amazon.ion.impl.bin.utf8;

import com.amazon.ion.impl.bin.utf8.Pool;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class Utf8StringEncoderPool extends Pool<Utf8StringEncoder> {
    private static final Utf8StringEncoderPool INSTANCE = new Utf8StringEncoderPool();

    private Utf8StringEncoderPool() {
        super(new Pool.Allocator<Utf8StringEncoder>() { // from class: com.amazon.ion.impl.bin.utf8.Utf8StringEncoderPool.1
            @Override // com.amazon.ion.impl.bin.utf8.Pool.Allocator
            public Utf8StringEncoder newInstance(Pool<Utf8StringEncoder> pool) {
                return new Utf8StringEncoder(pool);
            }
        });
    }

    public static Utf8StringEncoderPool getInstance() {
        return INSTANCE;
    }
}
