package expo.modules.kotlin.types;

import expo.modules.kotlin.jni.JavaScriptTypedArray;
import expo.modules.kotlin.typedarray.TypedArray;
import kotlin.Metadata;
import kotlin.time.InstantKt$$ExternalSyntheticLambda1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lexpo/modules/kotlin/types/TypedArrayTypeConverter;", "Lexpo/modules/kotlin/types/BaseTypeArrayConverter;", "Lexpo/modules/kotlin/typedarray/TypedArray;", "<init>", "()V", "isTrivial", "", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class TypedArrayTypeConverter extends BaseTypeArrayConverter<TypedArray> {
    public TypedArrayTypeConverter() {
        super(new InstantKt$$ExternalSyntheticLambda1(16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypedArray _init_$lambda$0(JavaScriptTypedArray javaScriptTypedArray) {
        javaScriptTypedArray.getClass();
        return javaScriptTypedArray;
    }

    @Override // expo.modules.kotlin.types.BaseTypeArrayConverter, expo.modules.kotlin.types.NonNullableTypeConverter, expo.modules.kotlin.types.TypeConverter
    public boolean isTrivial() {
        return true;
    }
}
