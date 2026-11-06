package expo.modules.kotlin.jni;

import com.facebook.jni.HybridData;
import expo.modules.core.interfaces.DoNotStrip;
import kotlin.Metadata;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0004J\b\u0010\b\u001a\u00020\u0007H\u0016J\t\u0010\t\u001a\u00020\nH\u0086 R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "Lexpo/modules/kotlin/jni/Destructible;", "mHybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "finalize", "", "deallocate", JoinPoint.SYNCHRONIZATION_LOCK, "Lexpo/modules/kotlin/jni/JavaScriptObject;", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
/* loaded from: classes9.dex */
public final class JavaScriptWeakObject implements Destructible {

    @DoNotStrip
    @NotNull
    private final HybridData mHybridData;

    @DoNotStrip
    public JavaScriptWeakObject(@NotNull HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }

    @Override // expo.modules.kotlin.jni.Destructible
    public void deallocate() {
        this.mHybridData.resetNative();
    }

    public final void finalize() throws Throwable {
        deallocate();
    }

    @NotNull
    public final native JavaScriptObject lock();
}
