package expo.modules.kotlin.allocators;

import android.annotation.SuppressLint;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.dnssd.RxNsd$$ExternalSyntheticLambda1;
import com.amazon.alexa.ra.ui.fragments.smartfragment.SmartFragmentEventProcessor;
import com.google.gson.internal.ConstructorConstructor$$ExternalSyntheticLambda4;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda1;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005J\r\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0004¨\u0006\u0006"}, d2 = {"Lexpo/modules/kotlin/allocators/UnsafeAllocator;", ExifInterface.GPS_DIRECTION_TRUE, "", SmartFragmentEventProcessor.NEW_INSTANCE, "()Ljava/lang/Object;", "Companion", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface UnsafeAllocator<T> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00060\u0005\"\u0004\b\u0001\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\bH\u0007¨\u0006\t"}, d2 = {"Lexpo/modules/kotlin/allocators/UnsafeAllocator$Companion;", "", "<init>", "()V", "createAllocator", "Lexpo/modules/kotlin/allocators/UnsafeAllocator;", ExifInterface.GPS_DIRECTION_TRUE, "clazz", "Ljava/lang/Class;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object createAllocator$lambda$0(Method method, Class cls, int i) {
            return method.invoke(null, cls, Integer.valueOf(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object createAllocator$lambda$1(Method method, Object obj, Class cls) {
            return method.invoke(obj, cls);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object createAllocator$lambda$2(Class cls) {
            throw new IllegalArgumentException(a$$ExternalSyntheticOutline0.m("Cannot allocate ", cls));
        }

        @SuppressLint({"DiscouragedPrivateApi"})
        @NotNull
        public final <T> UnsafeAllocator<T> createAllocator(@NotNull Class<T> clazz) {
            clazz.getClass();
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    Object invoke = declaredMethod.invoke(null, Object.class);
                    invoke.getClass();
                    int intValue = ((Integer) invoke).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod(SmartFragmentEventProcessor.NEW_INSTANCE, Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    return new RxNsd$$ExternalSyntheticLambda1(declaredMethod2, clazz, intValue, 9);
                } catch (Throwable unused) {
                    Class<?> cls = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    return new Snapshotter$$ExternalSyntheticLambda1(cls.getMethod("allocateInstance", Class.class), 21, declaredField.get(null), clazz);
                }
            } catch (Throwable unused2) {
                return new ConstructorConstructor$$ExternalSyntheticLambda4(clazz);
            }
        }
    }

    T newInstance() throws Exception;
}
