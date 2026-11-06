package expo.modules.kotlin.types;

import android.net.Uri;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.typedarray.RawTypedArrayHolder;
import expo.modules.kotlin.types.ExperimentalJSTypeConverter;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00012\b\u0010\t\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\n\u001a\u00020\u000b\"\u0006\b\u0000\u0010\f\u0018\u0001H\u0080\b¢\u0006\u0002\b\rR\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lexpo/modules/kotlin/types/ReturnType;", "", "klass", "Lkotlin/reflect/KClass;", "<init>", "(Lkotlin/reflect/KClass;)V", "converter", "Lexpo/modules/kotlin/types/ExperimentalJSTypeConverter;", "convertToJS", "value", "inheritFrom", "", ExifInterface.GPS_DIRECTION_TRUE, "inheritFrom$expo_modules_core_release", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReturnType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReturnType.kt\nexpo/modules/kotlin/types/ReturnType\n*L\n1#1,217:1\n213#1,2:218\n213#1,2:220\n213#1,2:222\n213#1,2:224\n213#1,2:226\n213#1,2:228\n*S KotlinDebug\n*F\n+ 1 ReturnType.kt\nexpo/modules/kotlin/types/ReturnType\n*L\n198#1:218,2\n199#1:220,2\n200#1:222,2\n201#1:224,2\n202#1:226,2\n203#1:228,2\n*E\n"})
/* loaded from: classes9.dex */
public final class ReturnType {

    @NotNull
    private final ExperimentalJSTypeConverter<?> converter;

    @NotNull
    private final KClass<?> klass;

    public ReturnType(@NotNull KClass<?> kClass) {
        kClass.getClass();
        this.klass = kClass;
        ExperimentalJSTypeConverter<?> passThroughConverter = Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Unit.class)) ? new ExperimentalJSTypeConverter.PassThroughConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Bundle.class)) ? new ExperimentalJSTypeConverter.BundleConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(int[].class)) ? new ExperimentalJSTypeConverter.IntArrayConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(float[].class)) ? new ExperimentalJSTypeConverter.FloatArrayConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(double[].class)) ? new ExperimentalJSTypeConverter.DoubleArrayConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(boolean[].class)) ? new ExperimentalJSTypeConverter.BooleanArrayConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(byte[].class)) ? new ExperimentalJSTypeConverter.ByteArrayConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(URI.class)) ? new ExperimentalJSTypeConverter.URIConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(URL.class)) ? new ExperimentalJSTypeConverter.URLConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Uri.class)) ? new ExperimentalJSTypeConverter.AndroidUriConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(File.class)) ? new ExperimentalJSTypeConverter.FileConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Pair.class)) ? new ExperimentalJSTypeConverter.PairConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Long.TYPE)) ? new ExperimentalJSTypeConverter.LongConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Duration.class)) ? new ExperimentalJSTypeConverter.DurationConverter() : Intrinsics.areEqual(kClass, Reflection.getOrCreateKotlinClass(Object.class)) ? new ExperimentalJSTypeConverter.AnyConverter() : null;
        this.converter = passThroughConverter == null ? Map.class.isAssignableFrom(JvmClassMappingKt.getJavaClass(this.klass)) ? new ExperimentalJSTypeConverter.MapConverter() : Enum.class.isAssignableFrom(JvmClassMappingKt.getJavaClass(this.klass)) ? new ExperimentalJSTypeConverter.EnumConverter() : Record.class.isAssignableFrom(JvmClassMappingKt.getJavaClass(this.klass)) ? new ExperimentalJSTypeConverter.RecordConverter() : RawTypedArrayHolder.class.isAssignableFrom(JvmClassMappingKt.getJavaClass(this.klass)) ? new ExperimentalJSTypeConverter.RawTypedArrayHolderConverter() : Object[].class.isAssignableFrom(JvmClassMappingKt.getJavaClass(this.klass)) ? new ExperimentalJSTypeConverter.ArrayConverter() : Collection.class.isAssignableFrom(JvmClassMappingKt.getJavaClass(this.klass)) ? new ExperimentalJSTypeConverter.CollectionConverter() : new ExperimentalJSTypeConverter.PassThroughConverter() : passThroughConverter;
    }

    @Nullable
    public final Object convertToJS(@Nullable Object value) {
        return this.converter.convertToJS(value);
    }

    public final /* synthetic */ <T> boolean inheritFrom$expo_modules_core_release() {
        Class javaClass = JvmClassMappingKt.getJavaClass(this.klass);
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return Object.class.isAssignableFrom(javaClass);
    }
}
