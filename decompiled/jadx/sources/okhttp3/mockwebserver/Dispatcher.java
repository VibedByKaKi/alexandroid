package okhttp3.mockwebserver;

import com.amazon.alexa.assistant.transport.MissingTokenPull;
import com.amazon.alexa.voice.ui.ra.RaUiOptions;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lokhttp3/mockwebserver/Dispatcher;", "", "()V", "dispatch", "Lokhttp3/mockwebserver/MockResponse;", MissingTokenPull.TRIGGER_REQUEST, "Lokhttp3/mockwebserver/RecordedRequest;", RaUiOptions.ENTER_ANIMATION_PEEK, "shutdown", "", "mockwebserver"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes10.dex */
public abstract class Dispatcher {
    @NotNull
    public abstract MockResponse dispatch(@NotNull RecordedRequest request) throws InterruptedException;

    @NotNull
    public MockResponse peek() {
        MockResponse mockResponse = new MockResponse();
        mockResponse.socketPolicy(SocketPolicy.KEEP_OPEN);
        return mockResponse;
    }

    public void shutdown() {
    }
}
