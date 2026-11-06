package com.amazon.tarazed.ui.menu.databinding;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.amazon.tarazed.R;
import com.amazon.tarazed.utility.AccessibilityHelper;
import com.dee.app.data.reactnative.observers.WritableMapEncodingDataServiceObserver;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J*\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016J*\u0010\u0012\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/amazon/tarazed/ui/menu/databinding/StatusTextChangedAnnouncer;", "Landroid/text/TextWatcher;", "context", "Landroid/content/Context;", "textView", "Landroid/widget/TextView;", "(Landroid/content/Context;Landroid/widget/TextView;)V", "afterTextChanged", "", WritableMapEncodingDataServiceObserver.ElementsResponseKey.STATUS_TEXT, "Landroid/text/Editable;", "beforeTextChanged", "p0", "", "p1", "", "p2", "p3", "onTextChanged", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes19.dex */
public final class StatusTextChangedAnnouncer implements TextWatcher {

    @NotNull
    private final Context context;

    @NotNull
    private final TextView textView;

    public StatusTextChangedAnnouncer(@NotNull Context context, @NotNull TextView textView) {
        context.getClass();
        textView.getClass();
        this.context = context;
        this.textView = textView;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(@Nullable Editable statusText) {
        String string = this.context.getString(R.string.status_header);
        string.getClass();
        AccessibilityHelper.INSTANCE.announceForAccessibility3P(this.context, this.textView, string + " " + ((Object) statusText));
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@Nullable CharSequence p0, int p1, int p2, int p3) {
    }
}
