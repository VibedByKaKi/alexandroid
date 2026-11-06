package expo.modules.kotlin.functions;

import com.amazon.dee.app.elements.ElementsRouteKeys;
import com.mapbox.maps.Snapshotter$$ExternalSyntheticLambda1;
import expo.modules.kotlin.AppContext;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.ReturnType;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BT\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012-\u0010\t\u001a)\u0012\u001d\u0012\u001b\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\f\b\f\u0012\b\b\u0002\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0002\b\u0017J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0003H\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R5\u0010\t\u001a)\u0012\u001d\u0012\u001b\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\u0005¢\u0006\f\b\f\u0012\b\b\u0002\u0012\u0004\b\b(\r\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/functions/SyncFunctionComponent;", "Lexpo/modules/kotlin/functions/AnyFunction;", "name", "", "argTypes", "", "Lexpo/modules/kotlin/types/AnyType;", "returnType", "Lexpo/modules/kotlin/types/ReturnType;", "body", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", ElementsRouteKeys.ARGS, "<init>", "(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V", "callUserImplementation", "appContext", "Lexpo/modules/kotlin/AppContext;", "([Ljava/lang/Object;Lexpo/modules/kotlin/AppContext;)Ljava/lang/Object;", "getJNIFunctionBody", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "moduleName", "getJNIFunctionBody$expo_modules_core_release", "attachToJSObject", "", "jsObject", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSyncFunctionComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SyncFunctionComponent.kt\nexpo/modules/kotlin/functions/SyncFunctionComponent\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ExceptionDecorator.kt\nexpo/modules/kotlin/exception/ExceptionDecoratorKt\n+ 4 CodedException.kt\nexpo/modules/kotlin/exception/CodedExceptionKt\n*L\n1#1,42:1\n37#2:43\n36#2,3:44\n5#3,4:47\n11#4,6:51\n*S KotlinDebug\n*F\n+ 1 SyncFunctionComponent.kt\nexpo/modules/kotlin/functions/SyncFunctionComponent\n*L\n37#1:43\n37#1:44,3\n23#1:47,4\n23#1:51,6\n*E\n"})
/* loaded from: classes9.dex */
public final class SyncFunctionComponent extends AnyFunction {

    @NotNull
    private final Function1<Object[], Object> body;

    @NotNull
    private final ReturnType returnType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SyncFunctionComponent(@NotNull String str, @NotNull AnyType[] anyTypeArr, @NotNull ReturnType returnType, @NotNull Function1<? super Object[], ? extends Object> function1) {
        super(str, anyTypeArr);
        str.getClass();
        anyTypeArr.getClass();
        returnType.getClass();
        function1.getClass();
        this.returnType = returnType;
        this.body = function1;
    }

    public static /* synthetic */ Object callUserImplementation$default(SyncFunctionComponent syncFunctionComponent, Object[] objArr, AppContext appContext, int i, Object obj) {
        if ((i & 2) != 0) {
            appContext = null;
        }
        return syncFunctionComponent.callUserImplementation(objArr, appContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJNIFunctionBody$lambda$2(SyncFunctionComponent syncFunctionComponent, String str, AppContext appContext, Object[] objArr) {
        CodedException codedException;
        objArr.getClass();
        try {
            return syncFunctionComponent.returnType.convertToJS(syncFunctionComponent.callUserImplementation(objArr, appContext));
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                codedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException2 = (expo.modules.core.errors.CodedException) th;
                String code = codedException2.getCode();
                code.getClass();
                codedException = new CodedException(code, codedException2.getMessage(), codedException2.getCause());
            } else {
                codedException = new UnexpectedException(th);
            }
            throw new FunctionCallException(syncFunctionComponent.getName(), str, codedException);
        }
    }

    @Override // expo.modules.kotlin.functions.AnyFunction
    public void attachToJSObject(@NotNull AppContext appContext, @NotNull JSDecoratorsBridgingObject jsObject, @NotNull String moduleName) {
        appContext.getClass();
        jsObject.getClass();
        moduleName.getClass();
        jsObject.registerSyncFunction(getName(), getTakesOwner$expo_modules_core_release(), getIsEnumerable(), (ExpectedType[]) getCppRequiredTypes$expo_modules_core_release().toArray(new ExpectedType[0]), getJNIFunctionBody$expo_modules_core_release(moduleName, appContext));
    }

    @Nullable
    public final Object callUserImplementation(@NotNull Object[] args, @Nullable AppContext appContext) {
        args.getClass();
        return this.body.invoke(AnyFunction.convertArgs$default(this, args, appContext, false, 4, null));
    }

    @NotNull
    public final JNIFunctionBody getJNIFunctionBody$expo_modules_core_release(@NotNull String moduleName, @Nullable AppContext appContext) {
        moduleName.getClass();
        return new Snapshotter$$ExternalSyntheticLambda1(this, 22, moduleName, appContext);
    }
}
