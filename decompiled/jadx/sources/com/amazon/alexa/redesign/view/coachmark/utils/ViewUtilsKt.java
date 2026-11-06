package com.amazon.alexa.redesign.view.coachmark.utils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"BOTTOM_BAR_COACH_MARK_ANCHOR_ID", "", "findViewByIdInContext", "Landroid/view/View;", "context", "Landroid/content/Context;", "resourceName", "AlexaMobileAndroidHomeChannel_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class ViewUtilsKt {

    @NotNull
    public static final String BOTTOM_BAR_COACH_MARK_ANCHOR_ID = "bottom_bar_coachmark_anchor";

    @Nullable
    public static final View findViewByIdInContext(@NotNull Context context, @NotNull String str) {
        context.getClass();
        str.getClass();
        try {
            int identifier = context.getResources().getIdentifier(str, "id", context.getPackageName());
            if (context instanceof Activity) {
                return ((Activity) context).findViewById(identifier);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
