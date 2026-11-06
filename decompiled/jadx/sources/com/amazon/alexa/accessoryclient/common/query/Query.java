package com.amazon.alexa.accessoryclient.common.query;

import android.os.Bundle;
import com.amazon.alexa.accessoryclient.common.transformers.BundleTransformer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/Query;", "", "Request", "Response", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface Query {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u0012\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/Query$Request;", "I", "", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "self", "getSelf$annotations", "()V", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Request<I> {
        @NotNull
        Bundle getBundle();

        @NotNull
        BundleTransformer<I> getBundleTransformer();

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @NotNull
            public static <I> Bundle getBundle(@NotNull Request<I> request) {
                return request.getBundleTransformer().toBundle(getSelf(request));
            }

            private static /* synthetic */ void getSelf$annotations() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            private static <I> I getSelf(Request<I> request) {
                return request;
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u0012\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/accessoryclient/common/query/Query$Response;", "O", "", "bundle", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "bundleTransformer", "Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "getBundleTransformer", "()Lcom/amazon/alexa/accessoryclient/common/transformers/BundleTransformer;", "self", "getSelf$annotations", "()V", "AlexaAccessoryAndroidClient_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Response<O> {
        @NotNull
        Bundle getBundle();

        @NotNull
        BundleTransformer<O> getBundleTransformer();

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class DefaultImpls {
            @NotNull
            public static <O> Bundle getBundle(@NotNull Response<O> response) {
                return response.getBundleTransformer().toBundle(getSelf(response));
            }

            private static /* synthetic */ void getSelf$annotations() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            private static <O> O getSelf(Response<O> response) {
                return response;
            }
        }
    }
}
