package androidx.webkit;

import androidx.annotation.RequiresOptIn;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ExperimentalNavigationCallback
/* loaded from: classes14.dex */
public interface WebNavigationClient {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn(level = RequiresOptIn.Level.ERROR)
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalNavigationCallback {
    }

    void onFirstContentfulPaint(Page page);

    void onNavigationCompleted(Navigation navigation);

    void onNavigationRedirected(Navigation navigation);

    void onNavigationStarted(Navigation navigation);

    void onPageDeleted(Page page);

    void onPageDomContentLoadedEventFired(Page page);

    void onPageLoadEventFired(Page page);
}
