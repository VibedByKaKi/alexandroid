package okhttp3.mockwebserver.internal.duplex;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.mockwebserver.RecordedRequest;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lokhttp3/mockwebserver/internal/duplex/DuplexResponseBody;", "", "onRequest", "", MissingTokenPull.TRIGGER_REQUEST, "Lokhttp3/mockwebserver/RecordedRequest;", "http2Stream", "Lokhttp3/internal/http2/Http2Stream;", "mockwebserver"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes10.dex */
public interface DuplexResponseBody {
    void onRequest(@NotNull RecordedRequest request, @NotNull Http2Stream http2Stream) throws IOException;
}
