package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.compose.runtime.Immutable;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Immutable
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000e\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/graphics/CompositeShaderBrush;", "Landroidx/compose/ui/graphics/ShaderBrush;", "dstBrush", "srcBrush", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "<init>", "(Landroidx/compose/ui/graphics/ShaderBrush;Landroidx/compose/ui/graphics/ShaderBrush;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDstBrush", "()Landroidx/compose/ui/graphics/ShaderBrush;", "getSrcBrush", "getBlendMode-0nO6VwU", "()I", "I", "createShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "size", "Landroidx/compose/ui/geometry/Size;", "createShader-uvyYCjk", "(J)Landroid/graphics/Shader;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CompositeShaderBrush extends ShaderBrush {
    private final int blendMode;

    @NotNull
    private final ShaderBrush dstBrush;

    @NotNull
    private final ShaderBrush srcBrush;

    private CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i) {
        this.dstBrush = shaderBrush;
        this.srcBrush = shaderBrush2;
        this.blendMode = i;
    }

    @Override // androidx.compose.ui.graphics.ShaderBrush
    @NotNull
    /* renamed from: createShader-uvyYCjk */
    public Shader mo4613createShaderuvyYCjk(long size) {
        return ShaderKt.m4971CompositeShader7EN7VTw(this.dstBrush.mo4613createShaderuvyYCjk(size), this.srcBrush.mo4613createShaderuvyYCjk(size), this.blendMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompositeShaderBrush)) {
            return false;
        }
        CompositeShaderBrush compositeShaderBrush = (CompositeShaderBrush) other;
        return Intrinsics.areEqual(this.dstBrush, compositeShaderBrush.dstBrush) && Intrinsics.areEqual(this.srcBrush, compositeShaderBrush.srcBrush) && BlendMode.m4554equalsimpl0(this.blendMode, compositeShaderBrush.blendMode);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBlendMode() {
        return this.blendMode;
    }

    @NotNull
    public final ShaderBrush getDstBrush() {
        return this.dstBrush;
    }

    @NotNull
    public final ShaderBrush getSrcBrush() {
        return this.srcBrush;
    }

    public int hashCode() {
        return BlendMode.m4555hashCodeimpl(this.blendMode) + ((this.srcBrush.hashCode() + (this.dstBrush.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "CompositeShaderBrush(dstBrush=" + this.dstBrush + ", srcBrush=" + this.srcBrush + ", blendMode=" + ((Object) BlendMode.m4556toStringimpl(this.blendMode)) + ')';
    }

    public /* synthetic */ CompositeShaderBrush(ShaderBrush shaderBrush, ShaderBrush shaderBrush2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(shaderBrush, shaderBrush2, i);
    }
}
