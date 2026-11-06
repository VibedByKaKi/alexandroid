package io.reactivex.rxjava3.disposables;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import io.reactivex.rxjava3.annotations.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
final class RunnableDisposable extends ReferenceDisposable<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public RunnableDisposable(Runnable runnable) {
        super(runnable);
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        return "RunnableDisposable(disposed=" + isDisposed() + ", " + get() + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @Override // io.reactivex.rxjava3.disposables.ReferenceDisposable
    public void onDisposed(@NonNull Runnable runnable) {
        runnable.run();
    }
}
