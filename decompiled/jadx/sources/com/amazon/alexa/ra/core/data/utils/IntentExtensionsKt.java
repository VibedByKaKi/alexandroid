package com.amazon.alexa.ra.core.data.utils;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"hasHandlingActivity", "", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class IntentExtensionsKt {
    public static final boolean hasHandlingActivity(@NotNull Intent intent, @NotNull Context context) {
        intent.getClass();
        context.getClass();
        context.getPackageManager().queryIntentActivities(intent, 65536).getClass();
        return !r1.isEmpty();
    }
}
