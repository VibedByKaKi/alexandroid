package dagger.internal.codegen.base;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public final class UniqueNameSet {
    private final Set<String> uniqueNames = new HashSet();

    public void claim(CharSequence charSequence) {
        this.uniqueNames.add(charSequence.toString());
    }

    public String getUniqueName(CharSequence charSequence) {
        String charSequence2 = charSequence.toString();
        int i = 2;
        while (!this.uniqueNames.add(charSequence2)) {
            charSequence2 = charSequence.toString() + i;
            i++;
        }
        return charSequence2;
    }
}
