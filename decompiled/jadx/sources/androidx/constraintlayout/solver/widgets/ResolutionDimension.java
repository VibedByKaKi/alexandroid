package androidx.constraintlayout.solver.widgets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ResolutionDimension extends ResolutionNode {
    float value = 0.0f;

    public void remove() {
        this.state = 2;
    }

    @Override // androidx.constraintlayout.solver.widgets.ResolutionNode
    public void reset() {
        super.reset();
        this.value = 0.0f;
    }

    public void resolve(int i) {
        int i2 = this.state;
        if (i2 == 0 || this.value != i) {
            this.value = i;
            if (i2 == 1) {
                invalidate();
            }
            didResolve();
        }
    }
}
