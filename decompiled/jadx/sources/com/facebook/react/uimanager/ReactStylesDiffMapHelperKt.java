package com.facebook.react.uimanager;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.ExpoModulesPackage$$ExternalSyntheticLambda0;
import expo.modules.core.interfaces.DoNotStrip;
import java.lang.reflect.Field;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\"\u001b\u0010\u0000\u001a\u00020\u00018CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t"}, d2 = {"backingMapField", "Ljava/lang/reflect/Field;", "getBackingMapField", "()Ljava/lang/reflect/Field;", "backingMapField$delegate", "Lkotlin/Lazy;", "getBackingMap", "Lcom/facebook/react/bridge/ReadableMap;", "Lcom/facebook/react/uimanager/ReactStylesDiffMap;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReactStylesDiffMapHelperKt {

    @NotNull
    private static final Lazy backingMapField$delegate = LazyKt.lazy(new ExpoModulesPackage$$ExternalSyntheticLambda0(3));

    /* JADX INFO: Access modifiers changed from: private */
    public static final Field backingMapField_delegate$lambda$1() {
        Field declaredField = ReactStylesDiffMap.class.getDeclaredField("backingMap");
        declaredField.setAccessible(true);
        return declaredField;
    }

    @NotNull
    public static final ReadableMap getBackingMap(@NotNull ReactStylesDiffMap reactStylesDiffMap) {
        reactStylesDiffMap.getClass();
        try {
            Object obj = getBackingMapField().get(reactStylesDiffMap);
            obj.getClass();
            return (ReadableMap) obj;
        } catch (ReflectiveOperationException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Unable to access internal_backingMap via reflection", e);
            return null;
        }
    }

    @DoNotStrip
    private static final Field getBackingMapField() {
        Object value = backingMapField$delegate.getValue();
        value.getClass();
        return (Field) value;
    }
}
