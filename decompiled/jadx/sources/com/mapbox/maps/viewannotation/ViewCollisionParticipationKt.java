package com.mapbox.maps.viewannotation;

import android.view.View;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\".\u0010\u0002\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"value", "", "mbxViewAnnotationCollisionBox", "Landroid/view/View;", "getMbxViewAnnotationCollisionBox$annotations", "(Landroid/view/View;)V", "getMbxViewAnnotationCollisionBox", "(Landroid/view/View;)Z", "setMbxViewAnnotationCollisionBox", "(Landroid/view/View;Z)V", "maps-sdk_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ViewCollisionParticipationKt {
    public static final boolean getMbxViewAnnotationCollisionBox(@NotNull View view) {
        view.getClass();
        Object tag = view.getTag(R.id.collisionBox);
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void setMbxViewAnnotationCollisionBox(@NotNull View view, boolean z) {
        view.getClass();
        view.setTag(R.id.collisionBox, Boolean.valueOf(z));
    }

    @MapboxExperimental
    public static /* synthetic */ void getMbxViewAnnotationCollisionBox$annotations(View view) {
    }
}
