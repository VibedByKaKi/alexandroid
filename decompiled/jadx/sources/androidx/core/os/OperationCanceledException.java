package androidx.core.os;

import androidx.core.util.ObjectsCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException(String str) {
        super(ObjectsCompat.toString(str, "The operation has been canceled."));
    }

    public OperationCanceledException() {
        this(null);
    }
}
