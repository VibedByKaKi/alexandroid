package org.jetbrains.kotlin.konan.target;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\b\u0010\u0017\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/TargetTriple;", "", "architecture", "", "vendor", "os", "environment", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getArchitecture", "()Ljava/lang/String;", "getEnvironment", "getOs", "getVendor", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Companion", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension({"SMAP\nTargetTriple.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TargetTriple.kt\norg/jetbrains/kotlin/konan/target/TargetTriple\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
/* loaded from: classes11.dex */
public final /* data */ class TargetTriple {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String architecture;

    @Nullable
    private final String environment;

    @NotNull
    private final String os;

    @NotNull
    private final String vendor;

    public TargetTriple(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4) {
        ParcelCompat$$ExternalSyntheticOutline0.m(str, str2, str3);
        this.architecture = str;
        this.vendor = str2;
        this.os = str3;
        this.environment = str4;
    }

    public static /* synthetic */ TargetTriple copy$default(TargetTriple targetTriple, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = targetTriple.architecture;
        }
        if ((i & 2) != 0) {
            str2 = targetTriple.vendor;
        }
        if ((i & 4) != 0) {
            str3 = targetTriple.os;
        }
        if ((i & 8) != 0) {
            str4 = targetTriple.environment;
        }
        return targetTriple.copy(str, str2, str3, str4);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getArchitecture() {
        return this.architecture;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getVendor() {
        return this.vendor;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOs() {
        return this.os;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final TargetTriple copy(@NotNull String architecture, @NotNull String vendor, @NotNull String os, @Nullable String environment) {
        architecture.getClass();
        vendor.getClass();
        os.getClass();
        return new TargetTriple(architecture, vendor, os, environment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TargetTriple)) {
            return false;
        }
        TargetTriple targetTriple = (TargetTriple) other;
        return Intrinsics.areEqual(this.architecture, targetTriple.architecture) && Intrinsics.areEqual(this.vendor, targetTriple.vendor) && Intrinsics.areEqual(this.os, targetTriple.os) && Intrinsics.areEqual(this.environment, targetTriple.environment);
    }

    @NotNull
    public final String getArchitecture() {
        return this.architecture;
    }

    @Nullable
    public final String getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final String getOs() {
        return this.os;
    }

    @NotNull
    public final String getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.architecture.hashCode() * 31, 31, this.vendor), 31, this.os);
        String str = this.environment;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str;
        if (this.environment != null) {
            str = "-" + this.environment;
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.architecture);
        sb.append('-');
        sb.append(this.vendor);
        sb.append('-');
        return a$$ExternalSyntheticOutline0.m(sb, this.os, str);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lorg/jetbrains/kotlin/konan/target/TargetTriple$Companion;", "", "()V", "fromString", "Lorg/jetbrains/kotlin/konan/target/TargetTriple;", "tripleString", "", "kotlin-native-utils"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TargetTriple fromString(@NotNull String tripleString) {
            List split$default;
            tripleString.getClass();
            split$default = StringsKt__StringsKt.split$default(tripleString, new char[]{'-'}, false, 0, 6, (Object) null);
            if (split$default.size() == 3 || split$default.size() == 4) {
                return new TargetTriple((String) split$default.get(0), (String) split$default.get(1), (String) split$default.get(2), (String) CollectionsKt.getOrNull(split$default, 3));
            }
            Path$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m("Malformed target triple: ", tripleString, ". Expected format: <arch>-<vendor>-<os>-<environment?>."));
            return null;
        }

        private Companion() {
        }
    }
}
