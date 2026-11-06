package org.junit.runner.manipulation;

import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Iterator;
import org.junit.runner.Description;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public abstract class Filter {
    public static final Filter ALL = new Filter() { // from class: org.junit.runner.manipulation.Filter.1
        @Override // org.junit.runner.manipulation.Filter
        public String describe() {
            return "all tests";
        }

        @Override // org.junit.runner.manipulation.Filter
        public boolean shouldRun(Description description) {
            return true;
        }

        @Override // org.junit.runner.manipulation.Filter
        public void apply(Object obj) throws NoTestsRemainException {
        }

        @Override // org.junit.runner.manipulation.Filter
        public Filter intersect(Filter filter) {
            return filter;
        }
    };

    public static Filter matchMethodDescription(final Description description) {
        return new Filter() { // from class: org.junit.runner.manipulation.Filter.2
            @Override // org.junit.runner.manipulation.Filter
            public String describe() {
                return a$$ExternalSyntheticOutline0.m("Method ", Description.this.getDisplayName());
            }

            @Override // org.junit.runner.manipulation.Filter
            public boolean shouldRun(Description description2) {
                if (description2.isTest()) {
                    return Description.this.equals(description2);
                }
                Iterator<Description> it2 = description2.getChildren().iterator();
                while (it2.hasNext()) {
                    if (shouldRun(it2.next())) {
                        return true;
                    }
                }
                return false;
            }
        };
    }

    public void apply(Object obj) throws NoTestsRemainException {
        if (obj instanceof Filterable) {
            ((Filterable) obj).filter(this);
        }
    }

    public abstract String describe();

    public Filter intersect(final Filter filter) {
        return (filter == this || filter == ALL) ? this : new Filter() { // from class: org.junit.runner.manipulation.Filter.3
            @Override // org.junit.runner.manipulation.Filter
            public String describe() {
                return this.describe() + " and " + filter.describe();
            }

            @Override // org.junit.runner.manipulation.Filter
            public boolean shouldRun(Description description) {
                return this.shouldRun(description) && filter.shouldRun(description);
            }
        };
    }

    public abstract boolean shouldRun(Description description);
}
