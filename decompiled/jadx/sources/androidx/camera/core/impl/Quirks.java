package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class Quirks {

    @NonNull
    private final List<Quirk> mQuirks;

    public Quirks(@NonNull List<Quirk> list) {
        this.mQuirks = new ArrayList(list);
    }

    @NonNull
    public static String toString(@NonNull Quirks quirks) {
        ArrayList arrayList = new ArrayList();
        Iterator<Quirk> it2 = quirks.mQuirks.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    @VisibleForTesting
    public void addQuirkForTesting(@NonNull Quirk quirk) {
        this.mQuirks.add(quirk);
    }

    public boolean contains(@NonNull Class<? extends Quirk> cls) {
        Iterator<Quirk> it2 = this.mQuirks.iterator();
        while (it2.hasNext()) {
            if (cls.isAssignableFrom(it2.next().getClass())) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public <T extends Quirk> T get(@NonNull Class<T> cls) {
        Iterator<Quirk> it2 = this.mQuirks.iterator();
        while (it2.hasNext()) {
            T t = (T) it2.next();
            if (t.getClass() == cls) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    public <T extends Quirk> List<T> getAll(@NonNull Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (Quirk quirk : this.mQuirks) {
            if (cls.isAssignableFrom(quirk.getClass())) {
                arrayList.add(quirk);
            }
        }
        return arrayList;
    }
}
