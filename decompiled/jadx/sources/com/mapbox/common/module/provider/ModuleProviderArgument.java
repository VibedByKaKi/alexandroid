package com.mapbox.common.module.provider;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\r\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J#\u0010\f\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/mapbox/common/module/provider/ModuleProviderArgument;", "", "expectedArgumentClass", "Ljava/lang/Class;", "argumentInstance", "(Ljava/lang/Class;Ljava/lang/Object;)V", "getArgumentInstance", "()Ljava/lang/Object;", "getExpectedArgumentClass", "()Ljava/lang/Class;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "common-android"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ModuleProviderArgument {

    @Nullable
    private final Object argumentInstance;

    @NotNull
    private final Class<?> expectedArgumentClass;

    public ModuleProviderArgument(@NotNull Class<?> cls, @Nullable Object obj) {
        cls.getClass();
        this.expectedArgumentClass = cls;
        this.argumentInstance = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModuleProviderArgument copy$default(ModuleProviderArgument moduleProviderArgument, Class cls, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            cls = moduleProviderArgument.expectedArgumentClass;
        }
        if ((i & 2) != 0) {
            obj = moduleProviderArgument.argumentInstance;
        }
        return moduleProviderArgument.copy(cls, obj);
    }

    @NotNull
    public final Class<?> component1() {
        return this.expectedArgumentClass;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Object getArgumentInstance() {
        return this.argumentInstance;
    }

    @NotNull
    public final ModuleProviderArgument copy(@NotNull Class<?> expectedArgumentClass, @Nullable Object argumentInstance) {
        expectedArgumentClass.getClass();
        return new ModuleProviderArgument(expectedArgumentClass, argumentInstance);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModuleProviderArgument)) {
            return false;
        }
        ModuleProviderArgument moduleProviderArgument = (ModuleProviderArgument) other;
        return Intrinsics.areEqual(this.expectedArgumentClass, moduleProviderArgument.expectedArgumentClass) && Intrinsics.areEqual(this.argumentInstance, moduleProviderArgument.argumentInstance);
    }

    @Nullable
    public final Object getArgumentInstance() {
        return this.argumentInstance;
    }

    @NotNull
    public final Class<?> getExpectedArgumentClass() {
        return this.expectedArgumentClass;
    }

    public int hashCode() {
        int hashCode = this.expectedArgumentClass.hashCode() * 31;
        Object obj = this.argumentInstance;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("ModuleProviderArgument(expectedArgumentClass=");
        sb.append(this.expectedArgumentClass);
        sb.append(", argumentInstance=");
        return BitVector$$ExternalSyntheticOutline0.m(sb, this.argumentInstance, ')');
    }
}
