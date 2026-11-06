package expo.modules.kotlin.jni.decorators;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.NativeMap;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.jni.Destructible;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.JNIAsyncFunctionBody;
import expo.modules.kotlin.jni.JNIDeallocator;
import expo.modules.kotlin.jni.JNIFunctionBody;
import expo.modules.kotlin.jni.JNINoArgsFunctionBody;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0007H\u0082 J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086 J<\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0086 ¢\u0006\u0002\u0010\u0018J<\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u001aH\u0086 ¢\u0006\u0002\u0010\u001bJV\u0010\u001c\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00112\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0010\"\u001a\u0004\u0018\u00010\u0017H\u0086 ¢\u0006\u0002\u0010#J\u001b\u0010$\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010%H\u0086 J\u0019\u0010&\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u0000H\u0086 JR\u0010(\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010+2\u0006\u0010,\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0086 ¢\u0006\u0002\u0010-J\b\u0010.\u001a\u00020\nH\u0016J\b\u0010/\u001a\u00020\nH\u0004R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "Lexpo/modules/kotlin/jni/Destructible;", "jniDeallocator", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;)V", "mHybridData", "Lcom/facebook/jni/HybridData;", "initHybrid", "registerConstants", "", "constants", "Lcom/facebook/react/bridge/NativeMap;", "registerSyncFunction", "name", "", "takesOwner", "", "enumerable", "desiredTypes", "", "Lexpo/modules/kotlin/jni/ExpectedType;", "body", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "registerAsyncFunction", "Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;", "(Ljava/lang/String;ZZ[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIAsyncFunctionBody;)V", "registerProperty", "getterTakesOwner", "getterExpectedType", "getter", "setterTakesOwner", "setterExpectedType", "setter", "(Ljava/lang/String;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "registerConstant", "Lexpo/modules/kotlin/jni/JNINoArgsFunctionBody;", "registerObject", "jsDecoratorsBridgingObject", "registerClass", "prototypeDecorator", "ownerClass", "Ljava/lang/Class;", "isSharedRef", "(Ljava/lang/String;Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;ZLjava/lang/Class;Z[Lexpo/modules/kotlin/jni/ExpectedType;Lexpo/modules/kotlin/jni/JNIFunctionBody;)V", "deallocate", "finalize", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class JSDecoratorsBridgingObject implements Destructible {

    @DoNotStrip
    @NotNull
    private final HybridData mHybridData;

    public JSDecoratorsBridgingObject(@NotNull JNIDeallocator jNIDeallocator) {
        jNIDeallocator.getClass();
        this.mHybridData = initHybrid();
        jNIDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    @Override // expo.modules.kotlin.jni.Destructible
    public void deallocate() {
        this.mHybridData.resetNative();
    }

    public final void finalize() throws Throwable {
        deallocate();
    }

    public final native void registerAsyncFunction(@NotNull String name, boolean takesOwner, boolean enumerable, @NotNull ExpectedType[] desiredTypes, @NotNull JNIAsyncFunctionBody body);

    public final native void registerClass(@NotNull String name, @NotNull JSDecoratorsBridgingObject prototypeDecorator, boolean takesOwner, @Nullable Class<?> ownerClass, boolean isSharedRef, @NotNull ExpectedType[] desiredTypes, @NotNull JNIFunctionBody body);

    public final native void registerConstant(@NotNull String name, @Nullable JNINoArgsFunctionBody getter);

    public final native void registerConstants(@NotNull NativeMap constants);

    public final native void registerObject(@NotNull String name, @NotNull JSDecoratorsBridgingObject jsDecoratorsBridgingObject);

    public final native void registerProperty(@NotNull String name, boolean getterTakesOwner, @NotNull ExpectedType[] getterExpectedType, @Nullable JNIFunctionBody getter, boolean setterTakesOwner, @NotNull ExpectedType[] setterExpectedType, @Nullable JNIFunctionBody setter);

    public final native void registerSyncFunction(@NotNull String name, boolean takesOwner, boolean enumerable, @NotNull ExpectedType[] desiredTypes, @NotNull JNIFunctionBody body);
}
