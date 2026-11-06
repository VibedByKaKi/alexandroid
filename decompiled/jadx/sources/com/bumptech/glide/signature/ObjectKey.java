package com.bumptech.glide.signature;

import androidx.annotation.NonNull;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class ObjectKey implements Key {
    private final Object object;

    public ObjectKey(@NonNull Object obj) {
        this.object = Preconditions.checkNotNull(obj);
    }

    @Override // com.bumptech.glide.load.Key
    public boolean equals(Object obj) {
        if (obj instanceof ObjectKey) {
            return this.object.equals(((ObjectKey) obj).object);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.Key
    public int hashCode() {
        return this.object.hashCode();
    }

    public String toString() {
        return BitVector$$ExternalSyntheticOutline0.m(new StringBuilder("ObjectKey{object="), this.object, AbstractJsonLexerKt.END_OBJ);
    }

    @Override // com.bumptech.glide.load.Key
    public void updateDiskCacheKey(@NonNull MessageDigest messageDigest) {
        messageDigest.update(this.object.toString().getBytes(Key.CHARSET));
    }
}
