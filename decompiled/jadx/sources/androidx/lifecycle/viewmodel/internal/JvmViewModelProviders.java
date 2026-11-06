package androidx.lifecycle.viewmodel.internal;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0004\u001a\u0002H\u0005\"\b\b\u0000\u0010\u0005*\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00050\b¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/viewmodel/internal/JvmViewModelProviders;", "", "<init>", "()V", "createViewModel", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class JvmViewModelProviders {

    @NotNull
    public static final JvmViewModelProviders INSTANCE = new JvmViewModelProviders();

    private JvmViewModelProviders() {
    }

    @NotNull
    public final <T extends ViewModel> T createViewModel(@NotNull Class<T> modelClass) {
        modelClass.getClass();
        try {
            Constructor<T> declaredConstructor = modelClass.getDeclaredConstructor(null);
            if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                Single$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Cannot create an instance of ", modelClass));
                return null;
            }
            try {
                T newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return newInstance;
            } catch (IllegalAccessException e) {
                OnnxMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Cannot create an instance of ", modelClass), e);
                return null;
            } catch (InstantiationException e2) {
                OnnxMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Cannot create an instance of ", modelClass), e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            OnnxMap$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Cannot create an instance of ", modelClass), e3);
            return null;
        }
    }
}
