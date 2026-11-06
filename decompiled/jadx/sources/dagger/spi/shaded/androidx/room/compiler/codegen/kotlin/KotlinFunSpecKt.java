package dagger.spi.shaded.androidx.room.compiler.codegen.kotlin;

import com.squareup.kotlinpoet.KModifier;
import dagger.spi.shaded.androidx.room.compiler.codegen.VisibilityModifier;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toKotlinVisibilityModifier", "Lcom/squareup/kotlinpoet/KModifier;", "Ldagger/spi/shaded/androidx/room/compiler/codegen/VisibilityModifier;", "room-compiler-processing"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class KotlinFunSpecKt {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VisibilityModifier.values().length];
            try {
                iArr[VisibilityModifier.PUBLIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VisibilityModifier.PROTECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VisibilityModifier.PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final KModifier toKotlinVisibilityModifier(@NotNull VisibilityModifier visibilityModifier) {
        visibilityModifier.getClass();
        int i = WhenMappings.$EnumSwitchMapping$0[visibilityModifier.ordinal()];
        if (i == 1) {
            return KModifier.PUBLIC;
        }
        if (i == 2) {
            return KModifier.PROTECTED;
        }
        if (i == 3) {
            return KModifier.PRIVATE;
        }
        PathKt$$ExternalSyntheticBUOutline0.m();
        return null;
    }
}
