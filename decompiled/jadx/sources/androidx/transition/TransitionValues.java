package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import dagger.internal.codegen.base.Formatter;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes14.dex */
public class TransitionValues {

    @SuppressLint({"UnknownNullness"})
    public View view;
    public final Map<String, Object> values = new HashMap();
    final ArrayList<Transition> mTargetedTransitions = new ArrayList<>();

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder m1m = a$$ExternalSyntheticOutline0.m1m("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        m1m.append(this.view);
        m1m.append("\n");
        String concat = m1m.toString().concat("    values:");
        for (String str : this.values.keySet()) {
            concat = concat + Formatter.INDENT + str + ": " + this.values.get(str) + "\n";
        }
        return concat;
    }

    @Deprecated
    public TransitionValues() {
    }
}
