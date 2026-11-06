package androidx.webkit;

import androidx.annotation.RestrictTo;
import androidx.webkit.WebViewBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.support_lib_boundary.WebViewBuilderBoundaryInterface;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@WebViewBuilder.Experimental
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes14.dex */
public final class Policy {
    private final List<ConfigRunnable> mBehaviors;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        final List<ConfigRunnable> mBehaviors = new ArrayList();

        public Policy build() {
            return new Policy(this.mBehaviors);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ConfigRunnable {
        void configure(WebViewBuilderBoundaryInterface.Config config) throws WebViewBuilderException;
    }

    private Policy(List<ConfigRunnable> list) {
        this.mBehaviors = list;
    }

    public void configure(WebViewBuilderBoundaryInterface.Config config) throws WebViewBuilderException {
        Iterator<ConfigRunnable> it2 = this.mBehaviors.iterator();
        while (it2.hasNext()) {
            it2.next().configure(config);
        }
    }
}
