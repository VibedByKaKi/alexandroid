package com.amazonaws.regions;

import com.amazon.rtcsc.utils.RtcscLogger;
import com.amazonaws.DefaultRequest;
import com.esotericsoftware.kryo.KryoException;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.internal.mlkit_common.zzay;
import com.google.android.gms.internal.mlkit_vision_barcode.zzfa;
import com.google.android.gms.internal.mlkit_vision_common.zzae;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.InvalidProtocolBufferException;
import com.mapbox.bindgen.RecordUtils;
import com.mapbox.maps.extension.style.expressions.generated.Expression;
import com.mapbox.maps.extension.style.layers.generated.FillExtrusionLayer;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.types.StyleTransition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt__StringsJVMKt;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public abstract /* synthetic */ class RegionDefaults$$ExternalSyntheticOutline0 {
    public static FieldDescriptor.Builder m(int i, FieldDescriptor.Builder builder, String str) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        builder.withProperty(zzayVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static FieldDescriptor.Builder m$1(int i, FieldDescriptor.Builder builder, String str) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i);
        builder.withProperty(zzfaVar.zzb()).build();
        return FieldDescriptor.builder(str);
    }

    public static FieldDescriptor m$2(int i, FieldDescriptor.Builder builder) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i);
        return builder.withProperty(zzfaVar.zzb()).build();
    }

    public static FieldDescriptor m$3(int i, FieldDescriptor.Builder builder) {
        zzae zzaeVar = new zzae();
        zzaeVar.zza(i);
        return builder.withProperty(zzaeVar.zzb()).build();
    }

    public static Region m(String str, String str2, ArrayList arrayList) {
        Region region = new Region(str, str2);
        arrayList.add(region);
        return region;
    }

    public static FieldDescriptor m$1(int i, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        return builder.withProperty(zzayVar.zzb()).build();
    }

    public static FieldDescriptor m(int i, FieldDescriptor.Builder builder) {
        return builder.withProperty(AtProtobuf.builder().tag(i).build()).build();
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static void m23765m$1(int i, FieldDescriptor.Builder builder) {
        zzfa zzfaVar = new zzfa();
        zzfaVar.zza(i);
        builder.withProperty(zzfaVar.zzb()).build();
    }

    public static Expression.ExpressionBuilder m(Expression[] expressionArr, String str) {
        expressionArr.getClass();
        return new Expression.ExpressionBuilder(str);
    }

    public static Expression m(String str, Function1 function1) {
        function1.getClass();
        Expression.ExpressionBuilder expressionBuilder = new Expression.ExpressionBuilder(str);
        function1.invoke(expressionBuilder);
        return expressionBuilder.build();
    }

    public static PropertyValue m(StyleTransition styleTransition, String str, StyleTransition styleTransition2) {
        styleTransition.getClass();
        return new PropertyValue(str, styleTransition2);
    }

    public static PropertyValue m(String str, Expression expression, Expression expression2) {
        expression.getClass();
        return new PropertyValue(str, expression2);
    }

    public static Object m(int i) {
        return DescriptorProtos.getDescriptor().getMessageTypes().get(i);
    }

    public static String m(char c, String str, String str2) {
        return str + c + str2;
    }

    public static String m(InvalidProtocolBufferException invalidProtocolBufferException, StringBuilder sb) {
        sb.append(invalidProtocolBufferException.getMessage());
        return sb.toString();
    }

    public static String m(Class cls, String str, String str2, int i) {
        return str + cls + str2 + i;
    }

    public static String m(String str, String str2, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(str));
        sb.append(str2);
        return sb.toString();
    }

    public static String m(Locale locale, String str, Locale locale2, char c, char c2) {
        String replace$default;
        locale.getClass();
        String upperCase = str.toUpperCase(locale2);
        upperCase.getClass();
        replace$default = StringsKt__StringsJVMKt.replace$default(upperCase, c, c2, false, 4, (Object) null);
        return replace$default;
    }

    public static ArrayList m(int i, HashMap hashMap, ArrayList arrayList, int i2, String str) {
        hashMap.put(Integer.valueOf(i), arrayList);
        ArrayList arrayList2 = new ArrayList(i2);
        arrayList2.add(str);
        return arrayList2;
    }

    public static void m(double d, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Double.valueOf(d)));
        sb.append(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m23763m(int i, FieldDescriptor.Builder builder) {
        zzay zzayVar = new zzay();
        zzayVar.zza(i);
        builder.withProperty(zzayVar.zzb()).build();
    }

    public static void m(int i, String str, String str2) {
        Log.w(str2, str + i);
    }

    public static void m(long j, String str, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(Long.valueOf(j)));
        sb.append(str);
    }

    public static void m(Expression expression, String str, Expression expression2, FillExtrusionLayer fillExtrusionLayer) {
        expression.getClass();
        fillExtrusionLayer.setProperty$extension_style_release(new PropertyValue<>(str, expression2));
    }

    public static void m(Class cls, StringBuilder sb, String str, KryoException kryoException) {
        sb.append(cls.getName());
        sb.append(str);
        kryoException.addTrace(sb.toString());
    }

    public static void m(String str, String str2, RtcscLogger rtcscLogger) {
        rtcscLogger.i(str + str2);
    }

    public static void m(String str, String str2, String str3) {
        Log.w(str3, str + str2);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static void m23764m(String str, String str2, StringBuilder sb) {
        sb.append(RecordUtils.fieldToString(str));
        sb.append(str2);
    }

    public static boolean m(DefaultRequest defaultRequest, String str, String str2) {
        defaultRequest.setResourcePath(str);
        return defaultRequest.getHeaders().containsKey(str2);
    }

    public static boolean m(String str, String str2, String str3, DefaultRequest defaultRequest, String str4) {
        defaultRequest.setResourcePath(str.replace(str2, str3));
        return defaultRequest.getHeaders().containsKey(str4);
    }
}
