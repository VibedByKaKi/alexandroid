package androidx.media3.session;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class SimpleBitmapLoader$$ExternalSyntheticLambda1 implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ SimpleBitmapLoader$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bitmap load;
        Bitmap decode;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                load = SimpleBitmapLoader.load((Uri) obj);
                return load;
            default:
                decode = SimpleBitmapLoader.decode((byte[]) obj);
                return decode;
        }
    }
}
