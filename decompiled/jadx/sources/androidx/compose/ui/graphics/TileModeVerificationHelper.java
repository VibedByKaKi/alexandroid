package androidx.compose.ui.graphics;

import android.graphics.Shader;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\r\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/ui/graphics/TileModeVerificationHelper;", "", "<init>", "()V", "getFrameworkTileModeDecal", "Landroid/graphics/Shader$TileMode;", "getComposeTileModeDecal", "Landroidx/compose/ui/graphics/TileMode;", "getComposeTileModeDecal-3opZhB0", "()I", "ui-graphics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class TileModeVerificationHelper {

    @NotNull
    public static final TileModeVerificationHelper INSTANCE = new TileModeVerificationHelper();

    private TileModeVerificationHelper() {
    }

    /* renamed from: getComposeTileModeDecal-3opZhB0, reason: not valid java name */
    public final int m5038getComposeTileModeDecal3opZhB0() {
        return TileMode.INSTANCE.m5035getDecal3opZhB0();
    }

    @NotNull
    public final Shader.TileMode getFrameworkTileModeDecal() {
        Shader.TileMode tileMode;
        tileMode = Shader.TileMode.DECAL;
        return tileMode;
    }
}
