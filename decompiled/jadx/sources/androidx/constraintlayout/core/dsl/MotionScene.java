package androidx.constraintlayout.core.dsl;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class MotionScene {
    ArrayList<Transition> mTransitions = new ArrayList<>();
    ArrayList<ConstraintSet> mConstraintSets = new ArrayList<>();

    public void addConstraintSet(ConstraintSet constraintSet) {
        this.mConstraintSets.add(constraintSet);
    }

    public void addTransition(Transition transition) {
        this.mTransitions.add(transition);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("{\n");
        if (!this.mTransitions.isEmpty()) {
            sb.append("Transitions:{\n");
            Iterator<Transition> it2 = this.mTransitions.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next().toString());
            }
            sb.append("},\n");
        }
        if (!this.mConstraintSets.isEmpty()) {
            sb.append("ConstraintSets:{\n");
            Iterator<ConstraintSet> it3 = this.mConstraintSets.iterator();
            while (it3.hasNext()) {
                sb.append(it3.next().toString());
            }
            sb.append("},\n");
        }
        sb.append("}\n");
        return sb.toString();
    }
}
