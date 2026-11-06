package androidx.camera.core.internal.compat.quirk;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.camera.core.Preview;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import com.amazon.alexa.ra.core.data.model.Constants;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007J\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u000e"}, d2 = {"Landroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk;", "Landroidx/camera/core/impl/Quirk;", "()V", "isMotoE20", "", "()Z", "load", "shouldForceEnableStreamSharing", "cameraId", "", "appUseCases", "", "Landroidx/camera/core/UseCase;", "shouldForceEnableStreamSharingForMotoE20", "camera-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"CameraXQuirksClassDetector"})
@SourceDebugExtension({"SMAP\nPreviewGreenTintQuirk.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewGreenTintQuirk.kt\nandroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1747#2,3:71\n1747#2,3:74\n*S KotlinDebug\n*F\n+ 1 PreviewGreenTintQuirk.kt\nandroidx/camera/core/internal/compat/quirk/PreviewGreenTintQuirk\n*L\n61#1:71,3\n63#1:74,3\n*E\n"})
/* loaded from: classes.dex */
public final class PreviewGreenTintQuirk implements Quirk {

    @NotNull
    public static final PreviewGreenTintQuirk INSTANCE = new PreviewGreenTintQuirk();

    private PreviewGreenTintQuirk() {
    }

    private final boolean isMotoE20() {
        return StringsKt.equals("motorola", Build.BRAND, true) && StringsKt.equals("moto e20", Build.MODEL, true);
    }

    @JvmStatic
    public static final boolean load() {
        return INSTANCE.isMotoE20();
    }

    @JvmStatic
    public static final boolean shouldForceEnableStreamSharing(@NotNull String cameraId, @NotNull Collection<? extends UseCase> appUseCases) {
        cameraId.getClass();
        appUseCases.getClass();
        PreviewGreenTintQuirk previewGreenTintQuirk = INSTANCE;
        if (previewGreenTintQuirk.isMotoE20()) {
            return previewGreenTintQuirk.shouldForceEnableStreamSharingForMotoE20(cameraId, appUseCases);
        }
        return false;
    }

    private final boolean shouldForceEnableStreamSharingForMotoE20(String cameraId, Collection<? extends UseCase> appUseCases) {
        boolean z;
        boolean z2;
        if (Intrinsics.areEqual(cameraId, Constants.FEEDBACK_TYPE_DISLIKE) && appUseCases.size() == 2) {
            Collection<? extends UseCase> collection = appUseCases;
            boolean z3 = collection instanceof Collection;
            if (!z3 || !collection.isEmpty()) {
                Iterator<T> it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (((UseCase) it2.next()) instanceof Preview) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z3 || !collection.isEmpty()) {
                for (UseCase useCase : collection) {
                    if (useCase.getCurrentConfig().containsOption(UseCaseConfig.OPTION_CAPTURE_TYPE) && useCase.getCurrentConfig().getCaptureType() == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            if (z && z2) {
                return true;
            }
        }
        return false;
    }
}
