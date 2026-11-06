package dagger.producers.monitoring;

import com.google.common.base.Preconditions;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class ProducerToken {

    @NullableDecl
    private final Class<?> classToken;

    @NullableDecl
    private final String methodName;

    private ProducerToken(@NullableDecl Class<?> cls, @NullableDecl String str) {
        this.classToken = cls;
        this.methodName = str;
    }

    public static ProducerToken create(Class<?> cls) {
        return new ProducerToken((Class) Preconditions.checkNotNull(cls), null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ProducerToken) {
            ProducerToken producerToken = (ProducerToken) obj;
            if (Objects.equals(this.classToken, producerToken.classToken) && Objects.equals(this.methodName, producerToken.methodName)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.methodName) ^ ((Objects.hashCode(this.classToken) ^ 1000003) * 1000003);
    }

    public String toString() {
        String str = this.methodName;
        if (str != null) {
            return str;
        }
        Class<?> cls = this.classToken;
        if (cls != null) {
            return cls.getCanonicalName();
        }
        Duration$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public static ProducerToken create(String str) {
        return new ProducerToken(null, (String) Preconditions.checkNotNull(str));
    }
}
