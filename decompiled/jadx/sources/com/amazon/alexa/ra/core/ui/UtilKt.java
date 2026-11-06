package com.amazon.alexa.ra.core.ui;

import android.os.Build;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0086\b¢\u0006\u0002\u0010\u0005\u001a\u0012\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¨\u0006\b"}, d2 = {"getParcelableExtra", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Bundle;", "key", "", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "getLongestCommonPrefixWith", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class UtilKt {
    @NotNull
    public static final String getLongestCommonPrefixWith(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        int min = Math.min(str.length(), str2.length());
        int i = 0;
        while (i < min && str.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return str.substring(0, i);
    }

    public static final /* synthetic */ <T> T getParcelableExtra(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return (T) bundle.getParcelable(str);
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) bundle.getParcelable(str, Object.class);
    }
}
