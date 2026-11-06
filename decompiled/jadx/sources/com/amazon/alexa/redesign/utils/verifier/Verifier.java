package com.amazon.alexa.redesign.utils.verifier;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.entity.AlertBannerModel;
import com.amazon.alexa.redesign.entity.CardModel;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\"\u0010\t\u001a\u00020\n2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/redesign/utils/verifier/Verifier;", "", "<init>", "()V", "hasOutageAlert", "", "cardModels", "", "Lcom/amazon/alexa/redesign/entity/CardModel;", "verify", "", "conditionCallbacks", "Lcom/amazon/alexa/redesign/utils/verifier/ConditionCallback;", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nVerifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Verifier.kt\ncom/amazon/alexa/redesign/utils/verifier/Verifier\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1755#2,3:23\n1863#2:26\n1863#2,2:27\n1864#2:29\n1863#2,2:30\n*S KotlinDebug\n*F\n+ 1 Verifier.kt\ncom/amazon/alexa/redesign/utils/verifier/Verifier\n*L\n8#1:23,3\n12#1:26\n13#1:27,2\n12#1:29\n19#1:30,2\n*E\n"})
/* loaded from: classes19.dex */
public final class Verifier {
    public static final int $stable = 0;

    @NotNull
    public static final Verifier INSTANCE = new Verifier();

    private Verifier() {
    }

    public final boolean hasOutageAlert(@NotNull List<? extends CardModel> cardModels) {
        cardModels.getClass();
        List<? extends CardModel> list = cardModels;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            if (((CardModel) it2.next()) instanceof AlertBannerModel) {
                return true;
            }
        }
        return false;
    }

    public final void verify(@NotNull List<? extends CardModel> cardModels, @NotNull List<? extends ConditionCallback> conditionCallbacks) {
        cardModels.getClass();
        conditionCallbacks.getClass();
        for (CardModel cardModel : cardModels) {
            for (ConditionCallback conditionCallback : conditionCallbacks) {
                if (conditionCallback.isTrueWhen(cardModel)) {
                    conditionCallback.doThis(cardModel);
                }
            }
        }
        Iterator<T> it2 = conditionCallbacks.iterator();
        while (it2.hasNext()) {
            ((ConditionCallback) it2.next()).onComplete();
        }
    }
}
