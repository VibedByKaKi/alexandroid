package com.amazon.dee.app.services.toolbar;

import android.graphics.Color;
import java.util.Map;
import java.util.Optional;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0013J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\fR\u0012\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/amazon/dee/app/services/toolbar/ToolbarOptions;", "", "<init>", "()V", "visibilityOptions", "Lcom/amazon/dee/app/services/toolbar/VisibilityOptions;", "viewOptions", "", "", "backgroundColor", "floating", "", "Ljava/lang/Boolean;", "height", "", "Ljava/lang/Float;", "getViewOptions", "getVisibilityOptions", "getBackgroundColor", "Ljava/util/Optional;", "", "getHeight", "isFloating", "impl"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToolbarOptions {

    @Nullable
    private String backgroundColor;

    @Nullable
    private Boolean floating;

    @Nullable
    private Float height;

    @Nullable
    private Map<String, String> viewOptions;

    @Nullable
    private VisibilityOptions visibilityOptions;

    @NotNull
    public final Optional<Integer> getBackgroundColor() {
        String str = this.backgroundColor;
        if (str == null) {
            Optional<Integer> empty = Optional.empty();
            empty.getClass();
            return empty;
        }
        try {
            Optional<Integer> of = Optional.of(Integer.valueOf(Color.parseColor(str)));
            of.getClass();
            return of;
        } catch (RuntimeException unused) {
            Optional<Integer> empty2 = Optional.empty();
            empty2.getClass();
            return empty2;
        }
    }

    @NotNull
    public final Optional<Float> getHeight() {
        Optional<Float> ofNullable = Optional.ofNullable(this.height);
        ofNullable.getClass();
        return ofNullable;
    }

    @Nullable
    public final Map<String, String> getViewOptions() {
        return this.viewOptions;
    }

    @Nullable
    public final VisibilityOptions getVisibilityOptions() {
        return this.visibilityOptions;
    }

    @NotNull
    public final Optional<Boolean> isFloating() {
        Optional<Boolean> ofNullable = Optional.ofNullable(this.floating);
        ofNullable.getClass();
        return ofNullable;
    }
}
