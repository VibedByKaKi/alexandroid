package com.amazon.tarazed.ui.html;

import android.content.Context;
import android.text.Editable;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.BulletSpan;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import com.amazon.alexa.accessory.frames.contacts.ContactsModuleConstants;
import com.reactcommunity.rndatetimepicker.Common;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ5\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0018\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001dH\u0002¨\u0006\u001f"}, d2 = {"Lcom/amazon/tarazed/ui/html/HtmlUtil;", "", "()V", "applyHtmlToTextView", "", "htmlString", "", "view", "Landroid/widget/TextView;", "backportBulletSpans", "spannableBuilder", "Landroid/text/SpannableStringBuilder;", "bulletSpans", "", "Landroid/text/style/BulletSpan;", "textSize", "", Common.TEXT_COLOR, "", "(Landroid/text/SpannableStringBuilder;[Landroid/text/style/BulletSpan;FI)V", "finalizeBulletSpanLegacy", ContactsModuleConstants.OUTPUT, "Landroid/text/Editable;", "getSpannableFromHtmlLegacy", "Landroid/text/Spanned;", "markStartOfBulletSpanLegacy", "replaceTemplates", "originalString", "context", "Landroid/content/Context;", "BulletMarker", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nHtmlUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HtmlUtil.kt\ncom/amazon/tarazed/ui/html/HtmlUtil\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,106:1\n13309#2,2:107\n*S KotlinDebug\n*F\n+ 1 HtmlUtil.kt\ncom/amazon/tarazed/ui/html/HtmlUtil\n*L\n93#1:107,2\n*E\n"})
/* loaded from: classes19.dex */
public final class HtmlUtil {

    @NotNull
    public static final HtmlUtil INSTANCE = new HtmlUtil();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/amazon/tarazed/ui/html/HtmlUtil$BulletMarker;", "", "()V", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BulletMarker {
    }

    private HtmlUtil() {
    }

    private final void backportBulletSpans(SpannableStringBuilder spannableBuilder, BulletSpan[] bulletSpans, float textSize, @ColorInt int textColor) {
        for (BulletSpan bulletSpan : bulletSpans) {
            int spanStart = spannableBuilder.getSpanStart(bulletSpan);
            int spanEnd = spannableBuilder.getSpanEnd(bulletSpan);
            BackportedBulletSpan backportedBulletSpan = new BackportedBulletSpan((int) (textSize / 2), textColor, (int) (textSize * 0.15d));
            spannableBuilder.removeSpan(bulletSpan);
            spannableBuilder.setSpan(backportedBulletSpan, spanStart, spanEnd, 17);
        }
    }

    private final void finalizeBulletSpanLegacy(Editable output) {
        output.append("\n");
        Object[] spans = output.getSpans(0, output.length(), BulletMarker.class);
        spans.getClass();
        BulletMarker bulletMarker = (BulletMarker) ArraysKt.lastOrNull(spans);
        if (bulletMarker != null) {
            output.setSpan(new BulletSpan(), output.getSpanStart(bulletMarker), output.length(), 17);
        }
    }

    private final Spanned getSpannableFromHtmlLegacy(String htmlString) {
        Spanned fromHtml = Html.fromHtml(htmlString, null, new HtmlUtil$$ExternalSyntheticLambda0());
        fromHtml.getClass();
        return fromHtml;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getSpannableFromHtmlLegacy$lambda$1(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (Intrinsics.areEqual(str, "li")) {
            if (z) {
                HtmlUtil htmlUtil = INSTANCE;
                editable.getClass();
                htmlUtil.markStartOfBulletSpanLegacy(editable);
            } else {
                HtmlUtil htmlUtil2 = INSTANCE;
                editable.getClass();
                htmlUtil2.finalizeBulletSpanLegacy(editable);
            }
        }
    }

    private final void markStartOfBulletSpanLegacy(Editable output) {
        output.setSpan(new BulletMarker(), output.length(), output.length(), 17);
    }

    private final String replaceTemplates(String originalString, Context context) {
        String replace$default;
        replace$default = StringsKt__StringsJVMKt.replace$default(originalString, "$APP_NAME", context.getApplicationInfo().loadLabel(context.getPackageManager()).toString(), false, 4, (Object) null);
        return replace$default;
    }

    public final void applyHtmlToTextView(@NotNull String htmlString, @NotNull TextView view) {
        htmlString.getClass();
        view.getClass();
        Context context = view.getContext();
        context.getClass();
        Spanned fromHtml = Html.fromHtml(replaceTemplates(htmlString, context), 63);
        fromHtml.getClass();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringsKt.trim(fromHtml));
        BulletSpan[] bulletSpanArr = (BulletSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), BulletSpan.class);
        bulletSpanArr.getClass();
        backportBulletSpans(spannableStringBuilder, bulletSpanArr, view.getTextSize(), view.getTextColors().getDefaultColor());
        view.setText(spannableStringBuilder);
    }
}
