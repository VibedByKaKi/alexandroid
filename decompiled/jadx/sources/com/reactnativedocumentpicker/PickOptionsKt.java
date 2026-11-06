package com.reactnativedocumentpicker;

import android.content.Intent;
import com.facebook.react.bridge.ReadableArray;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"readableArrayToStringArray", "", "", "readableArray", "Lcom/facebook/react/bridge/ReadableArray;", "(Lcom/facebook/react/bridge/ReadableArray;)[Ljava/lang/String;", "react-native-documents_picker_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPickOptions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PickOptions.kt\ncom/reactnativedocumentpicker/PickOptionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,84:1\n1563#2:85\n1634#2,3:86\n37#3:89\n36#3,3:90\n*S KotlinDebug\n*F\n+ 1 PickOptions.kt\ncom/reactnativedocumentpicker/PickOptionsKt\n*L\n82#1:85\n82#1:86,3\n82#1:89\n82#1:90,3\n*E\n"})
/* loaded from: classes9.dex */
public final class PickOptionsKt {
    @NotNull
    public static final String[] readableArrayToStringArray(@NotNull ReadableArray readableArray) {
        readableArray.getClass();
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String normalizeMimeType = Intent.normalizeMimeType(String.valueOf(it2.next()));
            normalizeMimeType.getClass();
            arrayList2.add(normalizeMimeType);
        }
        return (String[]) arrayList2.toArray(new String[0]);
    }
}
