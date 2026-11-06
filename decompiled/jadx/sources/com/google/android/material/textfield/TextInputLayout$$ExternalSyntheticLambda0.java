package com.google.android.material.textfield;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final /* synthetic */ class TextInputLayout$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ TextInputLayout$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((TextInputLayout) obj).lambda$onGlobalLayout$1();
                break;
            case 1:
                ((ClearTextEndIconDelegate) obj).lambda$tearDown$2();
                break;
            default:
                ((DropdownMenuEndIconDelegate) obj).lambda$afterEditTextChanged$3();
                break;
        }
    }
}
