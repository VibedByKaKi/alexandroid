package com.google.gson;

import android.content.Context;
import android.text.Editable;
import com.google.android.datatransport.Transformer;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.material.carousel.MaskableFrameLayout;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.messaging.FcmBroadcastProcessor;
import com.google.firebase.messaging.reporting.MessagingClientEventExtension;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.gson.internal.ObjectConstructor;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Gson$$ExternalSyntheticBUOutline0 implements ShapeAppearanceModel.CornerSizeUnaryOperator, TextInputLayout.LengthCounter, LibraryVersionComponent.VersionExtractor, Continuation, Transformer, ObjectConstructor {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Gson$$ExternalSyntheticBUOutline0(int i) {
        this.$r8$classId = i;
    }

    public static /* synthetic */ void m(Object obj, Object obj2) {
        throw new JsonParseException("cannot deserialize " + obj + ((Object) " subtype named ") + obj2 + ((Object) "; did you forget to register a subtype?"));
    }

    public static /* synthetic */ void m$1(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    @Override // com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((MessagingClientEventExtension) obj).toByteArray();
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.$r8$classId) {
            case 14:
                return new ArrayList();
            case 15:
                return new LinkedHashSet();
            case 16:
                return new TreeSet();
            case 17:
                return new ArrayDeque();
            case 18:
                return new LinkedHashMap();
            case 19:
                return new TreeMap();
            case 20:
                return new ConcurrentHashMap();
            default:
                return new ConcurrentSkipListMap();
        }
    }

    @Override // com.google.android.material.textfield.TextInputLayout.LengthCounter
    public int countLength(Editable editable) {
        int lambda$new$0;
        lambda$new$0 = TextInputLayout.lambda$new$0(editable);
        return lambda$new$0;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$0;
        String lambda$getComponents$1;
        String lambda$getComponents$2;
        String lambda$getComponents$3;
        Context context = (Context) obj;
        switch (this.$r8$classId) {
            case 6:
                lambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$0(context);
                return lambda$getComponents$0;
            case 7:
                lambda$getComponents$1 = FirebaseCommonRegistrar.lambda$getComponents$1(context);
                return lambda$getComponents$1;
            case 8:
                lambda$getComponents$2 = FirebaseCommonRegistrar.lambda$getComponents$2(context);
                return lambda$getComponents$2;
            default:
                lambda$getComponents$3 = FirebaseCommonRegistrar.lambda$getComponents$3(context);
                return lambda$getComponents$3;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        Integer lambda$startMessagingService$1;
        Integer lambda$bindToMessagingService$3;
        switch (this.$r8$classId) {
            case 10:
                lambda$startMessagingService$1 = FcmBroadcastProcessor.lambda$startMessagingService$1(task);
                return lambda$startMessagingService$1;
            default:
                lambda$bindToMessagingService$3 = FcmBroadcastProcessor.lambda$bindToMessagingService$3(task);
                return lambda$bindToMessagingService$3;
        }
    }

    @Override // com.google.android.material.shape.ShapeAppearanceModel.CornerSizeUnaryOperator
    public CornerSize apply(CornerSize cornerSize) {
        CornerSize lambda$setShapeAppearanceModel$0;
        lambda$setShapeAppearanceModel$0 = MaskableFrameLayout.lambda$setShapeAppearanceModel$0(cornerSize);
        return lambda$setShapeAppearanceModel$0;
    }

    public static /* synthetic */ void m(long j, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " (");
        sb.append(j);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, int i, int i2, String str) {
        throw new IllegalArgumentException(str + i + obj + i2);
    }

    public static /* synthetic */ void m(int i, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " (");
        sb.append(i);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) " (");
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, StringBuilder sb) {
        sb.append(obj);
        sb.append(obj2);
        throw new JsonSyntaxException(sb.toString());
    }

    public static /* synthetic */ void m(Object obj, Object obj2, Throwable th) {
        throw new RuntimeException("Generated message class \"" + obj + ((Object) "\" missing method \"") + obj2 + ((Object) "\"."), th);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(Object obj, StringBuilder sb, Throwable th) {
        sb.append(obj);
        throw new JsonSyntaxException(sb.toString(), th);
    }

    public static /* synthetic */ void m(String str, double d) {
        throw new IllegalArgumentException(str + d);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3) {
        throw new RuntimeException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4 + obj5);
    }
}
