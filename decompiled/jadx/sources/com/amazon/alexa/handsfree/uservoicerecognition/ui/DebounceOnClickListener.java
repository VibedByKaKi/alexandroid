package com.amazon.alexa.handsfree.uservoicerecognition.ui;

import android.view.View;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.enrollment.api.EnrollmentAPI$$ExternalSyntheticLambda1;
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class DebounceOnClickListener implements View.OnClickListener {
    private static final long THROTTLE_WINDOW = 1000;
    private final Disposable disposable;
    private final PublishSubject<View> publishSubject;

    @VisibleForTesting
    public DebounceOnClickListener(PublishSubject<View> publishSubject, Scheduler scheduler) {
        this.publishSubject = publishSubject;
        this.disposable = publishSubject.throttleFirst(1000L, TimeUnit.MILLISECONDS).observeOn(scheduler).subscribe(new EnrollmentAPI$$ExternalSyntheticLambda1(this, 29));
    }

    public void cleanUp() {
        this.disposable.dispose();
    }

    public abstract void debounceClick(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.publishSubject.onNext(view);
    }

    @VisibleForTesting
    public DebounceOnClickListener(Scheduler scheduler) {
        this(PublishSubject.create(), scheduler);
    }

    public DebounceOnClickListener() {
        this(PublishSubject.create(), AndroidSchedulers.mainThread());
    }
}
