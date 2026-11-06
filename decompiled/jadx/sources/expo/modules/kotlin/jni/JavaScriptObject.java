package expo.modules.kotlin.jni;

import com.dee.app.metrics.MetricsConstants;
import com.facebook.jni.HybridData;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.AppContext$$ExternalSyntheticLambda2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u00014B\u0011\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0086 J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0086 J\u0013\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nH\u0086\u0002J\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\u000fH\u0086 ¢\u0006\u0002\u0010\u0010J\t\u0010\u0011\u001a\u00020\u0012H\u0086 J\u0019\u0010\u0013\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0082 J\u0019\u0010\u0016\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0017H\u0082 J\u001b\u0010\u0018\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0082 J\u001b\u0010\u0019\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0082 J\u001b\u0010\u001a\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0000H\u0082 J\u0011\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\nH\u0082 J!\u0010\u001c\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 J!\u0010\u001f\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 J#\u0010 \u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 J#\u0010!\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 J#\u0010\"\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u001d\u001a\u00020\u001eH\u0082 J\u0011\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020%H\u0082 J\u001b\u0010&\u001a\u00020\u00142\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00140'H\u0000¢\u0006\u0002\b(J\u0011\u0010)\u001a\u00020\u00142\u0006\u0010*\u001a\u00020\u001eH\u0086 J\u0016\u0010+\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007J\u0019\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\u0002J\u0016\u0010+\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001eJ\u0019\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001eH\u0086\u0002J\u0016\u0010+\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0017J\u0019\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0017H\u0086\u0002J\u0018\u0010+\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nJ\u001b\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\nH\u0086\u0002J\u0018\u0010+\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\fJ\u001b\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\fH\u0086\u0002J\u0018\u0010+\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0000J\u001b\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0000H\u0086\u0002J\u0018\u0010+\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010.J\u001b\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010.H\u0086\u0002J&\u0010/\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00072\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020100J&\u0010/\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u001e2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020100J&\u0010/\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00172\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020100J(\u0010/\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020100J(\u0010/\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020100J(\u0010/\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020100J(\u0010/\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\n2\b\u0010-\u001a\u0004\u0018\u00010.2\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020100J\b\u00102\u001a\u00020\u0014H\u0004J\b\u00103\u001a\u00020\u0014H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u00065"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lexpo/modules/kotlin/jni/Destructible;", "mHybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", "isValid", "", "hasProperty", "name", "", "getProperty", "Lexpo/modules/kotlin/jni/JavaScriptValue;", MetricsConstants.Method.CACHE_GET, "getPropertyNames", "", "()[Ljava/lang/String;", "createWeak", "Lexpo/modules/kotlin/jni/JavaScriptWeakObject;", "setBoolProperty", "", "value", "setDoubleProperty", "", "setStringProperty", "setJSValueProperty", "setJSObjectProperty", "unsetProperty", "defineBoolProperty", "options", "", "defineDoubleProperty", "defineStringProperty", "defineJSValueProperty", "defineJSObjectProperty", "defineNativeDeallocator", "deallocator", "Lexpo/modules/kotlin/jni/JNIFunctionBody;", "defineDeallocator", "Lkotlin/Function0;", "defineDeallocator$expo_modules_core_release", "setExternalMemoryPressure", "size", "setProperty", "set", "null", "", "defineProperty", "", "Lexpo/modules/kotlin/jni/JavaScriptObject$PropertyDescriptor;", "finalize", "deallocate", "PropertyDescriptor", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
/* loaded from: classes9.dex */
public class JavaScriptObject implements Destructible {

    @DoNotStrip
    @NotNull
    private final HybridData mHybridData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptObject$PropertyDescriptor;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Configurable", "Enumerable", "Writable", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PropertyDescriptor {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ PropertyDescriptor[] $VALUES;
        public static final PropertyDescriptor Configurable = new PropertyDescriptor("Configurable", 0, 1);
        public static final PropertyDescriptor Enumerable = new PropertyDescriptor("Enumerable", 1, 2);
        public static final PropertyDescriptor Writable = new PropertyDescriptor("Writable", 2, 4);
        private final int value;

        private static final /* synthetic */ PropertyDescriptor[] $values() {
            return new PropertyDescriptor[]{Configurable, Enumerable, Writable};
        }

        static {
            PropertyDescriptor[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private PropertyDescriptor(String str, int i, int i2) {
            this.value = i2;
        }

        @NotNull
        public static EnumEntries<PropertyDescriptor> getEntries() {
            return $ENTRIES;
        }

        public static PropertyDescriptor valueOf(String str) {
            return (PropertyDescriptor) Enum.valueOf(PropertyDescriptor.class, str);
        }

        public static PropertyDescriptor[] values() {
            return (PropertyDescriptor[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    @DoNotStrip
    public JavaScriptObject(@NotNull HybridData hybridData) {
        hybridData.getClass();
        this.mHybridData = hybridData;
    }

    private final native void defineBoolProperty(String name, boolean value, int options);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit defineDeallocator$lambda$0(Function0 function0, Object[] objArr) {
        objArr.getClass();
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final native void defineDoubleProperty(String name, double value, int options);

    private final native void defineJSObjectProperty(String name, JavaScriptObject value, int options);

    private final native void defineJSValueProperty(String name, JavaScriptValue value, int options);

    private final native void defineNativeDeallocator(JNIFunctionBody deallocator);

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, boolean z, List list, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: defineProperty");
            return;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        javaScriptObject.defineProperty(str, z, (List<? extends PropertyDescriptor>) list);
    }

    private final native void defineStringProperty(String name, String value, int options);

    private final native void setBoolProperty(String name, boolean value);

    private final native void setDoubleProperty(String name, double value);

    private final native void setJSObjectProperty(String name, JavaScriptObject value);

    private final native void setJSValueProperty(String name, JavaScriptValue value);

    private final native void setStringProperty(String name, String value);

    private final native void unsetProperty(String name);

    @NotNull
    public final native JavaScriptWeakObject createWeak();

    @Override // expo.modules.kotlin.jni.Destructible
    public void deallocate() {
        this.mHybridData.resetNative();
    }

    public final void defineDeallocator$expo_modules_core_release(@NotNull Function0<Unit> deallocator) {
        deallocator.getClass();
        defineNativeDeallocator(new AppContext$$ExternalSyntheticLambda2(deallocator));
    }

    public final void defineProperty(@NotNull String name, int value, @NotNull List<? extends PropertyDescriptor> options) {
        int cppOptions;
        name.getClass();
        options.getClass();
        double d = value;
        cppOptions = JavaScriptObjectKt.toCppOptions(options);
        defineDoubleProperty(name, d, cppOptions);
    }

    public final void finalize() throws Throwable {
        deallocate();
    }

    @Nullable
    public final JavaScriptValue get(@NotNull String name) {
        name.getClass();
        if (hasProperty(name)) {
            return getProperty(name);
        }
        return null;
    }

    @NotNull
    public final native JavaScriptValue getProperty(@NotNull String name);

    @NotNull
    public final native String[] getPropertyNames();

    public final native boolean hasProperty(@NotNull String name);

    public final boolean isValid() {
        return this.mHybridData.isValid();
    }

    public final void set(@NotNull String name, int value) {
        name.getClass();
        setDoubleProperty(name, value);
    }

    public final native void setExternalMemoryPressure(int size);

    public final void setProperty(@NotNull String name, int value) {
        name.getClass();
        setDoubleProperty(name, value);
    }

    public final void set(@NotNull String name, boolean value) {
        name.getClass();
        setBoolProperty(name, value);
    }

    public final void setProperty(@NotNull String name, boolean value) {
        name.getClass();
        setBoolProperty(name, value);
    }

    public final void set(@NotNull String name, double value) {
        name.getClass();
        setDoubleProperty(name, value);
    }

    public final void setProperty(@NotNull String name, double value) {
        name.getClass();
        setDoubleProperty(name, value);
    }

    public final void set(@NotNull String name, @Nullable String value) {
        name.getClass();
        setStringProperty(name, value);
    }

    public final void setProperty(@NotNull String name, @Nullable String value) {
        name.getClass();
        setStringProperty(name, value);
    }

    public final void set(@NotNull String name, @Nullable JavaScriptValue value) {
        name.getClass();
        setJSValueProperty(name, value);
    }

    public final void setProperty(@NotNull String name, @Nullable JavaScriptValue value) {
        name.getClass();
        setJSValueProperty(name, value);
    }

    public final void set(@NotNull String name, @Nullable JavaScriptObject value) {
        name.getClass();
        setJSObjectProperty(name, value);
    }

    public final void setProperty(@NotNull String name, @Nullable JavaScriptObject value) {
        name.getClass();
        setJSObjectProperty(name, value);
    }

    public final void set(@NotNull String name, @Nullable Void r2) {
        name.getClass();
        unsetProperty(name);
    }

    public final void setProperty(@NotNull String name, @Nullable Void r2) {
        name.getClass();
        unsetProperty(name);
    }

    public final void defineProperty(@NotNull String name, boolean value, @NotNull List<? extends PropertyDescriptor> options) {
        int cppOptions;
        name.getClass();
        options.getClass();
        cppOptions = JavaScriptObjectKt.toCppOptions(options);
        defineBoolProperty(name, value, cppOptions);
    }

    public final void defineProperty(@NotNull String name, double value, @NotNull List<? extends PropertyDescriptor> options) {
        int cppOptions;
        name.getClass();
        options.getClass();
        cppOptions = JavaScriptObjectKt.toCppOptions(options);
        defineDoubleProperty(name, value, cppOptions);
    }

    public final void defineProperty(@NotNull String name, @Nullable String value, @NotNull List<? extends PropertyDescriptor> options) {
        int cppOptions;
        name.getClass();
        options.getClass();
        cppOptions = JavaScriptObjectKt.toCppOptions(options);
        defineStringProperty(name, value, cppOptions);
    }

    public final void defineProperty(@NotNull String name, @Nullable JavaScriptValue value, @NotNull List<? extends PropertyDescriptor> options) {
        int cppOptions;
        name.getClass();
        options.getClass();
        cppOptions = JavaScriptObjectKt.toCppOptions(options);
        defineJSValueProperty(name, value, cppOptions);
    }

    public final void defineProperty(@NotNull String name, @Nullable JavaScriptObject value, @NotNull List<? extends PropertyDescriptor> options) {
        int cppOptions;
        name.getClass();
        options.getClass();
        cppOptions = JavaScriptObjectKt.toCppOptions(options);
        defineJSObjectProperty(name, value, cppOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, int i, List list, int i2, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: defineProperty");
            return;
        }
        if ((i2 & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        javaScriptObject.defineProperty(str, i, (List<? extends PropertyDescriptor>) list);
    }

    public final void defineProperty(@NotNull String name, @Nullable Void r2, @NotNull List<? extends PropertyDescriptor> options) {
        int cppOptions;
        name.getClass();
        options.getClass();
        cppOptions = JavaScriptObjectKt.toCppOptions(options);
        defineJSObjectProperty(name, null, cppOptions);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, double d, List list, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: defineProperty");
            return;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        javaScriptObject.defineProperty(str, d, (List<? extends PropertyDescriptor>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, String str2, List list, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: defineProperty");
            return;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        javaScriptObject.defineProperty(str, str2, (List<? extends PropertyDescriptor>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, JavaScriptValue javaScriptValue, List list, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: defineProperty");
            return;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        javaScriptObject.defineProperty(str, javaScriptValue, (List<? extends PropertyDescriptor>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, JavaScriptObject javaScriptObject2, List list, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: defineProperty");
            return;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        javaScriptObject.defineProperty(str, javaScriptObject2, (List<? extends PropertyDescriptor>) list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void defineProperty$default(JavaScriptObject javaScriptObject, String str, Void r2, List list, int i, Object obj) {
        if (obj != null) {
            Buffer$$ExternalSyntheticBUOutline0.m$1("Super calls with default arguments not supported in this target, function: defineProperty");
            return;
        }
        if ((i & 4) != 0) {
            list = CollectionsKt.emptyList();
        }
        javaScriptObject.defineProperty(str, r2, (List<? extends PropertyDescriptor>) list);
    }
}
