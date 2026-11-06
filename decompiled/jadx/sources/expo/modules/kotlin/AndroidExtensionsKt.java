package expo.modules.kotlin;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\u0006\u001a(\u0010\u0007\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\t\u001a(\u0010\n\u001a\u0004\u0018\u0001H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u000b*\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0086\b¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"safeGetParcelableExtra", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "Landroid/content/Intent;", "name", "", "(Landroid/content/Intent;Ljava/lang/String;)Landroid/os/Parcelable;", "safeGetParcelable", "Landroid/os/Bundle;", "(Landroid/os/Bundle;Ljava/lang/String;)Landroid/os/Parcelable;", "safeGetSerializable", "Ljava/io/Serializable;", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AndroidExtensionsKt {
    public static final /* synthetic */ <T extends Parcelable> T safeGetParcelable(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return (T) bundle.getParcelable(str);
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) bundle.getParcelable(str, Parcelable.class);
    }

    public static final /* synthetic */ <T extends Parcelable> T safeGetParcelableExtra(Intent intent, String str) {
        intent.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return (T) intent.getParcelableExtra(str);
        }
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        return (T) intent.getParcelableExtra(str, Parcelable.class);
    }

    public static final /* synthetic */ <T extends Serializable> T safeGetSerializable(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return (T) bundle.getSerializable(str, Serializable.class);
        }
        T t = (T) bundle.getSerializable(str);
        Intrinsics.reifiedOperationMarker(1, "T?");
        return t;
    }
}
