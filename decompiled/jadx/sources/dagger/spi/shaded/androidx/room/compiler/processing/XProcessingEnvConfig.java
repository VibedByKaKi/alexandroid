package dagger.spi.shaded.androidx.room.compiler.processing;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.compat.model.assistant.subcomponent.AlexaEventBundleKeys;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0014\u0015B\u001b\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0016"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnvConfig;", "", "excludeMethodsWithInvalidJvmSourceNames", "", "disableAnnotatedElementValidation", "(ZZ)V", "getDisableAnnotatedElementValidation", "()Z", "getExcludeMethodsWithInvalidJvmSourceNames", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toBuilder", "Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnvConfig$Builder;", "toString", "", "Builder", "Companion", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class XProcessingEnvConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final XProcessingEnvConfig DEFAULT = new Builder(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0).getInstance();
    private final boolean disableAnnotatedElementValidation;
    private final boolean excludeMethodsWithInvalidJvmSourceNames;

    public /* synthetic */ XProcessingEnvConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    public static /* synthetic */ XProcessingEnvConfig copy$default(XProcessingEnvConfig xProcessingEnvConfig, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = xProcessingEnvConfig.excludeMethodsWithInvalidJvmSourceNames;
        }
        if ((i & 2) != 0) {
            z2 = xProcessingEnvConfig.disableAnnotatedElementValidation;
        }
        return xProcessingEnvConfig.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getExcludeMethodsWithInvalidJvmSourceNames() {
        return this.excludeMethodsWithInvalidJvmSourceNames;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getDisableAnnotatedElementValidation() {
        return this.disableAnnotatedElementValidation;
    }

    @NotNull
    public final XProcessingEnvConfig copy(boolean excludeMethodsWithInvalidJvmSourceNames, boolean disableAnnotatedElementValidation) {
        return new XProcessingEnvConfig(excludeMethodsWithInvalidJvmSourceNames, disableAnnotatedElementValidation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XProcessingEnvConfig)) {
            return false;
        }
        XProcessingEnvConfig xProcessingEnvConfig = (XProcessingEnvConfig) other;
        return this.excludeMethodsWithInvalidJvmSourceNames == xProcessingEnvConfig.excludeMethodsWithInvalidJvmSourceNames && this.disableAnnotatedElementValidation == xProcessingEnvConfig.disableAnnotatedElementValidation;
    }

    public final boolean getDisableAnnotatedElementValidation() {
        return this.disableAnnotatedElementValidation;
    }

    public final boolean getExcludeMethodsWithInvalidJvmSourceNames() {
        return this.excludeMethodsWithInvalidJvmSourceNames;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.excludeMethodsWithInvalidJvmSourceNames;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        boolean z2 = this.disableAnnotatedElementValidation;
        return i + (z2 ? 1 : z2 ? 1 : 0);
    }

    @NotNull
    public final Builder toBuilder() {
        return new Builder(this);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("XProcessingEnvConfig(excludeMethodsWithInvalidJvmSourceNames=");
        sb.append(this.excludeMethodsWithInvalidJvmSourceNames);
        sb.append(", disableAnnotatedElementValidation=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.disableAnnotatedElementValidation, ')');
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnvConfig$Companion;", "", "()V", "DEFAULT", "Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnvConfig;", "getDEFAULT", "()Landroidx/room/compiler/processing/XProcessingEnvConfig;", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final XProcessingEnvConfig getDEFAULT() {
            return XProcessingEnvConfig.DEFAULT;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnvConfig$Builder;", "", "baseline", "Ldagger/spi/shaded/androidx/room/compiler/processing/XProcessingEnvConfig;", "(Landroidx/room/compiler/processing/XProcessingEnvConfig;)V", AlexaEventBundleKeys.INSTANCE, JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "disableAnnotatedElementValidation", "value", "", "excludeMethodsWithInvalidJvmSourceNames", "room-compiler-processing"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private XProcessingEnvConfig instance;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public /* synthetic */ Builder(dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnvConfig r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            /*
                r1 = this;
                r3 = r3 & 1
                if (r3 == 0) goto Lc
                dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnvConfig r2 = new dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnvConfig
                r3 = 3
                r4 = 0
                r0 = 0
                r2.<init>(r0, r0, r3, r4)
            Lc:
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnvConfig.Builder.<init>(dagger.spi.shaded.androidx.room.compiler.processing.XProcessingEnvConfig, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @NotNull
        /* renamed from: build, reason: from getter */
        public final XProcessingEnvConfig getInstance() {
            return this.instance;
        }

        @NotNull
        public final Builder disableAnnotatedElementValidation(boolean value) {
            this.instance = XProcessingEnvConfig.copy$default(this.instance, false, value, 1, null);
            return this;
        }

        @NotNull
        public final Builder excludeMethodsWithInvalidJvmSourceNames(boolean value) {
            this.instance = XProcessingEnvConfig.copy$default(this.instance, value, false, 2, null);
            return this;
        }

        public Builder(@NotNull XProcessingEnvConfig xProcessingEnvConfig) {
            xProcessingEnvConfig.getClass();
            this.instance = xProcessingEnvConfig;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder() {
            this(null, 1, 0 == true ? 1 : 0);
        }
    }

    private XProcessingEnvConfig(boolean z, boolean z2) {
        this.excludeMethodsWithInvalidJvmSourceNames = z;
        this.disableAnnotatedElementValidation = z2;
    }
}
