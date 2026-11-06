package retrofit2.adapter.rxjava3;

import javax.annotation.Nullable;
import retrofit2.Response;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public final class Result<T> {

    @Nullable
    private final Throwable error;

    @Nullable
    private final Response<T> response;

    private Result(@Nullable Response<T> response, @Nullable Throwable th) {
        this.response = response;
        this.error = th;
    }

    public static <T> Result<T> error(Throwable th) {
        if (th != null) {
            return new Result<>(null, th);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("error == null");
        return null;
    }

    public static <T> Result<T> response(Response<T> response) {
        if (response != null) {
            return new Result<>(response, null);
        }
        Single$$ExternalSyntheticBUOutline0.m$1("response == null");
        return null;
    }

    public boolean isError() {
        return this.error != null;
    }

    @Nullable
    public Throwable error() {
        return this.error;
    }

    @Nullable
    public Response<T> response() {
        return this.response;
    }
}
