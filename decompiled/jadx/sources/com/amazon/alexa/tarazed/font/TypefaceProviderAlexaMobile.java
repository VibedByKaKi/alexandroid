package com.amazon.alexa.tarazed.font;

import android.content.Context;
import android.graphics.Typeface;
import com.amazon.alexa.font.Font;
import com.amazon.alexa.font.FontResolver;
import com.amazon.alexa.tarazed.dagger.scope.TarazedIntegrationScope;
import com.amazon.tarazed.registry.component.TypefaceProvider;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/tarazed/font/TypefaceProviderAlexaMobile;", "Lcom/amazon/tarazed/registry/component/TypefaceProvider;", "()V", "createTypeface", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "fontName", "", "Companion", "AlexaMobileAndroidTarazedIntegration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TarazedIntegrationScope
/* loaded from: classes19.dex */
public final class TypefaceProviderAlexaMobile implements TypefaceProvider {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final Font DEFAULT_FONT;

    @NotNull
    private static final Map<String, Font> fontMappings;

    static {
        Font font = Font.APP_TEXT_REGULAR;
        DEFAULT_FONT = font;
        fontMappings = MapsKt.mapOf(TuplesKt.to("amazon-ember-display-bold", Font.APP_DISPLAY_BOLD), TuplesKt.to("amazon-ember-display-light", Font.APP_DISPLAY_LIGHT), TuplesKt.to("amazon-ember-display-medium", Font.APP_DISPLAY_MEDIUM), TuplesKt.to("amazon-ember-display-regular", Font.APP_DISPLAY_REGULAR), TuplesKt.to("ember-regular", font), TuplesKt.to("ember-bold", Font.APP_TEXT_BOLD), TuplesKt.to("ember-medium", Font.APP_TEXT_MEDIUM));
    }

    @Inject
    public TypefaceProviderAlexaMobile() {
    }

    @Override // com.amazon.tarazed.registry.component.TypefaceProvider
    @Nullable
    public Typeface createTypeface(@NotNull Context context, @NotNull String fontName) {
        context.getClass();
        fontName.getClass();
        Font font = fontMappings.get(fontName);
        if (font == null) {
            font = DEFAULT_FONT;
        }
        return FontResolver.getFont(context, font);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/tarazed/font/TypefaceProviderAlexaMobile$Companion;", "", "()V", "DEFAULT_FONT", "Lcom/amazon/alexa/font/Font;", "getDEFAULT_FONT", "()Lcom/amazon/alexa/font/Font;", "fontMappings", "", "", "getFontMappings", "()Ljava/util/Map;", "AlexaMobileAndroidTarazedIntegration_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Font getDEFAULT_FONT() {
            return TypefaceProviderAlexaMobile.DEFAULT_FONT;
        }

        @NotNull
        public final Map<String, Font> getFontMappings() {
            return TypefaceProviderAlexaMobile.fontMappings;
        }

        private Companion() {
        }
    }
}
