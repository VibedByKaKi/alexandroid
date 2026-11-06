package com.amazon.alexa.redesign.view.container;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.redesign.R;
import com.amazon.alexa.viewmanagement.api.ViewController;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/redesign/view/container/HomeViewController;", "Lcom/amazon/alexa/viewmanagement/api/ViewController;", "<init>", "()V", "onCreate", "", "context", "Landroid/content/Context;", "makeView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "getTitle", "", "onDetach", "view", "onDestroy", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class HomeViewController implements ViewController {
    public static final int $stable = 0;

    @Override // com.amazon.alexa.viewmanagement.api.ViewController
    @Nullable
    public String getTitle(@NotNull Context context) {
        context.getClass();
        return null;
    }

    @Override // com.amazon.alexa.viewmanagement.api.ViewController
    @NotNull
    public View makeView(@NotNull LayoutInflater inflater, @NotNull ViewGroup container) {
        inflater.getClass();
        container.getClass();
        Log.w("HomeViewController", "makeView");
        View inflate = inflater.inflate(R.layout.amahc_home_container, container, false);
        inflate.getClass();
        return inflate;
    }

    @Override // com.amazon.alexa.viewmanagement.api.ViewController
    public void onCreate(@NotNull Context context) {
        context.getClass();
    }

    @Override // com.amazon.alexa.viewmanagement.api.ViewController
    public void onDestroy(@NotNull Context context) {
        context.getClass();
    }

    @Override // com.amazon.alexa.viewmanagement.api.ViewController
    public void onDetach(@NotNull View view) {
        view.getClass();
    }
}
