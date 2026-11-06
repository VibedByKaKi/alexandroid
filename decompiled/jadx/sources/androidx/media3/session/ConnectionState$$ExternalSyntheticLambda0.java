package androidx.media3.session;

import android.os.Bundle;
import com.google.common.base.Function;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public final /* synthetic */ class ConnectionState$$ExternalSyntheticLambda0 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ ConnectionState$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        CommandButton lambda$fromBundle$0;
        CommandButton lambda$fromBundle$1;
        CommandButton lambda$fromBundle$2;
        CommandButton lambda$onSetMediaButtonPreferences$4;
        CommandButton lambda$onSetCustomLayout$2;
        int i = this.$r8$classId;
        int i2 = this.f$0;
        Bundle bundle = (Bundle) obj;
        switch (i) {
            case 0:
                lambda$fromBundle$0 = ConnectionState.lambda$fromBundle$0(i2, bundle);
                return lambda$fromBundle$0;
            case 1:
                lambda$fromBundle$1 = ConnectionState.lambda$fromBundle$1(i2, bundle);
                return lambda$fromBundle$1;
            case 2:
                lambda$fromBundle$2 = ConnectionState.lambda$fromBundle$2(i2, bundle);
                return lambda$fromBundle$2;
            case 3:
                lambda$onSetMediaButtonPreferences$4 = MediaControllerStub.lambda$onSetMediaButtonPreferences$4(i2, bundle);
                return lambda$onSetMediaButtonPreferences$4;
            default:
                lambda$onSetCustomLayout$2 = MediaControllerStub.lambda$onSetCustomLayout$2(i2, bundle);
                return lambda$onSetCustomLayout$2;
        }
    }
}
