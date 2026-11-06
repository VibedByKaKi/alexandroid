package kotlinx.serialization.json.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.json.JsonElement;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public final /* synthetic */ class TreeJsonEncoderKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TreeJsonEncoderKt$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit writeJson$lambda$0;
        Unit beginStructure$lambda$2;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                writeJson$lambda$0 = TreeJsonEncoderKt.writeJson$lambda$0((Ref.ObjectRef) obj2, (JsonElement) obj);
                return writeJson$lambda$0;
            default:
                beginStructure$lambda$2 = AbstractJsonTreeEncoder.beginStructure$lambda$2((AbstractJsonTreeEncoder) obj2, (JsonElement) obj);
                return beginStructure$lambda$2;
        }
    }
}
