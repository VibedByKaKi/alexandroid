package expo.modules.kotlin.objects;

import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.JSTypeConverter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.Util$$ExternalSyntheticLambda2;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/objects/ConstantComponent;", "", "name", "", "getter", "Lkotlin/Function0;", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getName", "()Ljava/lang/String;", "getGetter", "()Lkotlin/jvm/functions/Function0;", "attachToJSObject", "", "jsObject", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ConstantComponent {

    @NotNull
    private final Function0<Object> getter;

    @NotNull
    private final String name;

    public ConstantComponent(@NotNull String str, @NotNull Function0<? extends Object> function0) {
        str.getClass();
        function0.getClass();
        this.name = str;
        this.getter = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object attachToJSObject$lambda$0(ConstantComponent constantComponent) {
        return JSTypeConverter.convertToJSValue$default(JSTypeConverter.INSTANCE, constantComponent.getter.invoke(), null, false, 6, null);
    }

    public final void attachToJSObject(@NotNull JSDecoratorsBridgingObject jsObject) {
        jsObject.getClass();
        jsObject.registerConstant(this.name, new Util$$ExternalSyntheticLambda2(this, 17));
    }

    @NotNull
    public final Function0<Object> getGetter() {
        return this.getter;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}
