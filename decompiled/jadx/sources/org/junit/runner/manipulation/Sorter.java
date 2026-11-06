package org.junit.runner.manipulation;

import java.util.Comparator;
import org.junit.runner.Description;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class Sorter implements Comparator<Description> {
    public static final Sorter NULL = new Sorter(new Comparator<Description>() { // from class: org.junit.runner.manipulation.Sorter.1
        @Override // java.util.Comparator
        public int compare(Description description, Description description2) {
            return 0;
        }
    });
    private final Comparator<Description> comparator;

    public Sorter(Comparator<Description> comparator) {
        this.comparator = comparator;
    }

    public void apply(Object obj) {
        if (obj instanceof Sortable) {
            ((Sortable) obj).sort(this);
        }
    }

    @Override // java.util.Comparator
    public int compare(Description description, Description description2) {
        return this.comparator.compare(description, description2);
    }
}
