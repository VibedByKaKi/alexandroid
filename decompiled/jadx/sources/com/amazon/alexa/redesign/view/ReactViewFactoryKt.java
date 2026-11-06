package com.amazon.alexa.redesign.view;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.VisibleForTesting;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¨\u0006\b"}, d2 = {"excludeFromViewHierarchyState", "", "Landroid/view/View;", "bundleContentEquals", "", "a", "Landroid/os/Bundle;", "b", "AlexaMobileAndroidHomeChannel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nReactViewFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReactViewFactory.kt\ncom/amazon/alexa/redesign/view/ReactViewFactoryKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,454:1\n1734#2,3:455\n*S KotlinDebug\n*F\n+ 1 ReactViewFactory.kt\ncom/amazon/alexa/redesign/view/ReactViewFactoryKt\n*L\n452#1:455,3\n*E\n"})
/* loaded from: classes19.dex */
public final class ReactViewFactoryKt {
    @VisibleForTesting
    public static final boolean bundleContentEquals(@Nullable Bundle bundle, @Nullable Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null || bundle2 == null || bundle.size() != bundle2.size()) {
            return false;
        }
        Set<String> keySet = bundle.keySet();
        keySet.getClass();
        Set<String> set = keySet;
        if ((set instanceof Collection) && set.isEmpty()) {
            return true;
        }
        for (String str : set) {
            if (!Intrinsics.areEqual(bundle.get(str), bundle2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static final void excludeFromViewHierarchyState(@NotNull View view) {
        view.getClass();
        view.setSaveFromParentEnabled(false);
    }
}
