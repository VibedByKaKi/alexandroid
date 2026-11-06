package bolts;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Locale;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class CancellationToken {
    private final CancellationTokenSource tokenSource;

    public CancellationToken(CancellationTokenSource cancellationTokenSource) {
        this.tokenSource = cancellationTokenSource;
    }

    public boolean isCancellationRequested() {
        return this.tokenSource.isCancellationRequested();
    }

    public CancellationTokenRegistration register(Runnable runnable) {
        return this.tokenSource.register(runnable);
    }

    public void throwIfCancellationRequested() throws CancellationException {
        this.tokenSource.throwIfCancellationRequested();
    }

    public String toString() {
        Locale locale = Locale.US;
        StringBuilder m = TableInfo$$ExternalSyntheticOutline0.m(getClass().getName(), "@", Integer.toHexString(hashCode()), "[cancellationRequested=", Boolean.toString(this.tokenSource.isCancellationRequested()));
        m.append(MarkdownConstants.RIGHT_BRACKET);
        return m.toString();
    }
}
