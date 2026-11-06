package expo.modules.interfaces.imageloader;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ImageLoaderInterface {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ResultListener {
        void onFailure(@Nullable Throwable th);

        void onSuccess(@NonNull Bitmap bitmap);
    }

    Future<Bitmap> loadImageForDisplayFromURL(@NonNull String str);

    void loadImageForDisplayFromURL(@NonNull String str, ResultListener resultListener);

    Future<Bitmap> loadImageForManipulationFromURL(@NonNull String str);

    void loadImageForManipulationFromURL(@NonNull String str, ResultListener resultListener);
}
