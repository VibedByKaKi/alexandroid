package com.google.googlejavaformat.java;

import com.amazon.alexa.hho.stickynotes.StickyNotesMediaProvider;
import com.amazon.deecomms.ndt.model.DeviceModel;
import com.amazon.deecomms.ndt.model.GetDevicesResponse;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.common.base.Predicate;
import org.openjdk.javax.tools.Diagnostic;
import org.openjdk.source.tree.ExpressionTree;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class Formatter$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ Formatter$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        boolean lambda$static$0;
        boolean lambda$static$02;
        boolean lambda$static$1;
        boolean lambda$static$03;
        boolean isArrayValue;
        switch (this.$r8$classId) {
            case 0:
                return Formatter.errorDiagnostic((Diagnostic) obj);
            case 1:
                lambda$static$0 = StickyNotesMediaProvider.lambda$static$0((String) obj);
                return lambda$static$0;
            case 2:
                lambda$static$02 = GetDevicesResponse.lambda$static$0((DeviceModel) obj);
                return lambda$static$02;
            case 3:
                lambda$static$1 = GetDevicesResponse.lambda$static$1((DeviceModel) obj);
                return lambda$static$1;
            case 4:
                lambda$static$03 = HttpDataSource.lambda$static$0((String) obj);
                return lambda$static$03;
            default:
                isArrayValue = JavaInputAstVisitor.isArrayValue((ExpressionTree) obj);
                return isArrayValue;
        }
    }
}
