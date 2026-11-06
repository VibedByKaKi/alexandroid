package expo.modules.kotlin.jni;

import expo.modules.kotlin.jni.JavaScriptObject;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¨\u0006\u0004"}, d2 = {"toCppOptions", "", "", "Lexpo/modules/kotlin/jni/JavaScriptObject$PropertyDescriptor;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nJavaScriptObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaScriptObject.kt\nexpo/modules/kotlin/jni/JavaScriptObjectKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1803#2,3:154\n*S KotlinDebug\n*F\n+ 1 JavaScriptObject.kt\nexpo/modules/kotlin/jni/JavaScriptObjectKt\n*L\n150#1:154,3\n*E\n"})
/* loaded from: classes9.dex */
public final class JavaScriptObjectKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int toCppOptions(List<? extends JavaScriptObject.PropertyDescriptor> list) {
        Iterator<T> it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            i |= ((JavaScriptObject.PropertyDescriptor) it2.next()).getValue();
        }
        return i;
    }
}
