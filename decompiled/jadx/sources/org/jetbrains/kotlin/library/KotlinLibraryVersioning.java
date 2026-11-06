package org.jetbrains.kotlin.library;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006 "}, d2 = {"Lorg/jetbrains/kotlin/library/KotlinLibraryVersioning;", "", "libraryVersion", "", "compilerVersion", "abiVersion", "Lorg/jetbrains/kotlin/library/KotlinAbiVersion;", "metadataVersion", "irSignatureVersions", "", "Lorg/jetbrains/kotlin/library/KotlinIrSignatureVersion;", "(Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/library/KotlinAbiVersion;Ljava/lang/String;Ljava/util/Set;)V", "getAbiVersion", "()Lorg/jetbrains/kotlin/library/KotlinAbiVersion;", "getCompilerVersion", "()Ljava/lang/String;", "getIrSignatureVersions", "()Ljava/util/Set;", "getLibraryVersion", "getMetadataVersion", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "kotlin-util-klib"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class KotlinLibraryVersioning {

    @Nullable
    private final KotlinAbiVersion abiVersion;

    @Nullable
    private final String compilerVersion;

    @NotNull
    private final Set<KotlinIrSignatureVersion> irSignatureVersions;

    @Nullable
    private final String libraryVersion;

    @Nullable
    private final String metadataVersion;

    public KotlinLibraryVersioning(@Nullable String str, @Nullable String str2, @Nullable KotlinAbiVersion kotlinAbiVersion, @Nullable String str3, @NotNull Set<KotlinIrSignatureVersion> set) {
        set.getClass();
        this.libraryVersion = str;
        this.compilerVersion = str2;
        this.abiVersion = kotlinAbiVersion;
        this.metadataVersion = str3;
        this.irSignatureVersions = set;
        if (set.isEmpty()) {
            Single$$ExternalSyntheticBUOutline0.m$3("Signature versions must not be empty!");
            throw null;
        }
    }

    public static /* synthetic */ KotlinLibraryVersioning copy$default(KotlinLibraryVersioning kotlinLibraryVersioning, String str, String str2, KotlinAbiVersion kotlinAbiVersion, String str3, Set set, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kotlinLibraryVersioning.libraryVersion;
        }
        if ((i & 2) != 0) {
            str2 = kotlinLibraryVersioning.compilerVersion;
        }
        if ((i & 4) != 0) {
            kotlinAbiVersion = kotlinLibraryVersioning.abiVersion;
        }
        if ((i & 8) != 0) {
            str3 = kotlinLibraryVersioning.metadataVersion;
        }
        if ((i & 16) != 0) {
            set = kotlinLibraryVersioning.irSignatureVersions;
        }
        Set set2 = set;
        KotlinAbiVersion kotlinAbiVersion2 = kotlinAbiVersion;
        return kotlinLibraryVersioning.copy(str, str2, kotlinAbiVersion2, str3, set2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getLibraryVersion() {
        return this.libraryVersion;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCompilerVersion() {
        return this.compilerVersion;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final KotlinAbiVersion getAbiVersion() {
        return this.abiVersion;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getMetadataVersion() {
        return this.metadataVersion;
    }

    @NotNull
    public final Set<KotlinIrSignatureVersion> component5() {
        return this.irSignatureVersions;
    }

    @NotNull
    public final KotlinLibraryVersioning copy(@Nullable String libraryVersion, @Nullable String compilerVersion, @Nullable KotlinAbiVersion abiVersion, @Nullable String metadataVersion, @NotNull Set<KotlinIrSignatureVersion> irSignatureVersions) {
        irSignatureVersions.getClass();
        return new KotlinLibraryVersioning(libraryVersion, compilerVersion, abiVersion, metadataVersion, irSignatureVersions);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KotlinLibraryVersioning)) {
            return false;
        }
        KotlinLibraryVersioning kotlinLibraryVersioning = (KotlinLibraryVersioning) other;
        return Intrinsics.areEqual(this.libraryVersion, kotlinLibraryVersioning.libraryVersion) && Intrinsics.areEqual(this.compilerVersion, kotlinLibraryVersioning.compilerVersion) && Intrinsics.areEqual(this.abiVersion, kotlinLibraryVersioning.abiVersion) && Intrinsics.areEqual(this.metadataVersion, kotlinLibraryVersioning.metadataVersion) && Intrinsics.areEqual(this.irSignatureVersions, kotlinLibraryVersioning.irSignatureVersions);
    }

    @Nullable
    public final KotlinAbiVersion getAbiVersion() {
        return this.abiVersion;
    }

    @Nullable
    public final String getCompilerVersion() {
        return this.compilerVersion;
    }

    @NotNull
    public final Set<KotlinIrSignatureVersion> getIrSignatureVersions() {
        return this.irSignatureVersions;
    }

    @Nullable
    public final String getLibraryVersion() {
        return this.libraryVersion;
    }

    @Nullable
    public final String getMetadataVersion() {
        return this.metadataVersion;
    }

    public int hashCode() {
        String str = this.libraryVersion;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.compilerVersion;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        KotlinAbiVersion kotlinAbiVersion = this.abiVersion;
        int hashCode3 = (hashCode2 + (kotlinAbiVersion == null ? 0 : kotlinAbiVersion.hashCode())) * 31;
        String str3 = this.metadataVersion;
        return this.irSignatureVersions.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        return "KotlinLibraryVersioning(libraryVersion=" + this.libraryVersion + ", compilerVersion=" + this.compilerVersion + ", abiVersion=" + this.abiVersion + ", metadataVersion=" + this.metadataVersion + ", irSignatureVersions=" + this.irSignatureVersions + ')';
    }

    public /* synthetic */ KotlinLibraryVersioning(String str, String str2, KotlinAbiVersion kotlinAbiVersion, String str3, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, kotlinAbiVersion, str3, (i & 16) != 0 ? KotlinIrSignatureVersion.INSTANCE.getCURRENTLY_SUPPORTED_VERSIONS() : set);
    }
}
