package com.amazon.alexa.ra.core.data.api;

import com.amazon.alexa.ra.cards.components.IconKt$$ExternalSyntheticLambda0;
import com.amazon.alexa.ra.core.data.model.ActionItem$$ExternalSyntheticLambda0;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a6\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00060\b¨\u0006\n"}, d2 = {"ApiCallback", "Lcom/amazon/alexa/ra/core/data/api/ApiCallback;", "id", "", "onSuccess", "Lkotlin/Function0;", "", "onFailure", "Lkotlin/Function1;", "Lcom/amazon/alexa/ra/core/data/api/ApiFailure;", "ui-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final class ApiCallbackKt {
    @NotNull
    public static final ApiCallback ApiCallback(@NotNull final String str, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super ApiFailure, Unit> function1) {
        str.getClass();
        function0.getClass();
        function1.getClass();
        return new ApiCallback(str, function0, function1) { // from class: com.amazon.alexa.ra.core.data.api.ApiCallbackKt$ApiCallback$3
            final /* synthetic */ Function1<ApiFailure, Unit> $onFailure;
            final /* synthetic */ Function0<Unit> $onSuccess;
            private final String id;
            private final TimeUnit timeoutUnit;
            private final Long timeoutValue;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.$onSuccess = function0;
                this.$onFailure = function1;
                this.id = str;
            }

            @Override // com.amazon.alexa.ra.core.data.api.ApiCallback
            public String getId() {
                return this.id;
            }

            @Override // com.amazon.alexa.ra.core.data.api.ApiCallback
            public TimeUnit getTimeoutUnit() {
                return this.timeoutUnit;
            }

            @Override // com.amazon.alexa.ra.core.data.api.ApiCallback
            public Long getTimeoutValue() {
                return this.timeoutValue;
            }

            @Override // com.amazon.alexa.ra.core.data.api.ApiCallback
            public void onFailure(ApiFailure failure) {
                this.$onFailure.invoke(failure);
            }

            @Override // com.amazon.alexa.ra.core.data.api.ApiCallback
            public void onSuccess() {
                this.$onSuccess.invoke();
            }
        };
    }

    public static /* synthetic */ ApiCallback ApiCallback$default(String str, Function0 function0, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new ActionItem$$ExternalSyntheticLambda0(21);
        }
        if ((i & 4) != 0) {
            function1 = new IconKt$$ExternalSyntheticLambda0(22);
        }
        return ApiCallback(str, function0, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ApiCallback$lambda$1(ApiFailure apiFailure) {
        return Unit.INSTANCE;
    }
}
