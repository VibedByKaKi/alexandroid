package expo.modules.core.interfaces;

import android.app.Activity;
import android.content.Intent;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public interface ActivityEventListener {
    void onActivityResult(Activity activity, int i, int i2, @Nullable Intent intent);

    void onNewIntent(Intent intent);
}
