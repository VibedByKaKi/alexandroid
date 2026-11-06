package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import defpackage.a$$ExternalSyntheticOutline0;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.jni.decorators.JSDecoratorsBridgingObject;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u000bH\u0082 J\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0086 J\b\u0010\u0014\u001a\u00020\u0011H\u0004J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000f¨\u0006\u0017"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptModuleObject;", "Lexpo/modules/kotlin/jni/Destructible;", "jniDeallocator", "Lexpo/modules/kotlin/jni/JNIDeallocator;", "name", "", "<init>", "(Lexpo/modules/kotlin/jni/JNIDeallocator;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "mHybridData", "Lcom/facebook/jni/HybridData;", "initHybrid", "isValid", "", "()Z", "decorate", "", "decorator", "Lexpo/modules/kotlin/jni/decorators/JSDecoratorsBridgingObject;", "finalize", "deallocate", "toString", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
/* loaded from: classes9.dex */
public final class JavaScriptModuleObject implements Destructible {

    @DoNotStrip
    @NotNull
    private final HybridData mHybridData;

    @NotNull
    private final String name;

    public JavaScriptModuleObject(@NotNull JNIDeallocator jNIDeallocator, @NotNull String str) {
        jNIDeallocator.getClass();
        str.getClass();
        this.name = str;
        this.mHybridData = initHybrid();
        jNIDeallocator.addReference(this);
    }

    private final native HybridData initHybrid();

    @Override // expo.modules.kotlin.jni.Destructible
    public void deallocate() {
        this.mHybridData.resetNative();
    }

    public final native void decorate(@NotNull JSDecoratorsBridgingObject decorator);

    public final void finalize() throws Throwable {
        deallocate();
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("JavaScriptModuleObject_", this.name);
    }
}
