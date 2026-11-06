package org.jetbrains.kotlin.library;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lorg/jetbrains/kotlin/library/KotlinIrSignatureVersion;", "", "number", "", "(I)V", "getNumber", "()I", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "Companion", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class KotlinIrSignatureVersion {

    @NotNull
    private static final Set<KotlinIrSignatureVersion> CURRENTLY_SUPPORTED_VERSIONS;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final KotlinIrSignatureVersion V1;

    @NotNull
    private static final KotlinIrSignatureVersion V2;
    private final int number;

    static {
        KotlinIrSignatureVersion kotlinIrSignatureVersion = new KotlinIrSignatureVersion(1);
        V1 = kotlinIrSignatureVersion;
        KotlinIrSignatureVersion kotlinIrSignatureVersion2 = new KotlinIrSignatureVersion(2);
        V2 = kotlinIrSignatureVersion2;
        CURRENTLY_SUPPORTED_VERSIONS = SetsKt.setOf((Object[]) new KotlinIrSignatureVersion[]{kotlinIrSignatureVersion, kotlinIrSignatureVersion2});
    }

    public KotlinIrSignatureVersion(int i) {
        this.number = i;
    }

    public static /* synthetic */ KotlinIrSignatureVersion copy$default(KotlinIrSignatureVersion kotlinIrSignatureVersion, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = kotlinIrSignatureVersion.number;
        }
        return kotlinIrSignatureVersion.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    @NotNull
    public final KotlinIrSignatureVersion copy(int number) {
        return new KotlinIrSignatureVersion(number);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof KotlinIrSignatureVersion) && this.number == ((KotlinIrSignatureVersion) other).number;
    }

    public final int getNumber() {
        return this.number;
    }

    public int hashCode() {
        return Integer.hashCode(this.number);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("KotlinIrSignatureVersion(number="), this.number, ')');
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lorg/jetbrains/kotlin/library/KotlinIrSignatureVersion$Companion;", "", "()V", "CURRENTLY_SUPPORTED_VERSIONS", "", "Lorg/jetbrains/kotlin/library/KotlinIrSignatureVersion;", "getCURRENTLY_SUPPORTED_VERSIONS", "()Ljava/util/Set;", "V1", "getV1", "()Lorg/jetbrains/kotlin/library/KotlinIrSignatureVersion;", "V2", "getV2", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<KotlinIrSignatureVersion> getCURRENTLY_SUPPORTED_VERSIONS() {
            return KotlinIrSignatureVersion.CURRENTLY_SUPPORTED_VERSIONS;
        }

        @NotNull
        public final KotlinIrSignatureVersion getV1() {
            return KotlinIrSignatureVersion.V1;
        }

        @NotNull
        public final KotlinIrSignatureVersion getV2() {
            return KotlinIrSignatureVersion.V2;
        }

        private Companion() {
        }
    }
}
