package com.amazon.whisperjoin.util.rx;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.whisperjoin.common.sharedtypes.utility.WJLog;
import defpackage.a$$ExternalSyntheticOutline0;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Action;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes4.dex */
public class RxLog {
    public static Action doFinally(final String str, final String str2) {
        return new Action() { // from class: com.amazon.whisperjoin.util.rx.RxLog.4
            @Override // io.reactivex.rxjava3.functions.Action
            public void run() throws Exception {
                WJLog.d(str, "[DoFinally]: " + str2);
            }
        };
    }

    public static Action doOnComplete(final String str, final String str2) {
        return new Action() { // from class: com.amazon.whisperjoin.util.rx.RxLog.5
            @Override // io.reactivex.rxjava3.functions.Action
            public void run() throws Exception {
                WJLog.d(str, "[OnComplete]: " + str2);
            }
        };
    }

    public static Consumer<Throwable> doOnError(final String str, final String str2) {
        return new Consumer<Throwable>() { // from class: com.amazon.whisperjoin.util.rx.RxLog.6
            @Override // io.reactivex.rxjava3.functions.Consumer
            public void accept(Throwable th) throws Exception {
                WJLog.e(str, "[OnError]: " + str2, th);
            }
        };
    }

    public static <T> Consumer<T> doOnNext(final String str, final String str2) {
        return new Consumer<T>() { // from class: com.amazon.whisperjoin.util.rx.RxLog.2
            @Override // io.reactivex.rxjava3.functions.Consumer
            public void accept(T t) throws Exception {
                String str3 = str;
                Locale locale = Locale.ENGLISH;
                WJLog.d(str3, a$$ExternalSyntheticOutline0.m("[OnNext]: ", str2, " - [", t.toString(), MarkdownConstants.RIGHT_BRACKET));
            }
        };
    }

    public static Consumer<Disposable> doOnSubscribe(final String str, final String str2) {
        return new Consumer<Disposable>() { // from class: com.amazon.whisperjoin.util.rx.RxLog.1
            @Override // io.reactivex.rxjava3.functions.Consumer
            public void accept(Disposable disposable) throws Exception {
                WJLog.d(str, "[OnSubscribe]: " + str2);
            }
        };
    }

    public static <T> Consumer<T> doOnSuccess(final String str, final String str2) {
        return new Consumer<T>() { // from class: com.amazon.whisperjoin.util.rx.RxLog.3
            @Override // io.reactivex.rxjava3.functions.Consumer
            public void accept(T t) throws Exception {
                String str3 = str;
                Locale locale = Locale.ENGLISH;
                WJLog.d(str3, a$$ExternalSyntheticOutline0.m("[OnSuccess]: ", str2, " - [", t.toString(), MarkdownConstants.RIGHT_BRACKET));
            }
        };
    }
}
