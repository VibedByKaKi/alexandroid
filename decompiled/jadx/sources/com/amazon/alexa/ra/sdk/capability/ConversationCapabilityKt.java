package com.amazon.alexa.ra.sdk.capability;

import android.content.Intent;
import androidx.annotation.VisibleForTesting;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¨\u0006\b"}, d2 = {"putAsStringArray", "", "Landroid/content/Intent;", "key", "", "fragments", "Ljava/util/ArrayList;", "Lcom/google/gson/JsonObject;", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConversationCapability.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConversationCapability.kt\ncom/amazon/alexa/ra/sdk/capability/ConversationCapabilityKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,501:1\n1557#2:502\n1628#2,3:503\n*S KotlinDebug\n*F\n+ 1 ConversationCapability.kt\ncom/amazon/alexa/ra/sdk/capability/ConversationCapabilityKt\n*L\n45#1:502\n45#1:503,3\n*E\n"})
/* loaded from: classes19.dex */
public final class ConversationCapabilityKt {
    @VisibleForTesting
    public static final void putAsStringArray(@NotNull Intent intent, @NotNull String str, @NotNull ArrayList<JsonObject> arrayList) {
        intent.getClass();
        str.getClass();
        arrayList.getClass();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((JsonObject) it2.next()).toString());
        }
        intent.putStringArrayListExtra(str, new ArrayList<>(arrayList2));
    }
}
