package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.parse.KeyParser;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public final /* synthetic */ class KeyParser$$ExternalSyntheticLambda0 implements KeyParser.Ids, KeyParser.DataType {
    @Override // androidx.constraintlayout.core.motion.parse.KeyParser.DataType
    public int get(int i) {
        return TypedValues.AttributesType.getType(i);
    }

    @Override // androidx.constraintlayout.core.motion.parse.KeyParser.Ids
    public int get(String str) {
        return TypedValues.AttributesType.getId(str);
    }
}
