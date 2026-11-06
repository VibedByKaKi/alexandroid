package expo.modules.kotlin.jni;

import com.amazon.deecomms.nativemodules.util.ReactBridgeSerializer;
import com.facebook.jni.HybridData;
import expo.modules.core.interfaces.DoNotStrip;
import expo.modules.kotlin.typedarray.TypedArray;
import io.ktor.util.PathKt$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u0018\u001a\u00020\u000eH\u0082 J\t\u0010\u0019\u001a\u00020\u001aH\u0096 J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0096 J!\u0010!\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000eH\u0096 J\u0011\u0010\"\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096 J\u0011\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096 J\u0011\u0010&\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096 J\u0011\u0010'\u001a\u00020(2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096 J\u0011\u0010)\u001a\u00020*2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096 J\u0011\u0010+\u001a\u00020,2\u0006\u0010\u001f\u001a\u00020\u000eH\u0096 J\u0019\u0010-\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020#H\u0096 J\u0019\u0010/\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020%H\u0096 J\u0019\u00100\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020\u000eH\u0096 J\u0019\u00101\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020(H\u0096 J\u0019\u00102\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020*H\u0096 J\u0019\u00103\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020,H\u0096 R\u001b\u0010\u0007\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001b\u0010\r\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0013\u0010\u0010R\u001b\u0010\u0015\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0016\u0010\u0010¨\u00064"}, d2 = {"Lexpo/modules/kotlin/jni/JavaScriptTypedArray;", "Lexpo/modules/kotlin/jni/JavaScriptObject;", "Lexpo/modules/kotlin/typedarray/TypedArray;", "hybridData", "Lcom/facebook/jni/HybridData;", "<init>", "(Lcom/facebook/jni/HybridData;)V", ReactBridgeSerializer.CONTACT_DISCRIMINATOR_PROPERTY_NAME, "Lexpo/modules/kotlin/jni/TypedArrayKind;", "getKind", "()Lexpo/modules/kotlin/jni/TypedArrayKind;", "kind$delegate", "Lkotlin/Lazy;", "length", "", "getLength", "()I", "length$delegate", "byteLength", "getByteLength", "byteLength$delegate", "byteOffset", "getByteOffset", "byteOffset$delegate", "getRawKind", "toDirectBuffer", "Ljava/nio/ByteBuffer;", "read", "", "buffer", "", "position", "size", "write", "readByte", "", "read2Byte", "", "read4Byte", "read8Byte", "", "readFloat", "", "readDouble", "", "writeByte", "value", "write2Byte", "write4Byte", "write8Byte", "writeFloat", "writeDouble", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@DoNotStrip
@SourceDebugExtension({"SMAP\nJavaScriptTypedArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaScriptTypedArray.kt\nexpo/modules/kotlin/jni/JavaScriptTypedArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n230#2,2:71\n*S KotlinDebug\n*F\n+ 1 JavaScriptTypedArray.kt\nexpo/modules/kotlin/jni/JavaScriptTypedArray\n*L\n33#1:71,2\n*E\n"})
/* loaded from: classes9.dex */
public final class JavaScriptTypedArray extends JavaScriptObject implements TypedArray {

    /* renamed from: byteLength$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy byteLength;

    /* renamed from: byteOffset$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy byteOffset;

    /* renamed from: kind$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy kind;

    /* renamed from: length$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy length;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @DoNotStrip
    public JavaScriptTypedArray(@NotNull HybridData hybridData) {
        super(hybridData);
        hybridData.getClass();
        final int i = 0;
        this.kind = LazyKt.lazy(new Function0(this) { // from class: expo.modules.kotlin.jni.JavaScriptTypedArray$$ExternalSyntheticLambda0
            public final /* synthetic */ JavaScriptTypedArray f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypedArrayKind kind_delegate$lambda$1;
                int length_delegate$lambda$2;
                int i2 = i;
                JavaScriptTypedArray javaScriptTypedArray = this.f$0;
                switch (i2) {
                    case 0:
                        kind_delegate$lambda$1 = JavaScriptTypedArray.kind_delegate$lambda$1(javaScriptTypedArray);
                        return kind_delegate$lambda$1;
                    case 1:
                        length_delegate$lambda$2 = JavaScriptTypedArray.length_delegate$lambda$2(javaScriptTypedArray);
                        break;
                    case 2:
                        length_delegate$lambda$2 = JavaScriptTypedArray.byteLength_delegate$lambda$3(javaScriptTypedArray);
                        break;
                    default:
                        length_delegate$lambda$2 = JavaScriptTypedArray.byteOffset_delegate$lambda$4(javaScriptTypedArray);
                        break;
                }
                return Integer.valueOf(length_delegate$lambda$2);
            }
        });
        final int i2 = 1;
        this.length = LazyKt.lazy(new Function0(this) { // from class: expo.modules.kotlin.jni.JavaScriptTypedArray$$ExternalSyntheticLambda0
            public final /* synthetic */ JavaScriptTypedArray f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypedArrayKind kind_delegate$lambda$1;
                int length_delegate$lambda$2;
                int i22 = i2;
                JavaScriptTypedArray javaScriptTypedArray = this.f$0;
                switch (i22) {
                    case 0:
                        kind_delegate$lambda$1 = JavaScriptTypedArray.kind_delegate$lambda$1(javaScriptTypedArray);
                        return kind_delegate$lambda$1;
                    case 1:
                        length_delegate$lambda$2 = JavaScriptTypedArray.length_delegate$lambda$2(javaScriptTypedArray);
                        break;
                    case 2:
                        length_delegate$lambda$2 = JavaScriptTypedArray.byteLength_delegate$lambda$3(javaScriptTypedArray);
                        break;
                    default:
                        length_delegate$lambda$2 = JavaScriptTypedArray.byteOffset_delegate$lambda$4(javaScriptTypedArray);
                        break;
                }
                return Integer.valueOf(length_delegate$lambda$2);
            }
        });
        final int i3 = 2;
        this.byteLength = LazyKt.lazy(new Function0(this) { // from class: expo.modules.kotlin.jni.JavaScriptTypedArray$$ExternalSyntheticLambda0
            public final /* synthetic */ JavaScriptTypedArray f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypedArrayKind kind_delegate$lambda$1;
                int length_delegate$lambda$2;
                int i22 = i3;
                JavaScriptTypedArray javaScriptTypedArray = this.f$0;
                switch (i22) {
                    case 0:
                        kind_delegate$lambda$1 = JavaScriptTypedArray.kind_delegate$lambda$1(javaScriptTypedArray);
                        return kind_delegate$lambda$1;
                    case 1:
                        length_delegate$lambda$2 = JavaScriptTypedArray.length_delegate$lambda$2(javaScriptTypedArray);
                        break;
                    case 2:
                        length_delegate$lambda$2 = JavaScriptTypedArray.byteLength_delegate$lambda$3(javaScriptTypedArray);
                        break;
                    default:
                        length_delegate$lambda$2 = JavaScriptTypedArray.byteOffset_delegate$lambda$4(javaScriptTypedArray);
                        break;
                }
                return Integer.valueOf(length_delegate$lambda$2);
            }
        });
        final int i4 = 3;
        this.byteOffset = LazyKt.lazy(new Function0(this) { // from class: expo.modules.kotlin.jni.JavaScriptTypedArray$$ExternalSyntheticLambda0
            public final /* synthetic */ JavaScriptTypedArray f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                TypedArrayKind kind_delegate$lambda$1;
                int length_delegate$lambda$2;
                int i22 = i4;
                JavaScriptTypedArray javaScriptTypedArray = this.f$0;
                switch (i22) {
                    case 0:
                        kind_delegate$lambda$1 = JavaScriptTypedArray.kind_delegate$lambda$1(javaScriptTypedArray);
                        return kind_delegate$lambda$1;
                    case 1:
                        length_delegate$lambda$2 = JavaScriptTypedArray.length_delegate$lambda$2(javaScriptTypedArray);
                        break;
                    case 2:
                        length_delegate$lambda$2 = JavaScriptTypedArray.byteLength_delegate$lambda$3(javaScriptTypedArray);
                        break;
                    default:
                        length_delegate$lambda$2 = JavaScriptTypedArray.byteOffset_delegate$lambda$4(javaScriptTypedArray);
                        break;
                }
                return Integer.valueOf(length_delegate$lambda$2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int byteLength_delegate$lambda$3(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("byteLength").getDouble();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int byteOffset_delegate$lambda$4(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("byteOffset").getDouble();
    }

    private final native int getRawKind();

    /* JADX INFO: Access modifiers changed from: private */
    public static final TypedArrayKind kind_delegate$lambda$1(JavaScriptTypedArray javaScriptTypedArray) {
        int rawKind = javaScriptTypedArray.getRawKind();
        for (TypedArrayKind typedArrayKind : TypedArrayKind.getEntries()) {
            if (typedArrayKind.getValue() == rawKind) {
                return typedArrayKind;
            }
        }
        PathKt$$ExternalSyntheticBUOutline0.m("Collection contains no element matching the predicate.");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int length_delegate$lambda$2(JavaScriptTypedArray javaScriptTypedArray) {
        return (int) javaScriptTypedArray.getProperty("length").getDouble();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getByteLength() {
        return ((Number) this.byteLength.getValue()).intValue();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getByteOffset() {
        return ((Number) this.byteOffset.getValue()).intValue();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    @NotNull
    public TypedArrayKind getKind() {
        return (TypedArrayKind) this.kind.getValue();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public int getLength() {
        return ((Number) this.length.getValue()).intValue();
    }

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void read(@NotNull byte[] buffer, int position, int size);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native short read2Byte(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native int read4Byte(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native long read8Byte(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native byte readByte(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native double readDouble(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native float readFloat(int position);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    @NotNull
    public native ByteBuffer toDirectBuffer();

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void write(@NotNull byte[] buffer, int position, int size);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void write2Byte(int position, short value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void write4Byte(int position, int value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void write8Byte(int position, long value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void writeByte(int position, byte value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void writeDouble(int position, double value);

    @Override // expo.modules.kotlin.typedarray.TypedArray
    public native void writeFloat(int position, float value);
}
