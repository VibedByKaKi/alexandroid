package com.amazon.apl.android.image.filters;

import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsic;
import android.renderscript.ScriptIntrinsicBlend;
import android.renderscript.ScriptIntrinsicBlur;
import android.renderscript.ScriptIntrinsicColorMatrix;
import com.amazon.apl.android.image.filters.RenderscriptFilterOperation;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class BlurFilterOperation$$ExternalSyntheticLambda0 implements RenderscriptFilterOperation.ScriptActor {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ BlurFilterOperation$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.apl.android.image.filters.RenderscriptFilterOperation.ScriptActor
    public final void act(ScriptIntrinsic scriptIntrinsic, Allocation allocation, Allocation allocation2) {
        switch (this.$r8$classId) {
            case 0:
                BlurFilterOperation.lambda$getScriptActor$0((ScriptIntrinsicBlur) scriptIntrinsic, allocation, allocation2);
                break;
            case 1:
                ((ScriptIntrinsicBlend) scriptIntrinsic).forEachSrcOver(allocation, allocation2);
                break;
            case 2:
                ((ScriptIntrinsicBlend) scriptIntrinsic).forEachMultiply(allocation, allocation2);
                break;
            case 3:
                ((ScriptIntrinsicBlend) scriptIntrinsic).forEachSrcAtop(allocation, allocation2);
                break;
            case 4:
                ((ScriptIntrinsicBlend) scriptIntrinsic).forEachSrcIn(allocation, allocation2);
                break;
            case 5:
                ((ScriptIntrinsicBlend) scriptIntrinsic).forEachSrcOut(allocation, allocation2);
                break;
            default:
                ((ScriptIntrinsicColorMatrix) scriptIntrinsic).forEach(allocation, allocation2);
                break;
        }
    }
}
