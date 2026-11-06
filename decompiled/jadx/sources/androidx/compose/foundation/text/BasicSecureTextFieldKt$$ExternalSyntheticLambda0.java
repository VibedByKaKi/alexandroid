package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.CodepointTransformation;
import androidx.compose.runtime.State;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final /* synthetic */ class BasicSecureTextFieldKt$$ExternalSyntheticLambda0 implements CodepointTransformation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ BasicSecureTextFieldKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.compose.foundation.text.input.internal.CodepointTransformation
    public final int transform(int i, int i2) {
        int BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3;
        int codepointTransformation$lambda$0;
        int i3 = this.$r8$classId;
        Object obj = this.f$0;
        switch (i3) {
            case 0:
                BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3 = BasicSecureTextFieldKt.BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3((State) obj, i, i2);
                return BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3;
            default:
                codepointTransformation$lambda$0 = SecureTextFieldController.codepointTransformation$lambda$0((SecureTextFieldController) obj, i, i2);
                return codepointTransformation$lambda$0;
        }
    }
}
