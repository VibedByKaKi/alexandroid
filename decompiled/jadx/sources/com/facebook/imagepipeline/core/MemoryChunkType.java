package com.facebook.imagepipeline.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes6.dex */
public @interface MemoryChunkType {
    public static final int ASHMEM_MEMORY = 2;
    public static final int BUFFER_MEMORY = 1;
    public static final int NATIVE_MEMORY = 0;
}
